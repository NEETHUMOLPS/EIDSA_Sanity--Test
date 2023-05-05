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
		vp.SearchVisitName("visit08");
		vp.SearchVisitNo("008");
		vp.clickSearch();
		vp.edit("visit08");
		vp.clickAssign();
		vp.AssignAlert2();
		logger.info("Negative test passed");
	}

}
