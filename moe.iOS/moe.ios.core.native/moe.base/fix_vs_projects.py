import xml.etree.ElementTree as ET
import glob
import os
import sets

disabled = sets.Set(['moe.sdk'])

listing = glob.glob(os.path.dirname(os.path.realpath(__file__)) + '/../*/build_windows/*.vcxproj')
for filename in listing:
    print "Found project: " + filename

    ET.register_namespace('', 'http://schemas.microsoft.com/developer/msbuild/2003')
    root = ET.parse(filename)

    obj = root.getroot().find('./{http://schemas.microsoft.com/developer/msbuild/2003}PropertyGroup/{http://schemas.microsoft.com/developer/msbuild/2003}ProjectName')
    project = obj.text
    tofix = project not in disabled

    if tofix:
        fixed = False

        # Fix up platform toolset.
        for elem in root.findall('./{http://schemas.microsoft.com/developer/msbuild/2003}PropertyGroup[@Label=\'Configuration\']'):

            # Platform toolset has to be set to clang.
            obj = elem.find('./{http://schemas.microsoft.com/developer/msbuild/2003}PlatformToolset')
            if obj is None:
                obj = ET.SubElement(elem, 'PlatformToolset')
                obj.text = 'v140_clang_3_7'
            elif obj.text == 'v140_clang_3_7':
                fixed = True
            else:
                obj.text = 'v140_clang_3_7'


        if fixed:
            print "Skipped project: " + filename
            print
            continue

        # Fix up compile settings.
        for elem in root.findall('./{http://schemas.microsoft.com/developer/msbuild/2003}ItemDefinitionGroup/{http://schemas.microsoft.com/developer/msbuild/2003}ClCompile'):

            # We need to replace object output directory to avoid clang error.
            obj = elem.find('./{http://schemas.microsoft.com/developer/msbuild/2003}ObjectFileName')
            if obj is None:
                obj = ET.SubElement(elem, 'ObjectFileName')
            obj.text = '$(IntDir)%(filename).obj'

            # Clang toolset does not recognize exception handling modes of the cl toolset.
            obj = elem.find('./{http://schemas.microsoft.com/developer/msbuild/2003}DebugInformationFormat')
            if obj is None:
                obj = ET.SubElement(elem, 'DebugInformationFormat')
            obj.text = 'FullDebug'

            # Clang supports native exceptions on Windows.
            obj = elem.find('./{http://schemas.microsoft.com/developer/msbuild/2003}ExceptionHandling')
            if obj is None:
                obj = ET.SubElement(elem, 'ExceptionHandling')
            obj.text = 'Enabled'

            # We enable ms compatibility mode to make the compiler more compatible with microsoft headers.
            obj = elem.find('./{http://schemas.microsoft.com/developer/msbuild/2003}MSCompatibility')
            if obj is None:
                obj = ET.SubElement(elem, 'MSCompatibility')
            obj.text = 'true'

            # We add -Wno-c++11-narrowing to the compiler settings to avoid enum errors.
            obj = elem.find('./{http://schemas.microsoft.com/developer/msbuild/2003}AdditionalOptions')
            if obj is None:
                obj = ET.SubElement(elem, 'AdditionalOptions')
                obj.text = ''
            force_include = obj.text.replace('-include ', '', 1).replace(' %(AdditionalOptions)', '')
            obj.text = '-Wno-c++11-narrowing %(AdditionalOptions)'

            # We move force include setting to its proper destination.
            obj = elem.find('./{http://schemas.microsoft.com/developer/msbuild/2003}ForcedIncludeFiles')
            if obj is None:
                obj = ET.SubElement(elem, 'ForcedIncludeFiles')
            obj.text = force_include

    # Enable multi-process build.
    obj = root.getroot().find('./{http://schemas.microsoft.com/developer/msbuild/2003}PropertyGroup/{http://schemas.microsoft.com/developer/msbuild/2003}UseMultiToolTask')
    if obj is None:
        obj = ET.SubElement(root.getroot(), 'PropertyGroup')
        obj = ET.SubElement(obj, 'UseMultiToolTask')
        obj.text = 'true'

    # Fix libcore, conscrypt and javasqlite specific link settings.
    for proj in ['android.libcore', 'android.external.conscrypt', 'android.external.javasqlite']:
        for elem in root.findall('./{http://schemas.microsoft.com/developer/msbuild/2003}ItemGroup/{http://schemas.microsoft.com/developer/msbuild/2003}ProjectReference'):
            include = elem.attrib['Include']
            if include.endswith(proj + '.vcxproj'):
                obj = elem.find('./{http://schemas.microsoft.com/developer/msbuild/2003}LinkLibraryDependencies')
                if obj is None:
                    obj = ET.SubElement(elem, 'LinkLibraryDependencies')
                obj.text = 'true'

                obj = elem.find('./{http://schemas.microsoft.com/developer/msbuild/2003}UseLibraryDependencyInputs')
                if obj is None:
                    obj = ET.SubElement(elem, 'UseLibraryDependencyInputs')
                obj.text = 'true'
                break

    # Fix up link settings.
    for elem in root.findall('./{http://schemas.microsoft.com/developer/msbuild/2003}ItemDefinitionGroup/{http://schemas.microsoft.com/developer/msbuild/2003}Link'):

        # We remove extraneous /machine:X86 from linker flags.
        obj = elem.find('./{http://schemas.microsoft.com/developer/msbuild/2003}AdditionalOptions')
        if obj is None:
            obj = ET.SubElement(elem, 'AdditionalOptions')
            obj.text = ''
        obj.text = obj.text.replace('/machine:X86', '')
        
        # We replace wrongly generated \LIBPATH: sub-strings with /LIBPATH: ones.
        obj = elem.find('./{http://schemas.microsoft.com/developer/msbuild/2003}AdditionalDependencies')
        if obj is None:
            obj = ET.SubElement(elem, 'AdditionalDependencies')
            obj.text = ''
        obj.text = obj.text.replace('\\LIBPATH:', '/LIBPATH:')

    # Fix up librarian settings.
    for elem in root.findall('./{http://schemas.microsoft.com/developer/msbuild/2003}ItemDefinitionGroup/{http://schemas.microsoft.com/developer/msbuild/2003}Lib/{http://schemas.microsoft.com/developer/msbuild/2003}AdditionalOptions'):

        # We remove extraneous /machine:X86 from linker flags
        elem.text = elem.text.replace('/machine:X86', '')

    # Update the file with our modifications.
    root.write(filename, encoding='utf-8', xml_declaration=True)

    print "Updated project: " + filename
    print
