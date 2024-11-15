package POM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript1 {
	public static void main(String[] args) throws IOException {
		//FIS obj
		FileInputStream fis = new FileInputStream("./Testdata/DemoLoginData.properties");
		
		//Respective File type obj
		Properties prop = new Properties();
		prop.load(fis);
		
		
		//Call Read Methods
		String URL = prop.getProperty("url");
		String EMAIL = prop.getProperty("email");
		String PWD = prop.getProperty("password");
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(URL);
		WelcomePage wp = new WelcomePage(driver);
		wp.getLoginLink().click();
		
		LoginPage lp = new LoginPage(driver);
		lp.getEmailTextFlied().sendKeys(EMAIL);
		lp.getPasswordTextField().sendKeys(PWD);
		lp.getLoginButton().click();
	}
}
