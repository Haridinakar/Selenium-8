package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCaseassign {
	@Test
	public void testcase() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("http://automationexercise.com");
		Assert.assertEquals(driver.getTitle(), "Automation Exercise", "Homepage is not displayed");
		Reporter.log("Homepage is displayed", true);

		driver.findElement(By.xpath("//a[@href='/login']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Login to your account')]")).isDisplayed(),
				"login page is not visible");
		Reporter.log("Loginpage visible", true);

		driver.findElement(By.name("email")).sendKeys("harish123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("1234567890");
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		Assert.assertTrue(driver.findElement(By.xpath("//i[@class='fa fa-user']")).isDisplayed(),
				"Logged in as not username is visible");
		Reporter.log("Logged in as username' is visible", true);
		
		driver.findElement(By.xpath("//a[@href='/delete_account']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//b[contains(text(),'Account Deleted!')]")).isDisplayed(),
				"Account is not deleted");
		Reporter.log("Account deleted suucessfully", true);
		
		
		
		
	}
}
