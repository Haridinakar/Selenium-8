package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattribute {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		String attributeval = driver.findElement(By.xpath("//input[@name='q']")).getAttribute("placeholder");
		System.out.println(attributeval);
	}
}
