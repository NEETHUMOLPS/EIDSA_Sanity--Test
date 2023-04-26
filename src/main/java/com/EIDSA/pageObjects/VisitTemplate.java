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

public class VisitTemplate extends AbstractComponent{
	static WebDriver driver;
	public VisitTemplate(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//*[@id=\"studysetup\"]/li[5]/a/img")
	@CacheLookup
	WebElement visitTemplate;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[1]/div/select")
	@CacheLookup
	WebElement SiteCode;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div/div/div[2]/div/select")
	@CacheLookup
	WebElement SubjectId;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[2]/div/div[1]/div/input")
	@CacheLookup
	WebElement VisitName;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[2]/div/div[2]/div/input")
	@CacheLookup
	WebElement VisitNo;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[2]/div/div[3]/span")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath = "//td[1]")
	@CacheLookup
	List<WebElement> tableSiteCode;
	
	@FindBy(xpath = "//td[2]")
	@CacheLookup
	List<WebElement> tableSub;
	
	@FindBy(xpath = "//td[3]")
	@CacheLookup
	List<WebElement> tableVisitNo;
	
	@FindBy(xpath = "//td[4]")
	@CacheLookup
	List<WebElement> tableVisitName;
	
	@FindBy(xpath = "//td[11]")
	@CacheLookup
	List<WebElement> tableEdit;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[4]/div/div[2]/div[1]/select")
	@CacheLookup
	WebElement template;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[4]/div/div[1]/div/i")
	@CacheLookup
	WebElement close;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[4]/div/div[2]/div[2]/button")
	@CacheLookup
	WebElement assign;
	
	public void clickVisitTemplate() throws InterruptedException
	{
		visitTemplate.click();
		Thread.sleep(3000);
	}
	
	public void clickSearch() throws InterruptedException
	{
		Search.click();
		Thread.sleep(3000);
	}
	
	public void clickAssign() throws InterruptedException
	{
		assign.click();
		Thread.sleep(3000);
	}
	
	public void SearchVisitName(String name) throws InterruptedException
	{
		VisitName.sendKeys(name);
	}
	
	public void SearchVisitNo(String no) throws InterruptedException
	{
		VisitNo.sendKeys(no);
	}
	
	public void SiteCode(String code) throws InterruptedException
	{
		Select sel=new Select(SiteCode);
		sel.selectByVisibleText(code);			
	}
	
	public void SubId(String id) throws InterruptedException
	{
		Select sel=new Select(SubjectId);
		sel.selectByVisibleText(id);			
	}
	
	public void Template(String temp) throws InterruptedException
	{
		Select sel=new Select(template);
		sel.selectByVisibleText(temp);	
		Thread.sleep(3000);
		assign.click();
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
	
	public Boolean visitNumSearchValidation(String num) throws InterruptedException
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
	
	
	public static boolean AssignAlert1() throws InterruptedException
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
	
	public static boolean AssignAlert2() throws InterruptedException
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
	
	public boolean edit(String editname) throws InterruptedException
	{
		Thread.sleep(2000);
		boolean sub=false;
		int count = tableVisitName.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableVisitName.get(i).getText();
			if(text.contains(editname))
			{
				tableEdit.get(i).click();
				Thread.sleep(10000);
				sub=true;
				break;
			}
		}
		return sub;
	}
	


}
