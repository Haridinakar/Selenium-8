package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vtiger01 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.vtiger.com/vtigercrm/");
		WebElement us = driver.findElement(By.xpath("//input[@id='username']"));
		us.clear();
		us.sendKeys("Testing@123");

		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
		pwd.clear();
		pwd.sendKeys("234567");

		WebElement subm = driver.findElement(By.xpath("//button[@class='button buttonBlue']"));
		subm.submit();
	}

}
