package com.EIDSA.pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AbstractComponents.AbstractComponent;

public class UnscheduledVisit extends AbstractComponent{
	
	static WebDriver driver;
	public UnscheduledVisit(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Unscheduled Visits')]")
	@CacheLookup
	WebElement UnscheduledVisit;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div[1]/div/input")
	@CacheLookup
	WebElement SubjectId;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div[2]/div/select")
	@CacheLookup
	WebElement Status;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div[3]/div/div/input[1]")
	@CacheLookup
	WebElement Date1;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div[3]/div/div/input[2]")
	@CacheLookup
	WebElement Date2;
	
	@FindBy(xpath="//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath="//td[1]")
	@CacheLookup
	List<WebElement> tableSiteCode;
	
	@FindBy(xpath="//td[2]")
	@CacheLookup
	List<WebElement> tableSubjectId;
	
	@FindBy(xpath="//td[3]")
	@CacheLookup
	List<WebElement> tableVisitNo;
	
	@FindBy(xpath="//td[4]")
	@CacheLookup
	List<WebElement> tableVisitName;
	
	@FindBy(xpath="//td[9]")
	@CacheLookup
	List<WebElement> tableVisitStatus;
	
	@FindBy(xpath="//td[12]")
	@CacheLookup
	List<WebElement> tableView;
	
	@FindBy(xpath="//td[7]")
	@CacheLookup
	List<WebElement> tableVisitDate;
	
	public void clickUnscheduledVisit() throws InterruptedException
	{
		
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		elementWait(UnscheduledVisit);
		UnscheduledVisit.click();
		Thread.sleep(3000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(5000);
	}
	
	public void searchSubjectId(String id) throws InterruptedException
	{
		SubjectId.sendKeys(id);
		Thread.sleep(3000);
	}
	
	public void searchStatus(String stat) throws InterruptedException
	{
		Status.sendKeys(stat);
		Thread.sleep(3000);
	}
	
	public void search() throws InterruptedException
	{
		Search.click();
		Thread.sleep(5000);
	}
	
	public void view(String vname) throws InterruptedException
	{
		for(int i=0;i<tableVisitName.size();i++)
		{
			String text=tableVisitName.get(i).getText();
			if(text.equals(vname))
			{
				tableView.get(i).click();
				Thread.sleep(8000);
				break;	
			}
		}
	}
	
	public void SearchVisitDate(String date1,String date2) throws InterruptedException
	{
		Date1.sendKeys(date1);
		Thread.sleep(3000);
		Date2.sendKeys(date2);
		Thread.sleep(3000);
	}
	
	public Boolean dateSearchValidation(String date) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableVisitDate.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableVisitDate.size();i++)
			{
				String scode=tableVisitDate.get(i).getText();
				if (!(scode.contains(date))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean subjectIdSearchValidation(String subid) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableSubjectId.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableSubjectId.size();i++)
			{
				String stat=tableSubjectId.get(i).getText();
				if (!(stat.contains(subid))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean statusSearchValidation(String subid) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableVisitStatus.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableVisitStatus.size();i++)
			{
				String stat=tableVisitStatus.get(i).getText();
				if (!(stat.contains(subid))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	

}
