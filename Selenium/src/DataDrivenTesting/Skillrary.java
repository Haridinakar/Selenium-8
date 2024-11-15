package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillrary {

	public static void main(String[] args) throws IOException {
//		Step 1: create object for FileInputStream
		FileInputStream fis = new FileInputStream("./Testdata/Skillrary.properties");

//		Step2: Create PropertyFile Object
		Properties prop = new Properties();
		prop.load(fis);

//		Step 3:Call
		String URL = prop.getProperty("url");
		String EMAIL = prop.getProperty("Email");
		String PASSWORD = prop.getProperty("Password");

		System.out.println(URL);
		System.out.println(EMAIL);
		System.out.println(PASSWORD);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(URL);
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("email")).sendKeys(EMAIL);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);
		driver.findElement(By.id("last")).click();

	}

}
