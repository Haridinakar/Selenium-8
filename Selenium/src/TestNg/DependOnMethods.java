package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOnMethods {
	@Test
	public void register() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		Assert.fail();

		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("register successfull", true);

	}

	@Test(dependsOnMethods = "register")
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("Login successfull", true);

	}
	@Test(dependsOnMethods = {"reigister","login"})
	public void addtocart() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demowebshop.tricentis.com/cart");
		Reporter.log("cart successfull", true);

	}
}
