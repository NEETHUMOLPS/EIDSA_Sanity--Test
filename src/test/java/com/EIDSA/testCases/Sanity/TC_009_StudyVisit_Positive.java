package com.EIDSA.testCases.Sanity;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.StudyVisit;

import Base.BaseClassTest;

public class TC_009_StudyVisit_Positive extends BaseClassTest {

	@Test(priority=1)
	public void visitCreation() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.clickStudy();
		sp.StudyNameOrIdSearch("Clinical Study - 001");
		sp.visitIcon("Clinical Study - 001");
		sp.createVisit("005", "005", "Home Visit");
		sp.Alert1();
		logger.info("Visit added");
	}
		
	@Test(priority=2)
	public void AssignTemplate() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.assignTemplate("005");
		sp.templateAssigning("Patient Information ( 1.0)");
		sp.Alert4();
		logger.info("Template assigned");	
	}
	
	@Test(priority=3)
	public void delete() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.delete("005");
		sp.Alert3();
		logger.info("Visit deleted");	
	}
	

}
