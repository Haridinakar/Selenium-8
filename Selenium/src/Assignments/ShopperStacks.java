package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopperStacks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://shoppersstack.com/");
		Thread.sleep(40000);
		driver.findElement(By
				.xpath("//span[text()='FAIR AND HANDSOME 2X Spot Reduction |M...']/../..//button[text()='add to cart']"))
				.click();

	}
}
