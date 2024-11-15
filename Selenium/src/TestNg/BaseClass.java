package TestNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	public Properties prop;

	@BeforeTest
	public void objectCreation() throws IOException {
		FileInputStream fis = new FileInputStream("./Testdata/DemoLoginData.properties");
		prop = new Properties();
		prop.load(fis);
	}

	@Parameters("Browser")
	@BeforeClass
	public void launchBrowser(@Optional("chrome") String Broswername) {
		if (Broswername.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (Broswername.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@BeforeMethod
	public void login() {

		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.id("Password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}

	@AfterMethod
	public void logOut() {
		driver.findElement(By.linkText("Log out")).click();
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
