package com.osacky.testorchbug;

import static androidx.test.InstrumentationRegistry.getInstrumentation;
import static androidx.test.internal.runner.listener.InstrumentationResultPrinter.REPORT_VALUE_RESULT_FAILURE;

import android.app.Instrumentation;
import android.os.Bundle;
import androidx.test.internal.runner.listener.InstrumentationResultPrinter;
import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

public class FailTestRunListener extends RunListener {

  private Bundle bundle;

  @Override
  public void testStarted(Description description) throws Exception {
    String testClass = description.getClassName();
    String testName = description.getMethodName();

    bundle = new Bundle();
    bundle.putString(Instrumentation.REPORT_KEY_IDENTIFIER,
        FailTestRunListener.class.getName());
    bundle.putString(InstrumentationResultPrinter.REPORT_KEY_NAME_CLASS, testClass);
    bundle.putString(InstrumentationResultPrinter.REPORT_KEY_NAME_TEST, testName);
  }

  @Override
  public void testFinished(Description description) throws Exception {

    bundle.putString(InstrumentationResultPrinter.REPORT_KEY_STACK, "this should fail the test with the android test orchestrator");
    getInstrumentation().sendStatus(REPORT_VALUE_RESULT_FAILURE, bundle);
  }
}
