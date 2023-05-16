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

public class UserPage extends AbstractComponent{
	
	static WebDriver driver;
	public UserPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[7]/ul[1]/li[2]/a[1]/span[1]")
	@CacheLookup
	WebElement User;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/img[1]")
	@CacheLookup
	WebElement AddUser;

	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement FirstName;

	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/input[1]")
	@CacheLookup
	WebElement LastName;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/input[1]")
	@CacheLookup
	WebElement PrimaryEmail;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[4]/input[1]")
	@CacheLookup
	WebElement SecondaryEmail;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[5]/select[1]")
	@CacheLookup
	WebElement UserType;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[6]/select[1]")
	@CacheLookup
	WebElement Role;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[7]/select[1]")
	@CacheLookup
	WebElement Country;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[8]/div[1]/input[1]")
	@CacheLookup
	WebElement DOB;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[9]/div[1]/input[1]")
	@CacheLookup
	WebElement PhoneNumber;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[10]/div[1]/input[1]")
	@CacheLookup
	WebElement Address1;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[11]/div[1]/input[1]")
	@CacheLookup
	WebElement Address2;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[12]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement Active;
	
	@FindBy(xpath="//label[contains(text(),'Lock')]")
	@CacheLookup
	WebElement Lock;
	
	@FindBy(xpath="//button[contains(text(),'Clear')]")
	@CacheLookup
	WebElement Clear;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement Save;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/div/input")
	@CacheLookup
	WebElement emailOrName;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/div/select")
	@CacheLookup
	WebElement searchRole;
	
	@FindBy(xpath="//button[contains(text(),'Set privilege')]")
	@CacheLookup
	WebElement SetPrivilege;
	
	@FindBy(xpath="//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement search;
	
	@FindBy(xpath="//td[1]")
	@CacheLookup
	List<WebElement> TableName;
	
	@FindBy(xpath="//td[8]")
	@CacheLookup
	List<WebElement> TablePrivilege;
	
	@FindBy(xpath="//td[2]")
	@CacheLookup
	List<WebElement> TableEmail;
	
	@FindBy(xpath="//td[3]")
	@CacheLookup
	List<WebElement> TableRole;
	
	@FindBy(xpath="//td[8]")
	@CacheLookup
	List<WebElement> TableUserPrivilege;
	
	@FindBy(xpath="//td[9]")
	@CacheLookup
	List<WebElement> TableEdit;
	
	@FindBy(xpath="//td[10]")
	@CacheLookup
	List<WebElement> TableAuditTrail;
	
	@FindBy(xpath="//td[11]")
	@CacheLookup
	List<WebElement> TableDelete;
	
	public void clickUser() throws InterruptedException
	{
		
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		elementWait(User);
		User.click();
		Thread.sleep(3000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
	}
	
	public void edit(String email) throws InterruptedException
	{
		for(int i=0;i<TableEmail.size();i++)
		{
			String text=TableEmail.get(i).getText();
			if(text.equals(email))
			{
				TableEdit.get(i).click();
				Thread.sleep(3000);
				break;	
			}
		}
	}
	
	public void privilege(String email) throws InterruptedException
	{
		for(int i=0;i<TableEmail.size();i++)
		{
			String text=TableEmail.get(i).getText();
			if(text.equals(email))
			{
				TablePrivilege.get(i).click();
				Thread.sleep(2000);
				SetPrivilege.click();
				Thread.sleep(2000);
				break;	
			}
		}
	}
	
	public void delete(String email) throws InterruptedException
	{
		for(int i=0;i<TableEmail.size();i++)
		{
			String text=TableEmail.get(i).getText();
			if(text.equals(email))
			{
				TableDelete.get(i).click();
				Thread.sleep(3000);
				break;	
			}
		}
	}
	
	public void auditTrail(String email) throws InterruptedException
	{
		for(int i=0;i<TableEmail.size();i++)
		{
			String text=TableEmail.get(i).getText();
			if(text.equals(email))
			{
				TableAuditTrail.get(i).click();
				Thread.sleep(3000);
				break;	
			}
		}
	}
	
	public Boolean emailStatusValidation(String email) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =TableEmail.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<TableEmail.size();i++)
			{
				String stat=TableEmail.get(i).getText();
				if (!(stat.contains(email))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	
	public Boolean RoleValidation(String rl) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =TableRole.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<TableRole.size();i++)
			{
				String stat=TableRole.get(i).getText();
				if (!(stat.contains(rl))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	
	public void ClickUser() throws InterruptedException
	{
		Thread.sleep(2000);
		User.click();
		Thread.sleep(2000);
	}
	
	public void AddUser() throws InterruptedException
	{
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
	}
	
	public void ClearFirstName() throws InterruptedException
	{
		Thread.sleep(2000);
		FirstName.click();
		Thread.sleep(2000);
	}
	
	public void SetFirstName(String FName) throws InterruptedException
	{
		Thread.sleep(2000);
		FirstName.sendKeys(FName);
		Thread.sleep(2000);
	}
	
	public void searchClick() throws InterruptedException
	{
		Thread.sleep(2000);
		search.click();
		Thread.sleep(2000);
	}
	
	public void ClearLastName() throws InterruptedException
	{
		Thread.sleep(2000);
		LastName.click();
		Thread.sleep(2000);
	}
	
	public void SetLastName(String LName) throws InterruptedException
	{
		Thread.sleep(2000);
		LastName.sendKeys(LName);
		Thread.sleep(2000);
	}
	
	public void searchEmail(String emailName) throws InterruptedException
	{
		Thread.sleep(2000);
		emailOrName.sendKeys(emailName);
		Thread.sleep(2000);
	}

	public void ClearPrimaryEmail() throws InterruptedException
	{
		Thread.sleep(2000);
		PrimaryEmail.click();
		Thread.sleep(2000);
	}
	
	public void SetPrimaryEmail(String PE) throws InterruptedException
	{
		Thread.sleep(2000);
		PrimaryEmail.sendKeys(PE);
		Thread.sleep(2000);
	}
	

	public void ClearSecondaryEmail() throws InterruptedException
	{
		Thread.sleep(2000);
		SecondaryEmail.click();
		Thread.sleep(2000);
	}
	
	public void SetSecondaryEmail(String SE) throws InterruptedException
	{
		Thread.sleep(2000);
		SecondaryEmail.sendKeys(SE);
		Thread.sleep(2000);
	}


	public void ClickUserType() throws InterruptedException
	{
		Thread.sleep(2000);
		Select os = new Select(UserType);
		os.selectByVisibleText("option 1");
		Thread.sleep(2000);
	}
	
	public void ClickRole() throws InterruptedException
	{
		Thread.sleep(2000);
		Select os = new Select(Role);
		os.selectByVisibleText("Administrator");
		Thread.sleep(2000);
	}
	
	public void searchRole(String role) throws InterruptedException
	{
		Thread.sleep(2000);
		Select os = new Select(searchRole);
		os.selectByVisibleText(role);
		Thread.sleep(2000);
	}
	
	public void ClickCountry() throws InterruptedException
	{
		Thread.sleep(2000);
		Select os = new Select(Country);
		os.selectByVisibleText("India");
		Thread.sleep(2000);
	}
	
	public void SetDOB(String dob) throws InterruptedException
	{
		Thread.sleep(2000);
		DOB.sendKeys(dob);
		Thread.sleep(2000);
	}
	
	public void ClearPhoneNumber() throws InterruptedException
	{
		Thread.sleep(2000);
		PhoneNumber.click();
		Thread.sleep(2000);
	}
	
	public void SetPhoneNumber(String Num) throws InterruptedException
	{
		Thread.sleep(2000);
		PhoneNumber.sendKeys(Num);
		Thread.sleep(2000);
	}
	
	public void ClearAddress1() throws InterruptedException
	{
		Thread.sleep(2000);
		Address1.click();
		Thread.sleep(2000);
	}
	
	public void SetAddress1(String Add1) throws InterruptedException
	{
		Thread.sleep(2000);
		Address1.sendKeys(Add1);
		Thread.sleep(2000);
	}
	
	public void ClearAddress2() throws InterruptedException
	{
		Thread.sleep(2000);
		Address2.click();
		Thread.sleep(2000);
	}
	
	public void SetAddress2(String Add2) throws InterruptedException
	{
		Thread.sleep(2000);
		Address2.sendKeys(Add2);
		Thread.sleep(2000);
	}
	
	public void ClickActive() throws InterruptedException
	{
		Thread.sleep(2000);
		Active.click();
		Thread.sleep(2000);
	}
	
	public void ClickLock() throws InterruptedException
	{
		Thread.sleep(2000);
		Clear.click();
		Thread.sleep(2000);
	}
	
	public void ClickClear() throws InterruptedException
	{
		Thread.sleep(2000);
		Clear.click();
		Thread.sleep(2000);
	}
	
	public void ClickSave() throws InterruptedException
	{

		Save.click();

	}
	
	public static boolean duplicateAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("User already exists with same email id!"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	public static boolean privilegeAlert() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("User study privilege updated successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}
	
	
}
