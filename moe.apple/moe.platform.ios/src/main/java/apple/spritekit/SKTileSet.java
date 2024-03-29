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
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A tile set contains all of the tile definitions that are available for use in a tile map. In addition, it also
 * contains tile groups, which define collections of related tile definitions and the rules that govern their placement.
 * 
 * API-Since: 10.0
 */
@Generated
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKTileSet extends NSObject implements NSCopying, NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected SKTileSet(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native SKTileSet alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native SKTileSet allocWithZone(VoidPtr zone);

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
    public static native SKTileSet new_objc();

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

    /**
     * Creates a tile set from the specified tile set file. Returns nil if the URL doesn't point to a valid tile set
     * file.
     * 
     * @param url the URL of the tile set file
     */
    @Generated
    @Selector("tileSetFromURL:")
    public static native SKTileSet tileSetFromURL(@NotNull NSURL url);

    /**
     * Gets the tile set with the specified name from the SpriteKit resource bundle. Returns nil if a tile set with a
     * matching name cannot be found.
     * 
     * @param name the name of the tile set to search for
     */
    @Generated
    @Selector("tileSetNamed:")
    public static native SKTileSet tileSetNamed(@NotNull String name);

    /**
     * Create a tile set with the specified tile groups.
     * 
     * @param tileGroups the tile groups that will be available for use with this set
     */
    @Generated
    @Selector("tileSetWithTileGroups:")
    public static native SKTileSet tileSetWithTileGroups(@NotNull NSArray<? extends SKTileGroup> tileGroups);

    /**
     * Create a tile set with the specified tile groups and tile set type.
     * 
     * @param tileGroups  the tile groups that will be available for use with this set
     * @param tileSetType the type of tile set this will be
     */
    @Generated
    @Selector("tileSetWithTileGroups:tileSetType:")
    public static native SKTileSet tileSetWithTileGroupsTileSetType(@NotNull NSArray<? extends SKTileGroup> tileGroups,
            @NUInt long tileSetType);

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

    @Nullable
    @Generated
    @Selector("defaultTileGroup")
    public native SKTileGroup defaultTileGroup();

    /**
     * The default tile size is the value an SKTileMapNode will use for it's tiles when the tile set is assigned to it.
     */
    @Generated
    @Selector("defaultTileSize")
    @ByValue
    public native CGSize defaultTileSize();

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("init")
    public native SKTileSet init();

    @Generated
    @Selector("initWithCoder:")
    public native SKTileSet initWithCoder(@NotNull NSCoder coder);

    /**
     * Initilize a tile set with the specified tile groups.
     * 
     * @param tileGroups the tile groups that will be available for use with this set
     */
    @Generated
    @Selector("initWithTileGroups:")
    public native SKTileSet initWithTileGroups(@NotNull NSArray<? extends SKTileGroup> tileGroups);

    /**
     * Initilize a tile set with the specified tile groups and tile set type.
     * 
     * @param tileGroups  the tile groups that will be available for use with this set
     * @param tileSetType the type of tile set this will be
     */
    @Generated
    @Selector("initWithTileGroups:tileSetType:")
    public native SKTileSet initWithTileGroupsTileSetType(@NotNull NSArray<? extends SKTileGroup> tileGroups,
            @NUInt long tileSetType);

    /**
     * Client-assignable name for the tile set. Defaults to nil.
     */
    @Nullable
    @Generated
    @Selector("name")
    public native String name();

    @Generated
    @Selector("setDefaultTileGroup:")
    public native void setDefaultTileGroup(@Nullable SKTileGroup value);

    /**
     * The default tile size is the value an SKTileMapNode will use for it's tiles when the tile set is assigned to it.
     */
    @Generated
    @Selector("setDefaultTileSize:")
    public native void setDefaultTileSize(@ByValue CGSize value);

    /**
     * Client-assignable name for the tile set. Defaults to nil.
     */
    @Generated
    @Selector("setName:")
    public native void setName(@Nullable String value);

    /**
     * The tile groups that this set provides for use.
     */
    @Generated
    @Selector("setTileGroups:")
    public native void setTileGroups(@NotNull NSArray<? extends SKTileGroup> value);

    /**
     * The tile set type specifies how the tiles in the set will be arranged when placed in a tile map. Defaults to
     * SKTileSetTypeGrid.
     */
    @Generated
    @Selector("setType:")
    public native void setType(@NUInt long value);

    /**
     * The tile groups that this set provides for use.
     */
    @NotNull
    @Generated
    @Selector("tileGroups")
    public native NSArray<? extends SKTileGroup> tileGroups();

    /**
     * The tile set type specifies how the tiles in the set will be arranged when placed in a tile map. Defaults to
     * SKTileSetTypeGrid.
     */
    @Generated
    @Selector("type")
    @NUInt
    public native long type();

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
