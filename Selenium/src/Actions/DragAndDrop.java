package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);

		WebElement pic1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement pic2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement trash = driver.findElement(By.id("trash"));

		Actions act = new Actions(driver);
		act.dragAndDrop(pic1, trash).perform();
		act.dragAndDrop(pic2, trash).perform();
		
		WebElement gallery = driver.findElement(By.id("gallery"));
		
		act.pause(2000).dragAndDrop(pic1, gallery).perform();
		act.pause(2000).dragAndDrop(pic2, gallery).perform();

	}

}
