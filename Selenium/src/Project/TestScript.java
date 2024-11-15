package Project;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		// 1:Respective Fis object
		FileInputStream fs = new FileInputStream("./Testdata/DemoShopData.properties");

		// 2:create file respective object
		Properties ps = new Properties();

		// 3:call
		ps.load(fs);
		String url = ps.getProperty("url");
		String mail = ps.getProperty("Email");
		String pass = ps.getProperty("password");

		System.out.println(url);
		System.out.println(mail);
		System.out.println(pass);

		driver.get(url);
		WelcomePage wl = new WelcomePage(driver);
		LoginPage lg = new LoginPage(driver);
		HomePage hg = new HomePage(driver);

		wl.getLoginButton().click();

		lg.getEmailTextField().sendKeys(mail);
		Thread.sleep(3000);

		lg.getPasswordTextField().sendKeys(pass);
		WebElement regLoginbutton = lg.getRegLoginbutton();
		Thread.sleep(3000);

		regLoginbutton.click();
		Thread.sleep(3000);

		hg.getLogoutButton().click();

	}
}
