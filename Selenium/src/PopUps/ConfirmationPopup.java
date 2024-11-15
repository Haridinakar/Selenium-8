package PopUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		Alert Confirmation = driver.switchTo().alert();
		System.out.println(Confirmation.getText());
		Thread.sleep(2000);
		Confirmation.accept();
		Thread.sleep(2000);
		System.out.println(Confirmation.getText());
		Thread.sleep(2000);
		Confirmation.accept();
		
	}

}
