package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.StudyVisit;

import Base.BaseClassTest;

public class TC_070_StudyVisit_Positive extends BaseClassTest {

	@Test(priority=1)
	public void visitCreation() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.clickStudy();
		sp.StudyNameOrIdSearch("Clinical 1");
		sp.searchStudy();
		sp.visitIcon("Clinical 1");
		sp.createVisit("visit02", "visit02", "Home Visit");
		sp.Alert1();
		logger.info("Visit added");
	}
	
	@Test(priority=2)
	public void visitNameSearch() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.clickStudy();
		sp.StudyNameOrIdSearch("Clinical 1");
		sp.searchStudy();
		sp.visitIcon("Clinical 1");
		sp.searchVisitName("visit02");
		sp.search();
		Assert.assertTrue(sp.visitNameSearchValidation("visit01"));
		logger.info("Visit name search functionality verified");
	}
	
	@Test(priority=2)
	public void visitNoSearch() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.clickStudy();
		sp.StudyNameOrIdSearch("Clinical 1");
		sp.searchStudy();
		sp.visitIcon("Clinical 1");
		sp.searchVisitNo("visit02");
		sp.search();
		Assert.assertTrue(sp.visitNoSearchValidation("visit02"));
		logger.info("Visit number search functionality verified");
	}
	
	@Test(priority=3)
	public void edit() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.clickStudy();
		sp.StudyNameOrIdSearch("Clinical 1");
		sp.searchStudy();
		sp.visitIcon("Clinical 1");
		sp.searchVisitNo("visit02");
		sp.search();
		sp.editStudyIcon("visit02");
		sp.ClickSave();
		sp.Alert2();
		logger.info("Visit updated");	
	}
	
	@Test(priority=4)
	public void AssignTemplate() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.clickStudy();
		sp.StudyNameOrIdSearch("Clinical 1");
		sp.searchStudy();
		sp.visitIcon("Clinical 1");
		sp.searchVisitNo("visit02");
		sp.search();
		sp.assignTemplate("visit02");
		sp.templateAssigning("Case Report-en-1.0");
		sp.Alert4();
		logger.info("Template assigned");	
	}
	
	@Test(priority=5)
	public void delete() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.clickStudy();
		sp.StudyNameOrIdSearch("Clinical 1");
		sp.searchStudy();
		sp.visitIcon("Clinical 1");
		sp.searchVisitNo("visit02");
		sp.search();
		sp.delete("visit02");
		sp.Alert3();
		logger.info("Visit deleted");	
	}
	

}
