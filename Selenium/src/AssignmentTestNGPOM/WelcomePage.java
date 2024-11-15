package AssignmentTestNGPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	// Declaration
	@FindBy(linkText = "LOGIN")
	private WebElement loginLink;

	// initialization
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// getters
	public WebElement getLoginLink() {
		return loginLink;
	}

}
