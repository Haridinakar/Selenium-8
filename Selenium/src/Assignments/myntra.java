package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/men-formal-shirts");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.quit();
	}

}
