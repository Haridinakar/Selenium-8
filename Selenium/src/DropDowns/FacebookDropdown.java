package DropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		driver.get("https://en-gb.facebook.com/reg/");
		WebElement dayDD = driver.findElement(By.id("day"));
		WebElement monthDD = driver.findElement(By.id("month"));
		WebElement yeayDD = driver.findElement(By.id("year"));
		
		
		Select dayselect =new Select(dayDD);
		Select monthselect =new Select(monthDD);
		Select yearselect =new Select(yeayDD);
		
		dayselect.selectByVisibleText("13");
		monthselect.selectByVisibleText("Sep");
		yearselect.selectByVisibleText("2003");
		
		
	}

}
