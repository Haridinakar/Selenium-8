package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyAxes {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("D:/JAVA vs/movie.html");
		String text = driver.findElement(By.xpath("//td[text()='KGF']/following-sibling::td[2]")).getText();
		System.out.println(text);
		
		
	}
}
