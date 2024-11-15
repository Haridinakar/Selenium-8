package AssignmentTestNGPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// declaration
	@FindBy(id = "email")
	private WebElement emailTextField;

	@FindBy(id = "password")
	private WebElement passwordTextField;

	@FindBy(id = "last")
	private WebElement loginbutton;

	// initialaization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// getters
	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

}
