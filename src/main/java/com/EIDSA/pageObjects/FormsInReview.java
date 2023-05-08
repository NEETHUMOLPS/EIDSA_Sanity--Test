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

public class FormsInReview extends AbstractComponent{
	static WebDriver driver;
	public FormsInReview(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//*[@id=\"studysetup\"]/li[8]/a/span")
	@CacheLookup
	WebElement FormsInReview;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/select")
	@CacheLookup
	WebElement SiteCode;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/select")
	@CacheLookup
	WebElement SubjectId;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[3]/input")
	@CacheLookup
	WebElement VisitName;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/span")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath = "//button[contains(text(),'Review And Submit')]")
	@CacheLookup
	WebElement ReviewAndSubmit;
	
	
	@FindBy(xpath = "//td[1]")
	@CacheLookup
	List<WebElement> tableSiteCode;
	
	@FindBy(xpath = "//td[2]")
	@CacheLookup
	List<WebElement> tableSubjectId;
	
	@FindBy(xpath = "//td[3]")
	@CacheLookup
	List<WebElement> tableVisitName;
	
	@FindBy(xpath = "//td[8]")
	@CacheLookup
	List<WebElement> tableView;
	
	public void clickFormsInReview() throws InterruptedException
	{
		Thread.sleep(3000);
		FormsInReview.click();
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
	
	public void reviewAndSubmit() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		elementWait(ReviewAndSubmit);
		ReviewAndSubmit.click();
		Thread.sleep(3000);
	}
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Form submitted successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	

	

	
	
	

}
