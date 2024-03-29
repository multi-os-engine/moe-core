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

package apple.photos.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 8.0
 */
@Generated
public final class PHAssetCollectionSubtype {
    /**
     * PHAssetCollectionTypeAlbum regular subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AlbumRegular = 0x0000000000000002L;
    /**
     * PHAssetCollectionTypeAlbum regular subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AlbumSyncedEvent = 0x0000000000000003L;
    /**
     * PHAssetCollectionTypeAlbum regular subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AlbumSyncedFaces = 0x0000000000000004L;
    /**
     * PHAssetCollectionTypeAlbum regular subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AlbumSyncedAlbum = 0x0000000000000005L;
    /**
     * PHAssetCollectionTypeAlbum regular subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AlbumImported = 0x0000000000000006L;
    /**
     * PHAssetCollectionTypeAlbum shared subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AlbumMyPhotoStream = 0x0000000000000064L;
    /**
     * PHAssetCollectionTypeAlbum shared subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AlbumCloudShared = 0x0000000000000065L;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long SmartAlbumGeneric = 0x00000000000000C8L;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long SmartAlbumPanoramas = 0x00000000000000C9L;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long SmartAlbumVideos = 0x00000000000000CAL;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long SmartAlbumFavorites = 0x00000000000000CBL;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long SmartAlbumTimelapses = 0x00000000000000CCL;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long SmartAlbumAllHidden = 0x00000000000000CDL;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long SmartAlbumRecentlyAdded = 0x00000000000000CEL;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long SmartAlbumBursts = 0x00000000000000CFL;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long SmartAlbumSlomoVideos = 0x00000000000000D0L;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long SmartAlbumUserLibrary = 0x00000000000000D1L;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long SmartAlbumSelfPortraits = 0x00000000000000D2L;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long SmartAlbumScreenshots = 0x00000000000000D3L;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 10.2
     */
    @Generated @NInt public static final long SmartAlbumDepthEffect = 0x00000000000000D4L;
    /**
     * Used for fetching, if you don't care about the exact subtype
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Any = org.moe.natj.general.NatJ.is64Bit() ?
            0x7FFFFFFFFFFFFFFFL :
            0x000000007FFFFFFFL;

    @Generated
    private PHAssetCollectionSubtype() {
    }

    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 10.3
     */
    @Generated @NInt public static final long SmartAlbumLivePhotos = 0x00000000000000D5L;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long SmartAlbumAnimated = 0x00000000000000D6L;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long SmartAlbumLongExposures = 0x00000000000000D7L;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 13.0
     */
    @Generated @NInt public static final long SmartAlbumUnableToUpload = 0x00000000000000D8L;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long SmartAlbumRAW = 0x00000000000000D9L;
    /**
     * PHAssetCollectionTypeSmartAlbum subtypes
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long SmartAlbumCinematic = 0x00000000000000DAL;
}
