package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	// Declaration
	@FindBy(xpath = "//a[@class='ico-register']")
	private WebElement RegisterButton;

	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement LoginButton;

	// Initialization
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	// Getters

	public WebElement getRegisterButton() {
		return RegisterButton;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}

}
