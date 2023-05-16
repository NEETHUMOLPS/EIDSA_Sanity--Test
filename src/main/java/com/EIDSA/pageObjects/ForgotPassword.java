package com.EIDSA.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AbstractComponents.AbstractComponent;

public class ForgotPassword extends AbstractComponent{
	static WebDriver driver;
	public ForgotPassword(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//a[@href='CheckEmail']")
	@CacheLookup
	WebElement forgotPassword;
	
	@FindBy(xpath = "//input[@placeholder='Account Email']")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath = "//button[normalize-space()='Submit']")
	@CacheLookup
	WebElement submit;
	
	@FindBy(xpath = "//span[contains(text(),'Please enter a valid email address.')]")
	@CacheLookup
	WebElement err;
	
	public void clickforgotPassword() throws InterruptedException
	{
		Thread.sleep(3000);
		forgotPassword.click();
		Thread.sleep(3000);
	}
	
	public void clickEmail() throws InterruptedException
	{
		Thread.sleep(3000);
		email.click();
		Thread.sleep(3000);
	}
	
	public void setEmail(String nm) throws InterruptedException
	{
		Thread.sleep(3000);
		email.sendKeys(nm);
		Thread.sleep(3000);
	}
	
	public void clickSubmit() throws InterruptedException
	{
		Thread.sleep(3000);
		submit.click();
		Thread.sleep(3000);
	}
	
	public String ErrorMsg()
	{
		elementWait(err);
		return err.getText();
	}

}
