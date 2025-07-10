# espresso-espressouitest_mobile

Mobile testing in EspressoUITestExamples.apk ([CodingWithMitch](https://codingwithmitch.com/courses/ui-testing-for-beginners/demo/)) running on updated refactored techs. This project contains basic examples on how to use Espresso to perform mobile tests. All the necessary support documentation to develop this project is placed here. 

# Pre-requirements:

| Requirement                     | Version        | Note                                                            |
| :------------------------------ |:---------------| :-------------------------------------------------------------- |
| JDK                             | 17             | -                                                               |
| Android Studio                  | 2024.2.1.11    | -                                                               |
| EspressoUITestExamples.apk      | 1.0            | -                                                               |
| Virtual device                  | Pixel 4        | -                                                               |
| Virtual device API              | 33             | -                                                               |

# Installation:

- See [Java SE 17 Archive Downloads (17.0.12 and earlier)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html), download the proper version for your OS and install it by keeping the preferenced options. 
- See [Anroid Studio download page](https://developer.android.com/), download the last version and install it by keeping the preferenced options. Open 
- Right click :point_right: **My Computer** and select :point_right: **Properties**. On the :point_right: **Advanced** tab, select :point_right: **Environment Variables**, and then, in System Variables, create a variable named JAVA_HOME to point to where the JDK software is located, for example, C:\Program Files\Java\jdk-17.
- Right click :point_right: **My Computer** and select :point_right: **Properties**. On the :point_right: **Advanced** tab, select :point_right: **Environment Variables**, and then, in System Variables, create a variable named ANDROID_HOME to point to where the sdk software is located, for example, C:\Users\user\AppData\Local\Android\Sdk.
- Right click :point_right: **My Computer** and select :point_right: **Properties**. On the :point_right: **Advanced** tab, select :point_right: **Environment Variables**, and then edit Path system variable with the new %JAVA_HOME%\bin and %ANDROID_HOME%\platform-tools entries.

# Tests:

- Execute ```./gradlew connectedDebugAndroidTest``` to execute all tests. 

# Support:

- [CodingWithMitch](https://codingwithmitch.com/courses/ui-testing-for-beginners/source-code-and-emulator-setup/)
- [EspressoUITest-Examples](https://github.com/mitchtabian/EspressoUITest-Examples)
- [./gradlew assembleRelease BUILD FAILED with Could not find com.linkedin.dexmaker:dexmaker:2.21.0](https://stackoverflow.com/a/70859949)
- [Migrate from Kotlin synthetics to Jetpack view binding](https://developer.android.com/topic/libraries/view-binding/migration)
- [View binding](https://developer.android.com/topic/libraries/view-binding)
- [Error while running any test, having mockk-android dependency. Requires: com.linkedin.dexmaker:dexmaker #1000](https://github.com/mockk/mockk/issues/1000#issuecomment-1361154496)
- [Java SE 17 Archive Downloads (17.0.12 and earlier)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
- [Tests not running on Android Studio : "Tests Cancelled 0 passed"](https://stackoverflow.com/a/77858059)

# Tips:

- Tests are being executed twice. It still needs investigation to know the reason.

