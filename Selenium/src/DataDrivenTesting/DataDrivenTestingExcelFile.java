package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTestingExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// step 1 Create FIS obj
		FileInputStream fis = new FileInputStream("./Testdata/testscriptdata.xlsx");

		// step 2 Create respective Filetype obj
		Workbook workbook = WorkbookFactory.create(fis);

		// step 3 Call read method
		String URL = workbook.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String UN = workbook.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String PWD = workbook.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();

		double PRICE = workbook.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		boolean STATUS = workbook.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();
		LocalDateTime DATE = workbook.getSheet("Sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();

		System.out.println(URL);
		System.out.println(UN);
		System.out.println(PWD);
		System.out.println(PRICE);
		System.out.println(STATUS);
		System.out.println(DATE);
		
		System.out.println(DATE.getDayOfMonth());
		System.out.println(DATE.getMonth());
		System.out.println(DATE.getYear());

//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		
//		driver.get(URL);
//		driver.findElement(By.linkText("LOGIN")).click();
//		driver.findElement(By.id("email")).sendKeys(UN);
//		driver.findElement(By.id("password")).sendKeys(PWD);
//		driver.findElement(By.id("last")).click();
	}
}
