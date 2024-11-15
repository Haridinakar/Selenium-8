package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Freshersworld {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.freshersworld.com/");
		driver.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
		WebElement cityname = driver.findElement(By.id("currentCity"));
		WebElement HigeshtDegree = driver.findElement(By.id("course"));

		Select city = new Select(cityname);
		Select degree = new Select(HigeshtDegree);
		Thread.sleep(2000);
		city.selectByVisibleText("Bangalore");
		Thread.sleep(2000);
		degree.selectByVisibleText("BE/B.Tech");

		TakesScreenshot page = (TakesScreenshot) driver;
		File temp = page.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/Freshersworld.png");

		FileHandler.copy(temp, dest);

	}
}
