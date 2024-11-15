package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Globalapp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement Frames = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));

		driver.switchTo().frame(Frames);
		WebElement pic1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement pic2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement Trash = driver.findElement(By.id("trash"));

		Actions act = new Actions(driver);
		act.dragAndDrop(pic1, Trash).perform();
		act.dragAndDrop(pic2, Trash).perform();
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='CheatSheets']")).click();
		
//		WebElement ads = driver.findElement(By.id("aswift_5"));
//		driver.switchTo().frame(ads);
		
		//NOT YET COMPLETE
		

	}
}
