package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelementbyfreeze {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(19));

		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("//a[@data-group='men']"));
		WebElement Tshirts = driver.findElement(By.xpath("//a[@data-reactid='31']"));

		Actions act = new Actions(driver);
		act.moveToElement(men).perform();
		Thread.sleep(2000);
		
		act.moveToElement(Tshirts).perform();
		Tshirts.click();
	}
}
