package Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqsp {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/table");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String text = driver.findElement(By.xpath("//th[text()='SAMSUNG Galaxy']/following-sibling::td[3]")).getText();
		System.out.println(text);
		
	}

}
