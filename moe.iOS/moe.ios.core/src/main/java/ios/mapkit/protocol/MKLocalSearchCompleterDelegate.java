package ios.mapkit.protocol;


import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import ios.foundation.NSError;
import ios.mapkit.MKLocalSearchCompleter;

@Generated
@Library("MapKit")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MKLocalSearchCompleterDelegate")
public interface MKLocalSearchCompleterDelegate {
	/**
	 * completer:didFailWithError:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKLocalSearchCompleterDelegate_protocol/index.html#//apple_ref/occ/intfm/MKLocalSearchCompleterDelegate/completer:didFailWithError:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("completer:didFailWithError:")
	default void completerDidFailWithError(MKLocalSearchCompleter completer,
			NSError error) {
		throw new java.lang.UnsupportedOperationException();
	}

	/**
	 * completerDidUpdateResults:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/MapKit/Reference/MKLocalSearchCompleterDelegate_protocol/index.html#//apple_ref/occ/intfm/MKLocalSearchCompleterDelegate/completerDidUpdateResults:">iOS Dev Center</a>
	 */
	@Generated
	@IsOptional
	@Selector("completerDidUpdateResults:")
	default void completerDidUpdateResults(MKLocalSearchCompleter completer) {
		throw new java.lang.UnsupportedOperationException();
	}
}