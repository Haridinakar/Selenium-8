package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getcsscolor {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		String csscolor = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"))
				.getCssValue("color");
		System.out.println(csscolor);
	}
}
