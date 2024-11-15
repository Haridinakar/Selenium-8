package Assignment01TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLoginpage01 {

	@FindBy(id = "email")
	private WebElement emailTextField;

	@FindBy(id = "password")
	private WebElement passwordTextField;

	@FindBy(id = "last")
	private WebElement loginLgButtton;

	@FindBy(xpath = "//span[text()='Sales']")
	private WebElement salesLink;

	public POMLoginpage01(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginLgButtton() {
		return loginLgButtton;
	}

	public WebElement getSalesLink() {
		return salesLink;
	}

}
