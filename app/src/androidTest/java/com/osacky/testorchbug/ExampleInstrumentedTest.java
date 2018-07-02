package com.osacky.testorchbug;

import androidx.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

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
