package Assignment01TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMLogoutpage01 {
	@FindBy(xpath = "//span[contains(text(),'SkillRary Admin')]")
	private WebElement logoutImg;

	@FindBy(partialLinkText = "Sign out")
	private WebElement signoutButton;

	public POMLogoutpage01(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutImg() {
		return logoutImg;
	}

	public WebElement getSignoutButton() {
		return signoutButton;
	}

}
