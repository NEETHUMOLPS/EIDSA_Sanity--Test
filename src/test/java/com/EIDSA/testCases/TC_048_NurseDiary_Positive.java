package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.Dashboards;

import Base.BaseClassTest;

public class TC_048_NurseDiary_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void NurseDiary() throws IOException, InterruptedException
	{
		Dashboards ms = new Dashboards(driver);
		ms.clickNurseDiary();
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals("https://eidsa.dev.datamatica.uk/nursediary"))
		{
			Assert.assertTrue(true);
			logger.info("Page verified");
		}
		else
		{
			captureScreen(driver, "NurseDiary");
			Assert.assertTrue(false);
			logger.info("Page not verified");
		}
	}

}
