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

package apple.eventkitui.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum]       EKEventEditViewAction
 * <p>
 * Represents actions that should cause the edit view controller to be dismissed
 * <p>
 * [@constant]   EKEventEditViewActionCanceled    The Cancel button was pressed, or the Done button was pressed, but the event was not dirty.
 * [@constant]   EKEventEditViewActionSaved       The event was saved.
 * [@constant]   EKEventEditViewActionDeleted     The event was deleted, either by the user or by another calendar store.
 */
@Generated
public final class EKEventEditViewAction {
    @Generated @NInt public static final long Canceled = 0x0000000000000000L;
    @Generated @NInt public static final long Saved = 0x0000000000000001L;
    @Generated @NInt public static final long Deleted = 0x0000000000000002L;
    /**
     * going away, use spelling above
     */
    @Generated @NInt public static final long Cancelled = 0x0000000000000000L;

    @Generated
    private EKEventEditViewAction() {
    }
}
