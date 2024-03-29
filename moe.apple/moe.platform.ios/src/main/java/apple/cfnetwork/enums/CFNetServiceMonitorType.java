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

package apple.cfnetwork.enums;

import org.moe.natj.general.ann.Generated;

/**
 * CFNetServiceMonitorType
 * 
 * Discussion:
 * Record type specifier in order to inform CFNetServiceMonitor to
 * watch for certain record changes.
 */
@Generated
public final class CFNetServiceMonitorType {
    /**
     * Watch for TXT record changes.
     */
    @Generated public static final int kCFNetServiceMonitorTXT = 0x00000001;

    @Generated
    private CFNetServiceMonitorType() {
    }
}
