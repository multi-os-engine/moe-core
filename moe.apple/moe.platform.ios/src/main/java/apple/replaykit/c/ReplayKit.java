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

package apple.replaykit.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("ReplayKit")
@Runtime(CRuntime.class)
public final class ReplayKit {
    static {
        NatJ.register();
    }

    @Generated
    private ReplayKit() {
    }

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String RPRecordingErrorDomain();

    /**
     * [@key] RPVideoSampleOrientationKey
     * 
     * Use this key in conjunction with CMGetAttachment on CMSampleBufferRef to get the orientation for the sample. The
     * orientation will follow the enum CGImagePropertyOrientation
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String RPVideoSampleOrientationKey();

    /**
     * [@key] RPApplicationInfoBundleIdentifierKey
     * 
     * Use this key to retrieve bundle identifier from dictionary provided by broadcastAnnotatedWithApplicationInfo
     * 
     * API-Since: 11.2
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String RPApplicationInfoBundleIdentifierKey();

    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SCStreamErrorDomain();
}
