package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DataUtils.Credentials;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.HomePage;
import pom.Loginpage;

public class SignInTestUsingDataTableAndClassObject {  // executing using class object concept is showing conversion exception //

public WebDriver driver;
	
	@Given("^user should be at online shopping sitee$")
	public void user_should_be_at_online_shopping_site() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\automation tool\\Selenium Softwares(new)\\drivers executables\\chromedriver 89.0\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
	     
	}

	@When("^user sign in with valid credentials and sign out from accountt$")
	public void user_sign_in_with_valid_credentials_and_sign_out_from_account(List<Credentials> userCredentials) {
		
		Loginpage l = new Loginpage(driver);
		l.clickOnSignInButton();
		HomePage hp = new HomePage(driver);
		
		for(Credentials data : userCredentials) {

		l.enterEmailOrPhoneNo(data.getEmailOrPhoneNo());
		l.clickOnContinueButton();
		l.enterPassword(data.getPassWord());
		l.clickOnLoginButton();
		
	    String actualUserName = hp.getSignInUserName();
	    assertEquals(actualUserName, data.getSignInName());
	    System.out.println("actual="+actualUserName+" , "+"expected="+data.getSignInName());
	    hp.moveToAccountMenu();
	    hp.moveToSignOutButton();
	    hp.clickOnSignOutButton();
		}
		
	}

	@Then("^user should get logout successfully and login page should display successfulyy$")
	public void user_should_get_logout_successfully_and_login_page_should_display_successfully() {
		String signInPageTitle = driver.getTitle();
		assertEquals(signInPageTitle, "Amazon Sign In");
	}
	
}
