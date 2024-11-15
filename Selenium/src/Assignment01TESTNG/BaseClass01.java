package Assignment01TESTNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass01 {
	public WebDriver driver;
	public Properties prop;
	public POMHomepage01 HPg;
	public POMLoginpage01 LPg;
	public POMLogoutpage01 loPg;

	@BeforeTest
	public void objectCreation() throws IOException {
		FileInputStream fis = new FileInputStream("./Testdata/Skillrary.properties");
		prop = new Properties();
		prop.load(fis);

	}

	@BeforeClass
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@BeforeMethod
	public void login() {
		HPg = new POMHomepage01(driver);
		LPg = new POMLoginpage01(driver);

		driver.get(prop.getProperty("url"));
		Assert.assertEquals(driver.getTitle(), "SkillRary Courses", "welcomepage is not displayed");
		Reporter.log("Welcome is Displayed", true);

		HPg.getLoginButton().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://demoapp.skillrary.com/login.php?type=login",
				"Loginpage is not displayed");
		Reporter.log("LoginPage is Displayed", true);

		LPg.getEmailTextField().sendKeys(prop.getProperty("Email"));
		LPg.getPasswordTextField().sendKeys(prop.getProperty("Password"));
		LPg.getLoginLgButtton().click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://demoapp.skillrary.com/admin/home.php",
				"Homepage is not displayed");
		Reporter.log("HomePage is Displayed", true);

	}

	@AfterMethod
	public void logout() {
		loPg = new POMLogoutpage01(driver);
		loPg.getLogoutImg().click();
		loPg.getSignoutButton().click();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
}
