# Running The Samples

1. Run this in Terminal:

	```sh
	export MOE_HOME=<path to moe home>
	cd <sample directory>
	chmod a+x gradlew
	./gradlew :ios:moeMainDebugIphonesimualtorXcodeBuild : ios:moeMainDebugIphoneosXcodeBuild
	cp $MOE_HOME/sdk/moe-ios-dex.jar ios/build/moe/
	```

2. Open the Xcode project at `<sample directory>/ios/build/xcode/*.xcodeproj`.
3. Add the following file as resource
`$MOE_HOME/sdk/iphoneos/MOE.framework/icudt56l.dat`.
4. At the sample's Build Phases, disable `Compile Sources (MOE)` by expanding the section and inserting an `exit 0` as the first line of the script.
5. Run the sample
