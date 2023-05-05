package com.EIDSA.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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

public class SubjectPage extends AbstractComponent{
	
	static WebDriver driver;
	public SubjectPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'Subjects')]")
	@CacheLookup
	WebElement subject;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[1]/div/div[2]/img")
	@CacheLookup
	WebElement createSubject;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[1]/select")
	@CacheLookup
	WebElement siteCode;

	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/input")
	@CacheLookup
	WebElement subjectId;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[3]/input")
	@CacheLookup
	WebElement enrolmentDate;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[4]/select")
	@CacheLookup
	WebElement country;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[5]/select")
	@CacheLookup
	WebElement investigator;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[6]/input")
	@CacheLookup
	WebElement preVisit;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[7]/input")
	@CacheLookup
	WebElement postVisit;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[8]/input")
	@CacheLookup
	WebElement city;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[9]/input")
	@CacheLookup
	WebElement postCode;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[10]/select")
	@CacheLookup
	WebElement language;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[12]/input")
	@CacheLookup
	WebElement subjectNotes;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[12]/div[1]/div/input")
	@CacheLookup
	WebElement active;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[12]/div[2]/div/input")
	@CacheLookup
	WebElement createSchedule;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[13]/button[1]")
	@CacheLookup
	WebElement clear;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement save;
	
	@FindBy(xpath = "//span[normalize-space()='Please select a site code']")
	@CacheLookup
	WebElement errorSiteCode;
	
	@FindBy(xpath = "//span[normalize-space()='Please enter a subject ID']")
	@CacheLookup
	WebElement errorSubjectId;
	
	@FindBy(xpath = "//span[normalize-space()='Please select enrolment date']")
	@CacheLookup
	WebElement errorDate;
	
	@FindBy(xpath = "img[alt='Upload subject']")
	@CacheLookup
	WebElement uploadSub;
	
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
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[1]/div/img")
	@CacheLookup
	WebElement createschedule;
	
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
	List<WebElement> tableShedule;
	
	@FindBy(xpath="//td[10]")
	@CacheLookup
	List<WebElement> tableComplete;
	
	@FindBy(xpath="//td[11]")
	@CacheLookup
	List<WebElement> tableEdit;
	
	@FindBy(xpath="//td[12]")
	@CacheLookup
	List<WebElement> tableWithdraw;;
	
	@FindBy(xpath="//td[13]")
	@CacheLookup
	List<WebElement> tableAuditTrail;
	
	@FindBy(xpath="//td[14]")
	@CacheLookup
	List<WebElement> tableDelete;
	
	@FindBy(xpath="//td[15]")
	@CacheLookup
	List<WebElement> tableDocument;
	
	public void clickSubject()
	{
		subject.click();
	}
	
	public void clickCreateSubject() throws InterruptedException
	{
		Thread.sleep(3000);
		createSubject.click();
	}
	
	public void saveSub() throws InterruptedException
	{
		Thread.sleep(3000);
		save.click();
	}
	
	public void createSubject(String subid,String date,String previsit,String postvisit,String ct,String pc,String notes) throws InterruptedException
	{
		subject.click();
		Thread.sleep(5000);
		createSubject.click();
		Thread.sleep(5000);
		siteCode.click();
		Thread.sleep(8000);
		Select sitecode=new Select(siteCode);
		sitecode.selectByVisibleText("Demo01");
		subjectId.clear();
		subjectId.sendKeys(subid);
		enrolmentDate.clear();
		enrolmentDate.sendKeys(date);
		country.click();
		Thread.sleep(5000);
		investigator.click();
		preVisit.clear();
		preVisit.sendKeys(previsit);
		postVisit.clear();
		postVisit.sendKeys(previsit);
		city.sendKeys(ct);
		postCode.sendKeys(pc);
		language.click();
		Thread.sleep(5000);
		subjectNotes.sendKeys(notes);
		save.click();	
	}
	
	public void duplicateSiteCode(String site) throws InterruptedException
	{
		Select sitecode=new Select(siteCode);
		sitecode.selectByVisibleText(site);

	}
	
	public void duplicateSubjectId(String subid) throws InterruptedException
	{
		subjectId.sendKeys(subid);
	}
	
	public void duplicatedate(String subid) throws InterruptedException
	{
		enrolmentDate.sendKeys(subid);
	}
	
	public static boolean subjectAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Subject added successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public boolean verifySubject(String subjectid) throws InterruptedException 
	{
		Thread.sleep(2000);
		boolean sub=false;
		int count = tableSubId.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableSubId.get(i).getText();
			if(text.contains(subjectid))
			{
				sub=true;
				break;
			}
		}
		return sub;
	}
	
	public void searchSiteCode(String sitecode)
	{
		Select sel=new Select(searchSiteCode);
		sel.selectByVisibleText(sitecode);
	}
	
	public void searchSubjectId(String subid) throws InterruptedException
	{
		Thread.sleep(2000);
		searchSubId.sendKeys(subid);
	}
	
	public void searchStatus(String status)
	{
		Select sel=new Select(searchStatus);
		sel.selectByVisibleText(status);
	}
	
	public void searchSiteCodeAll()
	{
		Select sel=new Select(searchSiteCode);
		sel.selectByVisibleText("All");
	}
	
	public void clearSubjectId() throws InterruptedException
	{
		searchSubId.click();
		searchSubId.clear();
	}
	
	public void searchStatusAll()
	{
		Select sel=new Select(searchStatus);
		sel.selectByVisibleText("All");
	}
	
	public void Search()
	{
		search.click();
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
				String scode=tableSiteCode.get(i).getText();
				if (!(scode.contains(sitecode))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	public Boolean subIdeSearchValidation(String sub) throws InterruptedException
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
				String scode=tableSubId.get(i).getText();
				if (!(scode.contains(sub))) 
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
				String scode=tableStatus.get(i).getText();
				if (!(scode.contains(status))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	
	
	public void editSubject(String subcode) throws InterruptedException
	{
		for(int i=0;i<tableSubId.size();i++)
		{
			String text=tableSubId.get(i).getText();
			if(text.equals(subcode))
			{
				tableEdit.get(i).click();
				break;	
			}
		}
	}
	
	public void editSub() throws InterruptedException
	{
		Thread.sleep(4000);
		subjectNotes.clear();
		Thread.sleep(4000);
		subjectNotes.sendKeys("NA");
		Thread.sleep(4000);
		save.click();	
	}
	
	public static boolean subjectEditAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Subject updated successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}			
	}
	
	public void auditTrail(String sub) throws InterruptedException
	{
		Thread.sleep(4000);
		int count=tableSubId.size();
		for(int i=0;i<count;i++)
		{
			String sublist=tableSubId.get(i).getText();
			if(sublist.contains(sub))
			{
				Thread.sleep(4000);
				tableAuditTrail.get(i).click();
				WebElement e = driver.findElement(By.xpath("//strong[contains(text(),'Neethu P S')]"));
				String actualText=e.getText();
				String expText="Neethu P S";
				
				if(actualText.equals(expText))
				{
					Assert.assertTrue(true);
					driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[3]/div/div[1]/div/i")).click();
				}
				else
				{
					Assert.assertTrue(false);
				}
		      
				
				break;
			}
		}
	}
	
	public void delSubject(String subcode) throws InterruptedException
	{
		for(int i=0;i<tableSubId.size();i++)
		{
			String text=tableSubId.get(i).getText();
			if(text.equals(subcode))
			{
				tableDelete.get(i).click();
				break;	
			}
		}
	}
	
	public static boolean subjectDelAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this patient?"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void withdrawnSubject(String subcode) throws InterruptedException
	{
		for(int i=0;i<tableSubId.size();i++)
		{
			String text=tableSubId.get(i).getText();
			if(text.equals(subcode))
			{
				tableWithdraw.get(i).click();
				break;	
			}
		}
	}
	
	public static boolean subjectWithdrawAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to withdraw this patient?"));
			alert1.accept();
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Patient withdrawn successfully"));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void completeSubject(String subcode) throws InterruptedException
	{
		for(int i=0;i<tableSubId.size();i++)
		{
			String text=tableSubId.get(i).getText();
			if(text.equals(subcode))
			{
				tableComplete.get(i).click();
				break;	
			}
		}
	}
	
	public static boolean subjectCompleteAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to complete this patient?"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void scheduleSubject(String subcode) throws InterruptedException
	{
		for(int i=0;i<tableSubId.size();i++)
		{
			String text=tableSubId.get(i).getText();
			if(text.equals(subcode))
			{
				tableShedule.get(i).click();
				Thread.sleep(3000);
				createschedule.click();
				break;	
			}
		}
	}
	
	public static boolean scheduleAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Schedule created successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean duplicateAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Subject ID already exists"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public void completeSubjectWithEnrolledStatus(String subcode) throws InterruptedException
	{
		for(int i=0;i<tableSubId.size();i++)
		{
			String text=tableSubId.get(i).getText();
			if(text.equals(subcode))
			{
				tableComplete.get(i).click();
				break;	
			}
		}
	}
	
	public static boolean completeSubjectWithEnrolledStatusAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("All the visit status should be either completed or withdrawn for completing patient"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public String siteCodeErrorMsg()
	{
		elementWait(errorSiteCode);
		return errorSiteCode.getText();
	}
	
	public String subIdErrorMsg()
	{
		elementWait(errorSubjectId);
		return errorSubjectId.getText();
	}
	
	public String dateErrorMsg()
	{
		elementWait(errorDate);
		return errorDate.getText();
	}
	
	
}
