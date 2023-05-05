package com.EIDSA.pageObjects;

import java.time.Duration;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;
import org.openqa.selenium.InvalidArgumentException;
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
	
	@FindBy(xpath="//td[9]")
	@CacheLookup
	List<WebElement> visit;
	
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

	@FindBy(xpath="//td[14]")
	@CacheLookup
	List<WebElement> document;
	
	@FindBy(xpath="(//li[@class='PaginationControl'])[3]")
	@CacheLookup
	WebElement next;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div/div[1]/div/div[1]/div/img")
	@CacheLookup
	WebElement AddFolder;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div/input")
	@CacheLookup
	WebElement FolderName;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div/span/button")
	@CacheLookup
	WebElement FolderAdd;
	
	@FindBy(xpath="//label[contains(text(),'01')]")
	@CacheLookup
	WebElement clickOnFolder;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/a[1]/img[1]")
	@CacheLookup
	WebElement edit;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement edit1;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/a[2]/img[1]")
	@CacheLookup
	WebElement delete;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/img[1]")
	@CacheLookup
	WebElement upload;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/a[1]/img[1]")
	@CacheLookup
	WebElement saveFolderDetails;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/a[2]/img[1]")
	@CacheLookup
	WebElement cancel;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[4]/div/div[2]/div[1]/textarea")
	@CacheLookup
	WebElement description;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]")
	@CacheLookup
	WebElement appr1;
	
	@FindBy(xpath="//span[contains(text(),'Neethu P S')]")
	@CacheLookup
	WebElement appr2;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]/span[2]")
	@CacheLookup
	WebElement appr3;
	
	@FindBy(xpath="//input[@id='InPutFile']")
	@CacheLookup
	WebElement chooseFile;
	
	@FindBy(xpath="//button[contains(text(),'Add')]")
	@CacheLookup
	WebElement AddFile;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement searchDocumentName;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]")
	@CacheLookup
	WebElement searchCreatedDate;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement searchUploadedBy;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/input[1]")
	@CacheLookup
	WebElement Search1;
	
	@FindBy(xpath="//td[1]")
	@CacheLookup
	List<WebElement> tableFolder;
	
	@FindBy(xpath="//td[2]")
	@CacheLookup
	List<WebElement> tableDocument;
	
	@FindBy(xpath="//td[3]")
	@CacheLookup
	List<WebElement> tableCreatedBy;
	
	@FindBy(xpath="//td[4]")
	@CacheLookup
	List<WebElement> tableCreatedDate;
	
	@FindBy(xpath="//td[5]")
	@CacheLookup
	List<WebElement> tableEdit;
	
	@FindBy(xpath="//td[6]")
	@CacheLookup
	List<WebElement> tableDelete;
	
	@FindBy(xpath="//td[7]")
	@CacheLookup
	List<WebElement> tableView;
	
	@FindBy(xpath="//td[8]")
	@CacheLookup
	List<WebElement> tableApprovals;
	
	@FindBy(xpath="//td[9]")
	@CacheLookup
	List<WebElement> tableDownloads;
	
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
		Thread.sleep(3000);
	}
	
	public void createStudy(String studId,String studName,String postvisit,String Sponsor,String StudyNotes,String PreVisit,String NumberOfSites,String NumberOfSubject) throws InterruptedException
	{
		
		Thread.sleep(3000);
		createStudy.click();
		Thread.sleep(3000);
		studyID.sendKeys(studId);
		Thread.sleep(3000);
		studyName.sendKeys(studName);
		Thread.sleep(3000);
		sponsor.sendKeys(Sponsor);
		Thread.sleep(3000);
		postVisit.sendKeys(postvisit);
		Thread.sleep(3000);
		studyNotes.sendKeys(StudyNotes);
		Thread.sleep(3000);
		preVisit.sendKeys(PreVisit);
		Thread.sleep(3000);
		numberOfSites.sendKeys(NumberOfSites);
		Thread.sleep(3000);
		numberOfSubject.sendKeys(NumberOfSubject);
		Thread.sleep(3000);
		save.click();
		Thread.sleep(3000);
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
	
	public void visitIcon(String studId) throws InterruptedException
	{

		int count = studyid.size();
		for(int i=0;i<count;i++)
		{

			String text =  studyid.get(i).getText();
			if(text.contains(studId))
			{
				visiticon.get(i).click();
				Thread.sleep(3000);
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
				Thread.sleep(3000);
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
				Thread.sleep(3000);
				WebElement e = driver.findElement(By.xpath("//strong[contains(text(),'Neethu P S')]"));
				String actualText=e.getText();
				String expText="Neethu P S";
				
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
		Thread.sleep(2000);
	}
	public void searchStudyStatus(String studystatus) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(studystatusSearch);
		sel.selectByVisibleText(studystatus);
		Thread.sleep(2000);
	}
	public void studySearch() throws InterruptedException
	{
		Thread.sleep(2000);
		studySearch.click();
		Thread.sleep(2000);
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
	
	public static boolean folderAlert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Folder created successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean folderAlert2() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Folder updated successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean documentAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Document created successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean documentAlert2() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Document updated successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean documentAlert3() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this document?"));
			alert1.accept();
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("Document deleted successfully"));
			alert.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean folderAlert3() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this folder?"));
			alert1.accept();
			Thread.sleep(3000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("Folder deleted successfully"));
			alert.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public void DocumentNameSearch(String name) throws InterruptedException
	{
		Thread.sleep(2000);
		searchDocumentName.sendKeys(name);
		Thread.sleep(2000);
		Search1.click();
		Thread.sleep(4000);
	}
	
	public Boolean DocumentNameSearchValidation(String nm) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableDocument.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableDocument.size();i++)
			{
				String stat=tableDocument.get(i).getText();
				if (!(stat.contains(nm))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}

	
	public void DocumentDateSearch(String dt) throws InterruptedException
	{
		Thread.sleep(2000);
		searchCreatedDate.sendKeys(dt);
		Thread.sleep(2000);
		Search1.click();
		Thread.sleep(4000);
	}
	
	public Boolean DateSearchValidation(String nm) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableCreatedDate.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableCreatedDate.size();i++)
			{
				String stat=tableCreatedDate.get(i).getText();
				if (!(stat.contains(nm))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public void UploadedBySearch(String dt) throws InterruptedException
	{
		Thread.sleep(2000);
		searchUploadedBy.sendKeys(dt);
		Thread.sleep(2000);
		Search1.click();
		Thread.sleep(4000);
	}
	
	public Boolean UploadedBySearchValidation(String nm) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableCreatedBy.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableCreatedBy.size();i++)
			{
				String stat=tableCreatedBy.get(i).getText();
				if (!(stat.contains(nm))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public void edit(String name)
	{
		for(int i=0;i<tableDocument.size();i++)
		{
			String text=tableDocument.get(i).getText();
			if(text.equals(name))
			{
				tableEdit.get(i).click();
				break;
			}
		}
	}
	
	public void edit1() throws InterruptedException
	{
		Thread.sleep(3000);
		AddFile.click();
		Thread.sleep(3000);
	}
	
	public void delete(String name)
	{
		for(int i=0;i<tableDocument.size();i++)
		{
			String text=tableDocument.get(i).getText();
			if(text.equals(name))
			{
				tableDelete.get(i).click();
				break;
			}
		}
	}
	
	public void View(String name)
	{
		for(int i=0;i<tableDocument.size();i++)
		{
			String text=tableDocument.get(i).getText();
			if(text.equals(name))
			{
				tableView.get(i).click();
				break;
			}
		}
	}
	
	public void Approvals(String name) throws InterruptedException
	{
		for(int i=0;i<tableDocument.size();i++)
		{
			String text=tableDocument.get(i).getText();
			if(text.equals(name))
			{
				tableApprovals.get(i).click();
				Thread.sleep(3000);
				appr1.click();
				Thread.sleep(3000);
				appr2.click();
				Thread.sleep(3000);
				appr3.click();
				break;
			}
		}
	}
	//Approver added successfully
	public void Download(String name)
	{
		for(int i=0;i<tableDocument.size();i++)
		{
			String text=tableDocument.get(i).getText();
			if(text.equals(name))
			{
				tableDownloads.get(i).click();
				break;
			}
		}
	}
	
	public void FolderCreation1(String studysearch) throws InterruptedException
	{
		Thread.sleep(2000);
		studyidsearch.sendKeys(studysearch);
		Thread.sleep(2000);
		studySearch.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[14]/i[1]")).click();
		Thread.sleep(2000);
		
	}
	
	public void FolderCreation2(String id) throws InterruptedException
	{
		for(int i=0;i<studyid.size();i++)
		{
			String text=studyid.get(i).getText();
			if(text.equals(id))
			{
				document.get(i).click();
				Thread.sleep(3000);
				break;	
			}
		}
	}
	
	public void Folder3() throws InterruptedException
	{
		Thread.sleep(2000);	
		AddFolder.click();
		FolderName.sendKeys("01");
		Thread.sleep(2000);	
		FolderAdd.click();
		Thread.sleep(2000);
		folderAlert1();
		Thread.sleep(4000);
		clickOnFolder.click();
		Thread.sleep(4000);
		edit.click();
		Thread.sleep(4000);
		edit1.clear();
		Thread.sleep(3000);
		edit1.sendKeys("02");
		Thread.sleep(3000);
		saveFolderDetails.click();
		Thread.sleep(3000);
		folderAlert2();
		Thread.sleep(4000);
		delete.click();
		Thread.sleep(3000);
		folderAlert3();		
	}
	
	public void Document1() throws InterruptedException, AWTException
	{
		Thread.sleep(2000);	
		AddFolder.click();
		FolderName.sendKeys("01");
		Thread.sleep(2000);	
		FolderAdd.click();
		Thread.sleep(2000);
		folderAlert1();
		Thread.sleep(4000);
		clickOnFolder.click();
		Thread.sleep(4000);
		//upload.click();
		Thread.sleep(4000);
		WebElement uploadicon=driver.findElement(By.xpath("//img[@alt='upload document']"));
	    uploadicon.click();
		Thread.sleep(3000);
		WebElement uploadbtn=driver.findElement(By.xpath("//input[@type='file']"));
		uploadbtn.sendKeys("C:\\Users\\lenovo\\Downloads\\EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		AddFile.click();
	    Thread.sleep(4000);
		/*Robot robot = new Robot();
		StringSelection filepath = new StringSelection("C:\\Users\\lenovo\\Downloads\\EIDSA_STUDY_EIDSA_20230505022527_002.xlsx"); 
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filepath, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(10000);*/
		documentAlert();
	}
}
