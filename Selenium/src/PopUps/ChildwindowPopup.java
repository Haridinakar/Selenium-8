package PopUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildwindowPopup {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.shoppersstack.com/products_page/23");
		String parentid = driver.getWindowHandle();
		driver.findElement(By.id("compare")).click();

		Set<String> allids = driver.getWindowHandles();

		for (String ids : allids) {
			driver.switchTo().window(ids);
			String currentUrl = driver.getCurrentUrl();
			if (currentUrl.contains("flipkart")) {
				break;
			}
		}
		driver.manage().window().maximize();
		driver.close();

		driver.switchTo().window(parentid);
		driver.close();
	}
}
