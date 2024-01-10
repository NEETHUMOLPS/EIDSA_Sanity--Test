package com.EIDSA.pageObjects;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.openqa.selenium.support.ui.Select;
import com.AbstractComponents.AbstractComponent;

public class StudyProfile extends AbstractComponent{
	
	static WebDriver driver;
	public StudyProfile(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Study Profile
	@FindBy(xpath="//span[normalize-space()='Study Profile']")
	WebElement studyProfile;
	
	//Edit study
	@FindBy(xpath="//i[@class='fa fa-edit fs-5']")
	WebElement editStudy;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement studyId;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement studyName;
	@FindBy(xpath="//input[@type='email']")
	WebElement sponsor;
	@FindBy(xpath="//select[@class='form-select']")
	WebElement status;
	@FindBy(xpath="//input[@type='test']")
	WebElement studyNotes;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement preVisit;
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement postVisit;
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement noOfSites;
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement noOfSubjects;
	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement duration;
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement active;
	@FindBy(xpath="//button[normalize-space()='Clear']")
	WebElement clear;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save;
	
	//Create Visit
	@FindBy(xpath="//span[normalize-space()='Create visit']")
	WebElement createVisit;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement visitNo;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement visitName;
	@FindBy(xpath="//select[@valueprop='VisitTypeName']")
	WebElement visitType;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement visitNotes;
	@FindBy(xpath="(//select[@valueprop='templateId'])[1]")
	WebElement assignTemplate;
	@FindBy(xpath="(//select[@valueprop='templateId'])[2]")
	WebElement formLibrary;
	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement preVisitDays;
	@FindBy(xpath="(//input[@type='number'])[2]")
	WebElement postVisitDays;
	@FindBy(xpath="(//input[@type='number'])[3]")
	WebElement days1;
	@FindBy(xpath="(//input[@type='number'])[4]")
	WebElement weeks1;
	@FindBy(xpath="(//input[@type='number'])[5]")
	WebElement months1;
	@FindBy(xpath="(//input[@type='number'])[6]")
	WebElement years1;
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement patientVisit;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement active1;
	@FindBy(xpath="//button[normalize-space()='Clear']")
	WebElement clear1;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save1;
	
	//Create site
	@FindBy(xpath="//span[normalize-space()='Create Site']")
	WebElement createSite;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement siteCode;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement siteName;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement siteContactName;
	@FindBy(xpath="(//input[@type='email'])[1]")
	WebElement siteContactEmail;
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement noOfSubjects2;
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement siteNotes;
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement active2;
	@FindBy(xpath="//button[normalize-space()='Clear']")
	WebElement clear2;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save2;
	
	//Create Subject
	@FindBy(xpath="//span[normalize-space()='Create Subject']")
	WebElement createSubject;
	
	@FindBy(xpath="(//select[@name='account'])[2]")
	WebElement siteCode3;
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement subjectId;
	@FindBy(xpath="(//input[@type='date'])[1]")
	WebElement enrolmentDate;
	@FindBy(xpath="(//select[@name='account'])[3]")
	WebElement investigator;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement preVisit3;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement postVisit3;
	@FindBy(xpath="(//select[@name='account'])[4]")
	WebElement country;
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement city;
	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement postCode;
	@FindBy(xpath="(//select[@name='account'])[5]")
	WebElement language;
	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement subjectNotes;
	@FindBy(xpath="(//input[@type='checkbox'])[1]")
	WebElement active3;
	@FindBy(xpath="(//input[@type='checkbox'])[2]")
	WebElement createSchedule;
	@FindBy(xpath="(//button[normalize-space()='Clear'])[1]")
	WebElement clear3;
	@FindBy(xpath="//button[normalize-space()='Save']")
	WebElement save3;
	
	//Form templates
	@FindBy(xpath="//td[1]")
	List<WebElement> formName;
	@FindBy(xpath="//td[2]")
	List<WebElement> version;
	@FindBy(xpath="//td[3]")
	List<WebElement> lastUpdated;
	@FindBy(xpath="//td[4]")
	List<WebElement> view;
	@FindBy(xpath="//td[5]")
	List<WebElement> action;
	
	@FindBy(xpath="//div[normalize-space()='Create new version']")
	WebElement createNewVersion;
	@FindBy(xpath="//div[normalize-space()='Retire Form']")
	WebElement retireForm;
	
	//Visits
	@FindBy(xpath="//td[1]")
	List<WebElement> visitName1;
	@FindBy(xpath="//td[2]")
	List<WebElement> visitNo1;
	@FindBy(xpath="//td[3]")
	List<WebElement> templates1;
	@FindBy(xpath="//td[4]")
	List<WebElement> action1;
	
	@FindBy(xpath="//div[normalize-space()='Assign Template']")
	WebElement assignTemplate1;
	@FindBy(xpath="//select[@placeholder='Search by Status']")
	WebElement assignTemplate2;
	@FindBy(xpath="//button[normalize-space()='Assign']")
	WebElement assign;
	
	
	@FindBy(xpath="//div[normalize-space()='Delete']")
	WebElement delete;
	@FindBy(xpath="//div[normalize-space()='Edit']")
	WebElement edit;
	
	public void clickOnStudyProfile() throws InterruptedException
	{		
		Thread.sleep(2000);
		studyProfile.click();
		Thread.sleep(2000);;
	}
	
	public void editStudy(String notes) throws InterruptedException
	{		
		Thread.sleep(2000);
		editStudy.click();
		Thread.sleep(2000);
		studyNotes.sendKeys(notes);
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
	}
	
	public static boolean studyEditAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Study updated successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public void createVisit(String num,String name,String type,String temp) throws InterruptedException
	{		
		Thread.sleep(2000);
		createVisit.click();
		Thread.sleep(2000);
		visitNo.sendKeys(num);
		Thread.sleep(2000);
		visitName.sendKeys(name);
		Thread.sleep(2000);
		Select os = new Select(visitType);
		os.selectByVisibleText(type);
		Thread.sleep(2000);
		Select os1 = new Select(assignTemplate);
		os1.selectByVisibleText(temp);
		Thread.sleep(2000);
		save1.click();
		Thread.sleep(2000);
	}
	
	public static boolean visitCreationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Visit added successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public void createSite(String code) throws InterruptedException
	{		
		Thread.sleep(2000);
		createSite.click();
		Thread.sleep(2000);
		siteCode.sendKeys(code);
		Thread.sleep(2000);
		save2.click();
		Thread.sleep(2000);
	}
	
	public static boolean siteCreationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Site saved successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public void createSubject(String code,String id,String dt,String ivs) throws InterruptedException
	{		
		Thread.sleep(2000);
		createSubject.click();
		Thread.sleep(2000);
		Select os = new Select(siteCode3);
		os.selectByVisibleText(code);
		Thread.sleep(2000);
		subjectId.sendKeys(id);
		Thread.sleep(2000);
		enrolmentDate.sendKeys(dt);
		Thread.sleep(2000);
		investigator.sendKeys(ivs);
		Thread.sleep(2000);
		save3.click();
		Thread.sleep(2000);
	}
	
	public static boolean subjectCreationAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Subject added successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public void assignTemplate1(String name) throws InterruptedException
	{
		for(int i=0;i<visitName1.size();i++)
		{
			String text=visitName1.get(i).getText();
			if(text.equals(name))
			{
				action1.get(i).click();
				Thread.sleep(2000);
				assignTemplate1.click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void assignTemplate2(String temp) throws InterruptedException
	{		
		Thread.sleep(2000);
		Select os = new Select(assignTemplate2);
		os.selectByVisibleText(temp);
		Thread.sleep(2000);
		assign.click();
		Thread.sleep(2000);
	}
	
	public static boolean assignTemplateAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Template assigned successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public void editVisit1(String name) throws InterruptedException
	{
		for(int i=0;i<visitName1.size();i++)
		{
			String text=visitName1.get(i).getText();
			if(text.equals(name))
			{
				action1.get(i).click();
				Thread.sleep(2000);
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,200)");
				Thread.sleep(2000);
				elementWait(edit);
				edit.click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void editVisit2(String type) throws InterruptedException
	{		
		Thread.sleep(2000);
		Select os = new Select(visitType);
		os.selectByVisibleText(type);
		Thread.sleep(2000);
		save1.click();
		Thread.sleep(2000);
	}
	
	public static boolean editVisitAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Visit updated successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}
	
	public void deleteVisit(String name) throws InterruptedException
	{
		for(int i=0;i<visitName1.size();i++)
		{
			String text=visitName1.get(i).getText();
			if(text.equals(name))
			{
				action1.get(i).click();
				JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,200)");
				Thread.sleep(2000);
				elementWait(delete);
				Thread.sleep(2000);
				delete.click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public static boolean deleteVisitAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this visit?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Visit deleted successfully."));
			alert2.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}		
	}

}
