package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebshop {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		// driver.get("https://demowebshop.tricentis.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		boolean displayed = driver.findElement(By.xpath("//img[@id='qspiderLogo']")).isDisplayed();
		System.out.println(displayed);
		// driver.findElement(By.xpath("//a[normalize-space()='Facebook']")).click();
//		driver.findElement(By.xpath("//a[text()='Log in']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@class='email']")).sendKeys("hari@123");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@class='password']")).sendKeys("234567");
//		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
//		
//		String title = driver.getTitle();\
//		System.out.println(title);
	}
}
