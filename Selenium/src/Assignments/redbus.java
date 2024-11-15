package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class redbus {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		
		driver.close();
	}

}
