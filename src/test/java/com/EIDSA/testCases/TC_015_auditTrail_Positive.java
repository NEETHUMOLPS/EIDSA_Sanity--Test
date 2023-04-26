package com.EIDSA.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.UserPage;

import Base.BaseClassTest;

public class TC_015_auditTrail_Positive extends BaseClassTest {
	
	@Test
	public void auditTrail() throws IOException, InterruptedException
	{

		Thread.sleep(5000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("scroll(0, 900);");
		Thread.sleep(6000);
		UserPage up=new UserPage(driver);
		WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[7]/ul[1]/li[2]/a[1]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		Thread.sleep(5000);	
		up.searchEmail("neethumolp@datamatica.uk");
		up.searchClick();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[10]/i[1]")).click();
		Thread.sleep(5000);
		WebElement e = driver.findElement(By.xpath("//strong[contains(text(),'neethumolp@datamatica.uk')]"));
		String actualText=e.getText();
		String expText="neethumolp@datamatica.uk";
		
		if(actualText.equals(expText))
		{
			Assert.assertTrue(true);
			logger.info("Audit trail verified");
			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/i[1]")).click();
		}
		else
		{
			captureScreen(driver, "auditTrail");
			Assert.assertTrue(false);
			logger.info("Audit trail verification failed");
		}
      
		
	}
}
