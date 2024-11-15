package Grooming;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Flipkart {
	public static void main(String[] args) throws IOException, InterruptedException {
		String Time = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.flipkart.com/");

		List<WebElement> img1 = driver.findElements(By.xpath("//div[@class='YBLJE4']"));
		int i = 1;
		for (WebElement webElement : img1) {
			Thread.sleep(3000);
			File temp = webElement.getScreenshotAs(OutputType.FILE);
			File dest = new File("./Screenshots/" + i + Time + webElement.getText() + webElement.getTagName() + ".png");
			FileHandler.copy(temp, dest);
			i++;
		}
	}
}
