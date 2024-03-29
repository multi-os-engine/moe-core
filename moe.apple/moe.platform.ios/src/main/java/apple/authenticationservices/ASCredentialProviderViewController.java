package apple.authenticationservices;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSBundle;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.uikit.UIViewController;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
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
import apple.authenticationservices.protocol.ASCredentialRequest;

/**
 * API-Since: 12.0
 */
@Generated
@Library("AuthenticationServices")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class ASCredentialProviderViewController extends UIViewController {
    static {
        NatJ.register();
    }

    @Generated
    protected ASCredentialProviderViewController(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native ASCredentialProviderViewController alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native ASCredentialProviderViewController allocWithZone(VoidPtr zone);

    @Deprecated
    @Generated
    @Selector("attemptRotationToDeviceOrientation")
    public static native void attemptRotationToDeviceOrientation();

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
    @Selector("clearTextInputContextIdentifier:")
    public static native void clearTextInputContextIdentifier(@NotNull String identifier);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @NotNull
    @Generated
    @Selector("extensionContext")
    public native ASCredentialProviderExtensionContext extensionContext();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native ASCredentialProviderViewController init();

    @Generated
    @Selector("initWithCoder:")
    public native ASCredentialProviderViewController initWithCoder(@NotNull NSCoder coder);

    @Generated
    @Selector("initWithNibName:bundle:")
    public native ASCredentialProviderViewController initWithNibNameBundle(@Nullable String nibNameOrNil,
            @Nullable NSBundle nibBundleOrNil);

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
    public static native ASCredentialProviderViewController new_objc();

    /**
     * Prepare the view controller to show a list of credentials.
     * 
     * This method is called by the system to prepare the extension's view controller to present the list of
     * credentials.
     * A service identifier array is passed which can be used to filter or prioritize the credentials that closely match
     * each service.
     * The service identifier array could have zero or more items. If there are more than one item in the array, items
     * with lower indexes
     * represent more specific identifiers for which a credential is being requested. For example, the array could
     * contain identifiers
     * [m.example.com, example.com] with the first item representing the more specifc service that requires a
     * credential.
     * If the array of service identifiers is empty, it is expected that the credential list should still show
     * credentials that the user can pick from.
     * 
     * @param serviceIdentifiers the array of service identifiers.
     */
    @Generated
    @Selector("prepareCredentialListForServiceIdentifiers:")
    public native void prepareCredentialListForServiceIdentifiers(
            @NotNull NSArray<? extends ASCredentialServiceIdentifier> serviceIdentifiers);

    /**
     * Prepare the view controller to show user interface when the user enables your extension.
     * 
     * The system calls this method after your extension is enabled by the user in Settings. You can
     * use this method to give the user a chance to configure the extension or to provide credential identities
     * to the system. After the configuration is done, call -[ASCredentialProviderExtensionContext
     * completeExtensionConfigurationRequest].
     * [@note] This method only gets called if your extension supports this functionality by specifying
     * "ASCredentialProviderExtensionShowsConfigurationUI": YES in its extension attributes.
     */
    @Generated
    @Selector("prepareInterfaceForExtensionConfiguration")
    public native void prepareInterfaceForExtensionConfiguration();

    /**
     * Prepare the view controller to show user interface for providing the user-requested credential.
     * 
     * The system calls this method when your extension cannot provide the requested credential without user
     * interaction.
     * Set up the view controller for any user interaction required to provide the requested credential only. The user
     * interaction should
     * be limited in nature to operations required for providing the requested credential. An example is showing an
     * authentication UI to
     * unlock the user's passwords database.
     * Call -[ASCredentialProviderExtensionContext completeRequestWithSelectedCredential:completionHandler:] to provide
     * the credential.
     * If an error occurs, call -[ASCredentialProviderExtensionContext cancelRequestWithError:] and pass an error with
     * domain
     * ASExtensionErrorDomain and an appropriate error code from ASExtensionErrorCode. For example, if the credential
     * identity cannot
     * be found in the database, pass an error with code ASExtensionErrorCodeCredentialIdentityNotFound.
     * 
     * API-Since: 12.0
     * Deprecated-Since: 17.0
     * 
     * @param credentialIdentity the credential identity for which a credential should be provided.
     */
    @Deprecated
    @Generated
    @Selector("prepareInterfaceToProvideCredentialForIdentity:")
    public native void prepareInterfaceToProvideCredentialForIdentity(
            @NotNull ASPasswordCredentialIdentity credentialIdentity);

    /**
     * Attempt to provide the user-requested credential without any user interaction.
     * 
     * After the user selects a credential identity, the system may ask your extension to provide the credential without
     * showing any
     * user interface if possible to enhance the user experience. If your extension can accomplish this (for example,
     * the user’s passwords database is
     * still unlocked from a recent interaction), call -[ASCredentialProviderExtensionContext
     * completeRequestWithSelectedCredential:completionHandler:]
     * to provide the credential.
     * If an error occurs, call -[ASCredentialProviderExtensionContext cancelRequestWithError:] and pass an error with
     * domain
     * ASExtensionErrorDomain and an appropriate error code from ASExtensionErrorCode. For example, if your extension
     * requires user interaction
     * because the passwords database needs to be unlocked, pass an error with code
     * ASExtensionErrorCodeUserInteractionRequired.
     * [@note] When this method is called, your extension's view controller is not present on the screen. Do not attempt
     * or expect to show any user
     * interface in this method.
     * 
     * API-Since: 12.0
     * Deprecated-Since: 17.0
     * 
     * @param credentialIdentity the credential identity for which a credential should be provided.
     */
    @Deprecated
    @Generated
    @Selector("provideCredentialWithoutUserInteractionForIdentity:")
    public native void provideCredentialWithoutUserInteractionForIdentity(
            @NotNull ASPasswordCredentialIdentity credentialIdentity);

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
     * Prepare the view controller to show a list of password and passkey credentials.
     * 
     * This method is called by the system to prepare the extension's view controller to present the list of
     * credentials.
     * A service identifier array is passed which can be used to filter or prioritize the credentials that closely match
     * each service.
     * The service identifier array could have zero or more items. If there is more than one item in the array, items
     * with lower indexes
     * represent more specific identifiers for which a credential is being requested. For example, the array could
     * contain identifiers
     * [m.example.com, example.com] with the first item representing the more specifc service that requires a
     * credential.
     * If the array of service identifiers is empty, it is expected that the credential list should still show
     * credentials that the user can pick from.
     * If a passkey credential is selected, the extension should use the requestParameters object to complete the
     * request using the selected
     * passkey credential.
     * 
     * API-Since: 17.0
     * 
     * @param serviceIdentifiers the array of service identifiers.
     * @param requestParameters  the parameters of the active passkey request.
     */
    @Generated
    @Selector("prepareCredentialListForServiceIdentifiers:requestParameters:")
    public native void prepareCredentialListForServiceIdentifiersRequestParameters(
            @NotNull NSArray<? extends ASCredentialServiceIdentifier> serviceIdentifiers,
            @NotNull ASPasskeyCredentialRequestParameters requestParameters);

    /**
     * Prepare UI to register a passkey for the specified relying party.
     * 
     * The system calls this method when the user selects your extension to use for creating a passkey. In order
     * for your extension to be presented in the list of options for passkey registration requests, your extension
     * needs to specify a true value for the Information Property List key `ProvidesPasskeys` under the
     * `ASCredentialProviderExtensionCapabilities` dictionary.
     * 
     * Info.plist
     * ├─ NSExtension
     * ├─ NSExtensionAttributes
     * ├─ ASCredentialProviderExtensionCapabilities
     * ├─ ProvidesPasskeys => true
     * 
     * This method will present your extension's UI for user authentication before creating the passkey. Once the
     * passkey is created, your extension should call `-[ASCredentialProviderExtensionContext
     * completeRegistrationRequestWithSelectedPasskeyCredential:completionHandler:]`
     * with the newly created ASPasskeyCredential object. If an error occurs, call
     * `-[ASCredentialProviderExtensionContext cancelRequestWithError:]` and pass an
     * error with domain `ASExtensionErrorDomain` and an appropriate error code from `ASExtensionErrorCode`.
     * 
     * - Parameter registrationRequest: The passkey registration request parameters needed to
     * register a new passkey.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("prepareInterfaceForPasskeyRegistration:")
    public native void prepareInterfaceForPasskeyRegistration(
            @Mapped(ObjCObjectMapper.class) @NotNull ASCredentialRequest registrationRequest);

    /**
     * Prepare the view controller to show user interface for providing the user-requested credential.
     * 
     * The system calls this method when your extension cannot provide the requested credential without user
     * interaction.
     * Set up the view controller for any user interaction required to provide the requested credential only. The user
     * interaction should
     * be limited in nature to operations required for providing the requested credential. An example is showing an
     * authentication UI to
     * unlock the user's passwords database.
     * Call -[ASCredentialProviderExtensionContext completeRequestWithSelectedCredential:completionHandler:] for
     * password credentials or
     * -[ASCredentialProviderExtensionContext completeAssertionRequestWithSelectedPasskeyCredential:completionHandler:]
     * for passkey credentials.
     * If an error occurs, call -[ASCredentialProviderExtensionContext cancelRequestWithError:] and pass an error with
     * domain
     * ASExtensionErrorDomain and an appropriate error code from ASExtensionErrorCode. For example, if the credential
     * identity cannot
     * be found in the database, pass an error with code ASExtensionErrorCodeCredentialIdentityNotFound.
     * 
     * API-Since: 17.0
     * 
     * @param credentialRequest the credential request for which a credential should be provided.
     */
    @Generated
    @Selector("prepareInterfaceToProvideCredentialForRequest:")
    public native void prepareInterfaceToProvideCredentialForRequest(
            @Mapped(ObjCObjectMapper.class) @NotNull ASCredentialRequest credentialRequest);

    /**
     * Attempt to provide the user-requested credential without any user interaction.
     * 
     * After the user selects a credential identity, the system will create a credential request, the contents of
     * which will depend on whether the credential to use is a password or passkey. The request type will match
     * the type of credential that was requested. Refer to `ASPasswordCredentialRequest` and
     * `ASPasskeyCredentialRequest` for details.
     * 
     * The system may ask your extension to provide the credential without showing any user interface if possible
     * to enhance the user experience. If your extension can accomplish this (for example, the user’s passwords
     * database is still unlocked from a recent interaction), call `-[ASCredentialProviderExtensionContext
     * completeRequestWithSelectedCredential:completionHandler:]`
     * for password credentials or `-[ASCredentialProviderExtensionContext
     * completeAssertionRequestWithSelectedPasskeyCredential:completionHandler:]` for passkey credentials. If an error
     * occurs, call `-[ASCredentialProviderExtensionContext cancelRequestWithError:]`
     * and pass an error with domain `ASExtensionErrorDomain` and an appropriate error code from
     * `ASExtensionErrorCode`. For example, if your extension requires user interaction because the
     * passwords database needs to be unlocked, pass an error with code `ASExtensionErrorCodeUserInteractionRequired`.
     * 
     * In order for your extension to be presented in the list of options for passkey assertion requests, your
     * extension needs to specify a true value for the Information Property List key `ProvidesPasskeys`
     * under the `ASCredentialProviderExtensionCapabilities` dictionary.
     * 
     * Info.plist
     * ├─ NSExtension
     * ├─ NSExtensionAttributes
     * ├─ ASCredentialProviderExtensionCapabilities
     * ├─ ProvidesPasskeys => true
     * 
     * - Note: When this method is called, your extension's view controller is not present on the screen. Do not
     * attempt or expect to show any user interface in this method.
     * 
     * - Parameter credentialRequest: The credential request for which a credential should be provided.
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("provideCredentialWithoutUserInteractionForRequest:")
    public native void provideCredentialWithoutUserInteractionForRequest(
            @Mapped(ObjCObjectMapper.class) @NotNull ASCredentialRequest credentialRequest);

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
