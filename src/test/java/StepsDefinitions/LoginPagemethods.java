package StepsDefinitions;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;
import Pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;
import StepsDefinitions.CommonMethods;

public class LoginPagemethods extends CommonMethods {
	
	LoginPage loginpage;
	HomePage homepage;
	
	//User navigate to the URL
	@Given("^User opens the browser$")
	public void user_opens_the_browser() throws Throwable {
	   CommonMethods.Driverdefinition();
	}


	//User login using username and password
	@Then("^userenter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void userenter_and(String arg1, String arg2) throws Throwable {
		loginpage = new LoginPage();
	    homepage = loginpage.logintoSystem(arg1, arg2);
	}
}
