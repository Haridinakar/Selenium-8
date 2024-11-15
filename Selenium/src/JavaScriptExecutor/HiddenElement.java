package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/r.php");
		WebElement gender = driver.findElement(By.id("custom_gender"));
		WebElement name = driver.findElement(By.name("firstname"));
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='Hello Have a nice day'",gender);
		js.executeScript("arguments[0].value='Hari'",name);
		
	}
}
