package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCss {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/login");
		String fontfam = driver.findElement(By.xpath("//a[text()='Register']")).getCssValue("font-family");
		System.out.println(fontfam);
	}

}
