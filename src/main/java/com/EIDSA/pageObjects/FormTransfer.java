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

public class FormTransfer extends AbstractComponent{
	
	static WebDriver driver;
	public FormTransfer(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Form Transfer')]")
	@CacheLookup
	WebElement FormTransfer;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[1]/div/div[3]/span")
	@CacheLookup
	WebElement Transfer;
	
	public void clickTransfer() throws InterruptedException
	{
		Thread.sleep(3000);
		Transfer.click();
		Thread.sleep(3000);
	}
	
	public void clickFormTransfer() throws InterruptedException
	{
		
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		elementWait(FormTransfer);
		FormTransfer.click();
		Thread.sleep(3000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(5000);
	}
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to transfer this form to the selected subject?"));
			alert1.accept();
			Thread.sleep(3000);
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("Form has been transferred successfully."));
			alert1.accept();
			Thread.sleep(3000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert2() throws InterruptedException
	{
		{
			try
			{
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
				wait1.until(ExpectedConditions.alertIsPresent());
				Alert alert1 = driver.switchTo().alert();
				Assert.assertTrue(alert1.getText().contains("Source visit does not have a form!"));
				alert1.accept();
				Thread.sleep(3000);
				return true;
			} catch (NoAlertPresentException e) {
				return false;
			}	
		}
	}
	
	public static boolean Alert3() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Cannot transfer between same visits!"));
			alert1.accept();
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
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
				wait.until(ExpectedConditions.alertIsPresent());
				Alert alert = driver.switchTo().alert();
				Assert.assertTrue(alert.getText().contains("Target visit already have a form uploaded, do you want to replace the form?"));
				alert.accept();
				Thread.sleep(3000);
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
				wait1.until(ExpectedConditions.alertIsPresent());
				Alert alert1 = driver.switchTo().alert();
				Assert.assertTrue(alert1.getText().contains("Are you sure you want to transfer this form to the selected subject?"));
				alert1.accept();
				Thread.sleep(3000);
				WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(8));
				wait2.until(ExpectedConditions.alertIsPresent());
				Alert alert2 = driver.switchTo().alert();
				Assert.assertTrue(alert2.getText().contains("Form has been transferred successfully."));
				alert2.accept();
				Thread.sleep(3000);
				return true;
			} catch (NoAlertPresentException e) {
				return false;
			}	
	}

}



