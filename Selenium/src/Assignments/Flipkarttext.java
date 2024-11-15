package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkarttext {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		String text = driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"))
				.getAttribute("title");

		System.out.println(text);
	}
}
