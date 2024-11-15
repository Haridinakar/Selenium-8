package Assignments;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromiumCommands {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://peter.sh/experiments/chromium-command-line-switches");
	    JavascriptExecutor js =(JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    Thread.sleep(2000);
		js.executeScript("history.go()");
	}
}
