package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	// Declaration
	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	// Intialization
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Getters
	public WebElement getLoginLink() {
		return loginLink;
	}

}
