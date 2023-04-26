package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.Visit;

import Base.BaseClassTest;

public class TC_026_Visit_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void VisitNumSearchFunctionality() throws IOException, InterruptedException
	{
		Visit vp = new Visit(driver);
		vp.clickVisit();
		vp.SearchVisitNo("Trial 2");
		vp.clickSearch();
		Thread.sleep(3000);
		Assert.assertTrue(vp.visitNoSearchValidation("Trial 2"));
		logger.info("Visit number search validation successfully completed");	
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void VisitNameSearchFunctionality() throws IOException, InterruptedException
	{
		Visit vp = new Visit(driver);
		vp.clickVisit();
		vp.SearchVisitName("Visit 3");
		vp.clickSearch();
		Thread.sleep(3000);
		Assert.assertTrue(vp.visitNameSearchValidation("Visit 3"));
		logger.info("Visit name search validation successfully completed");	
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void AssignTemplate() throws IOException, InterruptedException
	{
		Visit vp = new Visit(driver);
		vp.clickVisit();
		vp.SearchVisitNo("Trial 2");
		vp.SearchVisitName("Visit 3");
		vp.clickSearch();
		Thread.sleep(3000);
		vp.assignTemp("Visit 3");
		vp.TemplateAssigning("Screening Visit-hy-1.0");
		vp.assign();
		vp.AssignAlert2();
		logger.info("Template assigned successfully");	
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void translate() throws IOException, InterruptedException
	{
		Visit vp = new Visit(driver);
		vp.clickVisit();
		vp.SearchVisitNo("Test visit");
		vp.SearchVisitName("home Visit");
		vp.clickSearch();
		Thread.sleep(3000);
		vp.view("home Visit");
		vp.language("Malayalam");
		vp.Translate();
		vp.TransalteAlert();
		logger.info("Language traslation successfully completed");		
	}
	

}
