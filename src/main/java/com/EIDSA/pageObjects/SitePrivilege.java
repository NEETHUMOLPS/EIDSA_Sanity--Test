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

public class SitePrivilege extends AbstractComponent{
	static WebDriver driver;
	public SitePrivilege(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'Site privilege')]")
	WebElement sitePrivilege;
	@FindBy(xpath = "//select[@placeholder='select a user']")
	WebElement user;
	@FindBy(xpath = "//a[normalize-space()='Study - 001']")
	WebElement study;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/input[1]")
	WebElement site;
	@FindBy(xpath = "//thead/tr[1]/th[1]/button[1]/i[1]")
	WebElement save;
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("User site privilege updated successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void clickSitePrivilege() throws InterruptedException
	{
		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		elementWait(sitePrivilege);
		sitePrivilege.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-1000)");
	}
	
	public void sitePrivilegeSetting(String username) throws InterruptedException
	{
		
		Thread.sleep(2000);
		user.sendKeys(username);
		Thread.sleep(2000);
		study.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
	}
	
	public void sitePrivilegeSetting1(String username) throws InterruptedException
	{
		
		Thread.sleep(2000);
		user.sendKeys(username);
		Thread.sleep(2000);
		study.click();
		Thread.sleep(2000);
		site.click();
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
	}
	

}
