# Android Test Orchestrator Bug

This project demonstrates a bug with the Android Test Orchestrator.

When reporting a test failure using a RunListener, the test failure is not properly reported back to the Android Test Orchestrator.

To reproduce the bug run `./gradlew connectedCheck`. The tests will succeed but should have failed because the FailTestRunListener is reporting them is failed.

To disable the Android Test Orchestrator and have the tests fail as expected, comment out the following line in app/build.gradle:
`execution 'ANDROID_TEST_ORCHESTRATOR'`


