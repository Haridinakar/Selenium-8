package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("Shopping cart")).click();
		driver.findElement(By.partialLinkText("Recently")).click();
		driver.findElement(By.partialLinkText("BOOKS")).click();
	}

}
