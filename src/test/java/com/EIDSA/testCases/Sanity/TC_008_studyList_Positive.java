package com.EIDSA.testCases.Sanity;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.StudyList;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_008_studyList_Positive extends BaseClassTest {

	@Test(priority=1)
	public void Study_positive() throws IOException, InterruptedException
	{
	
		StudyList sp = new StudyList(driver);
		sp.clickStudy();
		sp.createStudy("Study - 006","Clinical Study05","1","NA","Clinical study","1","1","1");
		sp.studyAlert();
		logger.info("Study created successfully");
	}
	
	@Test(priority=2)
	public void delete_Study() throws IOException, InterruptedException
	{	
		StudyList sp = new StudyList(driver);
		sp.searchStudyId("Study - 006");
		sp.delStudyIcon("Study - 006");
		sp.deleteAlert();
		logger.info("Study deleted successfully");		
	}
	
	
	

}
