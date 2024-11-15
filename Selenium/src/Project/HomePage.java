package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// declaration

	@FindBy(xpath = "//a[text()='Log out']")
	private WebElement logoutButton;

	// Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//getters

	public WebElement getLogoutButton() {
		return logoutButton;
	}
	
}
