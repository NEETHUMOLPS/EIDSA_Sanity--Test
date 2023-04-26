package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EIDSA.pageObjects.SubjectPage;

import Base.BaseClassTest;

public class TC_021_Subject_Negative extends BaseClassTest {
	
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
	}

}
