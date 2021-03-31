package StepDefinition;

import static org.testng.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.HomePage;

public class SignOutUsingScenarioOutline {
	
public HomePage hp;
	
	
	@Given("^user should be at home page with \"([^\"]*)\"$")
	public void user_should_be_at_home_page_with(String SignInName) {
	    hp = new HomePage(SignInUsingScenarioOutline.driver);
	    String actualUserName = hp.getSignInUserName();
	    assertEquals(actualUserName, SignInName);
	    System.out.println("actual="+actualUserName+" , "+"expected="+SignInName);
	}

	@When("^click on signout button$")
	public void click_on_signout_button() {
	    hp.moveToAccountMenu();
	    hp.moveToSignOutButton();
	    hp.clickOnSignOutButton();
	}

	@Then("^user should get logout successfully and login page should display$")
	public void user_should_get_logout_successfully_and_login_page_should_display() {
		String signInPageTitle = SignInUsingScenarioOutline.driver.getTitle();
		assertEquals(signInPageTitle, "Amazon Sign In");
	}

}
