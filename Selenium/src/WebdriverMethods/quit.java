package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/52");
		Thread.sleep(10000);
		driver.findElement(By.id("compare")).click();	
		driver.quit();
		
	}
}
