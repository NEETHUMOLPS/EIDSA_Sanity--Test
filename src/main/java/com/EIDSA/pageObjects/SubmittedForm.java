package com.EIDSA.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.AbstractComponents.AbstractComponent;

public class SubmittedForm extends AbstractComponent{
	static WebDriver driver;
	public SubmittedForm(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Menu
	@FindBy(xpath = "//span[normalize-space()='Items']")
	WebElement items;
	@FindBy(xpath = "//span[normalize-space()='Submitted Forms']")
	WebElement submittedForm;
	
	//Webtable
	@FindBy(xpath="//td[1]//i")
	List<WebElement> view;
	
	@FindBy(xpath="//i[@class='fa fa-eye editicon']")
	WebElement form1;
	
	
	public void clickOnSubmittedForm() throws InterruptedException
	{
		Thread.sleep(2000);
		items.click();
		Thread.sleep(2000);
		submittedForm.click();
		Thread.sleep(2000);
	}
		
	public void viewForm() throws InterruptedException
	{
		Thread.sleep(2000);
		form1.click();
		Thread.sleep(2000);
	}
	

	

	
	
	

}
