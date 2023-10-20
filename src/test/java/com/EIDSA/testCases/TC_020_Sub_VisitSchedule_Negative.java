package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EIDSA.pageObjects.SubVisitScheduleList;
import com.EIDSA.pageObjects.SubjectPage;

import Base.BaseClassTest;

public class TC_020_Sub_VisitSchedule_Negative extends BaseClassTest {
	
	@Test(priority=1)
	public void VisitSchedule() throws IOException, InterruptedException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.clickSubject();
		sp.searchSiteCode("Demo05");
		sp.findSubId("demo05");
		sp.clickUnscheduleVisit();
		sp.unScheduleVisit_negative();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(sp.errorVisitNum(), "Please enter visit no");
		softAssert.assertEquals(sp.errorVisitName(), "Please enter visit/form name");
		softAssert.assertEquals(sp.errorVisitType(), "Please select a visit type");
		softAssert.assertEquals(sp.errorPreVisit(), "Please enter a number");
		softAssert.assertEquals(sp.errorPostVisit(), "Please enter a number");
		softAssert.assertEquals(sp.errorInvestigator(), "Please enter a investigatorr");
		softAssert.assertEquals(sp.errorVisitDate(), "Please enter visit date");
		softAssert.assertEquals(sp.errorVisitTemplate(), "Please select a visit template");
		softAssert.assertAll();
        logger.info("Negative test1 passed");	
        driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void unsheduledVisitCreation() throws IOException, InterruptedException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.clickSubject();
		sp.searchSiteCode("Demo05");
		sp.findSubId("demo05");
		sp.createUnScheduleVisit("Visit100", "Visit100", "0", "0", "16-05-2023");
		sp.duplicateAlert();
		logger.info("Negative test2 passed");
	}

}
