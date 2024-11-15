package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");
		String Rating="Very bad";
		WebElement GoodRadioButton = driver.findElement(By.xpath("//label[text()='"+Rating+"']/..//input[@type='radio']"));
		System.out.println("=====Before Selected=====");
		System.out.println(GoodRadioButton.isSelected());

		GoodRadioButton.click();
		System.out.println("=====After Selected=====");
		System.out.println(GoodRadioButton.isSelected());
	}
}
