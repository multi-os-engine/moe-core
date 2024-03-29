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
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gameplaykit.protocol.GKGameModel;
import apple.gameplaykit.protocol.GKGameModelUpdate;
import apple.gameplaykit.protocol.GKRandom;
import apple.gameplaykit.protocol.GKStrategist;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The Monte Carlo Strategist is a generic AI that selects a game model update for a given player that results
 * in the highest likelihood for that player to eventually win the game. It does this by sampling the updates available
 * to the player in question. In doing this it will select the update it knows to produce the best result so far,
 * expanding on this
 * selection, simulating the rest of the game from that expansion, and then propogating the results (win or loss)
 * upwards.
 * It will do this until the budget has been reached, then returning the choice it has deemed best suited for the player
 * in question.
 */
@Generated
@Library("GameplayKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKMonteCarloStrategist extends NSObject implements GKStrategist {
    static {
        NatJ.register();
    }

    @Generated
    protected GKMonteCarloStrategist(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKMonteCarloStrategist alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKMonteCarloStrategist allocWithZone(VoidPtr zone);

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
    public static native GKMonteCarloStrategist new_objc();

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

    @Nullable
    @Generated
    @Selector("bestMoveForActivePlayer")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKGameModelUpdate bestMoveForActivePlayer();

    /**
     * The maximum number of samples that will be processed when searching for a move.
     */
    @Generated
    @Selector("budget")
    @NUInt
    public native long budget();

    /**
     * A weight that encourages exploration of less visited updates versus the continued exploitation of previously
     * visited updates.
     */
    @Generated
    @Selector("explorationParameter")
    @NUInt
    public native long explorationParameter();

    @Nullable
    @Generated
    @Selector("gameModel")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKGameModel gameModel();

    @Generated
    @Selector("init")
    public native GKMonteCarloStrategist init();

    @Nullable
    @Generated
    @Selector("randomSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKRandom randomSource();

    /**
     * The maximum number of samples that will be processed when searching for a move.
     */
    @Generated
    @Selector("setBudget:")
    public native void setBudget(@NUInt long value);

    /**
     * A weight that encourages exploration of less visited updates versus the continued exploitation of previously
     * visited updates.
     */
    @Generated
    @Selector("setExplorationParameter:")
    public native void setExplorationParameter(@NUInt long value);

    @Generated
    @Selector("setGameModel:")
    public native void setGameModel(@Nullable @Mapped(ObjCObjectMapper.class) GKGameModel value);

    @Generated
    @Selector("setRandomSource:")
    public native void setRandomSource(@Nullable @Mapped(ObjCObjectMapper.class) GKRandom value);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
