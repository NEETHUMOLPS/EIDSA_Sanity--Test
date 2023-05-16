package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EIDSA.pageObjects.SubjectPage;

import Base.BaseClassTest;

public class TC_018_Subject_Negative extends BaseClassTest {
	
	@Test(priority=1)
	public void subjectCreationNegative() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		Thread.sleep(4000);
		sp.clickSubject();
		sp.clickCreateSubject();
		sp.saveSub();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(sp.siteCodeErrorMsg(), "Please select a site code");
		softAssert.assertEquals(sp.subIdErrorMsg(), "Please enter a subject ID");
		softAssert.assertEquals(sp.dateErrorMsg(), "Please select enrolment date");
		softAssert.assertAll();
        logger.info("Negative test passed");	
        driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void duplicateSub() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		Thread.sleep(4000);
		sp.clickSubject();
		sp.clickCreateSubject();
		sp.duplicateSiteCode("Demo01");
		sp.duplicateSubjectId("demo02");
		sp.duplicatedate("14-03-2023");
		sp.saveSub();
		sp.duplicateAlert();
		logger.info("Duplicate subject id cannot be created");	
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void CompleteSubjectWithEnrolledStatus() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		Thread.sleep(4000);
		sp.clickSubject();
		sp.searchSiteCode("UiVision site01");
		sp.searchSubjectId("UiVision site01	");
		sp.Search();
		sp.completeSubject("UiVision site01");
		sp.completeSubjectWithEnrolledStatusAlert();
		logger.info("All the visit status should be either completed or withdrawn for completing patient");		
		driver.navigate().refresh();
	}

}
