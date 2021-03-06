/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package apple.modelio;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.modelio.protocol.MDLMeshBufferAllocator;
import apple.scenekit.SCNNode;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("ModelIO")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MDLVoxelArray extends MDLObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MDLVoxelArray(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MDLVoxelArray alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("objectWithSCNNode:")
    public static native MDLVoxelArray objectWithSCNNode(SCNNode scnNode);

    @Generated
    @Selector("objectWithSCNNode:bufferAllocator:")
    public static native MDLVoxelArray objectWithSCNNodeBufferAllocator(SCNNode scnNode,
            @Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator bufferAllocator);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("coarseMesh")
    public native MDLMesh coarseMesh();

    @Generated
    @Selector("coarseMeshUsingAllocator:")
    public native MDLMesh coarseMeshUsingAllocator(@Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator allocator);

    @Generated
    @Selector("convertToSignedShellField")
    public native void convertToSignedShellField();

    @Generated
    @Selector("count")
    @NUInt
    public native long count();

    @Generated
    @Selector("differenceWithVoxels:")
    public native void differenceWithVoxels(MDLVoxelArray voxels);

    @Generated
    @Selector("init")
    public native MDLVoxelArray init();

    @Generated
    @Selector("initWithAsset:divisions:patchRadius:")
    public native MDLVoxelArray initWithAssetDivisionsPatchRadius(MDLAsset asset, int divisions, float patchRadius);

    @Generated
    @Selector("intersectWithVoxels:")
    public native void intersectWithVoxels(MDLVoxelArray voxels);

    @Generated
    @Selector("isValidSignedShellField")
    public native boolean isValidSignedShellField();

    @Generated
    @Selector("meshUsingAllocator:")
    public native MDLMesh meshUsingAllocator(@Mapped(ObjCObjectMapper.class) MDLMeshBufferAllocator allocator);

    @Generated
    @Selector("setShellFieldExteriorThickness:")
    public native void setShellFieldExteriorThickness(float value);

    @Generated
    @Selector("setShellFieldInteriorThickness:")
    public native void setShellFieldInteriorThickness(float value);

    @Generated
    @Selector("setVoxelsForMesh:divisions:patchRadius:")
    public native void setVoxelsForMeshDivisionsPatchRadius(MDLMesh mesh, int divisions, float patchRadius);

    @Generated
    @Selector("shellFieldExteriorThickness")
    public native float shellFieldExteriorThickness();

    @Generated
    @Selector("shellFieldInteriorThickness")
    public native float shellFieldInteriorThickness();

    @Generated
    @Selector("unionWithVoxels:")
    public native void unionWithVoxels(MDLVoxelArray voxels);

    @Generated
    @Selector("voxelIndices")
    public native NSData voxelIndices();
}
