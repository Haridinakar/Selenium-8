package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listenerimp implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("LoginSuccess", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Login is Failed", true);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Login", true);
	}

}
