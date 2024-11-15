package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(15));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		Actions act =new Actions(driver);
		//act.contextClick().perform();
		WebElement reglink = driver.findElement(By.linkText("Register"));
		act.contextClick(reglink).perform();
	}
}
