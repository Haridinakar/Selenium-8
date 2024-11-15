package WebdriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://www.amazon.com/");
		//driver.navigate().to("https://www.amazon.com/");
		driver.navigate().to(new URL("https://www.amazon.com/"));
		
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		
	}
}
