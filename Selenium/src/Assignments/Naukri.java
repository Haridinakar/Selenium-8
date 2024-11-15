package Assignments;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		Point position = driver.manage().window().getPosition();
		int x = position.getX();
		int y = position.getY();
		System.out.println(x);
		System.out.println(y);
		
		Thread.sleep(2000);
		driver.navigate().refresh();

	}

}
