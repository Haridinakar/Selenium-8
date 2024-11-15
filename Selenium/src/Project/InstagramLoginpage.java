package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramLoginpage {
	// declaration
	@FindBy(xpath = "//input[@aria-label='Phone number, username, or email']")
	private WebElement usenameTextField;

	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement passwordTextField;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;

	// initialization
	public InstagramLoginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// getters
	public WebElement getUsenameTextField() {
		return usenameTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

}
