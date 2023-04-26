package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.SitePage;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_018_site_create_verify_search_auditTrail_edit_action_delete_Positive extends BaseClassTest {

	@Test(priority=1, dataProvider = "SiteData")
	public void siteCreation(String sitecode,String sitename,String sitecontactename,String sitecontactemail,String noofsubject,String studynotes) throws IOException, InterruptedException
	{
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.createSite(sitecode,sitename,sitecontactename,sitecontactemail,noofsubject,studynotes);
		sp.siteAlert();
		logger.info("Site created successfully");
	}
		
	@Test(priority=2)
	public void siteVerification() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.verifyStudy("AT011");
		logger.info("Site verified successfully");	
	}
	@Test(priority=3)
	public void searchValidation() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.searchSiteCode("AT011");
		sp.siteSearch();
		Thread.sleep(4000);
		Assert.assertTrue(sp.siteCodeSearchValidation("AT011"));
		logger.info("Site code search functionality verified");
		sp.searchSiteName("Automation demo01");
		sp.siteSearch();
		Thread.sleep(4000);
		Assert.assertTrue(sp.siteNameSearchValidation("Automation demo01"));
		logger.info("Site name search functionality verified");
		sp.searchSiteStatus("New");
		sp.siteSearch();
		Thread.sleep(4000);
		Assert.assertTrue(sp.siteStatusSearchValidation("New"));
		logger.info("Site status search functionality verified");		
	}
	@Test(priority=4)
	public void siteEdit() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.editSiteIcon("AT011");
		Thread.sleep(4000);
		sp.editSite("Automation demo0111");
		sp.editAlert();
		logger.info("Study updated successfully");
		Thread.sleep(5000);
	}
	@Test(priority=5)
	public void siteAuditTrail() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.auditTrail("AT011");
		logger.info("Audit trail verified");
	}
	
	@Test(priority=6)
	public void duplicateAlert() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.clickCreateSite();
		sp.duplicateSite("AT011");
		sp.clickSave();
		sp.duplicateAlert();
		logger.info("Site code already exists");
	}
	
	@Test(priority=7)
	public void siteAction() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.siteActionOpen("AT011");
		logger.info("Site opened");
		Thread.sleep(8000);
		sp.siteActionComplete("AT011");
		logger.info("Site completed");
		Thread.sleep(8000);
		sp.siteActionTerminate("AT011");
		logger.info("Site terminated");
	}
	@Test(priority=7)
	public void siteDelete() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.delSiteIcon("AT011");
		sp.deleteAlert();
		logger.info("Site deleted");
	}	
	@Test(priority=8)
	public void siteDeleteWithPatient() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.delSiteIcon("UiVision site01");
		sp.deleteSiteWithPatientsAlert();
		logger.info("Site having patients cannot be deleted");
	}
	
	
	@DataProvider(name="SiteData")
	 String [][] getData() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\lenovo\\Desktop\\Selenium\\Study_Site_Positive.xlsx";
int rownum=XLUtility.getRowCount(path, "Sheet2");
	int colcount=XLUtility.getCellCount(path, "Sheet2", 1);
	
	String sitedata[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			sitedata[i-1][j]=XLUtility.getCellData(path, "Sheet2", i, j);
		}
	}
	
	return sitedata;		
	
	
	}
	
	

}
