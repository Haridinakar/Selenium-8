package Assignment01TESTNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript01 extends BaseClass01 {
	@Test
	public void clickOnSales() {
		LPg.getSalesLink().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://demoapp.skillrary.com/admin/sales.php",
				"Salespage is not displayed");
		Reporter.log("SalesPage is Displayed", true);
	}

}
