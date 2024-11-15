package POM;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapp.skillrary.com/");
		Skillrarypage sp = new Skillrarypage(driver);
		sp.getSearchTextField().sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2000);
		sp.getSearchTextField().sendKeys("testng",Keys.ENTER);
		sp.getSearchTextField().sendKeys("selenium",Keys.ENTER);
	}

}
