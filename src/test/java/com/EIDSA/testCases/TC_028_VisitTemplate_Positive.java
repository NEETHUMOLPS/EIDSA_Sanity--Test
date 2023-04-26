package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.VisitTemplate;

import Base.BaseClassTest;

public class TC_028_VisitTemplate_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void VisitNumSearchFunctionality() throws IOException, InterruptedException
	{
		VisitTemplate vp = new VisitTemplate(driver);
		vp.clickVisitTemplate();
		vp.SiteCode("Demo01");
		vp.SubId("demo05");
		Thread.sleep(3000);
		vp.SearchVisitName("05");		
		vp.clickSearch();
		Thread.sleep(4000);
		Assert.assertTrue(vp.visitNameSearchValidation("05"));
		logger.info("Visit name search validation successfully completed");	
		driver.navigate().refresh();		
	}
	
	@Test(priority=2)
	public void VisitNoSearchFunctionality() throws IOException, InterruptedException
	{
		VisitTemplate vp = new VisitTemplate(driver);
		vp.clickVisitTemplate();
		vp.SiteCode("Demo01");
		vp.SubId("demo05");
		Thread.sleep(3000);
		vp.SearchVisitNo("visit05");
		vp.clickSearch();
		Thread.sleep(4000);
		Assert.assertTrue(vp.visitNumSearchValidation("visit05"));
		logger.info("Visit number search validation successfully completed");	
		driver.navigate().refresh();		
	}
	
	@Test(priority=3)
	public void templateEdit() throws IOException, InterruptedException
	{
		VisitTemplate vp = new VisitTemplate(driver);
		vp.clickVisitTemplate();
		vp.SiteCode("Demo01");
		vp.SubId("demo05");
		Thread.sleep(3000);
		vp.SearchVisitName("05");
		vp.SearchVisitNo("visit05");
		vp.clickSearch();
		vp.edit("05");
		vp.Template("Screening Visit-hy-1.0");
		vp.AssignAlert1();
		logger.info("Template assigned successfully");
	}
	
}
