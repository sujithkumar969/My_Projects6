package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	private WebElement eleSignUserName;
	
	@FindBy(id="nav-link-accountList")
	private WebElement eleAccountMenu;
	
	@FindBy(id="nav-item-signout")
	private WebElement eleSignOutButton;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public String getSignInUserName() {
		String userName = eleSignUserName.getText();
		return userName;
	}
	
	public void moveToAccountMenu() {
		Actions action = new Actions(driver);
		action.moveToElement(eleAccountMenu).perform();
	}
	
	public void moveToSignOutButton() {
		Actions action = new Actions(driver);
		action.moveToElement(eleSignOutButton).perform();
	}
	
	public void clickOnSignOutButton() {
		eleSignOutButton.click();
	}

}
