package com.EIDSA.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.AbstractComponents.AbstractComponent;

public class ArchiveForms extends AbstractComponent{
	static WebDriver driver;
	public ArchiveForms(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//*[@id=\"studysetup\"]/li[9]/a/span")
	@CacheLookup
	WebElement ArchiveForms;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/select")
	@CacheLookup
	WebElement SiteCode;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/select")
	@CacheLookup
	WebElement SubjectId;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[3]/input")
	@CacheLookup
	WebElement VisitName;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[4]/select")
	@CacheLookup
	WebElement Status;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/span")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath = "//td[1]")
	@CacheLookup
	List<WebElement> tableSiteCode;
	
	@FindBy(xpath = "//td[2]")
	@CacheLookup
	List<WebElement> tableSubjectId;
	
	@FindBy(xpath = "//td[3]")
	@CacheLookup
	List<WebElement> tableVisitName;
	
	@FindBy(xpath = "//td[4]")
	@CacheLookup
	List<WebElement> tableStatus;
	
	@FindBy(xpath = "//td[10]")
	@CacheLookup
	List<WebElement> tableView;
	
	public void clickArchiveForms() throws InterruptedException
	{
		Thread.sleep(3000);
		ArchiveForms.click();
		Thread.sleep(3000);
	}
	
	public void searchSiteCode(String sitecode) throws InterruptedException
	{
		Thread.sleep(3000);
		Select sel=new Select(SiteCode);
		sel.selectByVisibleText(sitecode);
		Thread.sleep(3000);
	}
	
	public void searchSubId(String subId) throws InterruptedException
	{
		Thread.sleep(3000);
		Select sel=new Select(SubjectId);
		sel.selectByVisibleText(subId);
		Thread.sleep(3000);
	}
	
	public void searchVisitName(String visitname) throws InterruptedException
	{
		Thread.sleep(2000);
		VisitName.sendKeys(visitname);
		Thread.sleep(3000);
	}
	
	public void searchStat(String stat) throws InterruptedException
	{
		Thread.sleep(3000);
		Select sel=new Select(Status);
		sel.selectByVisibleText(stat);
		Thread.sleep(3000);
	}
	
	public void ClickSearch() throws InterruptedException
	{
		Thread.sleep(3000);
		Search.click();
		Thread.sleep(3000);
	}
	
	public Boolean siteCodeSearchValidation(String sitecode) throws InterruptedException
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
				if (!(stat.contains(sitecode))) 
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
	
	public Boolean visitNameSearchValidation(String visitName) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableVisitName.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableVisitName.size();i++)
			{
				String stat=tableVisitName.get(i).getText();
				if (!(stat.contains(visitName))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean statusSearchValidation(String status) throws InterruptedException
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
				if (!(stat.contains(status))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public void view(String vname) throws InterruptedException
	{
		Thread.sleep(1000);
		int count=tableVisitName.size();
		for(int i=0;i<count;i++)
		{
			String visitlist=tableVisitName.get(i).getText();
			if(visitlist.contains(vname))
			{
				tableView.get(i).click();
				break;
			}
		}
	}
	
	
	

}
