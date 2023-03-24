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

package apple.safariservices.c;

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
@Library("SafariServices")
@Runtime(CRuntime.class)
public final class SafariServices {
    static {
        NatJ.register();
    }

    @Generated
    private SafariServices() {
    }

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SFErrorDomain();

    /**
     * API-Since: 9.0
     * Deprecated-Since: 10.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SFContentBlockerErrorDomain();

    /**
     * domain for NSError
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SSReadingListErrorDomain();

    /**
     * API-Since: 11.0
     * Deprecated-Since: 12.0
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SFAuthenticationErrorDomain();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String SFExtensionMessageKey();
}
