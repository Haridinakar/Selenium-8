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

public class MyntaActionsclass {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.myntra.com/");
		WebElement kids = driver.findElement(By.xpath("//a[@data-index='2']"));
		WebElement ethnic = driver.findElement(By.xpath("//a[@data-reactid='357']"));

		Actions act = new Actions(driver);
		act.moveToElement(kids).perform();
		act.moveToElement(ethnic).perform();
		
		TakesScreenshot Ts =(TakesScreenshot)driver;
		File temp = Ts.getScreenshotAs(OutputType.FILE);
		File dest =new File("./Screenshots/Myntra.png");
		FileHandler.copy(temp, dest);
	}
}
