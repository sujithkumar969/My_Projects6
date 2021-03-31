package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	@FindBy(id="nav-link-accountList-nav-line-1")
	private WebElement signbtn;
	
	@FindBy(id="ap_email")
	private WebElement eleEmailTextBox;
	
	@FindBy(id="continue")
	private WebElement eleContinueButton;
	
	@FindBy(id="ap_password")
	private WebElement elePasswordTextBox;
	
	@FindBy(id="signInSubmit")
	private WebElement eleLoginButton;
	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignInButton() {
		signbtn.click();
	}
	
	public void enterEmailOrPhoneNo(String email) {
		eleEmailTextBox.sendKeys(email);
	}
	
	public void clickOnContinueButton() {
		eleContinueButton.click();
	}
	
	public void enterPassword(String password) {
		elePasswordTextBox.sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		eleLoginButton.click();
	}

}

	

