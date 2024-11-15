package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// declaration
	
	@FindBy(xpath = "//input[@id='Email']")
	private WebElement EmailTextField;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement PasswordTextField;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement RegLoginbutton;

	// Initialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	// getters

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getRegLoginbutton() {
		return RegLoginbutton;
	}
}
