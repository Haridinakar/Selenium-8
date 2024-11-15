package Assertions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TolearnHardAssert {
	@Test
	public void launchBrowser() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop","Welcome page is not displayed");
		Reporter.log("Welcome is displayed",true);
		
		driver.findElement(By.linkText("Log in")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Login","LoginPage is not displayed");
		Reporter.log("Loginpage is displayed",true);
	
		driver.findElement(By.id("Email")).sendKeys("haridinakar1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("hari123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop","HomePage is not displayed");
		Reporter.log("Homepage is displayed",true);
		
	}

}
