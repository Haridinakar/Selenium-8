package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getpagesouce {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		String sorucecode = driver.getPageSource();
		System.out.println(sorucecode);
		

	}

}
