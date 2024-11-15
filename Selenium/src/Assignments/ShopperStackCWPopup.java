package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ShopperStackCWPopup {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("compare")).click();

		Set<String> allids = driver.getWindowHandles();
		for (String IDs : allids) {
			driver.switchTo().window(IDs);
			String currentUrl = driver.getCurrentUrl();
			if (currentUrl.contains("amazon")) {
				break;
			}
		}
		Actions act = new Actions(driver);
		act.scrollByAmount(300, 500).perform();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/Amazon.png");
		FileHandler.copy(temp, dest);
	}
}
