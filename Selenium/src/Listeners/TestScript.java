package Listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listenerimp.class)
public class TestScript {
	@Test
	public void login() {
		Reporter.log("launchBrowser", true);
		Reporter.log("navigateToUrl", true);
		Reporter.log("ClickOnLoginLink", true);
		Reporter.log("Enter valid Crendentials", true);
		Reporter.log("Click on LoginButton", true);
		Assert.assertEquals(true, false);
	}
}
