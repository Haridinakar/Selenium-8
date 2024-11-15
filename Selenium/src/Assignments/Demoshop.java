package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoshop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.cssSelector("a[class=ico-login]")).click();
		
		driver.findElement(By.cssSelector("input[class='email']")).sendKeys("hari@12345");
		driver.findElement(By.cssSelector("input[class='password']")).sendKeys("345675");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);

	}

}
