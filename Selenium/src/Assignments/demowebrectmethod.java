package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demowebrectmethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		boolean displayed = driver.findElement(By.id("newsletter-subscribe-button")).isDisplayed();
		Rectangle rect = driver.findElement(By.id("newsletter-subscribe-button")).getRect();
		
		System.out.println(displayed);
		System.out.println("heigth:"+rect.getHeight());
		System.out.println("width:"+rect.getWidth());
		System.out.println("X:"+rect.getX());
		System.out.println("Y:"+rect.getY());
		
		
	}
}
