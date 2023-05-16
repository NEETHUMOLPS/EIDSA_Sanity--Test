package com.EIDSA.pageObjects;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AbstractComponents.AbstractComponent;

public class IOT extends AbstractComponent{
	static WebDriver driver;
	public IOT(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[1]/input")
	@CacheLookup
	WebElement SubjectId;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[2]/input")
	@CacheLookup
	WebElement Devicename;
	
	@FindBy(xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div[3]/input")
	@CacheLookup
	WebElement Formname;
	
	@FindBy(xpath = "//span[contains(text(),'Search')]")
	@CacheLookup
	WebElement Search;
	
	@FindBy(xpath = "//span[contains(text(),'Google Fit')]")
	@CacheLookup
	WebElement GoogleFit;
	
	@FindBy(xpath = "//span[contains(text(),'IOT Devices')]")
	@CacheLookup
	WebElement IOTDevices;
	
	@FindBy(xpath = "//span[contains(text(),'IOT Patients')]")
	@CacheLookup
	WebElement IOTPatients;
	
	@FindBy(xpath = "//td[1]")
	@CacheLookup
	List<WebElement> tableSubjectId;
	
	@FindBy(xpath = "//td[2]")
	@CacheLookup
	List<WebElement> tableDeviceName;
	
	@FindBy(xpath = "//td[3]")
	@CacheLookup
	List<WebElement> tableFormName;
	
	@FindBy(xpath = "//td[4]")
	@CacheLookup
	List<WebElement> tableView;
	
	
	
	public void clickGoogleFit() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		elementWait(GoogleFit);
		GoogleFit.click();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(3000);
	}
	
	public void clickIOTDevices() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		elementWait(IOTDevices);
		IOTDevices.click();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(3000);
	}
	
	
	public void clickIOTPatients() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		elementWait(IOTPatients);
		IOTPatients.click();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(3000);
	}
	
	public void searchStudyId(String study) throws InterruptedException
	{
		Thread.sleep(2000);
		SubjectId.sendKeys(study);
		Thread.sleep(3000);
	}
	
	public void searchDeviceName(String deviceName) throws InterruptedException
	{
		Thread.sleep(2000);
		Devicename.sendKeys(deviceName);
		Thread.sleep(3000);
	}
	
	public void searchFormName(String formName) throws InterruptedException
	{
		Thread.sleep(2000);
		Formname.sendKeys(formName);
		Thread.sleep(3000);
	}
	
	public void clickSearch() throws InterruptedException
	{
		Thread.sleep(2000);
		Search.click();
		Thread.sleep(3000);
	}
	
	public Boolean studyStatusValidation(String study) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableSubjectId.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableSubjectId.size();i++)
			{
				String stat=tableSubjectId.get(i).getText();
				if (!(stat.contains(study))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean deviceNameStatusValidation(String device) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableDeviceName.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableDeviceName.size();i++)
			{
				String stat=tableDeviceName.get(i).getText();
				if (!(stat.contains(device))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public Boolean formNameStatusValidation(String form) throws InterruptedException
	{
		Thread.sleep(3000);
		boolean st = true;
		int count =tableFormName.size();
		if (count<1) 
		{
			st=false;
		}
		else 
		{
			for (int i=0; i<tableFormName.size();i++)
			{
				String stat=tableFormName.get(i).getText();
				if (!(stat.contains(form))) 
				{
					st=false;
					break;
				}
			}
		}
		return st;
	}
	
	public void view(String view)
	{
		for(int i=0;i<tableSubjectId.size();i++)
		{
			String text=tableSubjectId.get(i).getText();
			if(text.equals(view))
			{
				tableView.get(i).click();
				break;
			}
		}
	}

}
