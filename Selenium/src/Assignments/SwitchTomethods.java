package Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTomethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(10000);
		String parent = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();

		switchhToWindow(driver, "flipkart");
		Point flipkartposition = driver.manage().window().getPosition();

		switchhToWindow(driver, "ebay");
		Point ebayposition = driver.manage().window().getPosition();
		driver.manage().window().setPosition(flipkartposition);

		switchhToWindow(driver, "flipkart");
		driver.manage().window().setPosition(ebayposition);

	}

	public static void switchhToWindow(WebDriver driver, String url) {
		Set<String> allwindowids = driver.getWindowHandles();
		for (String id : allwindowids) {
			driver.switchTo().window(id);
			String currentUrl = driver.getCurrentUrl();
			if (currentUrl.contains(url)) {
				break;
			}
		}
	}
}
