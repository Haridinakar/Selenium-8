package AsssignmenntsPOM;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestScriptRegister {
	public static void main(String[] args) throws IOException {

		// FIS OBJ
		FileInputStream fis = new FileInputStream("./Testdata/Commondata.properties");
		FileInputStream fisxl = new FileInputStream("./Testdata/testscriptdata.xlsx");

		// Respective File typ obj
		Properties prop = new Properties();
		prop.load(fis);
		Workbook workbook = WorkbookFactory.create(fisxl);

		// call read method
		String URL = prop.getProperty("url");
		String FN = workbook.getSheet("Registerdetails").getRow(1).getCell(0).getStringCellValue();
		String LN = workbook.getSheet("Registerdetails").getRow(1).getCell(1).getStringCellValue();
		String EMAIL = workbook.getSheet("Registerdetails").getRow(1).getCell(2).getStringCellValue();
		String PASS = workbook.getSheet("Registerdetails").getRow(1).getCell(3).getStringCellValue();
		String CNFPASS = workbook.getSheet("Registerdetails").getRow(1).getCell(4).getStringCellValue();
		String ER = workbook.getSheet("Registerdetails").getRow(1).getCell(5).getStringCellValue();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get(URL);
		WelcomePage wp = new WelcomePage(driver);
		RegisterPage rp = new RegisterPage(driver);

		wp.getRegisterlink().click();

		rp.getMaleRadioButton().click();
		rp.getFirstNameTextField().sendKeys(FN);
		rp.getLastNameTextField().sendKeys(LN);
		rp.getEmailTextField().sendKeys(EMAIL);
		rp.getPasswordTextField().sendKeys(PASS);
		rp.getConfirmpasswordTextField().sendKeys(CNFPASS);
		rp.getRegisterbutton().click();

		String text = rp.getActualResult().getText();
		System.out.println(text);

		if (text.contains(ER)) {
			System.out.println("Register Successfully");
		}

	}
}
