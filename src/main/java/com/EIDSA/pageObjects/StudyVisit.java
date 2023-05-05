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

public class StudyVisit extends AbstractComponent{
	
	static WebDriver driver;
	public StudyVisit(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[1]/div/img")
	@CacheLookup
	WebElement AddVisit;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement VisitNo ;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/input[1]")
	@CacheLookup
	WebElement VisitName ;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/select[1]")
	@CacheLookup
	WebElement VisitType ;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/input[1]")
	@CacheLookup
	WebElement PreVisit ;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]/input[1]")
	@CacheLookup
	WebElement PostVisit ;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[6]/input[1]")
	@CacheLookup
	WebElement Day ;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[7]/input[1]")
	@CacheLookup
	WebElement Week ;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[8]/input[1]")
	@CacheLookup
	WebElement Month ;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[9]/input[1]")
	@CacheLookup
	WebElement Year ;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[10]/input[1]")
	@CacheLookup
	WebElement Notes ;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div/div/div[11]/div/input")
	@CacheLookup
	WebElement Active ;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div/div/div[12]/div/input")
	@CacheLookup
	WebElement PatientVisit ;
	
	@FindBy(xpath="//button[contains(text(),'Clear')]")
	@CacheLookup
	WebElement Clear ;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement Save ;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/div/input")
	@CacheLookup
	WebElement StudyIdOrNameSearch ;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/div/select")
	@CacheLookup
	WebElement StatusSearch ;
	
	@FindBy(xpath="//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement Search ;
	
	@FindBy(xpath="//ul[@id='administrationmenu']/li/a/span")
	@CacheLookup
	WebElement Study;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement StudyNameOrId;
	
	@FindBy(xpath="//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement StudySearch;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div/div/div[1]/div/select")
	@CacheLookup
	WebElement SelectTemplate;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div/div/div[2]/div/button")
	@CacheLookup
	WebElement Assign;
	
	@FindBy(xpath="//span[contains(text(),'Please enter visit no')]")
	@CacheLookup
	WebElement err1;
	
	@FindBy(xpath="//span[contains(text(),'Please enter visit/form name')]")
	@CacheLookup
	WebElement err2;
	
	@FindBy(xpath="//span[contains(text(),'Please select a visit type')]")
	@CacheLookup
	WebElement err3;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement searchVisitNo;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement searchVisitName;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[4]/div/div[1]/div/a/i")
	@CacheLookup
	WebElement AssignClose;
	
	@FindBy(xpath="//td[9]")
	@CacheLookup
	List<WebElement> TableVisit;
	
	@FindBy(xpath="//td[1]")
	@CacheLookup
	List<WebElement> TableStudyId;
	
	@FindBy(xpath="//td[1]")
	@CacheLookup
	List<WebElement> TableVisitNo;
	
	@FindBy(xpath="//td[2]")
	@CacheLookup
	List<WebElement> TableVisitName;
	
	@FindBy(xpath="//td[12]")
	@CacheLookup
	List<WebElement> TableActive;
	
	@FindBy(xpath="//td[13]")
	@CacheLookup
	List<WebElement> TableAssignTemplate;
	
	@FindBy(xpath="//td[14]")
	@CacheLookup
	List<WebElement> TableEdit;
	
	@FindBy(xpath="//td[15]")
	@CacheLookup
	List<WebElement> TableDelete;
	
	public void clickStudy() throws InterruptedException
	{
		
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		elementWait(Study);
		Study.click();
		Thread.sleep(3000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(3000);
	}
	
	public void visitIcon(String studId) throws InterruptedException
	{

		int count = TableStudyId.size();
		for(int i=0;i<count;i++)
		{

			String text =  TableStudyId.get(i).getText();
			if(text.contains(studId))
			{
				TableVisit.get(i).click();
				Thread.sleep(3000);
				break;
			}
		}
	}
	
	public void createVisit(String no,String name,String type) throws InterruptedException
	{
		Thread.sleep(3000);
		AddVisit.click();
		Thread.sleep(3000);
		VisitNo.sendKeys(no);
		Thread.sleep(3000);
		VisitName.sendKeys(name);
		Thread.sleep(3000);
		Select sel=new Select(VisitType);
		sel.selectByVisibleText(type);
		Thread.sleep(3000);
		Save.click();
		Thread.sleep(3000);
	}
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Visit added successfully."));
			alert1.accept();
			Thread.sleep(3000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean Alert2() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Visit updated successfully."));
			alert1.accept();
			Thread.sleep(3000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean Alert3() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this visit?"));
			alert1.accept();
			Thread.sleep(3000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean Alert4() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Template assigned successfully"));
			alert1.accept();
			Thread.sleep(3000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean Alert5() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Please select a template"));
			alert1.accept();
			Thread.sleep(3000);
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
		
	public void searchVisitName(String name) throws InterruptedException
	{
		Thread.sleep(3000);
		searchVisitName.sendKeys(name);
		Thread.sleep(3000);
	}
	
	public void VisitAdd() throws InterruptedException
	{
		Thread.sleep(3000);
		AddVisit.click();
		Thread.sleep(3000);
	}
	
	public void AssignClick() throws InterruptedException
	{
		Thread.sleep(3000);
		Assign.click();
		Thread.sleep(3000);
	}
	
	public void templateAssigning(String temp) throws InterruptedException
	{
		Thread.sleep(3000);
		Select sel=new Select(SelectTemplate);
		sel.selectByVisibleText(temp);
		Thread.sleep(3000);
		Assign.click();
		Thread.sleep(3000);
	}
	
	public void searchVisitNo(String no) throws InterruptedException
	{
		Thread.sleep(3000);
		searchVisitNo.sendKeys(no);
		Thread.sleep(3000);
	}
	
	public void search() throws InterruptedException
	{
		Thread.sleep(3000);
		Search.click();
		Thread.sleep(3000);
	}
	
	public void StudyNameOrIdSearch(String id) throws InterruptedException
	{
		Thread.sleep(3000);
		StudyNameOrId.sendKeys(id);
		Thread.sleep(3000);
	}
	
	public void searchStudy() throws InterruptedException
	{
		Thread.sleep(3000);
		StudySearch.click();
		Thread.sleep(3000);
	}
	
	public void ClickSave() throws InterruptedException
	{
		Thread.sleep(3000);
		Save.click();
		Thread.sleep(3000);
	}
	
	public Boolean visitNameSearchValidation(String status) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =TableVisitName.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<TableVisitName.size();i++)
			{
				String stat=TableVisitName.get(i).getText();
				if (!(stat.contains(status))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean visitNoSearchValidation(String status) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =TableVisitNo.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<TableVisitNo.size();i++)
			{
				String stat=TableVisitNo.get(i).getText();
				if (!(stat.contains(status))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public void editStudyIcon(String nstudyid) throws InterruptedException
	{
		for(int i=0;i<TableVisitName.size();i++)
		{
			String text=TableVisitName.get(i).getText();
			if(text.equals(nstudyid))
			{
				TableEdit.get(i).click();
				Thread.sleep(3000);
				break;	
			}
		}
	}
	
	public void delete(String nstudyid) throws InterruptedException
	{
		for(int i=0;i<TableVisitName.size();i++)
		{
			String text=TableVisitName.get(i).getText();
			if(text.equals(nstudyid))
			{
				TableDelete.get(i).click();
				Thread.sleep(3000);
				break;	
			}
		}
	}
	
	public void assignTemplate(String nstudyid) throws InterruptedException
	{
		for(int i=0;i<TableVisitName.size();i++)
		{
			String text=TableVisitName.get(i).getText();
			if(text.equals(nstudyid))
			{
				TableAssignTemplate.get(i).click();
				Thread.sleep(3000);
				break;	
			}
		}
	}
	
	public String ErrorMsg1()
	{
		elementWait(err1);
		return err1.getText();
	}
	
	public String ErrorMsg2()
	{
		elementWait(err2);
		return err2.getText();
	}
	
	public String ErrorMsg3()
	{
		elementWait(err3);
		return err3.getText();
	}

}
