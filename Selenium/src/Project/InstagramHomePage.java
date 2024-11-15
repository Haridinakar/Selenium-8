package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InstagramHomePage {
	// declaration
	@FindBy(xpath = "//button[text()='Not Now']")
	private WebElement notnowbutton;

	@FindBy(xpath = "//span[text()='Search']")
	private WebElement searchBar;

	@FindBy(xpath = "(//div[@class='x1n2onr6 x6s0dn4 x78zum5'])[4]")
	private WebElement searchTextField;

	@FindBy(xpath = "//span[text()='hariee13']")
	private WebElement searchNameclick;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement followbackButton;

	@FindBy(xpath = "//span[text()='More']")
	private WebElement moreOptions;

	@FindBy(xpath = "//span[text()='Log out']")
	private WebElement logoutButton;

	// intializatiom
	public InstagramHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// getters

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getNotnowbutton() {
		return notnowbutton;
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}

	public WebElement getSearchNameclick() {
		return searchNameclick;
	}

	public WebElement getFollowbackButton() {
		return followbackButton;

	}

	public WebElement getMoreOptions() {
		return moreOptions;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

}
