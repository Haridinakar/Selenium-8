package Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TocloseallWindows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.shoppersstack.com/products_page/22");
		String parent = driver.getWindowHandle();
		Thread.sleep(30000);
		
		driver.findElement(By.id("compare")).click();
		Set<String> Childids = driver.getWindowHandles();
		
		for (String ids : Childids) {
			if(!ids.contains(parent)) {
				Thread.sleep(2000);
				driver.close();
			}
		}
	}

}
