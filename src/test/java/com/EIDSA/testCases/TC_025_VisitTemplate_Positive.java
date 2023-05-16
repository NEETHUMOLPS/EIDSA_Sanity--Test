package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.VisitTemplate;

import Base.BaseClassTest;

public class TC_025_VisitTemplate_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void VisitNumSearchFunctionality() throws IOException, InterruptedException
	{
		VisitTemplate vp = new VisitTemplate(driver);
		vp.clickVisitTemplate();
		vp.SiteCode("Demo01");
		vp.SubId("demo05");
		Thread.sleep(3000);
		vp.SearchVisitName("visit001");		
		vp.clickSearch();
		Thread.sleep(4000);
		Assert.assertTrue(vp.visitNameSearchValidation("visit001"));
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
		vp.SearchVisitNo("new01");
		vp.clickSearch();
		Thread.sleep(4000);
		Assert.assertTrue(vp.visitNumSearchValidation("new01"));
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
		vp.SearchVisitName("visit08");
		vp.SearchVisitNo("008");
		vp.clickSearch();
		vp.edit("visit08");
		vp.Template("Screening Visit-hy-1.0");
		vp.AssignAlert1();
		logger.info("Template assigned successfully");
	}
	
}
