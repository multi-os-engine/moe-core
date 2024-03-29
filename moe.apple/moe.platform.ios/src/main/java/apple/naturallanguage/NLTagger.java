package apple.naturallanguage;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSOrthography;
import apple.foundation.NSSet;
import apple.foundation.NSValue;
import apple.foundation.struct.NSRange;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("NaturalLanguage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NLTagger extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected NLTagger(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NLTagger alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NLTagger allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Not all combinations of scheme and unit are supported, and not all combinations of scheme and language are
     * supported. Clients can use +availableTagSchemesForUnit:language: to determine which ones are supported on the
     * current device.
     * 
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("availableTagSchemesForUnit:language:")
    public static native NSArray<String> availableTagSchemesForUnitLanguage(@NInt long unit, @NotNull String language);

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

    /**
     * Returns the top identified language (if any) for the entire string. Convenience for tagAtIndex: with
     * NLTagSchemeLanguage and NLTaggerUnitDocument.
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("dominantLanguage")
    public native String dominantLanguage();

    /**
     * The tagger will segment the string as needed into tokens for the given unit, and return those ranges along with a
     * tag for any scheme in its array of tag schemes. The fundamental tagging method on NLTagger is a block iterator,
     * that iterates over all tokens intersecting a given range, supplying tags and ranges. There are additional
     * convenience methods for obtaining information about a single token, or for obtaining information about all tokens
     * intersecting a given range at once. In each case, the index or range passed in must not extend beyond the end of
     * the tagger's string, or the methods will raise an exception. Note that a given instance of NLTagger should not be
     * used from more than one thread simultaneously.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("enumerateTagsInRange:unit:scheme:options:usingBlock:")
    public native void enumerateTagsInRangeUnitSchemeOptionsUsingBlock(@ByValue NSRange range, @NInt long unit,
            @NotNull String scheme, @NUInt long options,
            @NotNull @ObjCBlock(name = "call_enumerateTagsInRangeUnitSchemeOptionsUsingBlock") Block_enumerateTagsInRangeUnitSchemeOptionsUsingBlock block);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateTagsInRangeUnitSchemeOptionsUsingBlock {
        @Generated
        void call_enumerateTagsInRangeUnitSchemeOptionsUsingBlock(@Nullable String tag, @ByValue NSRange tokenRange,
                @NotNull BoolPtr stop);
    }

    /**
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @Selector("gazetteersForTagScheme:")
    public native NSArray<? extends NLGazetteer> gazetteersForTagScheme(@NotNull String tagScheme);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native NLTagger init();

    /**
     * An instance of NLTagger is created with an array of tag schemes. The tagger will be able to supply tags
     * corresponding to any of the schemes in this array.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("initWithTagSchemes:")
    public native NLTagger initWithTagSchemes(@NotNull NSArray<String> tagSchemes);

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

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("modelsForTagScheme:")
    public native NSArray<? extends NLModel> modelsForTagScheme(@NotNull String tagScheme);

    @Generated
    @Owned
    @Selector("new")
    public static native NLTagger new_objc();

    /**
     * API-Since: 13.0
     */
    @Generated
    @Selector("requestAssetsForLanguage:tagScheme:completionHandler:")
    public static native void requestAssetsForLanguageTagSchemeCompletionHandler(@NotNull String language,
            @NotNull String tagScheme,
            @NotNull @ObjCBlock(name = "call_requestAssetsForLanguageTagSchemeCompletionHandler") Block_requestAssetsForLanguageTagSchemeCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestAssetsForLanguageTagSchemeCompletionHandler {
        @Generated
        void call_requestAssetsForLanguageTagSchemeCompletionHandler(@NInt long result, @Nullable NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * In addition to the model for a given tag scheme, clients can add a custom gazetteer that will override the tags
     * for that scheme, for terms that are included in the gazetteer. If multiple gazetteers are specified, they will be
     * matched to text based on the language that they specify.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setGazetteers:forTagScheme:")
    public native void setGazetteersForTagScheme(@NotNull NSArray<? extends NLGazetteer> gazetteers,
            @NotNull String tagScheme);

    /**
     * If clients know the language or orthography for a given portion of the string, they may supply it to the tagger
     * (after setting the string itself via 'string' @property). Otherwise, the tagger will infer the language from the
     * contents of the text. In each case, the range passed in must not extend beyond the end of the tagger's string, or
     * the methods will raise an exception. When a new string is set, it resets any language or orthography settings.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setLanguage:range:")
    public native void setLanguageRange(@NotNull String language, @ByValue NSRange range);

    /**
     * In addition to the built-in models for predefined tag schemes, clients can set custom models that they have
     * trained, either for existing tag schemes or for custom tag schemes. If multiple models are specified, they will
     * be matched to text based on the language that they specify.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setModels:forTagScheme:")
    public native void setModelsForTagScheme(@NotNull NSArray<? extends NLModel> models, @NotNull String tagScheme);

    /**
     * API-Since: 12.0
     */
    @Generated
    @Selector("setOrthography:range:")
    public native void setOrthographyRange(@NotNull NSOrthography orthography, @ByValue NSRange range);

    /**
     * An NLTagger instance must be assigned a string to tag, and clients can then obtain tags and ranges for tokens in
     * that string appropriate to a given tag scheme and unit.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setString:")
    public native void setString(@Nullable String value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * An NLTagger instance must be assigned a string to tag, and clients can then obtain tags and ranges for tokens in
     * that string appropriate to a given tag scheme and unit.
     * 
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("string")
    public native String string();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * API-Since: 12.0
     */
    @Nullable
    @Generated
    @Selector("tagAtIndex:unit:scheme:tokenRange:")
    public native String tagAtIndexUnitSchemeTokenRange(@NUInt long characterIndex, @NInt long unit,
            @NotNull String scheme,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") NSRange tokenRange);

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("tagSchemes")
    public native NSArray<String> tagSchemes();

    /**
     * API-Since: 12.0
     */
    @NotNull
    @Generated
    @Selector("tagsInRange:unit:scheme:options:tokenRanges:")
    public native NSArray<String> tagsInRangeUnitSchemeOptionsTokenRanges(@ByValue NSRange range, @NInt long unit,
            @NotNull String scheme, @NUInt long options,
            @Nullable @ReferenceInfo(type = NSArray.class) Ptr<NSArray<? extends NSValue>> tokenRanges);

    /**
     * Returns the range corresponding to the token for the given unit that contains the given character index.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("tokenRangeAtIndex:unit:")
    @ByValue
    public native NSRange tokenRangeAtIndexUnit(@NUInt long characterIndex, @NInt long unit);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * In addition, it is possible to obtain multiple hypotheses for a given tag with associated probability scores. Not
     * all tag schemes will produce more than one hypothesis.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("tagHypothesesAtIndex:unit:scheme:maximumCount:tokenRange:")
    public native NSDictionary<String, ? extends NSNumber> tagHypothesesAtIndexUnitSchemeMaximumCountTokenRange(
            @NUInt long characterIndex, @NInt long unit, @NotNull String scheme, @NUInt long maximumCount,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") NSRange tokenRange);

    /**
     * Returns the smallest range covering all tokens for the given unit intersecting the given range. If range.length
     * == 0, this is equivalent to tokenRangeAtIndex:unit:.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("tokenRangeForRange:unit:")
    @ByValue
    public native NSRange tokenRangeForRangeUnit(@ByValue NSRange range, @NInt long unit);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
