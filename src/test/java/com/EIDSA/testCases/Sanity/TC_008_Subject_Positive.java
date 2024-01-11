
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
	
	@Test(priority=1)
	public void subjectCreation() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		StudyProfile sp1 = new StudyProfile(driver);
		sp1.selectStudy("DMS");
		sp.clickSubject1();
		sp.createSubject("001","003","11-01-2024");
		sp.subjectAlert();
		logger.info("Subject created successfully");
	}

	@Test(priority=2)
	public void schedule() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.searchSiteCode("001");
		sp.searchSubjectId("003");
		sp.scheduleSubject("003");
		sp.scheduleAlert();
		logger.info("Schedule created successfully");	
		driver.navigate().refresh();////
	}
	
	/*@Test(priority=3)
	public void delete() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.searchSiteCode("001");
		sp.searchSubjectId("003");
		sp.delSubject("003");
		sp.subjectDelAlert();
		logger.info("Subject deleted successfully");
		driver.navigate().refresh();
	}*/
	
	
}
