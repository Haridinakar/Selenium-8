package WebdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setsize {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.agoda.com/en-in/");
		
		driver.manage().window().setSize(new Dimension(1000,1000));
		
	}

}