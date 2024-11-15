package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getoptions {
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://en-gb.facebook.com/reg/");
		WebElement month = driver.findElement(By.id("month"));
		Select monthbox =new Select(month);
		List<WebElement> options = monthbox.getOptions();
		monthbox.selectByIndex(0);
		//System.out.println(monthbox.isMultiple());
	//	System.out.println(options.size());
		
		for (WebElement ele : options) {
			System.out.println(ele.getText());
		}
		
	}
}
