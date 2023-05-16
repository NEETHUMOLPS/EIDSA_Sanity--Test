package com.EIDSA.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.AbstractComponents.AbstractComponent;

public class SentQuery extends AbstractComponent{
	static WebDriver driver;
	public SentQuery(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//*[@id=\"studysetup\"]/li[10]/a/span[2]")
	@CacheLookup
	WebElement AllQueries1;
	
	@FindBy(xpath = "//*[@id=\"querysetup\"]/li[1]/a")
	@CacheLookup
	WebElement Sent;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement QueryId;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div[1]/div/div[2]/select")
	@CacheLookup
	WebElement SiteCode;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div[1]/div/div[3]/select")
	@CacheLookup
	WebElement SubjectId;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div[1]/div/div[4]/select")
	@CacheLookup
	WebElement QueryStatus;
	
	@FindBy(xpath = "//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath = "//td[1]")
	@CacheLookup
	List<WebElement> tableQueryId;
	
	@FindBy(xpath = "//td[2]")
	@CacheLookup
	List<WebElement> tableSiteCode;

	@FindBy(xpath = "//td[3]")
	@CacheLookup
	List<WebElement> tableSubjectId;
	
	@FindBy(xpath = "//td[5]")
	@CacheLookup
	List<WebElement> tableStatus;
	
	@FindBy(xpath = "//td[13]")
	@CacheLookup
	List<WebElement> tableView;
	
	public void clickAllQueries1() throws InterruptedException
	{
		Thread.sleep(4000);
		AllQueries1.click();
		Thread.sleep(5000);
		Sent.click();
		Thread.sleep(3000);
	}
	
	public void clickQueryId(String id) throws InterruptedException
	{
		Thread.sleep(3000);
		QueryId.sendKeys(id);
		Thread.sleep(3000);
	}
	
	public void clickSiteCode(String code) throws InterruptedException
	{
		Thread.sleep(3000);
		Select sel=new Select(SiteCode);
		sel.selectByVisibleText(code);
		Thread.sleep(3000);
	}
	
	public void clickSubjectId(String id) throws InterruptedException
	{
		Thread.sleep(3000);
		Select sel=new Select(SubjectId);
		sel.selectByVisibleText(id);
		Thread.sleep(3000);
	}
	
	public void clickQueryStatus(String st) throws InterruptedException
	{
		Thread.sleep(3000);
		Select sel=new Select(QueryStatus);
		sel.selectByVisibleText(st);
		Thread.sleep(3000);
	}
	
	public void clickSearch() throws InterruptedException
	{
		Thread.sleep(3000);
		Search.click();
		Thread.sleep(3000);
	}
	
	public boolean view(String name) throws InterruptedException 
	{
		Thread.sleep(2000);
		boolean sub=false;
		int count = tableQueryId.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableQueryId.get(i).getText();
			if(text.contains(name))
			{
				tableView.get(i).click();
				Thread.sleep(5000);
				break;	
			}
		}
		return sub;
	}
	
	public Boolean QueryIdSearchValidation(String id) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableQueryId.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableQueryId.size();i++)
			{
				String stat=tableQueryId.get(i).getText();
				if (!(stat.contains(id))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean SiteCodeSearchValidation(String id) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableSiteCode.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableSiteCode.size();i++)
			{
				String stat=tableSiteCode.get(i).getText();
				if (!(stat.contains(id))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean SubjectIdSearchValidation(String id) throws InterruptedException
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
				if (!(stat.contains(id))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean QueryStatusSearchValidation(String id) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableStatus.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableStatus.size();i++)
			{
				String stat=tableStatus.get(i).getText();
				if (!(stat.contains(id))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}

}
