package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class DoubleClickQsp {
	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		WebElement doubleclick = driver.findElement(By.id("btn20"));
		
		Actions act =new Actions(driver);
		act.doubleClick(doubleclick).perform();
		
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File temp = screenshot.getScreenshotAs(OutputType.FILE);
		File dest =new File("./Screenshots/doubleclick.png");
		FileHandler.copy(temp, dest);
		
		
	}
}
