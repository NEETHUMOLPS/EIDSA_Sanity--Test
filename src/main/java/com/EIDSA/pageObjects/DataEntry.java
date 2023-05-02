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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.AbstractComponents.AbstractComponent;

public class DataEntry extends AbstractComponent{
	
	static WebDriver driver;
	public DataEntry(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"side-menu\"]/li[9]/a")
	@CacheLookup
	WebElement DataEntry;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/input")
	@CacheLookup
	WebElement VisitNumber;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/input")
	@CacheLookup
	WebElement VisitName;
	
	@FindBy(xpath="//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath="//td[1]")
	@CacheLookup
	List<WebElement> tableStudy;
	
	@FindBy(xpath="//td[2]")
	@CacheLookup
	List<WebElement> tableVisitNumber;
	
	@FindBy(xpath="//td[3]")
	@CacheLookup
	List<WebElement> tableVisitName;
	
	@FindBy(xpath="//td[5]")
	@CacheLookup
	List<WebElement> tableFillForm;
	
	@FindBy(xpath="//*[@id=\"formElements\"]/form/div/div/div/div/div[2]/div/div[1]/div/div/input")
	@CacheLookup
	WebElement formSiteIdCode;
	
	@FindBy(xpath="//*[@id=\"formElements\"]/form/div/div/div/div/div[2]/div/div[2]/div/div/input")
	@CacheLookup
	WebElement formPatientScreeningNumber;
	
	@FindBy(xpath="//*[@id=\"formElements\"]/form/div/div/div/div/div[11]/div/div[1]/div/div/input")
	@CacheLookup
	WebElement formVisitDate;
	
	@FindBy(xpath="//*[@id=\"formElements\"]/form/div/div/div/div/div[11]/div/div[2]/div/div/input")
	@CacheLookup
	WebElement formInvestigatorInitials;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement formSave;
	
	@FindBy(xpath="//button[contains(text(),'Review And Submit')]")
	@CacheLookup
	WebElement formReviewAndSubmit;
	
	@FindBy(xpath="//*[@id=\"formElements\"]/form/div/div/div/div/div[2]/div/div[1]/div/span")
	@CacheLookup
	WebElement err1;
	
	@FindBy(xpath="//*[@id=\"formElements\"]/form/div/div/div/div/div[2]/div/div[2]/div/span")
	@CacheLookup
	WebElement err2;
	
	@FindBy(xpath="//*[@id=\"formElements\"]/form/div/div/div/div/div[11]/div/div[1]/div/span")
	@CacheLookup
	WebElement err3;
	
	@FindBy(xpath="//*[@id=\"formElements\"]/form/div/div/div/div/div[11]/div/div[2]/div/span")
	@CacheLookup
	WebElement err4;
	
	@FindBy(xpath="//*[@id=\"formElements\"]/form/div/div/div/div/div[2]/div/div[1]/div/span")
	@CacheLookup
	WebElement err5;
	
	@FindBy(xpath="//*[@id=\"formElements\"]/form/div/div/div/div/div[2]/div/div[2]/div/span")
	@CacheLookup
	WebElement err6;
	
	@FindBy(xpath="//*[@id=\"formElements\"]/form/div/div/div/div/div[11]/div/div[2]/div/span")
	@CacheLookup
	WebElement err7;
	
	public void clickSave() throws InterruptedException
	{
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		formSave.click();
	}
	
	public void clickDataEntry() throws InterruptedException
	{
		
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(3000);
		elementWait(DataEntry);
		DataEntry.click();
		Thread.sleep(3000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(5000);
	}
	
	public void searchVisitNumber(String visitno) throws InterruptedException
	{
		VisitNumber.sendKeys(visitno);
		Thread.sleep(3000);
		
	}
	
	public void clickSearch() throws InterruptedException
	{
		Search.click();
		Thread.sleep(3000);
	}
	
	public void searchVisitName(String visitname) throws InterruptedException
	{
		VisitName.sendKeys(visitname);
		Thread.sleep(3000);
	}
	
	public Boolean visitNumberStatusValidation(String visitno) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableVisitNumber.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableVisitNumber.size();i++)
			{
				String stat=tableVisitNumber.get(i).getText();
				if (!(stat.contains(visitno))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean visitNameStatusValidation(String visitname) throws InterruptedException
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
				if (!(stat.contains(visitname))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public void fillform(String visitno) throws InterruptedException
	{
		for(int i=0;i<tableVisitNumber.size();i++)
		{
			String text=tableVisitNumber.get(i).getText();
			if(text.equals(visitno))
			{
				tableFillForm.get(i).click();
				Thread.sleep(8000);
				break;	
			}
		}
	}
	
	public void FillFormSave(String sitecode, String num, String date, String in) throws InterruptedException
	{
		Thread.sleep(2000);
		formSiteIdCode.sendKeys(sitecode);
		Thread.sleep(2000);
		formPatientScreeningNumber.sendKeys(num);
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		formVisitDate.sendKeys(date);
		Thread.sleep(2000);
		formInvestigatorInitials.sendKeys(in);
		Thread.sleep(2000);
		formSave.click();		
	}
	
	public void FillFormReviewAndSubmit(String sitecode, String num,String date,String in) throws InterruptedException
	{
		Thread.sleep(2000);
		formSiteIdCode.sendKeys(sitecode);
		Thread.sleep(2000);
		formPatientScreeningNumber.sendKeys(num);
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		formVisitDate.sendKeys(date);
		Thread.sleep(2000);
		formInvestigatorInitials.sendKeys(in);
		Thread.sleep(2000);
		formReviewAndSubmit.click();		
	}
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Form saved successfully"));
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
			Assert.assertTrue(alert1.getText().contains("Form submitted successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public String errorMsg1()
	{
		elementWait(err1);
		return err1.getText();
	}
	
	public String errorMsg2()
	{
		elementWait(err2);
		return err2.getText();
	}
	public String errorMsg3()
	{
		elementWait(err3);
		return err3.getText();
	}
	
	public String errorMsg4()
	{
		elementWait(err4);
		return err4.getText();
	}
	
	public String errorMsg5()
	{
		elementWait(err5);
		return err5.getText();
	}
	
	public String errorMsg6()
	{
		elementWait(err6);
		return err6.getText();
	}
	
	public String errorMsg7()
	{
		elementWait(err1);
		return err7.getText();
	}
	
	public void clickSiteCode(String code) throws InterruptedException
	{
		formSiteIdCode.sendKeys(code);
		Thread.sleep(3000);
	}
	
	public void clickPatientScreeningNum(String num) throws InterruptedException
	{
		formPatientScreeningNumber.sendKeys(num);
		Thread.sleep(3000);
	}

	public void clickdate(String date) throws InterruptedException
	{
		formVisitDate.sendKeys(date);
		Thread.sleep(3000);
	}
	
	public void clickintials(String in) throws InterruptedException
	{
		formInvestigatorInitials.sendKeys(in);
		Thread.sleep(3000);
	}
	
	public void clickSiteCode1() throws InterruptedException
	{
		formSiteIdCode.click();
		Thread.sleep(3000);
	}
	
	public void clickPatientScreeningNum1() throws InterruptedException
	{
		formPatientScreeningNumber.click();
		Thread.sleep(3000);
	}

	public void clickdate1() throws InterruptedException
	{
		formVisitDate.click();
		Thread.sleep(3000);
	}
	
	public void clickintials1() throws InterruptedException
	{
		formInvestigatorInitials.click();
		Thread.sleep(3000);
	}
	

}
