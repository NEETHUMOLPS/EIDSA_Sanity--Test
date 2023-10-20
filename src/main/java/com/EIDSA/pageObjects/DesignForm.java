package com.EIDSA.pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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
	
	@FindBy(xpath = "//i[@class='fa fa-times']")
	@CacheLookup
	WebElement CreateFormClose;
	
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
	
	//Heading
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[2]/div[2]/div/div[9]/a/div/img")
	@CacheLookup
	WebElement Heading;
	
	@FindBy(xpath = "//input[@id='headdingtext']")
	@CacheLookup
	WebElement AddHeading;
	
	@FindBy(xpath = "//input[@id='instructionstext']")
	@CacheLookup
	WebElement FieldName;
	
	@FindBy(xpath = "//*[@id=\"modalcontents\"]/div/div/div/div[2]/div[3]/div/div[1]/img")
	@CacheLookup
	WebElement Add;
	
	@FindBy(xpath = "//*[@id=\"modalcontents\"]/div/div/div/div[2]/div[3]/div/div[2]/img")
	@CacheLookup
	WebElement Delete;
	
	@FindBy(xpath = "//*[@id=\"modalcontents\"]/div/div/div/div[2]/div[3]/div/div[1]/img")
	@CacheLookup
	WebElement Save;
	
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
	WebElement PageName1;
	
	@FindBy(xpath = "//body/div[@id='app']/div[2]/div[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement PageName2;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	@CacheLookup
	WebElement Submit2;
	
	@FindBy(xpath = "//i[@class='fa fa-times']")
	@CacheLookup
	WebElement AddPageClose;
	
	@FindBy(xpath = "//i[@class='fa fa-times']")
	@CacheLookup
	WebElement HeadingClose;
	
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
	
	public void CreateForm_Negative() throws InterruptedException
	{
		Thread.sleep(3000);
		CreateForm.click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		Submit1.click();
		Thread.sleep(3000);
		
	}
	
	public void CreateFormClose() throws InterruptedException
	{
		Thread.sleep(2000);
		CreateFormClose.click();
		Thread.sleep(2000);
	}
	
	public void AddPageClose() throws InterruptedException
	{
		Thread.sleep(2000);
		AddPageClose.click();
		Thread.sleep(2000);
	}
	
	public void HeadingClose() throws InterruptedException
	{
		Thread.sleep(2000);
		HeadingClose.click();
		Thread.sleep(2000);
	}
	
	public void completeDesign() throws InterruptedException
	{
		Thread.sleep(3000);
		DesignComplete.click();
		Thread.sleep(3000);
	}
	
	public void SaveTemplate() throws InterruptedException
	{
		Thread.sleep(3000);
		SaveTemplate.click();
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
		PageName1.sendKeys("pg 01");
		Thread.sleep(3000);
		Submit2.click();
		Thread.sleep(3000);
	}
	
	public void NewPage() throws InterruptedException
	{
		Thread.sleep(3000);
		NewPage.click();
		Thread.sleep(3000);
	}
	
	public void PageName(String pg) throws InterruptedException
	{
		Thread.sleep(3000);
		PageName2.sendKeys(pg);
		Thread.sleep(3000);
	}
	public void Submit2() throws InterruptedException
	{
		Submit2.click();
		
	}
	

	
	public void Heading(String h1, String h2) throws InterruptedException
	{
		Thread.sleep(3000);
		AddHeading.sendKeys(h1);
		Thread.sleep(3000);
		FieldName.sendKeys(h2);
		Thread.sleep(3000);
		
	}
	
	public void HeadingEdit(String h3) throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div/div[2]/div/div[1]/div[2]/div/div[1]/form/div/div/div/div/div/div/div/div")).click();
		Thread.sleep(2000);
		AddHeading.click();
		Thread.sleep(2000);
		AddHeading.clear();
		Thread.sleep(2000);
		AddHeading.sendKeys(h3);
		Thread.sleep(3000);
		Save.click();
		Thread.sleep(2000);
		
	}
	public void HeadingAdd() throws InterruptedException
	{
		Thread.sleep(2000);
		Add.click();
		Thread.sleep(2000);	
	}
	
	public void HeadingDelete() throws InterruptedException
	{
		Thread.sleep(2000);
		Delete.click();
		Thread.sleep(2000);	
	}
	
	public void DeleteColumn() throws InterruptedException
	{
		Thread.sleep(2000);
		DeleteColumn.click();
		Thread.sleep(2000);	
	}
	
	public void DeletePage() throws InterruptedException
	{
		Thread.sleep(2000);
		DeletePage.click();
		Thread.sleep(2000);	
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
	
	public static boolean Alert12() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Fieldname cannot be empty"));
			alert1.accept();
			Thread.sleep(3000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert13() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("This field name is already in use"));
			alert1.accept();
			Thread.sleep(3000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}


}
