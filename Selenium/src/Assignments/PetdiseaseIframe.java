package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PetdiseaseIframe {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		WebElement element = driver
				.findElement(By.xpath("//iframe[contains(@src,'https://api-prod.capcvet.org/api/embed/pda')]"));
		driver.switchTo().frame(element);
		driver.findElement(By.id("region-27")).click();

		driver.switchTo().defaultContent();

		driver.findElement(By.xpath("//a[text()='Sign up']")).click();

		driver.findElement(By.id("user")).sendKeys("hari@123gmailcom");
		driver.findElement(By.id("pass")).sendKeys("hari1235678965");
		driver.findElement(By.id("cpass")).sendKeys("hari1235678965");
		driver.findElement(By.id("firstName")).sendKeys("Hari");
		driver.findElement(By.id("lastName")).sendKeys("dinakar");
		driver.findElement(By.id("phone")).sendKeys("9876543210");

		WebElement dropdown = driver.findElement(By.id("user-type"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("Pet Owner");

		driver.findElement(By.id("accept-tou")).click();
		
		Actions act =new Actions(driver);
		act.scrollByAmount(0, 500).perform();
		
		driver.findElement(By.xpath("//button[@value='Register']")).click();

	}
}
