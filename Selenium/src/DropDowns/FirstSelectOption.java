package DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectOption {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demoapp.skillrary.com/");
		WebElement PriceBox = driver.findElement(By.id("cars"));
		Select Allprices = new Select(PriceBox);
		Allprices.selectByIndex(0);
		//Allprices.selectByIndex(2);
		//Allprices.selectByIndex(1);

//		WebElement firstSelectedOption = Allprices.getFirstSelectedOption();
		// System.out.println(firstSelectedOption.getText());// firstSelectedOption
		System.out.println(Allprices.isMultiple());
//
//		List<WebElement> allSelectedOptions = Allprices.getAllSelectedOptions();
//		System.out.println(allSelectedOptions.size());
//
//		for (WebElement ele : allSelectedOptions) {
//			System.out.println(ele.getText());
//		}
//
	}

}
