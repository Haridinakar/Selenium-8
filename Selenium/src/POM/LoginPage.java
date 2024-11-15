package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// Declaration
	@FindBy(id = "Email")
	private WebElement emailTextFlied;

	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;

	// intialization
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Getters
	public WebElement getEmailTextFlied() {
		return emailTextFlied;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
