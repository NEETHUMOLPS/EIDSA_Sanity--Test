package com.EIDSA.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.SitePage;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_018_site_Positive extends BaseClassTest {

	@Test(priority=1, dataProvider = "SiteData")
	public void siteCreation(String sitecode,String sitename,String sitecontactename,String sitecontactemail,String noofsubject,String studynotes) throws IOException, InterruptedException
	{
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.createSite(sitecode,sitename,sitecontactename,sitecontactemail,noofsubject,studynotes);
		sp.siteAlert();
		logger.info("Site created successfully");
		driver.navigate().refresh();
	}
		
	@Test(priority=2)
	public void siteVerification() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.searchSiteCode("CT011");
		sp.siteSearch();
		Thread.sleep(4000);
		sp.verifySite("CT011");
		logger.info("Site verified successfully");	
		driver.navigate().refresh();
	}
	@Test(priority=3)
	public void searchValidation() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.searchSiteCode("CT011");
		sp.siteSearch();
		Thread.sleep(4000);
		Assert.assertTrue(sp.siteCodeSearchValidation("CT011"));
		logger.info("Site code search functionality verified");
		sp.searchSiteName("CT012");
		sp.siteSearch();
		Thread.sleep(4000);
		Assert.assertTrue(sp.siteNameSearchValidation("CT012"));
		logger.info("Site name search functionality verified");
		sp.searchSiteStatus("New");
		sp.siteSearch();
		Thread.sleep(4000);
		Assert.assertTrue(sp.siteStatusSearchValidation("New"));
		logger.info("Site status search functionality verified");	
		driver.navigate().refresh();
	}
	@Test(priority=4)
	public void siteEdit() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.searchSiteCode("CT011");
		sp.siteSearch();
		Thread.sleep(4000);
		sp.editSiteIcon("CT011");
		Thread.sleep(4000);
		sp.editSite("CT0122");
		sp.editAlert();
		logger.info("Study updated successfully");
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	@Test(priority=5)
	public void siteAuditTrail() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.searchSiteCode("CT011");
		sp.siteSearch();
		Thread.sleep(4000);
		sp.auditTrail("CT011");
		logger.info("Audit trail verified");
		driver.navigate().refresh();
	}
	
	@Test(priority=6)
	public void duplicateAlert() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.clickCreateSite();
		sp.duplicateSite("CT011");
		sp.clickSave();
		sp.duplicateAlert();
		logger.info("Site code already exists");
		driver.navigate().refresh();
	}
	
	@Test(priority=7)
	public void siteActionOpen() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.searchSiteCode("CT011");
		sp.siteSearch();
		Thread.sleep(4000);
		sp.siteActionOpen("CT011");
		logger.info("Site opened");
		driver.navigate().refresh();
	}
		
	@Test(priority=8)
	public void siteActionComplete() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.searchSiteCode("BT003");
		sp.siteSearch();
		Thread.sleep(4000);
		sp.siteActionComplete("BT003");
		logger.info("Site completed");
		Thread.sleep(8000);
		driver.navigate().refresh();
	}
	
	@Test(priority=8)
	public void siteActionTerminate() throws IOException, InterruptedException
	{
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.searchSiteCode("BT004");
		sp.siteSearch();
		Thread.sleep(4000);
		sp.siteActionTerminate("BT004");
		logger.info("Site terminated");
		driver.navigate().refresh();
	}
	@Test(priority=9)
	public void siteDelete() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.searchSiteCode("BT002");
		sp.siteSearch();
		Thread.sleep(4000);
		sp.delSiteIcon("BT002");
		sp.deleteAlert();
		logger.info("Site deleted");
		driver.navigate().refresh();
	}	
	@Test(priority=10)
	public void siteDeleteWithPatient() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.searchSiteCode("UiVision site01");
		sp.siteSearch();
		Thread.sleep(4000);
		sp.delSiteIcon("UiVision site01");
		sp.deleteSiteWithPatientsAlert();
		logger.info("Site having patients cannot be deleted");
		driver.navigate().refresh();
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
