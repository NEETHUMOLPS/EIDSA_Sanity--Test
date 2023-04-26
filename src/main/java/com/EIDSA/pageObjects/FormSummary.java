package com.EIDSA.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.AbstractComponents.AbstractComponent;

public class FormSummary  extends AbstractComponent{
	static WebDriver driver;
	public FormSummary(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Form Summary')]")
	@CacheLookup
	WebElement FormSummary;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement SiteCode;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/select[1]")
	@CacheLookup
	WebElement SubjectId;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement VisitName;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[4]/select[1]")
	@CacheLookup
	WebElement Status;
	
	@FindBy(xpath = "//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath = "//td[1]")
	@CacheLookup
	List<WebElement> tableSiteCode;
	
	@FindBy(xpath = "//td[2]")
	@CacheLookup
	List<WebElement> tableSubId;
	
	@FindBy(xpath = "//td[3]")
	@CacheLookup
	List<WebElement> tableVisitName;
	
	@FindBy(xpath = "//td[4]")
	@CacheLookup
	List<WebElement> tableStatus;
	
	@FindBy(xpath = "//td[7]")
	@CacheLookup
	List<WebElement> tableView;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[9]/button[1]/img[1]")
	@CacheLookup
	WebElement ViewDocuments;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[8]/button[1]/img[1]")
	@CacheLookup
	WebElement UploadDocument;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[7]/button[1]/i[1]")
	@CacheLookup
	WebElement button3;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[6]/button[1]/img[1]")
	@CacheLookup
	WebElement ClosedQuery;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[5]/button[1]/img[1]")
	@CacheLookup
	WebElement OpenQuery;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[4]/button[1]/i[1]")
	@CacheLookup
	WebElement DownloadPdf;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[3]/span[1]/i[1]")
	@CacheLookup
	WebElement FormQery;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[2]/span[1]/i[1]")
	@CacheLookup
	WebElement FormSave;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/span[1]/i[1]")
	@CacheLookup
	WebElement Verify;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[2]/div[1]/span[10]/button[1]/i[1]")
	@CacheLookup
	WebElement Archive;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[3]/div[1]/div[2]/span[3]/i[1]")
	@CacheLookup
	WebElement Sign;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[5]/div[3]/div[1]/div[2]/span[2]/span[1]/i[1]")
	@CacheLookup
	WebElement PageQuery;
	
	public void clickFormSummary() throws InterruptedException
	{
		FormSummary.click();
		Thread.sleep(3000);
	}
	
	public void searchSiteCode(String sitecode)
	{
		Select sel=new Select(SiteCode);
		sel.selectByVisibleText(sitecode);
	}
	
	public void searchSubId(String subId)
	{
		Select sel=new Select(SubjectId);
		sel.selectByVisibleText(subId);
	}
	
	public void searchVisitName(String visitname) throws InterruptedException
	{
		Thread.sleep(2000);
		VisitName.sendKeys(visitname);
	}
	
	public void searchStat(String stat)
	{
		Select sel=new Select(Status);
		sel.selectByVisibleText(stat);
	}
	
	public void ClickSearch()
	{
		Search.click();
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
		int count =tableSubId.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableSubId.size();i++)
			{
				String stat=tableSubId.get(i).getText();
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
