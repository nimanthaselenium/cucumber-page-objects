package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import StepsDefinitions.CommonMethods;
import junit.framework.Assert;

public class HomePage extends CommonMethods {
	
	//Initiating page objects
		
	@FindBy(id = "giveFeedback")
	WebElement Feedbackbutton;
	
	@FindBy(xpath = "//div[contains(@class, 'ribbon-top')]/h4")
	WebElement homepagetitle;
	
	@FindBy(id = "navbar-user-caret-down")
	WebElement downarrow;
	
	@FindBy(id ="menu-user-log-out" )
	WebElement logoutbutton;
	
	public HomePage(){
		
		PageFactory.initElements(driver, this);
	}
	
	//Clicking on down arrow  
	public void clickondownarrow(){
	
		downarrow.click();
		
	}
	
	
	//Clicking on the Logout link
	public void  ClickonLogout(){
	
		logoutbutton.click();
	}
	
	

}
