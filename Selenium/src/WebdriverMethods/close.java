package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
//		String title = driver.getTitle();
//		String sourcecode=driver.getPageSource();
//		
//		System.out.println(sourcecode);
//		System.out.println(title);
//		
		driver.close();
	}

}
