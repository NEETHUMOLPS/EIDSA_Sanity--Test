package com.EIDSA.testCases.Sanity;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.StudyProfile;
import com.EIDSA.pageObjects.SubVisitScheduleList;
import com.EIDSA.pageObjects.SubjectPage;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_009_Sub_VisitScheduleList_Positive extends BaseClassTest{
	
	@Test(priority=1)
	public void unsheduledVisitCreation() throws IOException, InterruptedException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		StudyProfile sp1 = new StudyProfile(driver);
		sp1.selectStudy("DMS");
		sp.clickSubject();
		sp.searchSiteCode("001");
		sp.searchSubID("003");
		sp.findSubId("003");
		sp.createUnScheduleVisit("003", "003", "Home Visit", "0", "0", "Neethumol P S","11-01-2024","Patient Information");
		sp.creationAlert();
		logger.info("Unsheduled visit created successfully");
	}

	

}
