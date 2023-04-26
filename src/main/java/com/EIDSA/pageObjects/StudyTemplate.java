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

public class StudyTemplate extends AbstractComponent{
	static WebDriver driver;
	public StudyTemplate(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//span[contains(text(),'Study Template')]")
	@CacheLookup
	WebElement StudyTemplate;
	
	@FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/select[1]")
	@CacheLookup
	WebElement Study;
	
	@FindBy(xpath = "//td[1]")
	@CacheLookup
	List<WebElement> tableSelect;
	
	@FindBy(xpath = "//td[2]")
	@CacheLookup
	List<WebElement> tableTemplateName;
	
	@FindBy(xpath = "//td[7]")
	@CacheLookup
	List<WebElement> tableStatus;
	
	@FindBy(xpath = "//button[contains(text(),'Save')]")
	@CacheLookup
	WebElement save;
	
	public static boolean Alert1() throws InterruptedException
	{
		try
		{
			WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(8));
			wait1.until(ExpectedConditions.alertIsPresent());
			Alert alert1 = driver.switchTo().alert();
			Assert.assertTrue(alert1.getText().contains("Study template updated successfully"));
			alert1.accept();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}	
	}
	
	public void clickStudyTemplate() throws InterruptedException
	{	
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		elementWait(StudyTemplate);
		StudyTemplate.click();
		Thread.sleep(3000);
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,-1000)");
		Thread.sleep(3000);		
	}
	
	public void selectStudy(String study) throws InterruptedException
	{	
		Select sel=new Select(Study);
		sel.selectByVisibleText(study);
		Thread.sleep(3000);
	}
	
		public boolean clickSelect(String subjectid) throws InterruptedException 
		{
			Thread.sleep(2000);
			boolean sub=false;
			int count = tableTemplateName.size();
			for(int i=0;i<count;i++)
			{
				
				String text =  tableTemplateName.get(i).getText();
				if(text.contains(subjectid))
				{
					tableSelect.get(i).click();
					Thread.sleep(8000);
					break;	
				}
			}
			return sub;
		}
		
		public void save() throws InterruptedException
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,400)");
			Thread.sleep(3000);
			elementWait(save);
			save.click();		
		}


	
}
