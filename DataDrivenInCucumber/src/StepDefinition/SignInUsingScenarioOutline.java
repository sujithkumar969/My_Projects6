package StepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pom.Loginpage;

public class SignInUsingScenarioOutline {
	
public static WebDriver driver;                 
	
	@Given("^user should be at online shopping site \"([^\"]*)\"$")
	public void user_should_be_at_online_shopping_site(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\automation tool\\Selenium Softwares(new)\\drivers executables\\chromedriver 89.0\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@Given("^click on signIn button$")
	public void click_on_signIn_button() {
		Loginpage l=new Loginpage(driver);
		l.clickOnSignInButton();	
	}

	@When("^user enter valid \"([^\"]*)\" and click on continue button$")
	public void user_enter_valid_user_name_and_click_on_continue_button(String un) {
		Loginpage l=new Loginpage(driver);
		l.enterEmailOrPhoneNo(un);
		l.clickOnContinueButton();	
	}
	
	@And("^user enter valid \"([^\"]*)\" and click on signIn button$")
	public void user_enter_valid_a_a_and_click_on_signIn_button(String pwd) {
		Loginpage l=new Loginpage(driver);
		l.enterPassword(pwd);
		l.clickOnLoginButton();
	}

	@Then("^user should be successfully login to the application$")
	public void user_should_be_successfully_login_to_the_application() {
		Reporter.log("user in lkogin",true);
	  
	}

}
