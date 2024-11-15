package Project;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InstagramSCRIPT {
	@Test
	public void Login() throws IOException, InterruptedException {
		// create fis obj
		FileInputStream fis = new FileInputStream("./Testdata/InstagramData.properties");

		// create respective type obj
		Properties prop = new Properties();
		prop.load(fis);

		// call read methods
		String URL = prop.getProperty("url");
		String UN = prop.getProperty("username");
		String PWD = prop.getProperty("password");
		String SNAME = prop.getProperty("searchname");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(URL);
		InstagramLoginpage lp = new InstagramLoginpage(driver);
		InstagramHomePage hp = new InstagramHomePage(driver);

		lp.getUsenameTextField().sendKeys(UN);
		lp.getPasswordTextField().sendKeys(PWD);
		lp.getLoginButton().click();

		hp.getNotnowbutton().click();
		hp.getSearchBar().click();
		Thread.sleep(2000);

		hp.getSearchTextField().sendKeys(SNAME);
		hp.getSearchNameclick().click();

		// Thread.sleep(3000);
		hp.getFollowbackButton().click();

		hp.getMoreOptions().click();
		hp.getLogoutButton().click();
		String Title = driver.getTitle();
		Reporter.log(Title + " " + "Instagram login Success", true);

		Thread.sleep(3000);
		driver.close();

	}
}
