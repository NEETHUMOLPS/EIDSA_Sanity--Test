
package com.EIDSA.testCases.Sanity;

import java.awt.AWTException;
import java.io.IOException;

import com.EIDSA.pageObjects.SitePage;
import com.EIDSA.pageObjects.StudyProfile;
import com.EIDSA.pageObjects.SubjectPage;
import com.EIDSA.utilities.XLUtility;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClassTest;

public class TC_008_Subject_Positive extends BaseClassTest {
	
	@Test(priority=1, description = "Create subject")
	public void subjectCreation() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		StudyProfile sp1 = new StudyProfile(driver);
		sp1.selectStudy("DMS01");
		sp.clickSubject1();
		sp.createSubject("001","002","12-01-2024");
		sp.subjectAlert();
		logger.info("Subject created successfully");
	}

	@Test(priority=2, description = "Schedule the patient visit")
	public void schedule() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.searchSiteCode("001");
		sp.searchSubjectId("001");
		sp.scheduleSubject("001");
		sp.scheduleAlert();
		logger.info("Schedule created successfully");	
	}
	
	@Test(priority=3, description = "Delete subject")
	public void delete() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.searchSiteCode("001");
		sp.searchSubjectId("002");
		sp.delSubject("002");
		sp.subjectDelAlert();
		logger.info("Subject deleted successfully");
		driver.navigate().refresh();
	}
	
	
}
