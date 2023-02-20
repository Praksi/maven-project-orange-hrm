package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import util.elementutils;

public class LoginPage {

	WebDriver driver;
	elementutils elementutils;
	//WebElements
	By username = By.name("username");
	By password = By.name("password");
	By loginButton = By.className("orangehrm-login-button");
	By invalidCredMsg = By.className("oxd-alert-content-text");
	

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		elementutils=new elementutils(driver);
	}
	
	
	//PageActions
	public void enterUsername(String user)
	{
		elementutils.enterText(username,user);
		
	}
	
	public void enterPassword(String pass)
	{
		elementutils.enterText(password, pass);
		
	}
	
	public HomePage clickLoginButton()
	{
		elementutils.doclick(loginButton);
//		HomePage page = new HomePage(driver);
//		return page;
		return new HomePage(driver);
	}
	
	public HomePage doLogin(String user, String pass)
	{
		enterUsername(user);
		enterPassword(pass);
//		HomePage page =clickLoginButton();
//		return page;
		return clickLoginButton();
	}
	
	
	public boolean isInvalidCredMsgPresent()
	{
		
	return	elementutils.isElementPresent(invalidCredMsg, 10);
		
	}
	
	public String getInvalidMsgText()
	{
		return elementutils.gettextinvalCred(invalidCredMsg);
		
	}
	
	
}
