package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.HomePage;
import pom.Loginpage;

public class SignInTestUsingDataTable {
	
public WebDriver driver;
	
	@Given("^user should be at online shopping site$")
	public void user_should_be_at_online_shopping_site() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\automation tool\\Selenium Softwares(new)\\drivers executables\\chromedriver 89.0\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
	     
	}

	@When("^user sign in with valid credentials and sign out from account$")
	public void user_sign_in_with_valid_credentials_and_sign_out_from_account(DataTable userCredentials) {
		
		Loginpage l = new Loginpage(driver);
		l.clickOnSignInButton();
		HomePage hp = new HomePage(driver);
		
		for(Map<String, String> data : userCredentials.asMaps(String.class, String.class)) {

		l.enterEmailOrPhoneNo(data.get("emailOrPhoneNo"));
		l.clickOnContinueButton();
		l.enterPassword(data.get("passWord"));
		l.clickOnLoginButton();
		
	    String actualUserName = hp.getSignInUserName();
	    assertEquals(actualUserName, data.get("SignInName"));
	    System.out.println("actual="+actualUserName+" , "+"expected="+data.get("SignInName"));
	    hp.moveToAccountMenu();
	    hp.moveToSignOutButton();
	    hp.clickOnSignOutButton();
		}
		
	}

	@Then("^user should get logout successfully and login page should display successfuly$")
	public void user_should_get_logout_successfully_and_login_page_should_display_successfuly() {
		String signInPageTitle = driver.getTitle();
		assertEquals(signInPageTitle, "Amazon Sign In");
	}

}
