package Assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntrasize {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		Dimension size = driver.manage().window().getSize();
		
		int Height = size.getHeight();
		int Width = size.getWidth();
		
		System.out.println("Height:"+Height);
		System.out.println("Width:"+Width);
	}

}
