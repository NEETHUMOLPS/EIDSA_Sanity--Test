package com.EIDSA.pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AbstractComponents.AbstractComponent;

public class DocumentApproval extends AbstractComponent{
	static WebDriver driver;
	public DocumentApproval(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'Document Approval')]")
	@CacheLookup
	WebElement DocumentApproval;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/input")
	@CacheLookup
	WebElement DocumentName;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/div/div/input[1]")
	@CacheLookup
	WebElement FromDate;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[2]")
	@CacheLookup
	WebElement ToDate;
	
	@FindBy(xpath = "//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath = "//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement Approver_close;
	
	@FindBy(xpath = "//td[1]")
	@CacheLookup
	List<WebElement> TableDocumentName;
	
	@FindBy(xpath = "//td[3]")
	@CacheLookup
	List<WebElement>  TableAssignedDate;
	
	@FindBy(xpath = "//td[5]")
	@CacheLookup
	List<WebElement>  TableApprovals;
	
	@FindBy(xpath = "//td[6]")
	@CacheLookup
	List<WebElement>  TableView;
	
	@FindBy(xpath = "//td[7]")
	@CacheLookup
	List<WebElement>  TableDownload;
	
	public void clickDocumentApproval() throws InterruptedException
	{
		
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		elementWait(DocumentApproval);
		DocumentApproval.click();
		Thread.sleep(3000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-500)");
		Thread.sleep(5000);
	}
	
	public void searchDocumentName(String dn) throws InterruptedException
	{
		Thread.sleep(3000);
		DocumentName.sendKeys(dn);
		Thread.sleep(3000);
	}
	
	public void SearchDate(String date1,String date2) throws InterruptedException
	{
		Thread.sleep(3000);
		FromDate.sendKeys(date1);
		Thread.sleep(3000);
		ToDate.sendKeys(date2);
		Thread.sleep(3000);
	}
	
	public void search() throws InterruptedException
	{
		Thread.sleep(3000);
		Search.click();
		Thread.sleep(5000);
	}
	
	public Boolean dateSearchValidation(String date) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =TableAssignedDate.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<TableAssignedDate.size();i++)
			{
				String scode=TableAssignedDate.get(i).getText();
				if (!(scode.contains(date))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public void ClickApprovals(String name) throws InterruptedException
	{
		for(int i=0;i<TableDocumentName.size();i++)
		{
			String text=TableDocumentName.get(i).getText();
			if(text.equals(name))
			{
				TableApprovals.get(i).click();
				Thread.sleep(5000);
				//Approver_close.click();
				//Thread.sleep(5000);
				break;	
			}
		}
	}
	
	public void ClickView(String name) throws InterruptedException
	{
		for(int i=0;i<TableDocumentName.size();i++)
		{
			String text=TableDocumentName.get(i).getText();
			if(text.equals(name))
			{
				TableView.get(i).click();
				Thread.sleep(5000);
				break;	
			}
		}
	}
	
	public void ClickDownload(String name) throws InterruptedException
	{
		for(int i=0;i<TableDocumentName.size();i++)
		{
			String text=TableDocumentName.get(i).getText();
			if(text.equals(name))
			{
				TableDownload.get(i).click();
				Thread.sleep(5000);
				break;	
			}
		}
	}
	
	public Boolean documentNameSearchValidation(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =TableDocumentName.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<TableDocumentName.size();i++)
			{
				String scode=TableDocumentName.get(i).getText();
				if (!(scode.contains(name))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
}
