package com.EIDSA.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
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

public class SubjectSchedule extends AbstractComponent{
	static WebDriver driver;
	public SubjectSchedule(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Subject Schedule')]")
	@CacheLookup
	WebElement SubjectSchedule;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div[1]/div/select")
	@CacheLookup
	WebElement SiteCode;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div[2]/div/select")
	@CacheLookup
	WebElement SubjectId;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[2]/div/div/div[1]/div/input")
	@CacheLookup
	WebElement VisitName;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[2]/div/div/div[2]/div/select")
	@CacheLookup
	WebElement Status;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[2]/div/div/div[3]/div/div/input[1]")
	@CacheLookup
	WebElement Date1;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[2]/div/div/div[3]/div/div/input[2]")
	@CacheLookup
	WebElement Date2;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[2]/div/div/div[4]/span")
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
	List<WebElement> tableVisitNo;
	
	@FindBy(xpath = "//td[4]")
	@CacheLookup
	List<WebElement> tableVisitName;
	
	@FindBy(xpath = "//td[9]")
	@CacheLookup
	List<WebElement> tableStatus;
	
	@FindBy(xpath = "//td[12]")
	@CacheLookup
	List<WebElement> tableView;
	
	@FindBy(xpath = "//td[7]")
	@CacheLookup
	List<WebElement> tableVisitDate;
	
	public void clickSubjectSchedule() throws InterruptedException
	{
		SubjectSchedule.click();
		Thread.sleep(3000);
	}
	
	public void searchSiteCode(String sitecode)
	{
		Select sel=new Select(SiteCode);
		sel.selectByVisibleText(sitecode);
	}
	
	public void SearchVisitDate(String date1,String date2) throws InterruptedException
	{
		Date1.sendKeys(date1);
		Thread.sleep(3000);
		Date2.sendKeys(date2);
		Thread.sleep(3000);
	}
	
	public void searchSubId(String subId)
	{
		Select sel=new Select(SubjectId);
		sel.selectByVisibleText(subId);
	}
	
	public void searchVisitName(String vname) throws InterruptedException
	{
		VisitName.sendKeys(vname);
		Thread.sleep(3000);
	}
	
	public void searchStatus(String stat)
	{
		Select sel=new Select(Status);
		sel.selectByVisibleText(stat);
	}
	
	public void searchDate1(String d1) throws InterruptedException
	{
		Date1.sendKeys(d1);
		Thread.sleep(3000);
	}
	
	public void searchDate2(String d2) throws InterruptedException
	{
		Date2.sendKeys(d2);
		Thread.sleep(3000);
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
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Please select a site code"));
			alert1.accept();
			
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Please select a subject ID"));
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
			Assert.assertTrue(alert1.getText().contains("Please select a subject ID"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert3() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("No records found"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert4() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Schedule created successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
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
	
	
	

}
