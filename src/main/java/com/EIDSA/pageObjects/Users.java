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
	
	
	@FindBy(xpath = "//a[@href='/userlisting']//span[contains(text(),'Users')]")
	WebElement Users;
	@FindBy(xpath = "//input[@type='email']")
	WebElement EmailOrName;
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/div/select")
	WebElement Role;
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[3]/span")
	WebElement Search;
	
	
	//Web table
	@FindBy(xpath = "//td[1]")
	List<WebElement> tableName;
	@FindBy(xpath = "//td[2]")
	List<WebElement> tableEmail;
	@FindBy(xpath = "//td[3]")
	List<WebElement> tableRole;
	@FindBy(xpath = "//td[8]")
	List<WebElement> tableUserPrivilege;
	@FindBy(xpath="(//li[@class='PaginationControl'])[3]")
	WebElement next;
	
	public void clickUsers() throws InterruptedException
	{
		
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(2000);
		elementWait(Users);
		Users.click();
		Thread.sleep(2000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(2000);
	}
	
	public void clickSearch() throws InterruptedException
	{
		Thread.sleep(1000);
		Search.click();
		Thread.sleep(1000);
	}
	
	public void SearchEmailOrName(String nm) throws InterruptedException
	{
		Thread.sleep(2000);
		EmailOrName.sendKeys(nm);
		Thread.sleep(2000);
	}
	
	public void SearchRole(String role) throws InterruptedException
	{
		Thread.sleep(2000);
		Select sel=new Select(Role);
		sel.selectByVisibleText(role);	
		Thread.sleep(2000);
	}
	
	public Boolean EmailSearchValidation(String role) throws InterruptedException
	{
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
