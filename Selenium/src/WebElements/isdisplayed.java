package WebElements;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class isdisplayed {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot s=(TakesScreenshot)driver;
		File screenshotAs = s.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/img1.png");
		FileHandler.copy(screenshotAs ,dest);
		
		boolean displayed = driver.findElement(By.id("small-searchterms")).isDisplayed();
		System.out.println(displayed);
	}
}
