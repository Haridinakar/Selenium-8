package Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemowebshopFBsign {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		String titleDS = driver.getTitle();
		System.out.println(titleDS);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();

		Switchtofb(driver, "facebook");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();

		Switchtofb(driver, "reg/?next");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.name("firstname")).sendKeys("Hari");

	}

	public static void Switchtofb(WebDriver driver, String url) {
		Set<String> windowHandles = driver.getWindowHandles();

		for (String string : windowHandles) {
			driver.switchTo().window(string);

			String currentUrl = driver.getCurrentUrl();
//			System.out.println(currentUrl);

			if (currentUrl.contains(url)) {
				break;
			}
		}
	}
}