package com.EIDSA.pageObjects;

import java.time.Duration;
import java.util.List;

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
import org.testng.asserts.SoftAssert;

import com.AbstractComponents.AbstractComponent;

public class Screen extends AbstractComponent{
	static WebDriver driver;
	public Screen(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Screen menu
	@FindBy(xpath="//span[normalize-space()='Screen']")
	WebElement screen;	
	
	//Add screen
	@FindBy(xpath="//img[@alt='Add screen']")
	WebElement addScreen;
	@FindBy(xpath="//input[@placeholder='Screen name']")
	WebElement screenName;
	@FindBy(xpath="//i[@class='fa fa-plus']")
	WebElement add;
	@FindBy(xpath="//i[@class='fa fa-times']")
	WebElement close;
	
	//Screen list
	@FindBy(xpath="//a[@class='list-group-item']")
	List<WebElement> screenList;

	//Add control
	@FindBy(xpath="//input[@placeholder='Control name']")
	WebElement controlName;
	@FindBy(xpath="//button[@class='btn-circle']//i[@class='fa fa-plus']")
	WebElement addControl;
	
	//Edit control
	@FindBy(xpath="//i[@class='fa fa-edit edit-delete']")
	WebElement editControl1;
	@FindBy(xpath="//tbody//tr//td//input[@type='text']")
	WebElement editControl2;
	@FindBy(xpath="//i[@class='fa fa-save edit-delete my-1']")
	WebElement save;
	
	//Delete control
	@FindBy(xpath="//i[@class='fa fa-trash edit-delete']")
	WebElement deleteControl;
	
	//Delete screen
	@FindBy(xpath="//i[@class='fa fa-trash edit-delete1 my-2']")
	WebElement deleteScreen;
	
	public void deleteControl() throws InterruptedException
	{
		
		Thread.sleep(2000);
		deleteControl.click();
		Thread.sleep(2000);
	}
	
	public void deleteScreen() throws InterruptedException
	{
		
		Thread.sleep(2000);
		deleteScreen.click();
		Thread.sleep(2000);
	}
	
	public static boolean screenDeletionAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this screen?"));
			alert1.accept();
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Screen deleted successfully"));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public void editControl(String edit) throws InterruptedException
	{
		
		Thread.sleep(2000);
		editControl1.click();
		Thread.sleep(2000);
		editControl2.sendKeys(edit);
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
	}
	
	public static boolean controlDeletionAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this control?"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public void clickScreens() throws InterruptedException
	{
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		elementWait(screen);
		screen.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
	}
	
	public void addScreens(String name) throws InterruptedException
	{
		
		Thread.sleep(2000);
		addScreen.click();
		Thread.sleep(2000);
		screenName.sendKeys(name);
		Thread.sleep(2000);
		add.click();
		Thread.sleep(2000);
	}
	
	public void negative1() throws InterruptedException
	{
		
		Thread.sleep(2000);
		addScreen.click();
		Thread.sleep(2000);
		add.click();
		Thread.sleep(2000);
		SoftAssert softAssert = new SoftAssert();
		String ActualErrorMEssage1 = driver.findElement(By.xpath("//span[@class='errormsg']")).getText();	
		softAssert.assertEquals(ActualErrorMEssage1, "Enter a valid screen name");
		softAssert.assertAll();
		close.click();
		Thread.sleep(2000);
	}
	
	public void negative2() throws InterruptedException
	{
		
		Thread.sleep(2000);
		addControl.click();
		Thread.sleep(2000);
		SoftAssert softAssert = new SoftAssert();
		String ActualErrorMEssage1 = driver.findElement(By.xpath("//span[@class='errormsg']")).getText();	
		softAssert.assertEquals(ActualErrorMEssage1, "Enter a valid control name");
		softAssert.assertAll();
		close.click();
		Thread.sleep(2000);
	}
	
	public void addControl(String name) throws InterruptedException
	{
		
		Thread.sleep(2000);
		controlName.sendKeys(name);
		Thread.sleep(2000);
		addControl.click();
		Thread.sleep(2000);
	}
	
	
	public void selScreen(String name) throws InterruptedException
	{
		for(int i=0;i<screenList.size();i++)
		{
			String text=screenList.get(i).getText();
			if(text.equals(name))
			{
				screenList.get(i).click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void EditScreen(String name) throws InterruptedException
	{		
		Thread.sleep(3000);
		screenName.clear();
		Thread.sleep(2000);
		screenName.sendKeys(name);
		Thread.sleep(2000);
		add.click();
		Thread.sleep(1000);
	}
	
	public static boolean screenUpdationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Screen name updated successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public static boolean duplicateAlert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Screen name already exist"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public static boolean duplicateAlert2() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Control name already exist"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	
}
