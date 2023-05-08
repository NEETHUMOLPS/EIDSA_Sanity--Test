package com.EIDSA.pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.AbstractComponents.AbstractComponent;

public class Users extends AbstractComponent{
	static WebDriver driver;
	public Users(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//*[@id=\"studysetup\"]/li[15]/a/span")
	@CacheLookup
	WebElement Users;
	
	@FindBy(xpath = "//input[@type='email']")
	@CacheLookup
	WebElement EmailOrName;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/div/select")
	@CacheLookup
	WebElement Role;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[3]/span")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath = "//td[1]")
	@CacheLookup
	List<WebElement> tableName;
	
	@FindBy(xpath = "//td[2]")
	@CacheLookup
	List<WebElement> tableEmail;
	
	@FindBy(xpath = "//td[3]")
	@CacheLookup
	List<WebElement> tableRole;
	
	@FindBy(xpath = "//td[8]")
	@CacheLookup
	List<WebElement> tableUserPrivilege;
	
	@FindBy(xpath="(//li[@class='PaginationControl'])[3]")
	@CacheLookup
	WebElement next;
	
	public void clickUsers() throws InterruptedException
	{
		
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(3000);
		elementWait(Users);
		Users.click();
		Thread.sleep(3000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(5000);
	}
	
	public void clickSearch() throws InterruptedException
	{
		Thread.sleep(3000);
		Search.click();
		Thread.sleep(3000);
	}
	
	public void SearchEmailOrName(String nm) throws InterruptedException
	{
		EmailOrName.sendKeys(nm);
	}
	
	public void SearchRole(String role) throws InterruptedException
	{
		Select sel=new Select(Role);
		sel.selectByVisibleText(role);			
	}
	
	public Boolean EmailSearchValidation(String role) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableEmail.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableEmail.size();i++)
			{
				String stat=tableEmail.get(i).getText();
				if (!(stat.contains(role))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}

	
	public Boolean RolesearchValidation(String role) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableRole.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableRole.size();i++)
			{
				String stat=tableRole.get(i).getText();
				if (!(stat.contains(role))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}

}
