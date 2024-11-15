package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println("--------Before passing Data------");
		System.out.println(element.isEnabled());

		driver.findElement(By.name("username")).sendKeys("123456789");
		driver.findElement(By.name("password")).sendKeys("asdfghjk");

		System.out.println("--------After passing Data--------");
		System.out.println(element.isEnabled());
	}
}
