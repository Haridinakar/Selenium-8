package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettext {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Thread.sleep(2000);
		String errmsg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getText();
		System.out.println(errmsg);

		if (errmsg.contains("login was unsucessful")) {
			System.out.println("ErrMsg is Displayed");
		} else {
			System.out.println("Err msg is not display");
		}
	}

}
