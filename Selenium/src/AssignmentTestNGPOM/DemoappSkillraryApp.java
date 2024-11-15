package AssignmentTestNGPOM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoappSkillraryApp {
	@Test
	public void Login() throws IOException {
		// create FIS obj
		FileInputStream fis = new FileInputStream("./Testdata/SkillraryAssign.properties");
		FileInputStream fisXl = new FileInputStream("./Testdata/testscriptdata.xlsx");

		// create Respective type obj
		Properties prop = new Properties();
		prop.load(fis);
		Workbook workbook = WorkbookFactory.create(fisXl);

		// call the read methods
		String URL = prop.getProperty("url");

		String EMAIL = workbook.getSheet("Skillrarylogindata").getRow(1).getCell(0).getStringCellValue();
		String PASSWORD = workbook.getSheet("Skillrarylogindata").getRow(1).getCell(1).getStringCellValue();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(URL);
		WelcomePage wp = new WelcomePage(driver);
		LoginPage lp = new LoginPage(driver);

		wp.getLoginLink().click();

		lp.getEmailTextField().sendKeys(EMAIL);
		lp.getPasswordTextField().sendKeys(PASSWORD);
		lp.getLoginbutton().click();

		String title = driver.getTitle();
		Reporter.log(title, true);

	}
}
