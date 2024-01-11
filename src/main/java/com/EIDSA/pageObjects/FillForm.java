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

public class FillForm extends AbstractComponent{
	static WebDriver driver;
	public FillForm(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Select study
	@FindBy(xpath = "//select[@name='account']")
	WebElement selectStudy;
	
	//Menu
	@FindBy(xpath = "//span[normalize-space()='Fill Form']")
	WebElement FillForm;
	
	//Web table
	@FindBy(xpath = "//td[1]")
	List<WebElement> TableSiteCode;
	@FindBy(xpath = "//td[2]")
	List<WebElement> TableSubId;
	@FindBy(xpath = "//td[3]")
	List<WebElement> TableVisitName;
	@FindBy(xpath = "//td[6]")
	List<WebElement> TableSubmitForm;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/i[1]")
	WebElement reviewAndSubmitForm;
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[6]/i[1]")
	WebElement saveForm;
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	WebElement Save;
	@FindBy(xpath = "//button[contains(text(),'Review And Submit')]")
	WebElement ReviewAndSubmit;
	
	@FindBy(xpath = "//input[@type='textbox']")
	WebElement nameField;
	
	public void selectStudy1(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel = new Select(selectStudy);
		sel.selectByVisibleText(study);
		Thread.sleep(2000);
	}
	
	
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Form saved successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert2() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Form submitted successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void clickFillForm() throws InterruptedException
	{
		Thread.sleep(2000);
		FillForm.click();
		Thread.sleep(2000);
	}
	
	public void reviewAndSubmit() throws InterruptedException
	{
		Thread.sleep(2000);
		ReviewAndSubmit.click();
		Thread.sleep(2000);
	}
	
	public void save() throws InterruptedException
	{
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
	}
	
	public void selectForm1() throws InterruptedException 
	{
		Thread.sleep(2000);
		reviewAndSubmitForm.click();
		Thread.sleep(2000);
	}
	
	public void selectForm2() throws InterruptedException 
	{
		Thread.sleep(2000);
		saveForm.click();
		Thread.sleep(2000);
	}
	
	public void fillFormSave(String nm) throws InterruptedException
	{
		Thread.sleep(2000);
		nameField.sendKeys(nm);
		Thread.sleep(2000);
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
	}
	
	public void fillFormReviewAndSubmit(String nm) throws InterruptedException
	{
		Thread.sleep(2000);
		nameField.sendKeys(nm);
		Thread.sleep(2000);
		Thread.sleep(2000);
		ReviewAndSubmit.click();
		Thread.sleep(2000);
	}
	
	
	
	

}
