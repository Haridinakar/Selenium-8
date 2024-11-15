package WebdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.agoda.com/en-in/");
		driver.manage().window().fullscreen();
		Dimension size = driver.manage().window().getSize();
		int Height = size.getHeight();
		int Width = size.getWidth();
		
		System.out.println("Height:"+Height);
		System.out.println("Width:"+Width);
		
	}

}
