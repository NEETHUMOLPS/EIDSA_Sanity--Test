package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.EIDSA.pageObjects.Visit;

import Base.BaseClassTest;

public class TC_027_Visit_Negative extends BaseClassTest {
	
	@Test(priority=1)
	public void assigningTemplate() throws IOException, InterruptedException
	{
		Visit vp = new Visit(driver);
		vp.clickVisit();
		vp.SearchVisitNo("Trial 2");
		vp.SearchVisitName("Visit 3");
		vp.clickSearch();
		Thread.sleep(3000);
		vp.assignTemp("Visit 3");
		vp.assign();
		vp.AssignAlert1();
		logger.info("Negative test passed");	
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void transalte() throws IOException, InterruptedException
	{
		Visit vp = new Visit(driver);
		vp.clickVisit();
		vp.SearchVisitNo("Test visit");
		vp.SearchVisitName("home Visit");
		vp.clickSearch();
		Thread.sleep(3000);
		vp.view("home Visit");
		vp.Translate();
		vp.TransalteAlertNegative();
		logger.info("Negative test passed");	
	}

}
