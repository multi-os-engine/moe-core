
package org.moe.cmakegen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map.Entry;

import org.moe.document.pbxproj.*;
import org.moe.document.pbxproj.nextstep.Array;
import org.moe.document.pbxproj.nextstep.Dictionary;
import org.moe.document.pbxproj.nextstep.NextStep;
import org.moe.document.pbxproj.nextstep.Value;

public class Main {
	
	static final String severityLevel = "WARNING";
	
	static final String[] disabledProjects = new String[] {
			"android.art.sigchainlib",
			"android.system.core.libnativebridge",
			"android.external.libunwind",
			"moe.natj",
			"moe.sdk"
	}; 
	
	static final HashMap<String, LinkedList<String>> includes = new HashMap<>();
	
	static final HashMap<String, LinkedList<String>> todos = new HashMap<>();
	
	static final HashMap<String, LinkedList<String>> dependencies = new HashMap<>();
	
	static final HashMap<String, LinkedList<String>> extras = new HashMap<>();
	
	static final String compatPath = "../moe.base/src_windows/main/native";
	
	static final String[] extensions = new String[] {"c", "cc", "cpp"}; 
	
	static final String[] winDeps = new String[] {"comsuppw", "psapi", "ws2_32", "mswsock", "wbemuuid"};
	
	static final String[] skipDeps = new String[] {"m", "z", "edit", "curses", "sqlite3", "pthread"};

	static final HashMap<String, LinkedList<String>> winLDPaths = new HashMap<>();
	
	private static class StringPair {
		String a;
		String b;
		StringPair(String a, String b) {
			this.a = a;
			this.b = b;
		}
	}
	
	static final StringPair[] mappers = new StringPair[] {
			new StringPair("clang+llvm-3.7.0-x86_64-apple-darwin", "clang+llvm-3.7.0-$(PlatformTargetAsMSBuildArchitecture)-microsoft-windows-$(Configuration)"),
			new StringPair("interpreter_goto_table_impl.cc", "interpreter_switch_impl.cc"),
			new StringPair("src/main/native/UnixFileSystem_md.c",  "src_windows/main/native/java/io/Win32FileSystem_md.c")
	};
	
	static {
		{
			LinkedList<String> sqlite = new LinkedList<>();
			sqlite.add("../../../../../external/sqlite/dist");
			includes.put("android.external.javasqlite", sqlite);

			LinkedList<String> zlib = new LinkedList<>();
			zlib.add("../../../../../external/zlib");
			includes.put("android.system.core.libziparchive", zlib);
			includes.put("android.art.runtime", zlib);
			
			LinkedList<String> libcore = new LinkedList<>();
			libcore.add("../../../../../libcore/ojluni/src/main/native");
			includes.put("android.libcore", libcore);
		}
		
		{
			LinkedList<String> libcore = new LinkedList<>();
			libcore.add("../../../../../libcore/ojluni/src_windows/main/native/java/io/dirent_md.c");
			extras.put("android.libcore", libcore);			
		}
		
		{
			LinkedList<String> runtime = new LinkedList<>();
			runtime.add("fault_handler.cc");
			runtime.add("signal_catcher.cc");
			todos.put("android.art.runtime", runtime);
			
			LinkedList<String> libcore_net = new LinkedList<>();
			libcore_net.add("net_util.c");
			libcore_net.add("Inet6AddressImpl.c");
			libcore_net.add("InheritedChannel.c");
			libcore_net.add("Inet4AddressImpl.c");
			libcore_net.add("SocketInputStream.c");
			libcore_net.add("SocketOutputStream.c");
			libcore_net.add("DatagramDispatcher.c");
			libcore_net.add("DatagramChannelImpl.c");
			libcore_net.add("SocketChannelImpl.c");
			libcore_net.add("ServerSocketChannelImpl.c");
			libcore_net.add("PlainSocketImpl.c");
			libcore_net.add("NetworkInterface.c");
			libcore_net.add("FileSystemPreferences.c");
			libcore_net.add("PlainDatagramSocketImpl.c");
			libcore_net.add("FileChannelImpl.c");
			libcore_net.add("net_util_md.c");
			libcore_net.add("linux_close.cpp");
			libcore_net.add("Net.c");
			libcore_net.add("UNIXProcess_md.c");
			libcore_net.add("FileDispatcherImpl.c");
			todos.put("android.libcore", libcore_net);
		}
		
		{
			LinkedList<String> sdk = new LinkedList<>();
			sdk.add("android.external.zlib");
			sdk.add("android.external.sqlite");
			sdk.add("natj-static");
			sdk.add("libffi");
			sdk.add("Pathcch");
			sdk.add("Shlwapi");
			dependencies.put("moe.sdk", sdk);
			
			LinkedList<String> dex2oat = new LinkedList<>();
			dex2oat.add("android.external.zlib");
			dex2oat.add("android.libnativehelper");
			dependencies.put("android.art.dex2oat", dex2oat);
		}
		
		{
			LinkedList<String> sdk = new LinkedList<>();
			sdk.add("../../../../prebuilt/natj-win/$(PlatformTargetAsMSBuildArchitecture)-$(Configuration)");
			sdk.add("../../../../prebuilt/libffi/$(PlatformTargetAsMSBuildArchitecture)-microsoft-windows-msvc-$(Configuration)/libs");
			winLDPaths.put("moe.sdk", sdk);
		}
	}
	
	static public void main(String[] args) throws ProjectException, FileNotFoundException {
		if (args.length != 1) {
			printUsage();
			return;
		}
		
		File root = new File(args[0]);
		
		if (!root.exists()) {
			System.out.println("root path (" + root.getPath() + ") does not exist");
			printUsage();
		}		
		if (!root.isDirectory()) {
			System.out.println("root path (" + root.getPath() + ") is not a directory");
			printUsage();
		}
		
		LinkedList<String> subProjects = new LinkedList<>();
		LinkedList<String> extProjects = new LinkedList<>();
		
		for (File chield : root.listFiles()) {
			if (!chield.isDirectory()) {
				continue;
			}
			if (Arrays.asList(disabledProjects).contains(chield.getName())) {
				continue;
			}
			boolean foundXcode = false;
			boolean foundCMake = false;
			for (File file : chield.listFiles()) {
				if (file.isDirectory() && file.getName().endsWith(".xcodeproj")) {
					foundXcode = true;
					subProjects.add(chield.getName());
					
					Context ctx = new Context();
					
					processXcodeProject(new File(file, "project.pbxproj"), ctx);
					buildCMakeProject(new File(chield, "CMakeLists.txt"), ctx);
					
					break;
				}
				if (file.isFile() && file.getName().equals("CMakeLists.txt")) {
					foundCMake = true;
				}
			}
			if (!foundXcode && foundCMake) {
				extProjects.add(chield.getName());
			}
		}
		
		Context ctx = new Context();
		processXcodeProject(new File(new File(new File(root, "moe.sdk"), "moe.sdk.xcodeproj"), "project.pbxproj"), ctx);
		buildMainCMakeProject(new File(new File(root, "moe.sdk"), "CMakeLists.txt"), subProjects, extProjects, ctx);
	}
	
	static private void printUsage() {
		System.out.println("cmakebuilder <source directory> <destionation directory>");
	}
	
	static private class Context {
		HashSet<String> sourceFiles = new HashSet<>();
		LinkedList<String> headerPaths = new LinkedList<>();
		LinkedList<String> userHeaderPaths = new LinkedList<>();
		LinkedList<String> externalDependees = new LinkedList<>();
		LinkedList<String> ldPaths = new LinkedList<>();
		LinkedList<String> dependees = new LinkedList<>();
		LinkedList<String> defines = new LinkedList<>();
		String pch = null;
		boolean isExec = false;
	}
	
	static private void processXcodeProject(File projectFile, Context ctx) throws ProjectException {
		ProjFile project = new ProjFile(projectFile);
		String name;
		String fullName;
		{
			String[] nameParts = projectFile.getParentFile().getName().split("\\.");
			name = nameParts[nameParts.length - 2];
			fullName = String.join(".", Arrays.copyOfRange(nameParts, 0, nameParts.length - 1));
		}
		LinkedList<String> todoList = todos.get(fullName);		
		
		PBXProject root = project.getRoot().getRootObject().getReferenced();
		
		final String SkipMarker = "!SKIP!";
		
		// Collect main and depended targets.
		LinkedList<PBXNativeTarget> targets = new LinkedList<>();
		{
			LinkedList<PBXNativeTarget> targetsToProcess = new LinkedList<>();
			for (PBXObjectRef<PBXNativeTarget> targetRef : root.getTargets()) {
				PBXNativeTarget target = targetRef.getReferenced();
				if (target.getName().equals(name)) {
					targetsToProcess.add(target);
					break;
				}
			}
			while (!targetsToProcess.isEmpty()) {
				PBXNativeTarget target = targetsToProcess.getFirst();
				targetsToProcess.removeFirst();
				targets.add(target);
				for (PBXObjectRef<?> depRef : target.getDependencies()) {
					PBXTargetDependency dep = (PBXTargetDependency)depRef.getReferenced();
					targetsToProcess.add(dep.getTarget().getReferenced());
				}
			}
		}
		
		LinkedList<String> libraryPaths = new LinkedList<>();
		LinkedList<String> ldFlags = new LinkedList<>();
		
		for (PBXNativeTarget target : targets) {
			// Collect source files for every target.
			for (PBXObjectRef<PBXBuildPhase> phaseRef : target.getBuildPhases()) {
				PBXBuildPhase phase = phaseRef.getReferenced();
				if (phase instanceof PBXSourcesBuildPhase) {
					PBXSourcesBuildPhase sourcesPhase = (PBXSourcesBuildPhase)phase;
					for (PBXObjectRef<PBXBuildFile> source : sourcesPhase.getFiles()) {
						PBXObject file = source.getReferenced().getFileRef().getReferenced();
						if (file instanceof PBXFileReference) {
							String path = null;							
							
							{
								String fileName = ((PBXFileReference) file).getPath();
								int idx = fileName.lastIndexOf('.');
								if (idx < 0) {
									continue;
								}
								if (!Arrays.asList(extensions).contains(fileName.substring(idx+1))) {
									continue;
								}
							}
							
							if (todoList != null && todoList.contains(((PBXFileReference) file).getPath())) {
								continue;
							}
							
							LinkedList<PBXGroup> groups = new LinkedList<>();							
							groups.add(root.getMainGroup().getReferenced());
							while (path == null && !groups.isEmpty()) {
								PBXGroup group = groups.getLast();
								
								// At first search for file match.
								for (PBXObjectRef<? extends PBXObject> childRef : group.getChildren()) {
									if (childRef.getReferenced() == file) {
										StringBuilder builder = new StringBuilder();
										for (PBXGroup parent : groups) {
											String sourceTree = parent.getSourceTree();
											if (sourceTree.equals("<group>")) {
												if (parent.getPath() != null) {
													builder.append(parent.getPath());
													builder.append('/');
												}
											} else if (sourceTree.equals("SOURCE_ROOT")) {
												builder = new StringBuilder();
												if (parent.getPath() != null) {
													builder.append(parent.getPath());
													builder.append('/');
												}
											} else {
												path = SkipMarker;
												break;
											}
										}
										if (builder.toString() != SkipMarker) {
											builder.append(((PBXFileReference) file).getPath());
										}
										path = builder.toString();
										break;
									}
								}
								
								if (path == null) {
									// After that search in children.
									for (PBXObjectRef<? extends PBXObject> childRef : group.getChildren()) {
										PBXObject chield = childRef.getReferenced();
										if (chield instanceof PBXGroup) {
											groups.addLast((PBXGroup)chield);
											break;
										}
									}
									
									// If we don't have more children then pop.
									if (groups.getLast() == group) {
										while (true) {
											groups.removeLast();
											if (groups.isEmpty()) {
												break;
											}
	
											PBXGroup parent = groups.getLast();
											boolean isAfterCurrent = false;
											for (PBXObjectRef<? extends PBXObject> childRef : parent.getChildren()) {
												PBXObject chield = childRef.getReferenced();
												
												if (!isAfterCurrent && chield == group) {
													isAfterCurrent = true;
													continue;
												}
												
												if (isAfterCurrent && chield instanceof PBXGroup) {
													groups.addLast((PBXGroup)chield);
													break;
												}
											}
											
											if (groups.getLast() != parent) {
												break;
											}
											group = parent;
										}
									}
								}
								
							}
							
							if (path != null && path != SkipMarker) {
								ctx.sourceFiles.add(path);
							}
						}
					}
				}
			}
			
			// For now, collect build settings only from the main target.
			if (target.getName().equals(name)) {
				// Also fetch product type.
				ctx.isExec = target.getProductType().equals("com.apple.product-type.tool");
				
				XCBuildConfiguration[] configurations = new XCBuildConfiguration[2];
				
				{
					int i = 0;
					for (PBXObjectRef<XCConfigurationList> list : new PBXObjectRef[] {root.getBuildConfigurationList(), target.getBuildConfigurationList()}) {
						for (PBXObjectRef<XCBuildConfiguration> configurationRef : list.getReferenced().getBuildConfigurations()) {
							XCBuildConfiguration configuration = configurationRef.getReferenced();
							// For now only use settings from Release configuration.
							if (configuration.getName().equals("Release")) {
								configurations[i++] = configuration;
								break;
							}
						}
					}
				}
				
				for (XCBuildConfiguration configuration : configurations) {					
					Dictionary<Value, NextStep> settings = configuration.getBuildSettings();
					
					{
						NextStep pch = settings.getValue("GCC_PREFIX_HEADER");
						if (pch != null) {
							ctx.pch = ((Value)pch).value;
						}
					}
					
					class Task {
						LinkedList<String> list;
						String key;
						Task(LinkedList<String> list, String key) { this.list = list; this.key = key; }						
					};
					
					for (Task task : new Task[] {
							new Task(ctx.headerPaths, "HEADER_SEARCH_PATHS"),
							new Task(ctx.userHeaderPaths, "USER_HEADER_SEARCH_PATHS"),
							new Task(libraryPaths, "LIBRARY_SEARCH_PATHS"),
							new Task(ldFlags, "OTHER_LDFLAGS"),
							new Task(ctx.defines, "GCC_PREPROCESSOR_DEFINITIONS"),
					}) {
						Object value = settings.getValue(task.key);
						
						if (value == null) {
							continue;
						}
						
						if (value instanceof Array) {
							for (Value path : (Array<Value>)value) {
								task.list.add(((Value)path).value);
							}
						} else {
							String str = ((Value)value).value;
							while (!str.isEmpty()) {
								boolean isOdd = false;
								for (int i = 0; i < str.length(); i++) {
									char c = str.charAt(i);
									
									if (c == '"') {
										isOdd = !isOdd;
									}
									
									if (isOdd) {
										if (i == str.length() - 1) {
											str = "";
											break;
										}
										continue;
									}
									
									if (c == ' ') {
										task.list.add(str.substring(0, i));
										str = str.substring(i + 1);
										break;
									}
									
									if (i == str.length() - 1) {
										task.list.add(str.substring(0, i + 1));
										str = "";
										break;
									}
								}
							}
						}
					}
				}
			}
		}
		
		LinkedList<String> extra = extras.get(fullName);
		if (extra != null) {
			ctx.sourceFiles.addAll(extra);
		}
		
		LinkedList<String> include = includes.get(fullName);
		if (include != null) {
			ctx.headerPaths.addAll(include);
		}
		
		ctx.headerPaths.add(compatPath);
		
		{
			LinkedList<String> ldPaths = winLDPaths.get(fullName);
			if (ldPaths != null) {
				libraryPaths.addAll(ldPaths);
			}
		}
		
		ctx.headerPaths.add("../mingw.winpthreads/include");
		ctx.headerPaths.add("../mingw.wincrt/include");
		
		for (LinkedList<String> list : new LinkedList[]{ctx.headerPaths, ctx.userHeaderPaths, libraryPaths}) {
			for (int i = 0; i < list.size(); i++) {
				String str = list.get(i).replace("$(SRCROOT)/", "");
				str = str.replace("$(SEVERITY_LEVEL)", severityLevel);
				if (str.startsWith("\"")) {
					str = "\"${PROJECT_SOURCE_DIR}/"  + str.substring(1);
				} else {
					str = "${PROJECT_SOURCE_DIR}/" + str;
				}
				list.set(i, str);
			}
		}
		
		if (ctx.pch != null) {
			ctx.pch = ctx.pch.replace("$(SRCROOT)/", "");
			ctx.pch = ctx.pch.replace("$(SEVERITY_LEVEL)", severityLevel);
			ctx.pch = "${PROJECT_SOURCE_DIR}/" + ctx.pch;
		}
		
		LinkedList<String> dependency = dependencies.get(fullName);
		if (dependency != null) {
			ctx.dependees.addAll(dependency);
		}
		
		LinkedList<String> notNeededLDFlags = new LinkedList<>();
		LinkedList<String> notNeededLDPaths = new LinkedList<>();
		
		final String prefix = "${PROJECT_SOURCE_DIR}/../";
		for (String path : libraryPaths) {
			if (!path.startsWith(prefix)) {
				continue;
			}
			path = path.substring(prefix.length());
			if (path.startsWith(".")) {
				continue;
			}
			path = path.substring(0, path.indexOf('/'));
			if (ctx.dependees.contains(path)) {
				continue;
			}
			if (Arrays.asList(disabledProjects).contains(path)) {
				continue;
			}
			String depName = path;
			int idx = depName.lastIndexOf('.');
			if (idx >= 0) {
				depName = depName.substring(idx + 1);
			}
			
			String expected = "-l" + depName;
			
			for (String flag : ldFlags) {
				if (flag.equals(expected)) {
					notNeededLDFlags.add(flag);
					notNeededLDPaths.add(path);
					ctx.dependees.add(path);
					break;
				}
			}
		}

		ctx.externalDependees = ldFlags;
		ctx.ldPaths = libraryPaths;
		ctx.externalDependees.removeAll(notNeededLDFlags);
		ctx.ldPaths.removeAll(notNeededLDPaths);
		
		{
			ListIterator<String> it = ctx.externalDependees.listIterator();
			while (it.hasNext()) {
				String last = it.next();
				if (!last.startsWith("-l")) {
					it.remove();
					continue;
				}
				String trimmed = last.substring(2);
				if (Arrays.asList(skipDeps).contains(trimmed)) {
					it.remove();
					continue;
				}
				boolean removed = false;
				for (String disabledProject : disabledProjects) {
					int idx = disabledProject.lastIndexOf(".");
					if (idx >= 0) {
						disabledProject = disabledProject.substring(idx + 1);
					}
					if (disabledProject.equals(trimmed)) {
						removed = true;
						it.remove();
						break;
					}
				}
				if (!removed) {
					it.set(trimmed);
				}
			}
		}
		
		{
			ListIterator<String> it = ctx.ldPaths.listIterator();
			while (it.hasNext()) {
				String last = it.next();
				if (!last.startsWith(prefix + "..")) {
					it.remove();
					continue;
				}
				it.set("/LIBPATH:" + last);
			}
		}
		
		for (LinkedList<String> list : new LinkedList[]{ctx.headerPaths, ctx.userHeaderPaths, ctx.ldPaths}) {
			ListIterator<String> it = list.listIterator();
			while (it.hasNext()) {
				String last = it.next();
				for (StringPair mapper : mappers) {
					last = last.replace(mapper.a, mapper.b);
				}
				it.set(last);
			}
		}
		
		{
			HashSet<String> sourceFiles = new HashSet<>();
			Iterator<String> it = ctx.sourceFiles.iterator();
			while (it.hasNext()) {
				String last = it.next();
				for (StringPair mapper : mappers) {
					last = last.replace(mapper.a, mapper.b);
				}
				sourceFiles.add(last);
			}
			ctx.sourceFiles = sourceFiles;
		}

		{
			ListIterator<String> it = ctx.ldPaths.listIterator();
			while (it.hasNext()) {
				String last = it.next();
				it.set("\"" + last + "\"");
			}
		}
	}

	static private void buildCMakeProject(File projectFile, Context ctx) throws ProjectException, FileNotFoundException {
		String name = projectFile.getParentFile().getName();
		
		PrintWriter writer = new PrintWriter(projectFile);
		
		writer.println("project(" + name + ")");
		writer.println("");

		if (ctx.isExec) {		
			writer.println("add_executable(" + name + " " + String.join(" ", ctx.sourceFiles)  + ")");
			writer.println("");
			writer.println("target_link_libraries(" + name + " " + (!ctx.ldPaths.isEmpty() ? String.join(" ", ctx.ldPaths) + " " : "") + (!ctx.externalDependees.isEmpty() ? String.join(" ", ctx.externalDependees) + " " : "") + (!ctx.dependees.isEmpty() ? String.join(" ", ctx.dependees) + " " : "") + "moe.windows.compat mingw.winpthreads mingw.wincrt " + (winDeps.length > 0 ? String.join(" ", winDeps) : "") + ")");
		} else {
			writer.println("add_library(" + name + " STATIC " + String.join(" ", ctx.sourceFiles)  + ")");
		}
	    writer.println("");
	    
	    if (ctx.pch != null) {
	    	writer.println("set_target_properties(" + name + " PROPERTIES COMPILE_FLAGS \"-include " + ctx.pch + "\")");
	    	writer.println("");
	    }
	    
	    if (ctx.defines.size() > 0) {
	    	writer.println("target_compile_definitions(" + name + " PRIVATE " + String.join(" ", ctx.defines) + ")");
	    	writer.println("");
	    }
	    
	    if (ctx.headerPaths.size() > 0) {
	    	writer.println("target_include_directories(" + name + " SYSTEM PRIVATE " + String.join(" ", ctx.headerPaths) + ")");
	    	writer.println("");
	    }

		if (ctx.userHeaderPaths.size() > 0) {
			writer.println("target_include_directories(" + name + " PRIVATE " + String.join(" ", ctx.userHeaderPaths) + ")");
			writer.println("");
		}
		
		writer.close();
	}
	
	static private void buildMainCMakeProject(File projectFile, LinkedList<String> subProjects, LinkedList<String> extProjects, Context ctx) throws FileNotFoundException {
		PrintWriter writer = new PrintWriter(projectFile);
		
		writer.println("cmake_minimum_required(VERSION 3.0.0)");
		writer.println("");
		writer.println("# the name of the target operating system");
		writer.println("SET(CMAKE_SYSTEM_NAME Windows)");
		writer.println("");
		writer.println("SET(CMAKE_VS_PLATFORM_TOOLSET v140_lang_3_7)");
		writer.println("");
		writer.println("project(moe_windows)");
		
		writer.println("");
		writer.println("");
		
		if (subProjects.size() > 0) {
			writer.println("# Include subprojects");
			for (String subProject : subProjects) {
				writer.println("add_subdirectory(${PROJECT_SOURCE_DIR}/../" + subProject + " ${PROJECT_SOURCE_DIR}/../" + subProject + "/build_windows)");
			}
		}
		
		if (extProjects.size() > 0) {
			writer.println("# Include external projects");
			for (String extProject : extProjects) {
				writer.println("add_subdirectory(${PROJECT_SOURCE_DIR}/../" + extProject + " ${PROJECT_SOURCE_DIR}/../" + extProject + "/build_windows)");
			}
		}
		
		writer.println("");
		writer.println("");
		
		writer.println("add_library(moe.windows.compat STATIC ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native/base.cpp)");
		writer.println("set_target_properties(moe.windows.compat PROPERTIES COMPILE_FLAGS \"/-include MOE-Prefix.pch\")");
		writer.println("target_compile_definitions(moe.windows.compat PRIVATE MOE)");
		writer.println("target_include_directories(moe.windows.compat SYSTEM PRIVATE ${PROJECT_SOURCE_DIR}/../moe.base/src_windows/main/native ${PROJECT_SOURCE_DIR}/../moe.base/src/main/native ${PROJECT_SOURCE_DIR}/../mingw.wincrt/include ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include)");
		
		writer.println("");
		writer.println("");
		
		writer.println("add_library(moe.sdk SHARED " + String.join(" ", ctx.sourceFiles) + " ${PROJECT_SOURCE_DIR}/src_windows/MOE.cpp)");
		
		if (ctx.pch != null) {
			writer.println("set_target_properties(moe.sdk PROPERTIES COMPILE_FLAGS \"/-include " + ctx.pch + "\")");
		}
		
		if (ctx.defines.size() > 0) {
			writer.println("target_compile_definitions(moe.sdk PRIVATE " + String.join(" ", ctx.defines) + ")");
		}
		
	    writer.println("target_include_directories(moe.sdk SYSTEM PRIVATE " + (ctx.headerPaths.size() > 0 ? String.join(" ", ctx.headerPaths) + " " : "" ) + "${PROJECT_SOURCE_DIR}/../mingw.wincrt/include ${PROJECT_SOURCE_DIR}/../mingw.winpthreads/include ${PROJECT_SOURCE_DIR}/src_windows/modern)");
		
	    if (ctx.userHeaderPaths.size() > 0) {
			writer.println("target_include_directories(moe.sdk PRIVATE " + String.join(" ", ctx.userHeaderPaths) + ")");
		}
		writer.println("target_link_libraries(moe.sdk " + (!ctx.ldPaths.isEmpty() ? String.join(" ", ctx.ldPaths) + " " : "") + (!ctx.externalDependees.isEmpty() ? String.join(" ", ctx.externalDependees) + " " : "") + (!ctx.dependees.isEmpty() ? String.join(" ", ctx.dependees) + " " : "" ) + "moe.windows.compat mingw.winpthreads mingw.wincrt " + (winDeps.length > 0 ? String.join(" ", winDeps) : "") + ")");
		
		writer.close();
	}
	
}
