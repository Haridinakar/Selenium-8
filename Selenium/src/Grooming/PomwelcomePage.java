package Grooming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomwelcomePage {
	// declaration
	@FindBy(xpath = "//a[@class='ico-login']")
	private WebElement loginbutton;

	// Initialization
	public PomwelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	// getters

	public WebElement getLoginbutton() {
		return loginbutton;
	}

}
