package WebdriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPosition {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.agoda.com/en-in/");
		Point position = driver.manage().window().getPosition();
		
		int x = position.getX();
		int y=position.getY();
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
	}

}
