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

public class FieldPrivilege extends AbstractComponent{
	static WebDriver driver;
	public FieldPrivilege(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'Field Privileges')]")
	@CacheLookup
	WebElement FieldPrivilege;
	
	@FindBy(xpath = "//select[@id='study']")
	@CacheLookup
	WebElement Study;
	
	@FindBy(xpath = "//td[1]")
	@CacheLookup
	List<WebElement> tableTemplateName;
	
	@FindBy(xpath = "//td[7]")
	@CacheLookup
	List<WebElement> tableSetPrivilege;
	
	@FindBy(xpath = "//select[@id='rolelist']")
	@CacheLookup
	WebElement roles;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[2]/div/div[1]/div/div/input")
	@CacheLookup
	WebElement siteIdCode;
	
	@FindBy(xpath = "//input[@id='exampleRadios1']")
	@CacheLookup
	WebElement masking;
	
	@FindBy(xpath = "//input[@id='exampleRadios2']")
	@CacheLookup
	WebElement view;
	
	@FindBy(xpath = "//input[@id='Edit']")
	@CacheLookup
	WebElement edit;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement save;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[2]/div/div[2]/div/div/input")
	@CacheLookup
	WebElement patientScreeningNum;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[4]/div/div[1]/div/div/div/div[1]/input")
	@CacheLookup
	WebElement present1;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[4]/div/div[1]/div/div/div/div[2]/input")
	@CacheLookup
	WebElement negative1;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[4]/div/div[2]/div/div/div/div[1]/input")
	@CacheLookup
	WebElement present2;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[4]/div/div[2]/div/div/div/div[2]/input")
	@CacheLookup
	WebElement negative2;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[6]/div/div/div/div/div/div[1]/input")
	@CacheLookup
	WebElement yes1;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[6]/div/div/div/div/div/div[2]/input")
	@CacheLookup
	WebElement no1;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[7]/div/div/div/div/div/div[1]/input")
	@CacheLookup
	WebElement yes2;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[7]/div/div/div/div/div/div[2]/input")
	@CacheLookup
	WebElement no2;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[8]/div/div/div/div/div/div[1]/input")
	@CacheLookup
	WebElement yes3;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[8]/div/div/div/div/div/div[2]/input")
	@CacheLookup
	WebElement no3;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[9]/div/div/div/div/div/div[1]/input")
	@CacheLookup
	WebElement yes4;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[9]/div/div/div/div/div/div[2]/input")
	@CacheLookup
	WebElement no4;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[10]/div/div/div/div/div/div[1]/input")
	@CacheLookup
	WebElement yes5;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[10]/div/div/div/div/div/div[2]/input")
	@CacheLookup
	WebElement no5;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[11]/div/div[1]/div/div/input")
	@CacheLookup
	WebElement date;
	
	@FindBy(xpath = "//*[@id=\"formElements\"]/form/div/div/div/div/div[11]/div/div[2]/div/div/input")
	@CacheLookup
	WebElement Initials;
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Please select a privilege"));
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
			Assert.assertTrue(alert1.getText().contains("Please select a role"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert3() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Please select a privilege"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert4() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Privilege added successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void clickFieldPrivilege() throws InterruptedException
	{	
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		elementWait(FieldPrivilege);
		FieldPrivilege.click();
		Thread.sleep(3000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(3000);
		
	}
	
	public void selectStudy(String study) throws InterruptedException
	{
		Thread.sleep(3000);
		Select sel=new Select(Study);
		sel.selectByVisibleText(study);
		Thread.sleep(3000);
	}
	
	public boolean clickSetPrivilege(String subjectid) throws InterruptedException 
	{
		Thread.sleep(2000);
		boolean sub=false;
		int count = tableTemplateName.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableTemplateName.get(i).getText();
			if(text.contains(subjectid))
			{
				tableSetPrivilege.get(i).click();
				Thread.sleep(8000);
				break;	
			}
		}
		return sub;
	}
	
	public void setPrivilege(String role) throws InterruptedException
	{
		Thread.sleep(3000);
		Select sel=new Select(roles);
		sel.selectByVisibleText(role);
		Thread.sleep(6000);
		siteIdCode.click();
		Thread.sleep(3000);
		masking.click();
		Thread.sleep(3000);
		save.click();
		Thread.sleep(3000);
	}
	
	public void negative1() throws InterruptedException
	{
		Thread.sleep(6000);
		siteIdCode.click();
		Thread.sleep(3000);
		masking.click();
		Thread.sleep(3000);
		save.click();
		Thread.sleep(3000);
	}
	
	
}
