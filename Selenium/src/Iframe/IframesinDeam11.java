package Iframe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesinDeam11 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.dream11.com/");

		driver.switchTo().frame(0);// INDEX

//		driver.switchTo().frame("send-sms-iframe");//NAME OR ID PRESENT IN <IFRAME>TAG

//		WebElement Example = driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
//		driver.switchTo().frame(Example);//XPATH FOR IFRAME TAG

		driver.findElement(By.id("regEmail")).sendKeys("9876543210");

//		driver.switchTo().defaultContent();//SWICHBACKTO-->PARENT PAGE
		driver.switchTo().parentFrame();// SWICHBACKTO-->PARENT PAGE
		driver.findElement(By.id("hamburger")).click();

	}
}
