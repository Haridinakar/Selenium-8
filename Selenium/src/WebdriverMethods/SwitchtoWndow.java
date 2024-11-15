package WebdriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchtoWndow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/15");
		Thread.sleep(45000);
		String Parent = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();
		Set<String> windowHandles = driver.getWindowHandles();

		for (String s : windowHandles) {
			driver.switchTo().window(s);
			Thread.sleep(5000);
			String url = driver.getCurrentUrl();
			System.out.println(url);

			if (url.contains("flipkart")) {
				break;
			}
		}
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("mobiles");
		driver.close();
		driver.switchTo().window(Parent);
		driver.findElement(By.id("men")).click();
	}
}