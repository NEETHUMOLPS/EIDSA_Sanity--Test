package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.EIDSA.pageObjects.VisitTemplate;

import Base.BaseClassTest;

public class TC_029_VisitTemplate_Negative extends BaseClassTest {
	
	@Test(priority=1)
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
		vp.clickAssign();
		vp.AssignAlert2();
		logger.info("Negative test passed");
	}

}
