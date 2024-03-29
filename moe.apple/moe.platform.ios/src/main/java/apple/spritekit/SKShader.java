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

package apple.spritekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKShader extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKShader(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKShader alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKShader allocWithZone(VoidPtr zone);

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
    public static native SKShader new_objc();

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
    @Selector("shader")
    public static native SKShader shader();

    /**
     * Loads a shader source file named 'name' from the main bundle. This is simpler yet functionally equivalent to the
     * following code
     * 
     * [SKShader shaderWithSource:[NSString stringWithContentsOfFile:[[NSBundle mainBundle] pathForResource:name
     * ofType:@"fsh"]
     * encoding:NSUTF8StringEncoding
     * error:NULL]];
     * 
     * The encoding is assumed to be NSUTF8StringEncoding.
     */
    @Generated
    @Selector("shaderWithFileNamed:")
    public static native SKShader shaderWithFileNamed(@NotNull String name);

    @Generated
    @Selector("shaderWithSource:")
    public static native SKShader shaderWithSource(@NotNull String source);

    @Generated
    @Selector("shaderWithSource:uniforms:")
    public static native SKShader shaderWithSourceUniforms(@NotNull String source,
            @NotNull NSArray<? extends SKUniform> uniforms);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("addUniform:")
    public native void addUniform(@NotNull SKUniform uniform);

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @Selector("attributes")
    public native NSArray<? extends SKAttribute> attributes();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native SKShader init();

    @Generated
    @Selector("initWithCoder:")
    public native SKShader initWithCoder(@NotNull NSCoder coder);

    /**
     * Create a custom shader with source code.
     * 
     * @param source the source code for the custom fragment shader.
     */
    @Generated
    @Selector("initWithSource:")
    public native SKShader initWithSource(@NotNull String source);

    /**
     * Create a custom shader with source code and uniforms.
     * 
     * @param source   the source code for the custom fragment shader.
     * @param uniforms the array of uniforms supplied to this shader
     */
    @Generated
    @Selector("initWithSource:uniforms:")
    public native SKShader initWithSourceUniforms(@NotNull String source,
            @NotNull NSArray<? extends SKUniform> uniforms);

    @Generated
    @Selector("removeUniformNamed:")
    public native void removeUniformNamed(@NotNull String name);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("setAttributes:")
    public native void setAttributes(@NotNull NSArray<? extends SKAttribute> value);

    /**
     * Shader source must define the 'main' method of the fragment shader
     * 
     * Your shader must assign a premultipled fragment value to 'gl_FragColor'
     * 
     * The following implicit uniforms are available:
     * 
     * 1. sampler2D u_texture (the primary texuture attached the the sprite)
     * 
     * The following varyings are available:
     * 
     * 1. vec2 v_tex_coord (normalized texture coordiantes for the primary texture)
     * 2. vec4 v_color_mix (premultiplied color value based on color & alpha)
     * 
     * 
     * The following functions are available:
     * 
     * 1. vec4 SKDefaultShading() (returns the fragment value that would have been output if no shader was used)
     * 
     * 
     * 
     * Sample shader source that produces the same result are SpriteKit's normal rendering:
     * 
     * "void main() { gl_FragColor = SKDefaultShading(); }"
     */
    @Generated
    @Selector("setSource:")
    public native void setSource(@Nullable String value);

    /**
     * You may define additional uniforms to be used in your shader here.
     * There is no need to declare them in you source, just use them by name.
     * 
     * All uniforms declared must be used within the source.
     */
    @Generated
    @Selector("setUniforms:")
    public native void setUniforms(@NotNull NSArray<? extends SKUniform> value);

    /**
     * Shader source must define the 'main' method of the fragment shader
     * 
     * Your shader must assign a premultipled fragment value to 'gl_FragColor'
     * 
     * The following implicit uniforms are available:
     * 
     * 1. sampler2D u_texture (the primary texuture attached the the sprite)
     * 
     * The following varyings are available:
     * 
     * 1. vec2 v_tex_coord (normalized texture coordiantes for the primary texture)
     * 2. vec4 v_color_mix (premultiplied color value based on color & alpha)
     * 
     * 
     * The following functions are available:
     * 
     * 1. vec4 SKDefaultShading() (returns the fragment value that would have been output if no shader was used)
     * 
     * 
     * 
     * Sample shader source that produces the same result are SpriteKit's normal rendering:
     * 
     * "void main() { gl_FragColor = SKDefaultShading(); }"
     */
    @Nullable
    @Generated
    @Selector("source")
    public native String source();

    @Nullable
    @Generated
    @Selector("uniformNamed:")
    public native SKUniform uniformNamed(@NotNull String name);

    /**
     * You may define additional uniforms to be used in your shader here.
     * There is no need to declare them in you source, just use them by name.
     * 
     * All uniforms declared must be used within the source.
     */
    @NotNull
    @Generated
    @Selector("uniforms")
    public native NSArray<? extends SKUniform> uniforms();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
