package com.EIDSA.testCases.Sanity;

import java.io.IOException;

import org.testng.annotations.Test;

import com.EIDSA.pageObjects.SitePrivilege;

import Base.BaseClassTest;

public class TC_007_SitePrivilege_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void SitePrivilege() throws IOException, InterruptedException
	{
		SitePrivilege sp = new SitePrivilege(driver);
		sp.clickSitePrivilege();
		sp.sitePrivilegeSetting("Neethur R");
		sp.Alert1();
		logger.info("User site privilege updated successfully");		
	}

}
