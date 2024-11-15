package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQspActions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapps.qspiders.com/ui/button/buttonRight?sublist=1");

		WebElement Rightclick = driver.findElement(By.id("btn30"));

		Actions act = new Actions(driver);

		act.contextClick(Rightclick).perform();
		WebElement Yesoption = driver.findElement(By.xpath("//div[text()='Yes']"));
		Yesoption.click();

		WebElement color = driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']"));

		System.out.println(color.getText());
		System.out.println(color.getCssValue("color"));
	}
}
