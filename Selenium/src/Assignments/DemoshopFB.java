package Assignments;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoshopFB {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String s:windowHandles) {
			System.out.println(s);
		}
	}
}
