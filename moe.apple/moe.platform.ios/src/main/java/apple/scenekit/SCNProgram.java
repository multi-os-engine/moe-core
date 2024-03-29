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

package apple.scenekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.metal.protocol.MTLLibrary;
import apple.scenekit.protocol.SCNProgramDelegate;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * SCNProgram
 * 
 * A SCNProgram lets you specify custom shaders to use when rendering materials.
 */
@Generated
@Library("SceneKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SCNProgram extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SCNProgram(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SCNProgram alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SCNProgram allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native SCNProgram new_objc();

    /**
     * program
     * 
     * Creates and initialize a program instance.
     */
    @Generated
    @Selector("program")
    public static native SCNProgram program();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    /**
     * [@property] delegate
     * 
     * Determines the receiver's delegate
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native SCNProgramDelegate delegate();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] fragmentFunctionName
     * 
     * Determines the receiver's fragment function name.
     * 
     * The name of the fragment function (for Metal programs).
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("fragmentFunctionName")
    public native String fragmentFunctionName();

    /**
     * [@property] fragmentShader
     * 
     * Determines the receiver's fragment shader.
     */
    @Nullable
    @Generated
    @Selector("fragmentShader")
    public native String fragmentShader();

    /**
     * handleBindingOfBufferNamed:frequency:usingBlock:
     * 
     * Sets the block to call at render time to bind the buffer of the specified symbol of the receiver's program.
     * 
     * This method can only be used with Metal based programs.
     * 
     * API-Since: 9.0
     * 
     * @param name      The name of the buffer to bind.
     * @param frequency The frequency at which the block has to be invoked. Can be per frame, per node or per geometry
     *                  or material. See SCNBufferBindingBlock above.
     * @param block     The block that binds the buffer.
     */
    @Generated
    @Selector("handleBindingOfBufferNamed:frequency:usingBlock:")
    public native void handleBindingOfBufferNamedFrequencyUsingBlock(@NotNull String name, @NInt long frequency,
            @NotNull @ObjCBlock(name = "call_handleBindingOfBufferNamedFrequencyUsingBlock") Block_handleBindingOfBufferNamedFrequencyUsingBlock block);

    @Generated
    @Selector("init")
    public native SCNProgram init();

    @Generated
    @Selector("initWithCoder:")
    public native SCNProgram initWithCoder(@NotNull NSCoder coder);

    /**
     * [@property] opaque
     * 
     * Determines the receiver's fragment are opaque or not. Defaults to YES.
     */
    @Generated
    @Selector("isOpaque")
    public native boolean isOpaque();

    /**
     * [@property] opaque
     * 
     * Determines the receiver's fragment are opaque or not. Defaults to YES.
     */
    @Generated
    @Selector("setOpaque:")
    public native void setOpaque(boolean value);

    /**
     * [@property] library
     * 
     * Specifies the Metal library to use to locate the function names specified above.
     * 
     * If set to nil the default library is used. Defaults to nil.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("library")
    @MappedReturn(ObjCObjectMapper.class)
    public native MTLLibrary library();

    /**
     * semanticForSymbol:
     * 
     * Retrieves the SceneKit semantic associated to a symbol from the program source code.
     * 
     * @param symbol A symbol from the program source code.
     */
    @Nullable
    @Generated
    @Selector("semanticForSymbol:")
    public native String semanticForSymbol(@NotNull String symbol);

    /**
     * [@property] delegate
     * 
     * Determines the receiver's delegate
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) SCNProgramDelegate value);

    /**
     * [@property] delegate
     * 
     * Determines the receiver's delegate
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) SCNProgramDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * [@property] fragmentFunctionName
     * 
     * Determines the receiver's fragment function name.
     * 
     * The name of the fragment function (for Metal programs).
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setFragmentFunctionName:")
    public native void setFragmentFunctionName(@Nullable String value);

    /**
     * [@property] fragmentShader
     * 
     * Determines the receiver's fragment shader.
     */
    @Generated
    @Selector("setFragmentShader:")
    public native void setFragmentShader(@Nullable String value);

    /**
     * [@property] library
     * 
     * Specifies the Metal library to use to locate the function names specified above.
     * 
     * If set to nil the default library is used. Defaults to nil.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setLibrary:")
    public native void setLibrary(@Nullable @Mapped(ObjCObjectMapper.class) MTLLibrary value);

    /**
     * setSemantic:forSymbol:options:
     * 
     * Associates a SceneKit semantic to a symbol.
     * 
     * Associates semantics handled by the SceneKit runtime to a symbol from the program. Supported semantics are listed
     * in SCNGeometry.h and SCNNode.h.
     * 
     * @param semantic The SceneKit semantic to associate to the specified symbol.
     * @param symbol   A symbol from the program source code.
     * @param options  An optional dictionary. See the 'Semantic options' above.
     */
    @Generated
    @Selector("setSemantic:forSymbol:options:")
    public native void setSemanticForSymbolOptions(@Nullable String semantic, @NotNull String symbol,
            @Nullable NSDictionary<String, ?> options);

    /**
     * [@property] vertexFunctionName
     * 
     * Determines the receiver's vertex function name.
     * 
     * The name of the vertex function (for Metal programs).
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setVertexFunctionName:")
    public native void setVertexFunctionName(@Nullable String value);

    /**
     * [@property] vertexShader
     * 
     * Determines the receiver's vertex shader.
     */
    @Generated
    @Selector("setVertexShader:")
    public native void setVertexShader(@Nullable String value);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * [@property] vertexFunctionName
     * 
     * Determines the receiver's vertex function name.
     * 
     * The name of the vertex function (for Metal programs).
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("vertexFunctionName")
    public native String vertexFunctionName();

    /**
     * [@property] vertexShader
     * 
     * Determines the receiver's vertex shader.
     */
    @Nullable
    @Generated
    @Selector("vertexShader")
    public native String vertexShader();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_handleBindingOfBufferNamedFrequencyUsingBlock {
        @Generated
        void call_handleBindingOfBufferNamedFrequencyUsingBlock(@NotNull @Mapped(ObjCObjectMapper.class) Object buffer,
                @NotNull SCNNode node, @NotNull @Mapped(ObjCObjectMapper.class) Object shadable,
                @NotNull SCNRenderer renderer);
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
