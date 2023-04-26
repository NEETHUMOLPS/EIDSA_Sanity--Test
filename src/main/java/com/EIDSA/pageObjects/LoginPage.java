package com.EIDSA.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AbstractComponents.AbstractComponent;

public class LoginPage extends AbstractComponent{
	static WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/input[1]")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[2]/input[1]")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/button[1]")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]/img[1]")
	@CacheLookup
	WebElement userProfile;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[4]/div[1]/div[2]/div[3]")
	@CacheLookup
	WebElement btnLogout;
	
	@FindBy(xpath="//span[contains(text(),'Invalid username or password.')]")
	@CacheLookup
	WebElement err1;

	//public Object setUsername;
	
	
	
	public void clearUser()
	{
		txtUsername.clear();
	}
	
	public String ErrorMsg()
	{
		elementWait(err1);
		return err1.getText();
	}
	
	public void clearPwd()
	{
		txtPassword.clear();
	}
	
	public void setUsername(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	

	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		btnLogin.click();
	}
	
	public void clickUserProfile()
	{
		userProfile.click();
	}
	public void clickLogout()
	{
		btnLogout.click();
	}
	
}