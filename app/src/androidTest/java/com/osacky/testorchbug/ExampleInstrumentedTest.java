package com.osacky.testorchbug;

import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleInstrumentedTest {

  @Rule
  public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(
      MainActivity.class);

  @Test
  public void useAppContext() {
    onView(withId(R.id.hello_world)).perform(click());
  }
}
