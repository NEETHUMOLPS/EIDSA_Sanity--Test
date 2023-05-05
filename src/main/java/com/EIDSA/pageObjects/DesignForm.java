package com.EIDSA.pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.AbstractComponents.AbstractComponent;

public class DesignForm  extends AbstractComponent{
	static WebDriver driver;
	public DesignForm(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'Design Form')]")
	@CacheLookup
	WebElement DesignForm;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
	@CacheLookup
	WebElement CreateForm;
	
	@FindBy(xpath = "//input[@id='form-name']")
	@CacheLookup
	WebElement FormName;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	@CacheLookup
	WebElement Submit1;
	
	@FindBy(xpath = "//body/div[@id='app']/div[2]/div[1]/div[1]/div[1]/a[1]/i[1]")
	@CacheLookup
	WebElement Close;
	
	@FindBy(xpath = "//*[@id=\"accordion\"]/div/div[1]/div/i")
	@CacheLookup
	WebElement Delete1;
	
	@FindBy(xpath = "//span[contains(text(),'Delete')]")
	@CacheLookup
	WebElement Delete2;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/img[1]")
	@CacheLookup
	WebElement SaveTemplate;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/img[1]")
	@CacheLookup
	WebElement DeletePage;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/img[1]")
	@CacheLookup
	WebElement DeleteColumn;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/img[1]")
	@CacheLookup
	WebElement DesignComplete;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/a[1]/div[1]/img[1]")
	@CacheLookup
	WebElement NewPage;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/a[1]/div[1]/img[1]")
	@CacheLookup
	WebElement ColumnOne;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[2]/div[2]/div/div[4]/a/div/img")
	@CacheLookup
	WebElement ColumnTwo;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[2]/div[2]/div/div[5]/a/div/img")
	@CacheLookup
	WebElement ColumnThree;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[2]/div[2]/div/div[9]/a/div/img")
	@CacheLookup
	WebElement Heading;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[2]/div[2]/div/div[10]/a/div/img")
	@CacheLookup
	WebElement SubHeading;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[2]/div[2]/div/div[12]/a/div/img")
	@CacheLookup
	WebElement TextBox;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[2]/div[2]/div/div[14]/a/div/img")
	@CacheLookup
	WebElement DropDown;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[2]/div/div[2]/div/input")
	@CacheLookup
	WebElement PageName;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	@CacheLookup
	WebElement Submit2;
	
	public void clickDesignForm() throws InterruptedException
	{
		
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(3000);
		elementWait(DesignForm);
		DesignForm.click();
		Thread.sleep(3000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(5000);
	}
	
	public void CreateForm(String name) throws InterruptedException
	{		
		Thread.sleep(3000);
		CreateForm.click();
		Thread.sleep(3000);
		FormName.sendKeys(name);
		Thread.sleep(3000);
		Submit1.click();
		Thread.sleep(3000);
	}
	
	public void completeDesign() throws InterruptedException
	{
		Thread.sleep(3000);
		DesignComplete.click();
		Thread.sleep(3000);
	}
	

	public void FormDelete() throws InterruptedException
	{
		Thread.sleep(3000);
		Delete1.click();
		Thread.sleep(3000);
		Delete2.click();
		Thread.sleep(3000);
		
	}
	
	public void CreatePage() throws InterruptedException
	{
		Thread.sleep(3000);
		NewPage.click();
		Thread.sleep(3000);
		PageName.sendKeys("Pg01");
		Thread.sleep(3000);
		Submit2.click();
		Thread.sleep(3000);
		
	}
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Form created successfully."));
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
			Assert.assertTrue(alert1.getText().contains("Please enter a form name"));
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
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this form?"));
			alert1.accept();
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("Form deleted successfully"));
			alert.accept();
			Thread.sleep(3000);
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
			Assert.assertTrue(alert1.getText().contains("Form cannot be saved with empty pages"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert5() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this page?"));
			alert1.accept();
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("Form deleted successfully"));
			alert.accept();
			Thread.sleep(3000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert6() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Please select a column"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert7() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Forms with empty pages cannot be saved"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert8() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Please create a page"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert9() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Page name already exist"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert10() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this column?"));
			alert1.accept();
			Thread.sleep(3000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert11() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to change the status to design complete?"));
			alert1.accept();
			Thread.sleep(3000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	


}
