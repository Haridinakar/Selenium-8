package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClick {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		driver.get("https://demoapp.skillrary.com/product.php?product=selenium");
		WebElement Addicon = driver.findElement(By.id("add"));

		Actions act = new Actions(driver);
		for (int i = 0; i <9; i++) {
			
			act.doubleClick(Addicon).perform();
		}
	}
}
