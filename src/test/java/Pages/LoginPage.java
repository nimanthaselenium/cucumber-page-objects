package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import StepsDefinitions.CommonMethods;

public class LoginPage extends CommonMethods{
	
	//Initiating page objects
	
	@FindBy(id = "Email") 
	WebElement username;
	
	@FindBy(id = "Password") 
	WebElement password;
	
	@FindBy(id = "btSignIn") 
	WebElement loginbutton;
	
	
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
		
	//Entering the username and Password to login to system
	public HomePage logintoSystem(String UserName1, String Password1) throws Throwable {
		
		Thread.sleep(15000);
		username.sendKeys(UserName1);
		password.sendKeys(Password1);
		
		loginbutton.click();
		Thread.sleep(5000);
		
		return new HomePage();
	}
	

}
