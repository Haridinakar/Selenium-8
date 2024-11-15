package DropDowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectDD {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapp.skillrary.com/");
		WebElement multipleDD = driver.findElement(By.id("cars"));
		
		Select multipleselect=new Select(multipleDD);
		multipleselect.selectByIndex(0);
		multipleselect.selectByIndex(1);
		multipleselect.selectByIndex(2);
	}

}
