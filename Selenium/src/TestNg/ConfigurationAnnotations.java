package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {

	@BeforeSuite
	public void beforesuite() {
		Reporter.log("@BeforeSuite", true);
	}

	@Test
	public void demo() {
		Reporter.log("@Test(demo)", true);
	}
	

	@Test
	public void sample() {
		Reporter.log("@Test(sample)", true);
	}


	@BeforeClass
	public void beforeClass() {
		Reporter.log("@BeforeClass", true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("@AfterClass", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("@BeforeMethod", true);
	}

	@BeforeTest
	public void BeforeTest() {
		Reporter.log("@BeforeTest", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("@AfterMethod", true);
	}

	@AfterTest
	public void AfterTest() {
		Reporter.log("@AfterTest", true);
	}

	@AfterSuite
	public void aftersuite() {
		Reporter.log("@AfterSuite", true);
	}
}
