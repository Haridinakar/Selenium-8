package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtiger {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://crmaccess.vtiger.com/log-in/?mode=continue");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Testing");

		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Testing@123");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		String csscol = driver.findElement(By.xpath("//p[@class='text-danger mb-0']")).getCssValue("color");

		System.out.println(csscol);

	}

}

