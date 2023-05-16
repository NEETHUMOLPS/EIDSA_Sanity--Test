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

public class DigitalForms extends AbstractComponent{
	
	static WebDriver driver;
	public DigitalForms(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Digital Forms')]")
	@CacheLookup
	WebElement DigitalForms;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[2]/div[2]/div[1]/div/div/div[1]/input")
	@CacheLookup
	WebElement FormName;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[2]/div[2]/div[1]/div/div/div[2]/select")
	@CacheLookup
	WebElement Status;
	
	@FindBy(xpath="//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath="//td[1]")
	@CacheLookup
	List<WebElement> tableFormName;
	
	@FindBy(xpath="//td[5]")
	@CacheLookup
	List<WebElement> tableStatus;
	
	@FindBy(xpath="//td[7]")
	@CacheLookup
	List<WebElement> tableView;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div[2]/div/textarea")
	@CacheLookup
	WebElement formComments;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div[1]/div/a[1]/img")
	@CacheLookup
	WebElement formApprove;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div[1]/div/a[2]/img")
	@CacheLookup
	WebElement formReject;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div[1]/div/a[3]/img")
	@CacheLookup
	WebElement Comments;
	
	public void clickDigitalForms() throws InterruptedException
	{
		
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(3000);
		elementWait(DigitalForms);
		DigitalForms.click();
		Thread.sleep(3000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(5000);
	}
	
	public void searchFormName(String fName) throws InterruptedException
	{
		Thread.sleep(3000);
		FormName.sendKeys(fName);
		Thread.sleep(3000);
	}
	
	public void clickSearch() throws InterruptedException
	{
		Thread.sleep(3000);
		Search.click();
		Thread.sleep(3000);
	}
	
	
	public void searchStatus(String status) throws InterruptedException
	{
		Thread.sleep(3000);
		Select sel=new Select(Status);
		sel.selectByVisibleText(status);
		Thread.sleep(3000);
	}
	
	
	public void view(String name) throws InterruptedException
	{
		for(int i=0;i<tableFormName.size();i++)
		{
			String text=tableFormName.get(i).getText();
			if(text.equals(name))
			{
				tableView.get(i).click();
				Thread.sleep(8000);
				break;	
			}
		}
	}
	
	public void clickApprove() throws InterruptedException
	{
		Thread.sleep(3000);
		formApprove.click();
		Thread.sleep(3000);
	}
	
	public void clickReject() throws InterruptedException
	{
		Thread.sleep(3000);
		formReject.click();
		Thread.sleep(3000);
	}
	
	public void clickComments2() throws InterruptedException
	{
		Thread.sleep(3000);
		formComments.click();
		Thread.sleep(3000);
	}
	
	public void clickComments1(String cmnt) throws InterruptedException
	{
		Thread.sleep(3000);
		formComments.sendKeys(cmnt);
		Thread.sleep(3000);
	}
	
	public boolean verifyformname(String fname) throws InterruptedException 
	{
		Thread.sleep(3000);
		boolean vis=false;
		int count = tableFormName.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableFormName.get(i).getText();
			if(text.contains(fname))
			{
				vis=true;
				break;
			}
		}
		return vis;
	}
	
	public boolean verifyStatus(String stat) throws InterruptedException 
	{
		Thread.sleep(3000);
		boolean vis=false;
		int count = tableStatus.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableStatus.get(i).getText();
			if(text.contains(stat))
			{
				vis=true;
				break;
			}
		}
		return vis;
	}
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to approve this form?"));
			alert1.accept();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("has been approved"));
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
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to reject this form?"));
			alert1.accept();
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("has been rejected"));
			Thread.sleep(3000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}

}
