package com.EIDSA.testCases.Sanity;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.Dashboards;

import Base.BaseClassTest;

public class TC_042_StudySummary_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void StudySummary() throws IOException, InterruptedException
	{
		Dashboards ms = new Dashboards(driver);
		ms.clickStudySummary();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://eidsa.dev.datamatica.uk/studysummary"))
		{
			Assert.assertTrue(true);
			logger.info("Page verified");
		}
		else
		{
			captureScreen(driver, "StudySummary");
			Assert.assertTrue(false);
			logger.info("Page not verified");
		}
	}



}
