package WebdriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindowhandless {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/57");
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String S:windowHandles) {
			System.out.println(S);
		}
	}

}
