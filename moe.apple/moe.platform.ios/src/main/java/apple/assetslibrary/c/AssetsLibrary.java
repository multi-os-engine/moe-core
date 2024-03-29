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

package apple.assetslibrary.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("AssetsLibrary")
@Runtime(CRuntime.class)
public final class AssetsLibrary {
    static {
        NatJ.register();
    }

    @Generated
    private AssetsLibrary() {
    }

    /**
     * This notification will be sent when the contents of the ALAssetsLibrary have changed from under the app that is
     * using the data.
     * The API user should retain the library object to receive this notification.
     * The userInfo may include the keys listed below, which identify specific ALAssets or ALAssetGroups that have
     * become invalid and should be discarded. The values are NSSets of NSURLs which match the ALAssetPropertyURL and
     * ALAssetsGroupPropertyURL properties.
     * If the userInfo is nil, all ALAssets and ALAssetGroups should be considered invalid and discarded.
     * Modified ALAssets will be identified by the ALAssetLibraryUpdatedAssetsKey, but inserted or deleted ALAssets are
     * identified by invalidating the containing ALAssetGroups.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use photoLibraryDidChange: notification from the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetsLibraryChangedNotification();

    /**
     * API-Since: 6.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use changeDetailsForFetchResult: and changeDetailsForObject: to get change details via the
     * PHChange object included on photoLibraryDidChange: from the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetLibraryUpdatedAssetsKey();

    /**
     * API-Since: 6.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use changeDetailsForFetchResult: and changeDetailsForObject: to get change details via the
     * PHChange object included on photoLibraryDidChange: from the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetLibraryInsertedAssetGroupsKey();

    /**
     * API-Since: 6.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use changeDetailsForFetchResult: and changeDetailsForObject: to get change details via the
     * PHChange object included on photoLibraryDidChange: from the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetLibraryUpdatedAssetGroupsKey();

    /**
     * API-Since: 6.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use changeDetailsForFetchResult: and changeDetailsForObject: to get change details via the
     * PHChange object included on photoLibraryDidChange: from the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetLibraryDeletedAssetGroupsKey();

    /**
     * Constant used by NSError to distinguish errors belonging to the AssetsLibrary domain
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetsLibraryErrorDomain();

    /**
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use PHAsset class properties from the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALErrorInvalidProperty();

    /**
     * An NSString that encodes the type of asset. One of ALAssetTypePhoto, ALAssetTypeVideo or ALAssetTypeUnknown.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the mediaType property on a PHAsset from the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetPropertyType();

    /**
     * CLLocation object with the location information of the asset. Only available if location services are enabled for
     * the caller.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the location property on a PHAsset from the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetPropertyLocation();

    /**
     * Play time duration of a video asset expressed as a double wrapped in an NSNumber. For photos,
     * kALErrorInvalidProperty is returned.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the duration property on a PHAsset from the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetPropertyDuration();

    /**
     * NSNumber containing an asset's orientation as defined by ALAssetOrientation.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the orientation of the UIImage returned for a PHAsset via the PHImageManager from the
     * Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetPropertyOrientation();

    /**
     * An NSDate with the asset's creation date.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the creationDate property on a PHAsset from the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetPropertyDate();

    /**
     * Array with all the representations available for a given asset (e.g. RAW, JPEG). It is expressed as UTIs.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use PHImageRequestOptions with the PHImageManager from the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetPropertyRepresentations();

    /**
     * Dictionary that maps asset representation UTIs to URLs that uniquely identify the asset.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use PHImageRequestOptions with the PHImageManager from the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetPropertyURLs();

    /**
     * An NSURL that uniquely identifies the asset
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the localIdentifier property on a PHAsset (or to lookup PHAssets by a previously known
     * ALAssetPropertyAssetURL use fetchAssetsWithALAssetURLs:options:) from the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetPropertyAssetURL();

    /**
     * The asset is a photo
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use PHAssetMediaTypeImage from the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetTypePhoto();

    /**
     * The asset is a video
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use PHAssetMediaTypeVideo from the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetTypeVideo();

    /**
     * The asset's type cannot be determined. It could be a sound file, a video or photo file that we don't know about,
     * or something else. This is possible only for assets imported from a camera onto the device.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use PHAssetMediaTypeAudio for audio or PHAssetMediaTypeUnknown for unknown media types from
     * the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetTypeUnknown();

    /**
     * An NSString with the name of the group
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the localizedTitle property on a PHAssetCollection from the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetsGroupPropertyName();

    /**
     * An ALAssetsGroupType wrapped in an NSNumber
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the assetCollectionType and assetCollectionSubtype properties on a PHAssetCollection from
     * the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetsGroupPropertyType();

    /**
     * An NSString with the group's persistent ID.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the localIdentifier property on a PHAssetCollection from the Photos framework instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetsGroupPropertyPersistentID();

    /**
     * An NSURL that uniquely identifies the group
     * 
     * API-Since: 5.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use the localIdentifier property on a PHAssetCollection from the Photos framework, or to
     * lookup PHAssetCollections by a previously known ALAssetsGroupPropertyURL use
     * fetchAssetCollectionsWithALAssetGroupURLs:options: instead
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String ALAssetsGroupPropertyURL();
}
