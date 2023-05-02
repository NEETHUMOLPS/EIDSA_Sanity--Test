package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.SubjectSchedule;

import Base.BaseClassTest;

public class TC_040_SubjectSchedule_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void siteCodeSearch() throws IOException, InterruptedException
	{
		SubjectSchedule fs = new SubjectSchedule(driver);
		fs.clickSubjectSchedule();
		fs.searchSiteCode("Demo01");
		Thread.sleep(3000);
		fs.searchSubId("demo05");
		Thread.sleep(3000);
		fs.ClickSearch();
		Thread.sleep(3000);
		Assert.assertTrue(fs.siteCodeSearchValidation("Demo01"));
		Assert.assertTrue(fs.subjectIdSearchValidation("demo05"));
		logger.info("Site code and Subject Id search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void visitNameSearch() throws IOException, InterruptedException
	{
		SubjectSchedule fs = new SubjectSchedule(driver);
		fs.clickSubjectSchedule();
		fs.searchSiteCode("Demo01");
		Thread.sleep(3000);
		fs.searchSubId("demo05");
		Thread.sleep(3000);
		fs.searchVisitName("03");
		fs.ClickSearch();
		Assert.assertTrue(fs.visitNameSearchValidation("03"));
		logger.info("Visit name search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void statusSearch() throws IOException, InterruptedException
	{
		SubjectSchedule fs = new SubjectSchedule(driver);
		fs.clickSubjectSchedule();
		fs.searchSiteCode("Demo01");
		Thread.sleep(3000);
		fs.searchSubId("demo05");
		Thread.sleep(3000);
		fs.searchStatus("Completed");
		fs.ClickSearch();
		Assert.assertTrue(fs.statusSearchValidation("Completed"));
		logger.info("Status search functionality verified");		
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void dateSearch() throws IOException, InterruptedException
	{
		SubjectSchedule fs = new SubjectSchedule(driver);
		fs.clickSubjectSchedule();
		fs.searchSiteCode("Demo01");
		Thread.sleep(3000);
		fs.searchSubId("demo05");
		Thread.sleep(3000);
		fs.SearchVisitDate("27-04-2023", "28-04-2023");
		fs.ClickSearch();
		fs.dateSearchValidation("27/04/2023");
		Thread.sleep(3000);
		logger.info("Date search validated ");	
	}
	
	@Test(priority=5)
	public void clickView() throws IOException, InterruptedException
	{
		SubjectSchedule fs = new SubjectSchedule(driver);
		fs.clickSubjectSchedule();
		fs.searchSiteCode("Demo01");
		Thread.sleep(3000);
		fs.searchSubId("demo05");
		Thread.sleep(3000);
		fs.ClickSearch();
		fs.view("03");
		logger.info("Form opened");
	}


}
