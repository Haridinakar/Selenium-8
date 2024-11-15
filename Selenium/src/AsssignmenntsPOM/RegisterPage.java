package AsssignmenntsPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	// Declaration
	@FindBy(id = "gender-male")
	private WebElement maleRadioButton;

	@FindBy(id = "gender-female")
	private WebElement femaleRadioButton;

	@FindBy(id = "FirstName")
	private WebElement firstNameTextField;

	@FindBy(id = "LastName")
	private WebElement lastNameTextField;

	@FindBy(id = "Email")
	private WebElement emailTextField;

	@FindBy(id = "Password")
	private WebElement passwordTextField;

	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpasswordTextField;

	@FindBy(id = "register-button")
	private WebElement registerbutton;

	@FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
	private WebElement actualResult;

	// intialiazation
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Getters
	public WebElement getMaleRadioButton() {
		return maleRadioButton;
	}

	public WebElement getFemaleRadioButton() {
		return femaleRadioButton;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getConfirmpasswordTextField() {
		return confirmpasswordTextField;
	}

	public WebElement getActualResult() {
		return actualResult;

	}

	public WebElement getRegisterbutton() {
		return registerbutton;
	}

}
