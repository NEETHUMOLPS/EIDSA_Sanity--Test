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

public class DocumentSummary extends AbstractComponent{
	static WebDriver driver;
	public DocumentSummary(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Document Summary')]")
	@CacheLookup
	WebElement DocumentSummary;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/div/input")
	@CacheLookup
	WebElement DocumentStorageArea;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/div/input")
	@CacheLookup
	WebElement DocumentName;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[3]/div/div/input[1]")
	@CacheLookup
	WebElement Date1;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[3]/div/div/input[2]")
	@CacheLookup
	WebElement Date2;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[4]/span")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]")
	@CacheLookup
	WebElement clickApproverdropdown;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[2]/ul[1]/li[3]")
	@CacheLookup
	WebElement SelectApprover;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div/div[2]/button")
	@CacheLookup
	WebElement Add;
	
	@FindBy(xpath = "//*[@id=\"task2\"]/div/div/img")
	@CacheLookup
	WebElement ApproverDelete;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[1]/div/i")
	@CacheLookup
	WebElement ApproverClose;
	
	@FindBy(xpath = "//tbody/tr[1]/td[4]/i[1]")
	@CacheLookup
	WebElement HistoryView;
	
	@FindBy(xpath = "//tbody/tr[1]/td[5]/i[1]")
	@CacheLookup
	WebElement HistoryDownload;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[1]/div/i")
	@CacheLookup
	WebElement HistoryClose;

	@FindBy(xpath = "//td[1]")
	@CacheLookup
	List<WebElement> tableDocumentType;
	
	@FindBy(xpath = "//td[3]")
	@CacheLookup
	List<WebElement> tableDocumentName;
	
	@FindBy(xpath = "//td[4]")
	@CacheLookup
	List<WebElement> tableUploadedDate;
	
	@FindBy(xpath = "//td[6]")
	@CacheLookup
	List<WebElement> tableApprovals;
	
	@FindBy(xpath = "//td[7]")
	@CacheLookup
	List<WebElement> tableHistory;
	
	@FindBy(xpath = "//td[8]")
	@CacheLookup
	List<WebElement> tableView;
	
	@FindBy(xpath = "//td[9]")
	@CacheLookup
	List<WebElement> tableDownload;
	
	public void clickDocumentSummary() throws InterruptedException
	{
		
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		elementWait(DocumentSummary);
		DocumentSummary.click();
		Thread.sleep(3000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(5000);
	}
	
	public void searchDocumentStorageArea(String dsa) throws InterruptedException
	{
		DocumentStorageArea.sendKeys(dsa);
		Thread.sleep(3000);
	}
	
	public void searchDocumentName(String name) throws InterruptedException
	{
		DocumentName.sendKeys(name);
		Thread.sleep(3000);
	}
	
	public void SearchDate(String date1,String date2) throws InterruptedException
	{
		Date1.sendKeys(date1);
		Thread.sleep(3000);
		Date2.sendKeys(date2);
		Thread.sleep(3000);
	}
	
	public void search() throws InterruptedException
	{
		Search.click();
		Thread.sleep(5000);
	}
	
	public void ClickApprovals(String vname) throws InterruptedException
	{
		for(int i=0;i<tableDocumentName.size();i++)
		{
			String text=tableDocumentName.get(i).getText();
			if(text.equals(vname))
			{
				tableApprovals.get(i).click();
				Thread.sleep(5000);
				break;	
			}
		}
	}
	
	public void ClickHistory(String vname) throws InterruptedException
	{
		for(int i=0;i<tableDocumentName.size();i++)
		{
			String text=tableDocumentName.get(i).getText();
			if(text.equals(vname))
			{
				tableHistory.get(i).click();
				Thread.sleep(5000);
				break;	
			}
		}
	}
	
	public void ClickView(String vname) throws InterruptedException
	{
		for(int i=0;i<tableDocumentName.size();i++)
		{
			String text=tableDocumentName.get(i).getText();
			if(text.equals(vname))
			{
				tableView.get(i).click();
				Thread.sleep(5000);
				break;	
			}
		}
	}
	
	public void ClickDownload(String vname) throws InterruptedException
	{
		for(int i=0;i<tableDocumentName.size();i++)
		{
			String text=tableDocumentName.get(i).getText();
			if(text.equals(vname))
			{
				tableDownload.get(i).click();
				Thread.sleep(5000);
				break;	
			}
		}
	}
	
	public Boolean dateSearchValidation(String date) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableUploadedDate.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableUploadedDate.size();i++)
			{
				String scode=tableUploadedDate.get(i).getText();
				if (!(scode.contains(date))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean documentTypeSearchValidation(String type) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableDocumentType.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableDocumentType.size();i++)
			{
				String scode=tableDocumentType.get(i).getText();
				if (!(scode.contains(type))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean documentNameSearchValidation(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableDocumentName.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableDocumentName.size();i++)
			{
				String scode=tableDocumentName.get(i).getText();
				if (!(scode.contains(name))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Approver added successfully"));
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
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to remove this approver?"));
			alert1.accept();
			Thread.sleep(5000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Approver removed successfully"));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void setApprover() throws InterruptedException
	{
		clickApproverdropdown.click();
		Thread.sleep(2000);
		SelectApprover.click();
		Thread.sleep(2000);
		Add.click();
		Thread.sleep(2000);
	}
	
	public void deleteApprover() throws InterruptedException
	{
		ApproverDelete.click();
		Thread.sleep(2000);
	}
	
	public void closeApprover() throws InterruptedException
	{
		ApproverClose.click();
		Thread.sleep(2000);
	}
	
	public void viewHistory() throws InterruptedException
	{
		HistoryView.click();
		Thread.sleep(3000);
	}
	
	public void downloadHistory() throws InterruptedException
	{
		HistoryDownload.click();
		Thread.sleep(3000);
		HistoryClose.click();
		Thread.sleep(3000);		
	}
	
	
}
