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

public class PatientLogin extends AbstractComponent{
	static WebDriver driver;
	public PatientLogin(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//*[@id=\"studysetup\"]/li[3]/a/span")
	@CacheLookup
	WebElement patientLogin;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/select")
	@CacheLookup
	WebElement searchSiteCode;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/input")
	@CacheLookup
	WebElement searchSubjectId;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[3]/select")
	@CacheLookup
	WebElement searchStatus;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/span")
	@CacheLookup
	WebElement search;
	
	@FindBy(xpath = "//td[1]")
	@CacheLookup
	List<WebElement> tableSiteCode;
	
	@FindBy(xpath = "//td[2]")
	@CacheLookup
	List<WebElement> tableSubjectId;
	
	@FindBy(xpath = "//td[6]")
	@CacheLookup
	List<WebElement> tableStatus;
	
	@FindBy(xpath = "//td[7]")
	@CacheLookup
	List<WebElement> tableAddLogin;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div/div[3]/input")
	@CacheLookup
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div/div[3]/button")
	@CacheLookup
	WebElement submit;
	
	@FindBy(xpath = "//span[contains(text(),'Please enter email')]")
	@CacheLookup
	WebElement errorMsg1;
	
	@FindBy(xpath = "//span[contains(text(),'Email already exist')]")
	@CacheLookup
	WebElement errorMsg2;
	
	@FindBy(xpath = "//span[contains(text(),'Invalid email')]")
	@CacheLookup
	WebElement errorMsg3;
	
	public void clickPatientLogin() throws InterruptedException
	{
		patientLogin.click();
		Thread.sleep(3000);
	}
	
	public void Submit() throws InterruptedException
	{
		submit.click();
		Thread.sleep(3000);
	}
	
	public void SearchSiteCode(String site) throws InterruptedException
	{
		Select sel=new Select(searchSiteCode);
		sel.selectByVisibleText(site);			
	}
	
	public String error1()
	{
		elementWait(errorMsg1);
		return errorMsg1.getText();
	}
	
	public String error2()
	{
		elementWait(errorMsg2);
		return errorMsg2.getText();
	}
	
	public String error3()
	{
		elementWait(errorMsg3);
		return errorMsg3.getText();
	}
	
	public void SearchSubId(String sub) throws InterruptedException
	{
		searchSubjectId.sendKeys(sub);
	}
	
	public void exsEmail(String sub) throws InterruptedException
	{
		email.sendKeys(sub);
	}
	
	public void SearchStatus(String stat) throws InterruptedException
	{
		Select sel=new Select(searchStatus);
		sel.selectByVisibleText(stat);
	}
	
	public void Search() throws InterruptedException
	{
		search.click();
	}
	
	public Boolean siteCodeSearchValidation(String site) throws InterruptedException
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
				if (!(scode.contains(site))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean SubjectIdSearchValidation(String sub) throws InterruptedException
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
				String scode=tableSubjectId.get(i).getText();
				if (!(scode.contains(sub))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean StatusSearchValidation(String stat) throws InterruptedException
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
				if (!(scode.contains(stat))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public boolean findSubId(String subject) throws InterruptedException
	{
		Thread.sleep(2000);
		boolean sub=false;
		int count = tableSubjectId.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableSubjectId.get(i).getText();
			if(text.contains(subject))
			{
				tableAddLogin.get(i).click();
				Thread.sleep(3000);
				sub=true;
				break;
			}
		}
		return sub;
	}
		
		public void AddLogin(String emailid) throws InterruptedException
		{
			email.clear();
			email.sendKeys(emailid);
			submit.click();
		}
		
		public static boolean CreationAlert() throws InterruptedException
		{
			try
			{
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
				wait1.until(ExpectedConditions.alertIsPresent());
				Alert alert1 = driver.switchTo().alert();
				Assert.assertTrue(alert1.getText().contains("Patient login created successfully"));
				alert1.accept();
				return true;
			} catch (NoAlertPresentException e) {
				return false;
			}	
		}

		
}
