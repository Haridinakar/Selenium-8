package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class managemaximize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.agoda.com/en-in/");
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();

	}

}
