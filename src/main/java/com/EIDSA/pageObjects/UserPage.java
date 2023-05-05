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
	
	@FindBy(xpath="//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement search;
	
	@FindBy(xpath="//td[1]")
	@CacheLookup
	List<WebElement> TableName;
	
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
	
	
	public void ClickUser()
	{
		User.click();
	}
	
	public void AddUser()
	{
		AddUser.click();
	}
	
	public void ClearFirstName()
	{
		FirstName.click();
	}
	
	public void SetFirstName(String FName)
	{
		FirstName.sendKeys(FName);
	}
	
	public void searchClick()
	{
		search.click();
	}
	
	public void ClearLastName()
	{
		LastName.click();
	}
	
	public void SetLastName(String LName)
	{
		LastName.sendKeys(LName);
	}
	
	public void searchEmail(String emailName)
	{
		emailOrName.sendKeys(emailName);
	}

	public void ClearPrimaryEmail()
	{
		PrimaryEmail.click();
	}
	
	public void SetPrimaryEmail(String PE)
	{
		PrimaryEmail.sendKeys(PE);
	}
	

	public void ClearSecondaryEmail()
	{
		SecondaryEmail.click();
	}
	
	public void SetSecondaryEmail(String SE)
	{
		SecondaryEmail.sendKeys(SE);
	}


	public void ClickUserType()
	{
		Select os = new Select(UserType);
		os.selectByVisibleText("option 1");
	}
	
	public void ClickRole()
	{
		Select os = new Select(Role);
		os.selectByVisibleText("Administrator");
	}
	
	public void searchRole(String role)
	{
		Select os = new Select(searchRole);
		os.selectByVisibleText(role);
	}
	
	public void ClickCountry()
	{
		Select os = new Select(Country);
		os.selectByVisibleText("India");
	}
	
	public void SetDOB(String dob)
	{
		DOB.sendKeys(dob);
	}
	
	public void ClearPhoneNumber()
	{
		PhoneNumber.click();
	}
	
	public void SetPhoneNumber(String Num)
	{
		PhoneNumber.sendKeys(Num);
	}
	
	public void ClearAddress1()
	{
		Address1.click();
	}
	
	public void SetAddress1(String Add1)
	{
		Address1.sendKeys(Add1);
	}
	
	public void ClearAddress2()
	{
		Address2.click();
	}
	
	public void SetAddress2(String Add2)
	{
		Address2.sendKeys(Add2);
	}
	
	public void ClickActive()
	{
		Active.click();
	}
	
	public void ClickLock()
	{
		Clear.click();
	}
	
	public void ClickClear()
	{
		Clear.click();
	}
	
	public void ClickSave()
	{
		Save.click();
	}
	

	
	
}
