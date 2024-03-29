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

package apple.gameplaykit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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

/**
 * A collection of GKGraphNodes that are governed by a mesh formed by the space between a set of GKPolygonObstacles
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKMeshGraph<_NodeType> extends GKGraph {
    static {
        NatJ.register();
    }

    @Generated
    protected GKMeshGraph(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKMeshGraph<?> alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKMeshGraph<?> allocWithZone(VoidPtr zone);

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
    @Selector("graphWithNodes:")
    public static native GKMeshGraph<?> graphWithNodes(@NotNull NSArray<? extends GKGraphNode> nodes);

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
    public static native GKMeshGraph<?> new_objc();

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

    /**
     * Adds obstacles to this mesh graph. Only reflected after the next triangulate call.
     */
    @Generated
    @Selector("addObstacles:")
    public native void addObstacles(@NotNull NSArray<? extends GKPolygonObstacle> obstacles);

    /**
     * The distance by which all obstacles are extruded.
     * This is most commonly the spatial bounding radius of a potential traveler on this path
     */
    @Generated
    @Selector("bufferRadius")
    public native float bufferRadius();

    /**
     * Returns the class of the specified generic index
     */
    @NotNull
    @Generated
    @Selector("classForGenericArgumentAtIndex:")
    public native Class classForGenericArgumentAtIndex(@NUInt long index);

    /**
     * Connects the node to this graph by inserting it into an existing triangle and making the appropriate connections
     * Node must be in the space defined by the min and max coordinates of this graph.
     * 
     * @param node the node to connect
     */
    @Generated
    @Selector("connectNodeUsingObstacles:")
    public native void connectNodeUsingObstacles(@NotNull GKGraphNode2D node);

    @Generated
    @Selector("init")
    public native GKMeshGraph<?> init();

    @Generated
    @Selector("initWithCoder:")
    public native GKMeshGraph<?> initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNodes:")
    public native GKMeshGraph<?> initWithNodes(@NotNull NSArray<? extends GKGraphNode> nodes);

    /**
     * Array of the extruded obstacles currently represented by this graph
     */
    @NotNull
    @Generated
    @Selector("obstacles")
    public native NSArray<? extends GKPolygonObstacle> obstacles();

    /**
     * Removes obstacles from this graph. Only reflected after the next triangulate call.
     */
    @Generated
    @Selector("removeObstacles:")
    public native void removeObstacles(@NotNull NSArray<? extends GKPolygonObstacle> obstacles);

    /**
     * Specifies how graph nodes are generated when you triangulate this graph.
     * You can combine triangulation modes using the | (OR) operator
     * 
     * @see GKMeshGraphTriangulationMode
     */
    @Generated
    @Selector("setTriangulationMode:")
    public native void setTriangulationMode(@NUInt long value);

    /**
     * The number of triangles currently in this mesh graph
     */
    @Generated
    @Selector("triangleCount")
    @NUInt
    public native long triangleCount();

    /**
     * Generates a new triangle mesh for the given obstacles.
     * This should be called after some number of calls to addObstacle
     * The negative space between all input obstacles are triangulated to create a mesh
     * This mesh is turned into a set of connected graph nodes based on
     */
    @Generated
    @Selector("triangulate")
    public native void triangulate();

    /**
     * Specifies how graph nodes are generated when you triangulate this graph.
     * You can combine triangulation modes using the | (OR) operator
     * 
     * @see GKMeshGraphTriangulationMode
     */
    @Generated
    @Selector("triangulationMode")
    @NUInt
    public native long triangulationMode();

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
