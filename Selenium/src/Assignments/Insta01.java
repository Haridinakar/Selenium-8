package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Insta01 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		Thread.sleep(9000);
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/help/instagram/261704639352628']]")).click();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("facebook");
		driver.findElement(By.xpath("//input[@type='search']")).click();

	}
}
