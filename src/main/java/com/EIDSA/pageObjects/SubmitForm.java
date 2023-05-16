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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.AbstractComponents.AbstractComponent;

public class SubmitForm extends AbstractComponent{
	static WebDriver driver;
	public SubmitForm(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Submit Form')]")
	@CacheLookup
	WebElement SubmitForm;
	
	@FindBy(xpath = "//td[1]")
	@CacheLookup
	List<WebElement> TableSiteCode;
	
	@FindBy(xpath = "//td[2]")
	@CacheLookup
	List<WebElement> TableSubId;
	
	@FindBy(xpath = "//td[3]")
	@CacheLookup
	List<WebElement> TableVisitName;
	
	@FindBy(xpath = "//td[6]")
	@CacheLookup
	List<WebElement> TableSubmitForm;
	
	@FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/i[1]")
	@CacheLookup
	WebElement submitForm;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement Save;
	
	@FindBy(xpath = "//button[contains(text(),'Review And Submit')]")
	@CacheLookup
	WebElement ReviewAndSubmit;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement SiteIdCode;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement PatientScreeningNumber;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/div[1]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement VisitDate;
	
	@FindBy(xpath = "(//span[contains(text(),'Please enter a value')])[1]")
	@CacheLookup
	WebElement err1;
	
	@FindBy(xpath = "(//span[contains(text(),'Please enter a value')])[2]")
	@CacheLookup
	WebElement err2;
	
	@FindBy(xpath = "(//span[contains(text(),'Please enter a value')])[3]")
	@CacheLookup
	WebElement err3;
	
	@FindBy(xpath = "(//span[contains(text(),'Please enter a value')])[4]")
	@CacheLookup
	WebElement err4;
	
	@FindBy(xpath = "//span[contains(text(),'Please enter a value between 100 and 999')]")
	@CacheLookup
	WebElement err5;
	
	@FindBy(xpath = "//span[contains(text(),'Number of characters should be between 3 and 7')]")
	@CacheLookup
	WebElement err6;
	
	@FindBy(xpath = "//span[contains(text(),'Number of characters should be between 2 and 4')]")
	@CacheLookup
	WebElement err7;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[11]/div[1]/div[2]/div[1]/div[1]/input[1]")
	@CacheLookup
	WebElement Initials;
	
	
	
	public String errorMsg1()
	{
		elementWait(err1);
		return err1.getText();
	}
	
	public String errorMsg2()
	{
		elementWait(err2);
		return err2.getText();
	}
	public String errorMsg3()
	{
		elementWait(err3);
		return err3.getText();
	}
	
	public String errorMsg4()
	{
		elementWait(err4);
		return err4.getText();
	}
	
	public String errorMsg5()
	{
		elementWait(err5);
		return err5.getText();
	}
	
	public String errorMsg6()
	{
		elementWait(err6);
		return err6.getText();
	}
	
	public String errorMsg7()
	{
		elementWait(err1);
		return err7.getText();
	}
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Form saved successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public static boolean Alert2() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Form submitted successfully."));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void clickSubmitForm() throws InterruptedException
	{
		Thread.sleep(2000);
		SubmitForm.click();
		Thread.sleep(5000);
	}
	
	public void reviewAndSubmit() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		elementWait(ReviewAndSubmit);
		ReviewAndSubmit.click();
		Thread.sleep(2000);
	}
	
	public void save() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		elementWait(Save);
		Save.click();
		Thread.sleep(2000);
	}
	
	public boolean selectSubmitForm(String name) throws InterruptedException 
	{
		Thread.sleep(2000);
		boolean sub=false;
		int count = TableVisitName.size();
		for(int i=0;i<count;i++)
		{
			
			String text =  TableVisitName.get(i).getText();
			if(text.contains(name))
			{
				TableSubmitForm.get(i).click();
				Thread.sleep(8000);
				break;	
			}
		}
		return sub;
	}
	
	public void fillFormSave() throws InterruptedException
	{
		Thread.sleep(2000);
		SiteIdCode.clear();
		Thread.sleep(2000);
		SiteIdCode.sendKeys("100");
		Thread.sleep(2000);
		PatientScreeningNumber.clear();
		Thread.sleep(2000);
		PatientScreeningNumber.sendKeys("101");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		VisitDate.clear();
		Thread.sleep(2000);
		VisitDate.sendKeys("27-04-2023");
		Thread.sleep(2000);
		Initials.clear();
		Thread.sleep(2000);
		Initials.sendKeys("Nee");
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
	}
	
	public void fillFormReviewAndSubmit() throws InterruptedException
	{
		Thread.sleep(2000);
		SiteIdCode.clear();
		Thread.sleep(2000);
		SiteIdCode.sendKeys("100");
		Thread.sleep(2000);
		PatientScreeningNumber.clear();
		Thread.sleep(2000);
		PatientScreeningNumber.sendKeys("101");
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,800)");
		VisitDate.clear();
		Thread.sleep(2000);
		VisitDate.sendKeys("27-04-2023");
		Thread.sleep(2000);
		Initials.clear();
		Thread.sleep(2000);
		Initials.sendKeys("Nee");
		Thread.sleep(2000);
		ReviewAndSubmit.click();
		Thread.sleep(2000);
	}
	
	
	public void clickSiteCode(String code) throws InterruptedException
	{
		Thread.sleep(2000);
		SiteIdCode.sendKeys(code);
		Thread.sleep(3000);
	}
	
	public void clickPatientScreeningNum(String num) throws InterruptedException
	{
		Thread.sleep(2000);
		PatientScreeningNumber.sendKeys(num);
		Thread.sleep(3000);
	}

	public void clickdate(String date) throws InterruptedException
	{
		Thread.sleep(2000);
		VisitDate.sendKeys(date);
		Thread.sleep(3000);
	}
	
	public void clickintials(String in) throws InterruptedException
	{
		Thread.sleep(2000);
		Initials.sendKeys(in);
		Thread.sleep(3000);
	}
	
	

}
