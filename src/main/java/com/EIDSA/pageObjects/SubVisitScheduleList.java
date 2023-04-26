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

public class SubVisitScheduleList extends AbstractComponent{
	static WebDriver driver;
	public SubVisitScheduleList(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//a[contains(text(),'Unscheduled Visit')]")
	@CacheLookup
	WebElement unscheduledVisit;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div[1]/input")
	@CacheLookup
	WebElement visitNumber;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div[2]/input")
	@CacheLookup
	WebElement visitName;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div[3]/select")
	@CacheLookup
	WebElement visitType;
		
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div[4]/input")
	@CacheLookup
	WebElement preVisit;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div[5]/input")
	@CacheLookup
	WebElement postVisit;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div[6]/select")
	@CacheLookup
	WebElement investigator;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div[7]/input")
	@CacheLookup
	WebElement visitDate;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div[8]/select")
	@CacheLookup
	WebElement visitTemplate;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div[9]/div/input")
	@CacheLookup
	WebElement patientVisit;
	
	@FindBy(xpath = "//span[contains(text(),'Save')]")
	@CacheLookup
	WebElement save;
	
	@FindBy(xpath = "//span[contains(text(),'Please enter visit no')]")
	@CacheLookup
	WebElement errorVisitNo;
	
	@FindBy(xpath = "//span[contains(text(),'Please enter visit/form name')]")
	@CacheLookup
	WebElement errorVisitName;
	
	@FindBy(xpath = "//span[contains(text(),'Please select a visit type')]")
	@CacheLookup
	WebElement errorVisitType;
	
	@FindBy(xpath = "//span[contains(text(),'Please enter a investigatorr')]")
	@CacheLookup
	WebElement errorInvestigator;
	
	@FindBy(xpath = "//span[contains(text(),'Please enter visit date')]")
	@CacheLookup
	WebElement errorVisitDate;
	
	@FindBy(xpath = "//span[contains(text(),'Please select a visit template')]")
	@CacheLookup
	WebElement errorVisitTemplate;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div[4]/span")
	@CacheLookup
	WebElement errorPreVisit;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div[5]/span")
	@CacheLookup
	WebElement errorPostVisit;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[1]/span/span/a")
	@CacheLookup
	WebElement unScheduledVisit;
	
	@FindBy(xpath = "//span[contains(text(),'Subjects')]")
	@CacheLookup
	WebElement subject;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/select")
	@CacheLookup
	WebElement searchSiteCode;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/input")
	@CacheLookup
	WebElement searchSubId;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[3]/select")
	@CacheLookup
	WebElement searchStatus;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/span")
	@CacheLookup
	WebElement search;
	
	@FindBy(xpath="//td[1]")
	@CacheLookup
	List<WebElement> tableSiteCode;
	
	@FindBy(xpath="//td[2]")
	@CacheLookup
	List<WebElement> tableSubId;
	
	@FindBy(xpath="//td[3]")
	@CacheLookup
	List<WebElement> tableStatus;
	
	@FindBy(xpath="//td[9]")
	@CacheLookup
	List<WebElement> tableSchedule;
	
	@FindBy(xpath="//td[3]")
	@CacheLookup
	List<WebElement> tableVisitNo;
	
	@FindBy(xpath="//td[12]")
	@CacheLookup
	List<WebElement> tableEdit;
	
	@FindBy(xpath="//td[13]")
	@CacheLookup
	List<WebElement> tableView;
	
	@FindBy(xpath="//td[4]")
	@CacheLookup
	List<WebElement> tableVisitName;
	
	@FindBy(xpath="//td[14]")
	@CacheLookup
	List<WebElement> tableWithdraw;
	
	@FindBy(xpath="//td[9]")
	@CacheLookup
	List<WebElement> tableVisitStatus;
	
	@FindBy(xpath="//td[7]")
	@CacheLookup
	List<WebElement> TableVisitDate;
	
	@FindBy(xpath="//td[10]")
	@CacheLookup
	List<WebElement> TableInvestigator;
	
	@FindBy(xpath="//td[11]")
	@CacheLookup
	List<WebElement> TableVisitCompletedDate;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div[1]/div/input")
	@CacheLookup
	WebElement searchVisitName;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div[2]/div/select")
	@CacheLookup
	List<WebElement> searchVisitSchedule;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div[3]/div/div/input[1]")
	@CacheLookup
	WebElement searchVisitDate1;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div[3]/div/div/input[2]")
	@CacheLookup
	WebElement searchVisitDate2;
	
	@FindBy(xpath="//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement visitSearch;
	
	
	public void clickSubject() throws InterruptedException
	{
		subject.click();
		Thread.sleep(3000);
	}
	
	public void clickUnscheduleVisit() throws InterruptedException
	{
		unscheduledVisit.click();
		Thread.sleep(3000);
	}
	
	public void searchSiteCode(String SiteCode) throws InterruptedException
	{
		searchSiteCode.sendKeys(SiteCode);
		search.click();	
		Thread.sleep(3000);
	}
	
	public void unScheduleVisit_negative() throws InterruptedException
	{
		preVisit.clear();
		preVisit.sendKeys("+!");
		postVisit.clear();
		postVisit.sendKeys("+!");
		save.click();
	}
	
	public boolean findSubId(String subid) throws InterruptedException
	{
		Thread.sleep(2000);
		boolean sub=false;
		int count = tableSubId.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableSubId.get(i).getText();
			if(text.contains(subid))
			{
				tableSchedule.get(i).click();
				Thread.sleep(3000);
				sub=true;
				break;
			}
		}
		return sub;	
	}
	
	public void createUnScheduleVisit(String visitno,String visitname,String previsit,String postvisit,String date) throws InterruptedException
	{
		unScheduledVisit.click();
		visitNumber.sendKeys(visitno);
		visitName.sendKeys(visitname);
		visitType.click();
		Select type=new Select(visitType);
		type.selectByVisibleText("Home Visit");
		preVisit.sendKeys(previsit);
		postVisit.sendKeys(postvisit);
		investigator.click();
		Select invs=new Select(investigator);
		invs.selectByVisibleText("Neethu P S");
		visitDate.sendKeys(date);
		visitTemplate.click();
		Select temp=new Select(visitTemplate);
		temp.selectByVisibleText("Patient visit--1");
		save.click();	
		Thread.sleep(3000);
	}
		
	public static boolean duplicateAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Visit number already exists"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean creationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Unscheduled visit added successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}
	
	public boolean verifyUnscheduledVisit(String visitno) throws InterruptedException 
	{
		Thread.sleep(2000);
		boolean sub=false;
		int count = tableVisitNo.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableVisitNo.get(i).getText();
			if(text.contains(visitno))
			{
				sub=true;
				break;
			}
		}
		return sub;
	}
	
	public void SearchVisitName(String visitname)
	{
		searchVisitName.sendKeys(visitname);
	}
	
	public void SearchVisitSchedule()
	{
		Select sel=new Select(searchStatus);
		sel.selectByVisibleText("Planned");
	}
	
	public void SearchVisitDate(String date1,String date2)
	{
		searchVisitDate1.sendKeys(date1);
		searchVisitDate1.sendKeys(date2);
	}
	
	public void Search()
	{
		visitSearch.click();
	}
	
	public Boolean visitNameSearchValidation(String visitname) throws InterruptedException
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
				String scode=tableVisitName.get(i).getText();
				if (!(scode.contains(visitname))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean visitScheduleSearchValidation(String visitschedule) throws InterruptedException
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
			for (int i=0; i<tableVisitStatus.size();i++)
			{
				String scode=tableVisitStatus.get(i).getText();
				if (!(scode.contains(visitschedule))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	/*public Boolean visitDateSearchValidation(String date1,String date2) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =TableVisitDate.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<TableVisitDate.size();i++)
			{
				String scode=TableVisitDate.get(i).getText();
				if(!(date1 <= scode) && (date2 <= scode))
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}*/
	
	public void withdraw(String subcode) throws InterruptedException
	{
		for(int i=0;i<tableVisitName.size();i++)
		{
			String text=tableVisitName.get(i).getText();
			if(text.equals(subcode))
			{
				tableWithdraw.get(i).click();
				Thread.sleep(3000);
				break;	
			}
		}
	}
	
	public void editVisit() throws InterruptedException
	{
	
	}
	
	public static boolean withdrawAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to withdraw this visit?"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}
	
	public String errorVisitNum()
	{
		elementWait(errorVisitNo);
		return errorVisitNo.getText();
	}
	
	public String errorVisitName()
	{
		elementWait(errorVisitName);
		return errorVisitName.getText();
	}
	
	public String errorVisitType()
	{
		elementWait(errorVisitType);
		return errorVisitType.getText();
	}
	
	public String errorInvestigator()
	{
		elementWait(errorInvestigator);
		return errorInvestigator.getText();
	}
	
	public String errorVisitDate()
	{
		elementWait(errorVisitDate);
		return errorVisitDate.getText();
	}
	
	public String errorVisitTemplate()
	{
		elementWait(errorVisitTemplate);
		return errorVisitTemplate.getText();
	}
	
	public String errorPreVisit()
	{
		elementWait(errorPreVisit);
		return errorPreVisit.getText();
	}
	
	public String errorPostVisit()
	{
		elementWait(errorPostVisit);
		return errorPostVisit.getText();
	}
	
}
