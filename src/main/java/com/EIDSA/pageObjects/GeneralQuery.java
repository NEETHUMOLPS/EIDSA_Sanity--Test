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

public class GeneralQuery extends AbstractComponent{
	static WebDriver driver;
	public GeneralQuery(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Query
	
	@FindBy(xpath = "//*[@id=\"studysetup\"]/li[10]/a/span[2]")
	@CacheLookup
	WebElement AllQueries1;
	
	@FindBy(xpath = "//span[contains(text(),'General')]")
	@CacheLookup
	WebElement GeneralQuery1;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement QueryId;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/input[1]")
	@CacheLookup
	WebElement QuerySubject1;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[3]/select[1]")
	@CacheLookup
	WebElement QueryStatus;
	
	@FindBy(xpath = "//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath = "//td[1]")
	@CacheLookup
	List<WebElement> tableQueryId;
	
	@FindBy(xpath = "//td[5]")
	@CacheLookup
	List<WebElement> tableQuerySubject;
	
	@FindBy(xpath = "//td[2]")
	@CacheLookup
	List<WebElement> tableStatus;
	
	@FindBy(xpath = "//td[10]")
	@CacheLookup
	List<WebElement> tableView;
	
	//Query generation
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]/img[1]")
	@CacheLookup
	WebElement GeneralQuery2;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement QuerySubject2;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/textarea[1]")
	@CacheLookup
	WebElement QueryMessage;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/select[1]")
	@CacheLookup
	WebElement Priority;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]/input[1]")
	@CacheLookup
	WebElement Role;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/ul[1]/li[1]")
	@CacheLookup
	WebElement Role1;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]/div[1]/input[1]")
	@CacheLookup
	WebElement Recipient1;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]/div[1]/div[2]/ul[1]/li[1]")
	@CacheLookup
	WebElement Recipient2;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]/div[1]/span[2]")
	@CacheLookup
	WebElement Recipient3;
	
	@FindBy(xpath = "//button[contains(text(),'Clear')]")
	@CacheLookup
	WebElement Clear;
	
	@FindBy(xpath = "//button[contains(text(),'Submit')]")
	@CacheLookup
	WebElement Submit;
	
	@FindBy(xpath = "//span[contains(text(),'Please enter query subject')]")
	@CacheLookup
	WebElement Qerr1;
	
	@FindBy(xpath = "//span[contains(text(),'Please enter query message')]")
	@CacheLookup
	WebElement Qerr2;
	
	@FindBy(xpath = "//span[contains(text(),'Please select role')]")
	@CacheLookup
	WebElement Qerr3;
	
	@FindBy(xpath = "//span[contains(text(),'Please select a recipient')]")
	@CacheLookup
	WebElement Qerr4;
	
	public void clickGeneralQueries() throws InterruptedException
	{
		Thread.sleep(4000);
		GeneralQuery2.click();
		Thread.sleep(5000);
	}
	
	public String QErr1()
	{
		elementWait(Qerr1);
		return Qerr1.getText();
	}
	
	public String QErr2()
	{
		elementWait(Qerr2);
		return Qerr2.getText();
	}
	
	public String QErr3()
	{
		elementWait(Qerr3);
		return Qerr3.getText();
	}
	
	public String QErr4()
	{
		elementWait(Qerr4);
		return Qerr4.getText();
	}
	
	public void GeneralQueryCreation(String pt) throws InterruptedException
	{
		Thread.sleep(4000);
		QuerySubject2.sendKeys("Subject");
		Thread.sleep(2000);
		QueryMessage.sendKeys("Message");
		Thread.sleep(2000);
		Select sel=new Select(Priority);
		sel.selectByVisibleText(pt);
		Thread.sleep(3000);
		Role.click();
		Thread.sleep(3000);
		Role1.click();
		Thread.sleep(3000);
		Recipient1.click();
		Thread.sleep(3000);
		Recipient2.click();
		Thread.sleep(3000);
		Recipient3.click();
		Thread.sleep(3000);
		Submit.click();
	}
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Query generated successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void clickGeneral() throws InterruptedException
	{
		AllQueries1.click();
		Thread.sleep(2000);
		GeneralQuery1.click();
		Thread.sleep(2000);
	}
	
	
	public void clickQueryId(String id) throws InterruptedException
	{
		QueryId.sendKeys(id);
		Thread.sleep(3000);
	}
	
	
	public void clickQuerySubject(String sub) throws InterruptedException
	{
		QuerySubject1.sendKeys(sub);
		Thread.sleep(3000);
	}
	
	public void clickQueryStatus(String st) throws InterruptedException
	{
		Select sel=new Select(QueryStatus);
		sel.selectByVisibleText(st);
		Thread.sleep(3000);
	}
	
	public void clickSearch() throws InterruptedException
	{
		Search.click();
		Thread.sleep(3000);
	}
	
	public void clickSubmit() throws InterruptedException
	{
		Submit.click();
		Thread.sleep(3000);
	}
	
	public boolean view(String id) throws InterruptedException 
	{
		Thread.sleep(2000);
		boolean sub=false;
		int count = tableQueryId.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  tableQueryId.get(i).getText();
			if(text.contains(id))
			{
				tableView.get(i).click();
				Thread.sleep(5000);
				break;	
			}
		}
		return sub;
	}
	
	public Boolean QueryIdSearchValidation(String id) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableQueryId.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableQueryId.size();i++)
			{
				String stat=tableQueryId.get(i).getText();
				if (!(stat.contains(id))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean QuerySubjectSearchValidation(String sub) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableQuerySubject.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableQuerySubject.size();i++)
			{
				String stat=tableQuerySubject.get(i).getText();
				if (!(stat.contains(sub))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean QueryStatusSearchValidation(String stt) throws InterruptedException
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
				if (!(stat.contains(stt))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	
	
}
