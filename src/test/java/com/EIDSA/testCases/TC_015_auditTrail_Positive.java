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
		UserPage up=new UserPage(driver);
		up.clickUser();
		Thread.sleep(3000);		
		up.searchEmail("neethumolp@datamatica.uk");
		Thread.sleep(3000);	
		up.searchClick();
		Thread.sleep(3000);	
		//up.auditTrail("neethumolp@datamatica.uk");
		driver.findElement(By.xpath("//tbody/tr[1]/td[10]/i[1]")).click();
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
