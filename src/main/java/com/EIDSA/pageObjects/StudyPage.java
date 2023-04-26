package com.EIDSA.pageObjects;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.interactions.Actions;
import com.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;

public class StudyPage extends AbstractComponent{
	
	static WebDriver driver;
	public StudyPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//ul[@id='administrationmenu']/li/a/span")
	@CacheLookup
	WebElement Study;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/img[1]")
	@CacheLookup
	WebElement createStudy;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement studyID;

	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/input[1]")
	@CacheLookup
	WebElement studyName;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement sponsor;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]/input[1]")
	@CacheLookup
	WebElement studyNotes;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[6]/input[1]")
	@CacheLookup
	WebElement preVisit;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[7]/input[1]")
	@CacheLookup
	WebElement postVisit;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[8]/input[1]")
	@CacheLookup
	WebElement numberOfSites;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[9]/input[1]")
	@CacheLookup
	WebElement numberOfSubject;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[10]/input[1]")
	@CacheLookup
	WebElement duration;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[11]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement active;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement save;
	
	@FindBy(xpath="//button[contains(text(),'Clear')]")
	@CacheLookup
	WebElement clickClear;
	
	@FindBy(xpath="//tbody/tr[1]/td[11]/i[1]")
	@CacheLookup
	WebElement clickEdit;
	
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[1]")
	@CacheLookup
	List<WebElement> studyid;

	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[2]")
	@CacheLookup
	List<WebElement> studynames;
	
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[9]//i")
	@CacheLookup
	List<WebElement> visiticon;
	
	@FindBy(xpath="//td[1]")
	@CacheLookup
	List<WebElement> ids;
	
	
	@FindBy(xpath="//td[2]")
	@CacheLookup
	List<WebElement> names;
	
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[11]/i")
	@CacheLookup
	List<WebElement> studyEdit;
	
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[13]/i")
	@CacheLookup
	List<WebElement> studyDelete;
	
	@FindBy(xpath="//table[contains(@class,'dataTables')]//td[12]/i")
	@CacheLookup
	List<WebElement> audit;
	
	
	@FindBy(xpath="//label[contains(text(),'ID')]//following-sibling::span[@class='errormsg']")
	@CacheLookup
	WebElement studyIdErr;
	
	@FindBy(xpath="//label[contains(text(),'Name')]//following-sibling::span[@class='errormsg']")
	@CacheLookup
	WebElement studyNameErr;
	
	@FindBy(xpath="//label[contains(text(),'ID')]//following-sibling::input[1]")
	@CacheLookup
	WebElement studyidsearch;
	
	@FindBy(xpath="//label[contains(text(),'Status')]//following-sibling::select")
	@CacheLookup
	WebElement studystatusSearch;
	
	@FindBy(xpath="//span[@type='button']")
	@CacheLookup
	WebElement studySearch;
	
	@FindBy(xpath="//td[3]")
	@CacheLookup
	List<WebElement> studyStatus;

	@FindBy(xpath="///tbody/tr[1]/td[14]/i[1]")
	@CacheLookup
	List<WebElement> document;
	
	@FindBy(xpath="(//li[@class='PaginationControl'])[3]")
	@CacheLookup
	WebElement next;
	
	public void clickCreateSudy() throws InterruptedException
	{
		createStudy.click();
	}
	
	public void clickSave() throws InterruptedException
	{
		save.click();
	}
	
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
	}
	
	public void createStudy(String studId,String studName,String postvisit,String Sponsor,String StudyNotes,String PreVisit,String NumberOfSites,String NumberOfSubject) throws InterruptedException
	{
		
		Thread.sleep(3000);
		createStudy.click();
		studyID.sendKeys(studId);
		studyName.sendKeys(studName);
		sponsor.sendKeys(Sponsor);
		postVisit.sendKeys(postvisit);
		studyNotes.sendKeys(StudyNotes);
		save.click();
		preVisit.sendKeys(PreVisit);
		numberOfSites.sendKeys(NumberOfSites);
		numberOfSubject.sendKeys(NumberOfSubject);
	}

	
	public boolean verifyStudy(String studId) throws InterruptedException 
	{
		Thread.sleep(2000);
		boolean study=false;
		int count = studyid.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  studyid.get(i).getText();
			if(text.contains(studId))
			{
				study=true;
				break;
			}
		}
		return study;
	}
	
	public String studyIdErrorMsg()
	{
		elementWait(studyIdErr);
		return studyIdErr.getText();
	}
	public String studyNameErrorMsg()
	{
		elementWait(studyNameErr);
		return studyNameErr.getText();
	}
	public static boolean duplicateAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Study ID already exists."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public void visitIcon(String studId)
	{

		int count = studyid.size();
		for(int i=0;i<count;i++)
		{

			String text =  studyid.get(i).getText();
			if(text.contains(studId))
			{
				visiticon.get(i).click();
				break;
			}
		}
	}
	
	public void editStudyIcon(String nstudyid) throws InterruptedException
	{
		for(int i=0;i<studyid.size();i++)
		{
			String text=studyid.get(i).getText();
			if(text.equals(nstudyid))
			{
				studyEdit.get(i).click();
				break;	
			}
		}
	}
	
	public void auditTrail(String sid) throws InterruptedException
	{
		Thread.sleep(1000);
		int count=studyid.size();
		for(int i=0;i<count;i++)
		{
			String studylist=studyid.get(i).getText();
			if(studylist.contains(sid))
			{
				audit.get(i).click();
				WebElement e = driver.findElement(By.xpath("//strong[contains(text(),'neethumolp@datamatica.uk')]"));
				String actualText=e.getText();
				String expText="neethumolp@datamatica.uk";
				
				if(actualText.equals(expText))
				{
					Assert.assertTrue(true);
					driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/i[1]")).click();
				}
				else
				{
					Assert.assertTrue(false);
				}
		      
				
				break;
			}
		}
	}
	
	public void editStudy(String newStudyId) throws InterruptedException
	{
		Thread.sleep(2000);
		studyID.clear();
		studyID.sendKeys(newStudyId);
		save.click();	
	}
	
	public static boolean studyAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Study created successfully."));
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
			Assert.assertTrue(alert1.getText().contains("Study updated successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public void delStudyIcon(String sid) throws InterruptedException
	{
		Thread.sleep(1000);
		int count=studyid.size();
		for(int i=0;i<count;i++)
		{
			String studylist=studyid.get(i).getText();
			System.out.println(studylist+i);
			if(studylist.contains(sid))
			{
				System.out.println(studyDelete.get(i));
				studyDelete.get(i).click();
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
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this study?"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}

	public void searchStudyId(String studysearch) throws InterruptedException
	{
		Thread.sleep(2000);
		studyidsearch.sendKeys(studysearch);
	}
	public void searchStudyStatus(String studystatus)
	{
		Select sel=new Select(studystatusSearch);
		sel.selectByVisibleText(studystatus);
	}
	public void studySearch()
	{
		studySearch.click();
	}
	public Boolean studySearchValidation(String search) throws InterruptedException
	{
		Thread.sleep(3000);
		Boolean present=true;
		int count=ids.size();
		if(count<1)
		{ 
			present=false;
		}
		else
		{
			for(int i=0;i<ids.size();i++)
			{
				String name=names.get(i).getText();
				String id=ids.get(i).getText();
				//System.out.println(id);
				if (!(id.contains(search)||(name.contains(search)))) 
				{
					System.out.println(id);
					present = false;
					break;
				}
			}
			if((present==true)&&(next.isDisplayed()))
			{
				next.click();
			}
		}
		return present;
	}
	public Boolean studyStatusValidation(String status) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =studyStatus.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<studyStatus.size();i++)
			{
				String stat=studyStatus.get(i).getText();
				if (!(stat.contains(status))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	
}
