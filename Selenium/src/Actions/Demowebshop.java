package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demowebshop {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		WebElement searchTf = driver.findElement(By.id("small-searchterms"));
		WebElement searchbutton = driver.findElement(By.xpath("//input[@type='submit']"));
		
		Actions act =new Actions(driver);
		act.sendKeys(searchTf,"14.1-inch Laptop").perform();
		act.click(searchbutton).perform();
	}
}
