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

public class Visit extends AbstractComponent{
	static WebDriver driver;
	public Visit(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//*[@id=\"studysetup\"]/li[4]/a")
	@CacheLookup
	WebElement visit;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/div/input")
	@CacheLookup
	WebElement visitNo;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/div/input")
	@CacheLookup
	WebElement visitName;
	
	@FindBy(xpath = "//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath = "//td[1]")
	@CacheLookup
	List<WebElement> tableVisitNo;
	
	@FindBy(xpath = "//td[2]")
	@CacheLookup
	List<WebElement> tableVisitName;
	
	@FindBy(xpath = "//td[14]")
	@CacheLookup
	List<WebElement> tableView;
	
	@FindBy(xpath = "//td[13]")
	@CacheLookup
	List<WebElement> tableAssignTemplate;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div/div/div[1]/div/select")
	@CacheLookup
	WebElement assignTemplate;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div/div/div[2]/div/button")
	@CacheLookup
	WebElement assign;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[1]/div/a/i")
	@CacheLookup
	WebElement assignClose;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div[1]/select")
	@CacheLookup
	WebElement availableLanguage;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div[2]/div/div/select")
	@CacheLookup
	WebElement language;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div[2]/div/span")
	@CacheLookup
	WebElement translate;
	
	public void clickVisit() throws InterruptedException
	{
		visit.click();
		Thread.sleep(3000);
	}
	
	public void clickSearch() throws InterruptedException
	{
		Search.click();
		Thread.sleep(3000);
	}
	
	public void SearchVisitNo(String no) throws InterruptedException
	{
		visitNo.sendKeys(no);
	}
	
	public void assign() throws InterruptedException
	{
		assign.click();
	}
	
	public void language(String lan) throws InterruptedException
	{
		Select sel=new Select(language);
		sel.selectByVisibleText(lan);			
	}
	
	public void Translate() throws InterruptedException
	{
		translate.click();
	}
	
	public void assignclose() throws InterruptedException
	{
		assignClose.click();
	}
	
	public void SearchVisitName(String name) throws InterruptedException
	{
		visitName.sendKeys(name);
	}
	
	public void TemplateAssigning(String temp) throws InterruptedException
	{
		Select sel=new Select(assignTemplate);
		sel.selectByVisibleText(temp);			
	}
	
	public Boolean visitNoSearchValidation(String num) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableVisitNo.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableVisitNo.size();i++)
			{
				String scode=tableVisitNo.get(i).getText();
				if (!(scode.contains(num))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean visitNameSearchValidation(String name) throws InterruptedException
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
				if (!(scode.contains(name))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
		
	public static boolean AssignAlert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Please select a template"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean AssignAlert2() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Template assigned successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean TransalteAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure, you want to convert this form to Malayalam"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean TransalteAlertNegative() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure, you want to convert this form to undefined"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public boolean assignTemp(String subject) throws InterruptedException
	{
		Thread.sleep(2000);
		boolean sub=false;
		int count = tableVisitName.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableVisitName.get(i).getText();
			if(text.contains(subject))
			{
				tableAssignTemplate.get(i).click();
				Thread.sleep(3000);
				sub=true;
				break;
			}
		}
		return sub;
	}
	
	public boolean view(String subject) throws InterruptedException
	{
		Thread.sleep(2000);
		boolean sub=false;
		int count = tableVisitName.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableVisitName.get(i).getText();
			if(text.contains(subject))
			{
				tableView.get(i).click();
				Thread.sleep(10000);
				sub=true;
				break;
			}
		}
		return sub;
	}
	
		
}
