package com.EIDSA.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.AbstractComponents.AbstractComponent;

public class Dashboards extends AbstractComponent{
	static WebDriver driver;
	public Dashboards(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "//span[contains(text(),'Main Dashboard')]")
	@CacheLookup
	WebElement MainDashboard;
	
	@FindBy(xpath = "//span[contains(text(),'Nurse Dashboard')]")
	@CacheLookup
	WebElement NurseDashboard;
	
	@FindBy(xpath = "//span[contains(text(),'Study Summary')]")
	@CacheLookup
	WebElement StudySummary;
	
	@FindBy(xpath = "//span[contains(text(),'Site Summary')]")
	@CacheLookup
	WebElement SiteSummary;
	
	@FindBy(xpath = "//span[contains(text(),'Visit Summary')]")
	@CacheLookup
	WebElement VisitSummary;
	
	@FindBy(xpath = "//span[contains(text(),'Nurse Diary')]")
	@CacheLookup
	WebElement NurseDiary;
	
	public void clickMainDashboard() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		elementWait(MainDashboard);
		MainDashboard.click();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(3000);
	}
	
	public void clickNurseDashboard() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		elementWait(NurseDashboard);
		NurseDashboard.click();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(3000);
	}
	
	public void clickStudySummary() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		elementWait(StudySummary);
		StudySummary.click();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(3000);
	}
	
	public void clickSiteSummary() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		elementWait(SiteSummary);
		SiteSummary.click();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(3000);
	}
	
	public void clickVisitSummary() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		elementWait(VisitSummary);
		VisitSummary.click();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(3000);
	}
	
	public void clickNurseDiary() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		Thread.sleep(3000);
		elementWait(NurseDiary);
		NurseDiary.click();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-800)");
		Thread.sleep(3000);
	}
	

}
