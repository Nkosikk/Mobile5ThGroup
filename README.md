# Mobile5ThGroup

## Tools needed to setup and run the project
* Intellij
* JDK
* Maven
* Node_jS
* Appium
* Android Studio (to get sdk and emulators)
* 
## Dependencies needed for the project
* java-client
* cucumber-java
* cucumber-testng
* extentreports
* tech.grasshopper

## How to install appium and plugins
* execute this command on terminal **npm install -g appium@latest**
* npm install -g UiAutomator2
* npm install -g appium-xcuitest-driver
## Steps to setup mobile framework
* Make sure Tools is installed by uncheking the Absolete checkbox in the tools Tab
* Setup environmental variables as
  *  under user variable set ANDROID_HOME = the path to the sdk
  * under system variable edit path
  * Set Platform_tools
  * set tools/bin
  * set emulator
  * set build_tools

## To check that the installation is correct
* start the emulator on android studio
* execute command "adb devices" - this should show the list of devices started

## How to execute the project (One of the below options can be used)
* Run the feature file
* Run using the Runner
* run using maven command " mvn clean test" or "mvn verify" or "mvn test"



