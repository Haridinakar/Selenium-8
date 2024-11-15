package Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoappDATADriven {

	public static void main(String[] args) throws IOException {

		// step 1 create obj for FileinputStream
		
		FileInputStream fis = new FileInputStream("./Testdata/DemoAppAssignment.properties");

		// step 2 create propertyfile obj
		Properties prop = new Properties();
		prop.load(fis);

		// step 3 call
		String URL = prop.getProperty("url");
		String FN = prop.getProperty("firstname");
		String LN = prop.getProperty("lastname");
		String EMAIL = prop.getProperty("email");
		String PSS = prop.getProperty("password");
		String CPSS = prop.getProperty("confirmpassword");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(URL);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();

		driver.findElement(By.id("FirstName")).sendKeys(FN);
		driver.findElement(By.id("LastName")).sendKeys(LN);

		driver.findElement(By.id("Email")).sendKeys(EMAIL);

		driver.findElement(By.id("Password")).sendKeys(PSS);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(CPSS);
		
		driver.findElement(By.id("register-button")).click();
		String text = driver.findElement(By.xpath("//div[contains(text(),'Your registration completed')]")).getText();
		System.out.println(text);

	}

}
