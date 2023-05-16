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

public class Templates extends AbstractComponent{
	
	static WebDriver driver;
	public Templates(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Templates')]")
	@CacheLookup
	WebElement Templates;
	
	@FindBy(xpath="//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div/input")
	@CacheLookup
	WebElement TemplateName;

	@FindBy(xpath="//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath="//td[1]")
	@CacheLookup
	List<WebElement> tableTemplateName;
	
	@FindBy(xpath="//td[8]")
	@CacheLookup
	List<WebElement> tableView;
	
	@FindBy(xpath="//td[6]")
	@CacheLookup
	List<WebElement> tableStatus;
	
	@FindBy(xpath="//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement Language;
	
	@FindBy(xpath="//span[contains(text(),'Translate')]")
	@CacheLookup
	WebElement Translate;
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Are you sure, you want to convert this form to English"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void clickTemplates() throws InterruptedException
	{
		
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(3000);
		elementWait(Templates);
		Templates.click();
		Thread.sleep(3000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(5000);
	}
	
	public void searchTemplateName(String temp) throws InterruptedException
	{
		Thread.sleep(2000);
		TemplateName.sendKeys(temp);
		Thread.sleep(3000);	
	}
	
	public void clickSearch() throws InterruptedException
	{
		Thread.sleep(2000);
		Search.click();
		Thread.sleep(3000);	
	}
	
	public void view(String name) throws InterruptedException
	{
		for(int i=0;i<tableTemplateName.size();i++)
		{
			String text=tableTemplateName.get(i).getText();
			if(text.equals(name))
			{
				tableView.get(i).click();
				Thread.sleep(8000);
				break;	
			}
		}
	}
	
	public void translate(String language) throws InterruptedException
	{
		Thread.sleep(2000);
		Select lan=new Select(Language);
		lan.selectByVisibleText(language);
		Thread.sleep(4000);
		Translate.click();
		Thread.sleep(4000);		
	}
	
	public Boolean templateSearchValidation(String temp) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableTemplateName.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableTemplateName.size();i++)
			{
				String stat=tableTemplateName.get(i).getText();
				if (!(stat.contains(temp))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
}
