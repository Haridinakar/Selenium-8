package AssignmentTestNGPOM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import DropDowns.Getoptions;

public class Test{
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://profile.oracle.com/myprofile/account/create-account.jspx");
		WebElement element = driver.findElement(By.xpath("//select[@title='India']"));
		Set<String> windowHandles = driver.getWindowHandles();
		Select sel = new Select(element);
		List<WebElement> options = sel.getOptions();
		for (WebElement opt : options) {
			System.out.println(opt);
		}
		sel.selectByVisibleText("Zimbabwe");		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/Test.png");
		FileHandler.copy(temp, dest);
		
		driver.findElement(By.xpath("//a[@href='https://www.oracle.com/legal/terms.html']")).click();
		
		List<WebElement> headings = driver.findElements(By.tagName("h3"));
		System.out.println(headings);
		for (WebElement printheading : headings) {
			driver.switchTo().window("printheading");
			System.out.println(printheading.getText());
			}
		
		
	}
}
