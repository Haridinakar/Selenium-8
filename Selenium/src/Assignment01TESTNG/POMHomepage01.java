package Assignment01TESTNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMHomepage01 {

//	DECLARATATION

	@FindBy(linkText = "LOGIN")
	private WebElement loginButton;

//	INTIALAIZATION

	public POMHomepage01(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//  GETTERS	
	public WebElement getLoginButton() {
		return loginButton;
	}

}
