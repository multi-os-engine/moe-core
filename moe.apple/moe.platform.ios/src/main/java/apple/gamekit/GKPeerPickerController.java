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

package apple.gamekit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.gamekit.protocol.GKPeerPickerControllerDelegate;
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
 * The GKPeerPickerController class manages the system-supplied user interface for choosing peers to connect with for
 * multiplayer games. The class manages the actual user interactions with the views and reports the results of those
 * interactions to your delegate object.
 * 
 * Because the GKPeerPickerController class handles all of the user interactions, all you have to do is tell it which
 * GKSession selected peers should be connected to, tell it to start, and then wait to receive a delegate callback when
 * the picker finished connecting peers or cancels.
 * 
 * You must provide a delegate that conforms to the GKPeerPickerControllerDelegate protocol in order to use this class.
 * After the user interface starts, this class notifies your delegate of the user’s actions.
 * 
 * API-Since: 3.0
 * Deprecated-Since: 7.0
 * Deprecated-Message: Use MCBrowserViewController from the MultipeerConnectivity framework.
 */
@Deprecated
@Generated
@Library("GameKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class GKPeerPickerController extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected GKPeerPickerController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native GKPeerPickerController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native GKPeerPickerController allocWithZone(VoidPtr zone);

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
    public static native GKPeerPickerController new_objc();

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
     * An integer bit mask that determines what connection types are supported by the application, and displays
     * system-supplied UI as appropriate.
     * 
     * This mask can be specified by combining, using the C bitwise OR operator, any of the options described in
     * GKPickerConnectionType. If not set, the default supported type is GKPickerConnectionTypeNearby. If multiple
     * connection types are supported, system-supplied UI will be presented to allow the user to select a connection
     * type. The delegate receives a -peerPickerController:didSelectConnectionType: callback when the user selects a
     * connection type. If desired, this property should be set prior to calling -show, and should not be set while the
     * picker is visible.
     */
    @Generated
    @Selector("connectionTypesMask")
    @NUInt
    public native long connectionTypesMask();

    /**
     * The delegate receives notifications when the user interacts with the picker interface. If this property is nil,
     * the picker is dismissed immediately if you try to show it.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     */
    @Nullable
    @Deprecated
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native GKPeerPickerControllerDelegate delegate();

    /**
     * Dismiss the picker.
     */
    @Generated
    @Selector("dismiss")
    public native void dismiss();

    @Generated
    @Selector("init")
    public native GKPeerPickerController init();

    @Generated
    @Selector("isVisible")
    public native boolean isVisible();

    /**
     * An integer bit mask that determines what connection types are supported by the application, and displays
     * system-supplied UI as appropriate.
     * 
     * This mask can be specified by combining, using the C bitwise OR operator, any of the options described in
     * GKPickerConnectionType. If not set, the default supported type is GKPickerConnectionTypeNearby. If multiple
     * connection types are supported, system-supplied UI will be presented to allow the user to select a connection
     * type. The delegate receives a -peerPickerController:didSelectConnectionType: callback when the user selects a
     * connection type. If desired, this property should be set prior to calling -show, and should not be set while the
     * picker is visible.
     */
    @Generated
    @Selector("setConnectionTypesMask:")
    public native void setConnectionTypesMask(@NUInt long value);

    /**
     * The delegate receives notifications when the user interacts with the picker interface. If this property is nil,
     * the picker is dismissed immediately if you try to show it.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     */
    @Deprecated
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(
            @Nullable @Mapped(ObjCObjectMapper.class) GKPeerPickerControllerDelegate value);

    /**
     * The delegate receives notifications when the user interacts with the picker interface. If this property is nil,
     * the picker is dismissed immediately if you try to show it.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 7.0
     */
    @Deprecated
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) GKPeerPickerControllerDelegate value) {
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
     * Show the picker.
     */
    @Generated
    @Selector("show")
    public native void show();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
