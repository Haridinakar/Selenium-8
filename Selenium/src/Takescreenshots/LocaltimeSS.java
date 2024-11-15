package Takescreenshots;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class LocaltimeSS {
	public static void main(String[] args) throws IOException {
		String Time = LocalDateTime.now().toString().replace(":","-");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File temp = screenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/"+Time+".png");
		FileHandler.copy(temp, dest);
	}
}
