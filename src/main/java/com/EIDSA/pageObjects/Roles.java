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

public class Roles extends AbstractComponent{
	static WebDriver driver;
	public Roles(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//Role menu
	@FindBy(xpath="//span[contains(text(),'Roles')]")
	@CacheLookup
	WebElement Roles;	
	
	//Add role
	@FindBy(xpath="//img[@alt='Create role']")
	@CacheLookup
	WebElement AddRole;
	@FindBy(xpath="//label[contains(text(),'Name')]/following-sibling::input[1]")
	@CacheLookup
	WebElement RoleName;
	@FindBy(xpath="//label[contains(text(),'Description')]/following-sibling::input[1]")
	@CacheLookup
	WebElement RoleDescription;
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement Active;	
	@FindBy(xpath="//button[contains(text(),'Clear')]")
	@CacheLookup
	WebElement Clear;	
	@FindBy(xpath="//button[contains(text(),'Submit')]")
	@CacheLookup
	WebElement Submit;	
	
	//Search
	@FindBy(xpath="//label[contains(text(),'Role Name')]/following-sibling::input[1]")
	@CacheLookup
	WebElement RoleNameSearch;
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/div/select")
	@CacheLookup
	WebElement Status;
	@FindBy(xpath="//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement Search;
	
	//Web table
	@FindBy(xpath="//td[1]")
	@CacheLookup
	List<WebElement> tableRoleName;
	@FindBy(xpath="//td[2]")
	@CacheLookup
	List<WebElement> tableRoleDes;
	@FindBy(xpath="//td[3]")
	@CacheLookup
	List<WebElement> tableActive;
	@FindBy(xpath="//td[4]")
	@CacheLookup
	List<WebElement> tableEdit;
	@FindBy(xpath="//td[5]")
	@CacheLookup
	List<WebElement> tableDelete;
	
	@FindBy(xpath="//span[contains(text(),'Please enter role name')]")
	@CacheLookup
	WebElement err;
	
	public String errMsg()
	{
		elementWait(err);
		return err.getText();
	}
	
	public void clickRoles() throws InterruptedException
	{
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		elementWait(Roles);
		Roles.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(2000);
	}
	
	public void createRoles(String rolename,String des) throws InterruptedException
	{
		Thread.sleep(2000);
		AddRole.click();
		Thread.sleep(2000);
		RoleName.sendKeys(rolename);
		Thread.sleep(2000);
		RoleDescription.sendKeys(des);
		Thread.sleep(2000);
		Submit.click();
		Thread.sleep(2000);
	}
	
	public void clickCreateRole() throws InterruptedException
	{
		Thread.sleep(2000);
		AddRole.click();
		Thread.sleep(2000);
	}
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Role added successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void searchRoles(String rname) throws InterruptedException
	{
		Thread.sleep(2000);
		RoleNameSearch.sendKeys(rname);
		Thread.sleep(2000);
		Search.click();
		Thread.sleep(2000);
	}
	
	public void edit(String rolename) throws InterruptedException
	{

		int count = tableRoleName.size();
		for(int i=0;i<count;i++)
		{

			String text =  tableRoleName.get(i).getText();
			if(text.contains(rolename))
			{
				tableEdit.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public void editData(String des) throws InterruptedException
	{
		Thread.sleep(2000);
		RoleDescription.click();
		Thread.sleep(2000);
		RoleDescription.clear();
		Thread.sleep(2000);
		RoleDescription.sendKeys(des);	
		Thread.sleep(2000);
		Submit.click();
		Thread.sleep(2000);
	}
	
	public void clickSubmit() throws InterruptedException
	{
		Thread.sleep(2000);
		Submit.click();
		Thread.sleep(2000);
	}
	
	public static boolean Alert2() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Role updated successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert5() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("RoleName already exist"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void delete(String del) throws InterruptedException
	{

		int count = tableRoleName.size();
		for(int i=0;i<count;i++)
		{

			String text =  tableRoleName.get(i).getText();
			if(text.contains(del))
			{
				tableDelete.get(i).click();
				Thread.sleep(2000);
				break;
			}
		}
	}
	
	public static boolean Alert3() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this role?"));
			alert1.accept();			
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert4() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure you want to delete this role?"));
			alert1.accept();	
			Thread.sleep(3000);
			WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait2.until(ExpectedConditions.alertIsPresent());
			Alert alert2 = driver.switchTo().alert();
			Assert.assertTrue(alert2.getText().contains("Role Deleted successfully"));
			alert2.accept();
			
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public Boolean roleNameSearchValidation(String name) throws InterruptedException
	{
		boolean st = true;
		int count =tableRoleName.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableRoleName.size();i++)
			{
				String stat=tableRoleName.get(i).getText();
				if (!(stat.contains(name))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
}
	

	
	


