package Grooming;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshots {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		TakesScreenshot s = (TakesScreenshot) driver;
		File screenshotAs = s.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots.img.png");
		FileHandler.copy(screenshotAs, dest);
	}
}
