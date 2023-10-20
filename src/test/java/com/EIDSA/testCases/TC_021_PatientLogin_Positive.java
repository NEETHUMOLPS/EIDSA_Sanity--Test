package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.PatientLogin;

import Base.BaseClassTest;

public class TC_021_PatientLogin_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void SiteCodeSearchFunctionality() throws IOException, InterruptedException
	{
		PatientLogin pl = new PatientLogin(driver);
		pl.clickPatientLogin();
		pl.SearchSiteCode("Demo01");
		pl.Search();
		Thread.sleep(3000);
		Assert.assertTrue(pl.siteCodeSearchValidation("Demo01"));
		logger.info("Site code search validation successfully completed");	
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void SubjectIdSearchValidation() throws IOException, InterruptedException
	{
		PatientLogin pl = new PatientLogin(driver);
		pl.clickPatientLogin();
		pl.SearchSiteCode("Demo01");
		pl.SearchSubId("demo02");
		pl.Search();
		Thread.sleep(3000);
		Assert.assertTrue(pl.SubjectIdSearchValidation("demo02"));
		logger.info("Subject Id search validation successfully completed");		
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void StatusSearchValidation() throws IOException, InterruptedException
	{
		PatientLogin pl = new PatientLogin(driver);
		pl.clickPatientLogin();
		pl.SearchStatus("Pending");
		pl.Search();
		Thread.sleep(3000);
		Assert.assertTrue(pl.StatusSearchValidation("Pending"));
		logger.info("Status search validation successfully completed");		
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void AddLogin() throws IOException, InterruptedException
	{
		PatientLogin pl = new PatientLogin(driver);
		pl.clickPatientLogin();
		pl.SearchSiteCode("Demo01");
		pl.Search();
		Thread.sleep(3000);
		pl.findSubId("demo04");
		pl.AddLogin("demo04new@yopmail.com");
		pl.CreationAlert();
		logger.info("Login added successfully");
	}

}
