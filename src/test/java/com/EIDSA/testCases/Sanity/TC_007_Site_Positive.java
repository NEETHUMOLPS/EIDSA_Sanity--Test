package com.EIDSA.testCases.Sanity;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.SitePage;
import com.EIDSA.pageObjects.StudyProfile;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_007_Site_Positive extends BaseClassTest {

	@Test(priority=1, description = "Create site")
	public void siteCreation() throws IOException, InterruptedException
	{
		SitePage sp = new SitePage(driver);
		StudyProfile sp1 = new StudyProfile(driver);
		sp1.selectStudy("DMS01");
		sp.clickSite();
		sp.createSite("002","002");
		sp.siteAlert();
		logger.info("Site created successfully");	
	}
	
	@Test(priority=2, description = "Delete site")
	public void siteDelete() throws IOException, InterruptedException
	{	
		SitePage sp = new SitePage(driver);
		sp.delSiteIcon("002");
		sp.deleteAlert();
		logger.info("Site deleted");
	}
}
