package Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoi {
	public static void main(String[] args) throws IOException, InterruptedException {
		// step1 create obj for FIS
		FileInputStream fis = new FileInputStream("./Testdata/Demoi.properties");

		// step 2 create property file obj
		Properties prop = new Properties();
		prop.load(fis);

		// step3 call
		String URL = prop.getProperty("url");
		String EMAIL = prop.getProperty("email");
		String PASS = prop.getProperty("password");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(URL);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("Email")).sendKeys(EMAIL);
		Thread.sleep(2000);

		driver.findElement(By.id("Password")).sendKeys(PASS);
		Thread.sleep(2000);

		driver.findElement(By.id("RememberMe")).click();

		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
	}
}
