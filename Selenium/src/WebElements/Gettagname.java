package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettagname {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		
		String tagName = driver.findElement(By.id("small-searchterms")).getTagName();
		System.out.println(tagName);
	}
}
