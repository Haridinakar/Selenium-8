package Assignments;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScript {
	public static void main(String[] args) throws IOException {
		// Step 1 FIS obj prop and Excel
		FileInputStream fis = new FileInputStream("./Testdata/Commondata.properties");
		FileInputStream fis1 = new FileInputStream("./Testdata/testscriptdata.xlsx");

		// Step 2 Create Respective File type obj

		// properties
		Properties prop = new Properties();
		prop.load(fis);

		// excel
		Workbook workbook = WorkbookFactory.create(fis1);

		// Step3 call the read method
		// PROPETY FILE
		String URL = prop.getProperty("url");

		// EXCEL FILE
		String FN = workbook.getSheet("Sheet2").getRow(1).getCell(0).getStringCellValue();
		String LN = workbook.getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
		String EMAIL = workbook.getSheet("Sheet2").getRow(1).getCell(2).getStringCellValue();
		String PASS = workbook.getSheet("Sheet2").getRow(1).getCell(3).getStringCellValue();
		String CNFPASS = workbook.getSheet("Sheet2").getRow(1).getCell(4).getStringCellValue();

		System.out.println(URL);
		System.out.println(FN);
		System.out.println(LN);
		System.out.println(EMAIL);
		System.out.println(PASS);
		System.out.println(CNFPASS);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(URL);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();

		driver.findElement(By.id("FirstName")).sendKeys(FN);
		driver.findElement(By.id("LastName")).sendKeys(LN);

		driver.findElement(By.id("Email")).sendKeys(EMAIL);

		driver.findElement(By.id("Password")).sendKeys(PASS);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(CNFPASS);

		driver.findElement(By.id("register-button")).click();
	}

}
