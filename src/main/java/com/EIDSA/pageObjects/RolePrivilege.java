package com.EIDSA.pageObjects;

import java.time.Duration;

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

public class RolePrivilege extends AbstractComponent{
	static WebDriver driver;
	public RolePrivilege(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@id=\"administrationmenu\"]/li[4]/a/span")
	@CacheLookup
	WebElement rolePrivilege;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/select")
	@CacheLookup
	WebElement ClickRole;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/select")
	@CacheLookup
	WebElement SelectRole;
	
	@FindBy(xpath="//input[@id='selectall']")
	@CacheLookup
	WebElement Screens;
	
	@FindBy(xpath="//input[@id='ba37885a-e7ad-4e97-b717-c8146c9e637a']")
	@CacheLookup
	WebElement Dashboard1;
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/label[1]/input[1]")
	@CacheLookup
	WebElement MainDashboard;
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/label[2]/input[1]")
	@CacheLookup
	WebElement StudySummary;
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/label[3]/input[1]")
	@CacheLookup
	WebElement SiteSummary;
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/label[4]/input[1]")
	@CacheLookup
	WebElement VisitSummary;
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/label[5]/input[1]")
	@CacheLookup
	WebElement GeneralQuery;
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/label[6]/input[1]")
	@CacheLookup
	WebElement NurseSummary;
	
	@FindBy(xpath="//tbody/tr[1]/td[3]/label[7]/input[1]")
	@CacheLookup
	WebElement NurseDiary;
	
	@FindBy(xpath="//input[@id='1cab7670-5a76-49a9-98e4-8f1a6acb509c']")
	@CacheLookup
	WebElement Study;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[1]/input[1]")
	@CacheLookup
	WebElement Site;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[2]/input[1]")
	@CacheLookup
	WebElement Subject;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[3]/input[1]")
	@CacheLookup
	WebElement PatientLogin;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[4]/input[1]")
	@CacheLookup
	WebElement Visit;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[5]/input[1]")
	@CacheLookup
	WebElement VisitTemplate;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[6]/input[1]")
	@CacheLookup
	WebElement Forms;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[7]/input[1]")
	@CacheLookup
	WebElement Query;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[8]/input[1]")
	@CacheLookup
	WebElement AssignForm;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[9]/input[1]")
	@CacheLookup
	WebElement Reports;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[10]/input[1]")
	@CacheLookup
	WebElement SubmitForm;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[11]/input[1]")
	@CacheLookup
	WebElement SubjectSchedule;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[12]/input[1]")
	@CacheLookup
	WebElement Users1;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[13]/input[1]")
	@CacheLookup
	WebElement UnscheduledVisit;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[14]/input[1]")
	@CacheLookup
	WebElement FormSummary1;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[15]/input[1]")
	@CacheLookup
	WebElement DMS1;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[16]/input[1]")
	@CacheLookup
	WebElement DocumentSummaryApprove;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[17]/input[1]")
	@CacheLookup
	WebElement DocumentPatientApprove;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[18]/input[1]")
	@CacheLookup
	WebElement FolderApprove;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[19]/input[1]")
	@CacheLookup
	WebElement DMSApprove;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[20]/input[1]")
	@CacheLookup
	WebElement FolderStudyApprove;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[21]/input[1]")
	@CacheLookup
	WebElement SUbjectAuditTrails;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[22]/input[1]")
	@CacheLookup
	WebElement SiteAuditTrails;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[23]/input[1]")
	@CacheLookup
	WebElement DMSSummaryReport;
	
	@FindBy(xpath="//input[@id='32c27946-ceb0-48cf-ab70-e47c9f78ce36']")
	@CacheLookup
	WebElement MainMenu;
	
	@FindBy(xpath="//tbody/tr[3]/td[3]/label[1]/input[1]")
	@CacheLookup
	WebElement Study3;
	
	@FindBy(xpath="//tbody/tr[3]/td[3]/label[2]/input[1]")
	@CacheLookup
	WebElement Dashboard3;
	
	@FindBy(xpath="//tbody/tr[3]/td[3]/label[3]/input[1]")
	@CacheLookup
	WebElement Administration;
	
	@FindBy(xpath="//tbody/tr[3]/td[3]/label[4]/input[1]")
	@CacheLookup
	WebElement StudyTemplate3;
	
	@FindBy(xpath="//tbody/tr[3]/td[3]/label[5]/input[1]")
	@CacheLookup
	WebElement DataEntry;
	
	@FindBy(xpath="//tbody/tr[3]/td[3]/label[6]/input[1]")
	@CacheLookup
	WebElement Templates;
	
	@FindBy(xpath="//tbody/tr[3]/td[3]/label[7]/input[1]")
	@CacheLookup
	WebElement Settings;
	
	@FindBy(xpath="//tbody/tr[3]/td[3]/label[8]/input[1]")
	@CacheLookup
	WebElement IOT;
	
	@FindBy(xpath="//tbody/tr[3]/td[3]/label[9]/input[1]")
	@CacheLookup
	WebElement DigitalForms;
	
	@FindBy(xpath="//input[@id='73e0d253-0079-41fb-bbe6-d9860f6835a4']")
	@CacheLookup
	WebElement Administration4;
	
	@FindBy(xpath="//tbody/tr[4]/td[3]/label[1]/input[1]")
	@CacheLookup
	WebElement Study4;
	
	@FindBy(xpath="//tbody/tr[4]/td[3]/label[2]/input[1]")
	@CacheLookup
	WebElement Users4;
	
	@FindBy(xpath="//tbody/tr[4]/td[3]/label[3]/input[1]")
	@CacheLookup
	WebElement Roles;
	
	@FindBy(xpath="//tbody/tr[4]/td[3]/label[4]/input[1]")
	@CacheLookup
	WebElement RolePrivilege4;
	
	@FindBy(xpath="//tbody/tr[4]/td[3]/label[5]/input[1]")
	@CacheLookup
	WebElement Screen;
	
	@FindBy(xpath="//tbody/tr[4]/td[3]/label[6]/input[1]")
	@CacheLookup
	WebElement SitePrivilege4;
	
	@FindBy(xpath="//tbody/tr[4]/td[3]/label[7/input[1]")
	@CacheLookup
	WebElement StudyAuditTrails;
	
	@FindBy(xpath="//tbody/tr[4]/td[3]/label[8]/input[1]")
	@CacheLookup
	WebElement FiledPrivilege;
	
	@FindBy(xpath="//tbody/tr[2]/td[3]/label[12]/input[1]")
	@CacheLookup
	WebElement Users;
	
	@FindBy(xpath="//span[contains(text(),'Role Privileges')]")
	@CacheLookup
	WebElement RolePrivilege;

	@FindBy(xpath="//input[@id='ba37885a-e7ad-4e97-b717-c8146c9e637a']")
	@CacheLookup
	WebElement Dashboard;
	
	@FindBy(xpath="//input[@id='57d8a311-85d7-4d2d-aff5-c02b04b80521']")
	@CacheLookup
	WebElement FormSummary;
	
	@FindBy(xpath="//input[@id='93768ed7-c863-40d1-9626-4e0243f62b31']")
	@CacheLookup
	WebElement DMS;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement Save;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/span]")
	@CacheLookup
	WebElement err;
	
	public void ClickRolePrivilege()
	{
		RolePrivilege.click();
	}
	
	public void ClickDashboard()
	{
		Dashboard.click();
	}
	
	public void ClickFormSummary()
	{
		FormSummary.click();
	}
	
	public void ClickDMS()
	{
		DMS.click();
	}
	
	public void ClickSave()
	{
		Save.click();
	}
	
	public void selectRole()
	{
		Select os = new Select(SelectRole);
		os.selectByVisibleText("Test10");
	}
	
	public void clickScreen()
	{
		Screens.click();
	}
	
	public void clickSave()
	{
		Save.click();
	}
	
	public void clickRole()
	{
		ClickRole.click();
	}
	
	public void err()
	{
		ClickRole.click();
	}
	
	public String errMsg()
	{
		elementWait(err);
		return err.getText();
	}	
	
	public void clickRolePrivilege() throws InterruptedException
	{
		
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		elementWait(rolePrivilege);
		rolePrivilege.click();
		Thread.sleep(3000);
	}
	
	public void setRolePrivilege(String role) throws InterruptedException
	{
		Thread.sleep(3000);
		Select sel=new Select(ClickRole);
		sel.selectByVisibleText(role);
		Thread.sleep(5000);
		Screen.click();
		Thread.sleep(4000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		elementWait(Save);
		Save.click();
		Thread.sleep(8000);
	}
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Role screen privilege saved successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void negative() throws InterruptedException
	{		
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		elementWait(Save);
		Save.click();
		Thread.sleep(8000);
	}
	
}
