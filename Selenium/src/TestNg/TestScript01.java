package TestNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript01 extends BaseClass {
	@Test
	public void clickOnBooks() {
		driver.findElement(By.partialLinkText("BOOKS")).click();
		if (driver.getTitle().equals("Demo Web Shop. Books")) {
			Reporter.log("Books Page Verified Successfully", true);
		} else {
			Reporter.log("Books Page Not Verified Successfully", true);
		}
	}
}
