package com.EIDSA.pageObjects;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;

public class SitePage extends AbstractComponent{
	
	static WebDriver driver;
	public SitePage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(linkText = "Sites")
	@CacheLookup
	WebElement site;
	
	@FindBy(xpath = "//img[@alt='Create site']")
	@CacheLookup
	WebElement siteCreate;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div/div/div[1]/input")
	@CacheLookup
	WebElement siteCode;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/input[1]")
	@CacheLookup
	WebElement siteName;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div/div/div[3]/input")
	@CacheLookup
	WebElement siteContactName;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div/div/div[4]/input")
	@CacheLookup
	WebElement siteContactEmail;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div/div/div[6]/input")
	@CacheLookup
	WebElement noOfSubject;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div/div/div[7]/input")
	@CacheLookup
	WebElement studyNotes;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div/div/div[8]/div/div/input")
	@CacheLookup
	WebElement active;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div/div/div[9]/button[1]")
	@CacheLookup
	WebElement clear;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div/div/div[9]/button[2]")
	@CacheLookup
	WebElement save;
	
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[1]")
	@CacheLookup
	List<WebElement> SiteCode;
	
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[2]")
	@CacheLookup
	List<WebElement> tableSiteName;
	
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[3]")
	@CacheLookup
	List<WebElement> tableStatus;
	
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[8]//i")
	@CacheLookup
	List<WebElement> tablesiteEdit;
	
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[9]//i")
	@CacheLookup
	List<WebElement> tableAction;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/img[1]")
	@CacheLookup
	WebElement Open;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/img[1]")
	@CacheLookup
	WebElement Complete;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[1]/div[3]/img[1]")
	@CacheLookup
	WebElement Terminate;
	
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[10]//i")
	@CacheLookup
	List<WebElement> tableAuditTrail;
	
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[11]//i")
	@CacheLookup
	List<WebElement> tableDelete;
	
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[12]//i")
	@CacheLookup
	List<WebElement> tableDocument;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/input")
	@CacheLookup
	WebElement siteCodeSearch;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/input")
	@CacheLookup
	WebElement siteNameSearch;
	
	@FindBy(xpath="//label[contains(text(),'Status')]//following-sibling::select")
	@CacheLookup
	WebElement siteStatusSearch;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/span")
	@CacheLookup
	WebElement siteSearch;
	
	@FindBy(xpath="(//li[@class='PaginationControl'])[3]")
	@CacheLookup
	WebElement next;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div/div/div[1]/span")
	@CacheLookup
	WebElement studyCodeError;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div/div/div[4]/span")
	@CacheLookup
	WebElement emailIdError;
	
	public String siteCodeErrorMsg()
	{
		elementWait(studyCodeError);
		return studyCodeError.getText();
	}
	public String emaileErrorMsg()
	{
		elementWait(emailIdError);
		return emailIdError.getText();
	}
	
	public void clickCreateSite() throws InterruptedException
	{
		Thread.sleep(3000);
		siteCreate.click();
		Thread.sleep(3000);
	}
	
	public void duplicateSite(String sitecode) throws InterruptedException
	{
		Thread.sleep(3000);
		siteCode.sendKeys(sitecode);
		Thread.sleep(3000);
	}
	
	public void invalidEmail(String email) throws InterruptedException
	{
		Thread.sleep(3000);
		siteContactEmail.sendKeys(email);
		Thread.sleep(3000);
	}
	
	public void clickSave() throws InterruptedException
	{
		Thread.sleep(3000);
		save.click();
		Thread.sleep(3000);
	}
	
	public void clickSite() throws InterruptedException
	{
		Thread.sleep(3000);
		site.click();
		Thread.sleep(3000);
	}
	
	public void createSite(String sitecode,String sitename,String sitecontactename,String sitecontactemail,String noofsubject,String studynotes) throws InterruptedException
	{
		Thread.sleep(2000);
		siteCreate.click();
		Thread.sleep(2000);
		siteCode.sendKeys(sitecode);
		Thread.sleep(2000);
		siteName.sendKeys(sitename);
		Thread.sleep(2000);
		siteContactName.sendKeys(sitecontactename);
		Thread.sleep(2000);
		siteContactEmail.sendKeys(sitecontactemail);
		Thread.sleep(2000);
		noOfSubject.sendKeys(noofsubject);
		Thread.sleep(2000);
		studyNotes.sendKeys(studynotes);
		Thread.sleep(2000);
		save.click();
		Thread.sleep(2000);
	}
	
	public boolean verifySite(String sitecode) throws InterruptedException 
	{
		Thread.sleep(2000);
		boolean site=false;
		int count = SiteCode.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  SiteCode.get(i).getText();
			if(text.contains(sitecode))
			{
				site=true;
				break;
			}
		}
		return site;
	}
	
	public static boolean duplicateAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Site code already exists"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public void editSiteIcon(String sitecode) throws InterruptedException
	{
		for(int i=0;i<SiteCode.size();i++)
		{
			String text=SiteCode.get(i).getText();
			if(text.equals(sitecode))
			{
				tablesiteEdit.get(i).click();
				Thread.sleep(3000);
				break;	
			}
		}
	}
	
	public void editSite(String newSiteName) throws InterruptedException
	{
		Thread.sleep(6000);
		siteName.clear();
		Thread.sleep(6000);
		siteName.sendKeys(newSiteName);
		Thread.sleep(2000);
		save.click();	
		Thread.sleep(2000);
	}
	
	public void auditTrail(String sid) throws InterruptedException
	{
		Thread.sleep(4000);
		int count=SiteCode.size();
		for(int i=0;i<count;i++)
		{
			String studylist=SiteCode.get(i).getText();
			if(studylist.contains(sid))
			{
				Thread.sleep(4000);
				tableAuditTrail.get(i).click();
				Thread.sleep(2000);
				WebElement e = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div/table/tbody/tr[1]/td[1]/span/strong"));
				String actualText=e.getText();
				String expText="Neethu P S";
				
				if(actualText.equals(expText))
				{
					Assert.assertTrue(true);
					driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[4]/div/div[1]/div/i")).click();
				}
				else
				{
					Assert.assertTrue(false);
				}
		      
				
				break;
			}
		}
	}
	
	public static boolean siteAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Site saved successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean editAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Site updated successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public void delSiteIcon(String sid) throws InterruptedException
	{
		Thread.sleep(1000);
		int count=SiteCode.size();
		for(int i=0;i<count;i++)
		{
			String studylist=SiteCode.get(i).getText();
			System.out.println(studylist+i);
			if(studylist.contains(sid))
			{
				System.out.println(tableDelete.get(i));
				tableDelete.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	public static boolean deleteAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this site?"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean deleteSiteWithPatientsAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this site?"));
			alert1.accept();
			Thread.sleep(2000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("This site contains 1 or more patients, sites with patients cannot be deleted"));
			alert2.accept();
			Thread.sleep(2000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("Deleted successfully."));
			alert.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public void searchSiteCode(String sitecodesearch) throws InterruptedException
	{
		Thread.sleep(2000);
		siteCodeSearch.sendKeys(sitecodesearch);
		Thread.sleep(2000);
	}
	
	public void searchSiteName(String sitenamesearch) throws InterruptedException
	{
		Thread.sleep(2000);
		siteNameSearch.sendKeys(sitenamesearch);
		Thread.sleep(2000);
	}
	public void searchSiteStatus(String sitestatus) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(siteStatusSearch);
		sel.selectByVisibleText(sitestatus);
		Thread.sleep(2000);
	}
	public void siteSearch() throws InterruptedException
	{
		Thread.sleep(2000);
		siteSearch.click();
		Thread.sleep(2000);
	}
	public Boolean siteCodeSearchValidation(String sitecode) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =SiteCode.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<SiteCode.size();i++)
			{
				String scode=SiteCode.get(i).getText();
				if (!(scode.contains(sitecode))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	public Boolean siteNameSearchValidation(String sitename) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableSiteName.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableSiteName.size();i++)
			{
				String scode=tableSiteName.get(i).getText();
				if (!(scode.contains(sitename))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	public Boolean siteStatusSearchValidation(String sitestat) throws InterruptedException
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
				if (!(scode.contains(sitestat))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	public void siteActionOpen(String sid) throws InterruptedException
	{
		Thread.sleep(1000);
		int count=SiteCode.size();
		for(int i=0;i<count;i++)
		{
			String sitelist=SiteCode.get(i).getText();
			if(sitelist.contains(sid))
			{
				tableAction.get(i).click();
				Thread.sleep(3000);
				Open.click();
				Thread.sleep(2000);
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
				wait1.until(ExpectedConditions.alertIsPresent());
				Alert alert1 = driver.switchTo().alert();
				Assert.assertTrue(alert1.getText().contains("Are you sure you want to open this site?"));
				alert1.accept();
				break;
			}
		}
	}
	public void siteActionTerminate(String sid) throws InterruptedException
	{
		Thread.sleep(1000);
		int count=SiteCode.size();
		for(int i=0;i<count;i++)
		{
			String sitelist=SiteCode.get(i).getText();
			if(sitelist.contains(sid))
			{
				tableAction.get(i).click();
				Thread.sleep(3000);
				Terminate.click();
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
				wait1.until(ExpectedConditions.alertIsPresent());
				Alert alert1 = driver.switchTo().alert();
				Assert.assertTrue(alert1.getText().contains("Are you sure you want to terminate this site?"));
				alert1.accept();
				break;
			}
		}
	}
	
	public void siteActionComplete(String sid) throws InterruptedException
	{
		Thread.sleep(1000);
		int count=SiteCode.size();
		for(int i=0;i<count;i++)
		{
			String sitelist=SiteCode.get(i).getText();
			if(sitelist.contains(sid))
			{
				tableAction.get(i).click();
				Thread.sleep(3000);
				Complete.click();
				Thread.sleep(2000);
				WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
				wait1.until(ExpectedConditions.alertIsPresent());
				Alert alert1 = driver.switchTo().alert();
				Assert.assertTrue(alert1.getText().contains("Are you sure you want to complete this site?"));
				alert1.accept();
				Thread.sleep(2000);
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
				wait.until(ExpectedConditions.alertIsPresent());
				Alert alert = driver.switchTo().alert();
				Assert.assertTrue(alert.getText().contains("Site completed successfully."));
				alert.accept();
				
				
				break;
			}
		}
	}
}
