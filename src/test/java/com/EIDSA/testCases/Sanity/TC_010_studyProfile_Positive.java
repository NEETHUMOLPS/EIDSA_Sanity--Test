package com.EIDSA.testCases.Sanity;

import java.io.IOException;

import org.testng.annotations.Test;
import com.EIDSA.pageObjects.StudyProfile;
import Base.BaseClassTest;

public class TC_010_studyProfile_Positive extends BaseClassTest {

	
	@Test(priority=1)
	public void editStudy() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.clickOnStudyProfile();
		sp.editStudy("NA");
		sp.studyEditAlert();
	}
	
	@Test(priority=2)
	public void createVisit() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.createVisit("005", "005", "Home Visit", "Patient Information");
		sp.visitCreationAlert();
	}
	
	@Test(priority=3)
	public void createSite() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.createSite("005");
		sp.siteCreationAlert();
	}
	
	@Test(priority=4)
	public void createSubject() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.createSubject("001","010","10-01-2024","Neethumol P S");
		sp.subjectCreationAlert();
	}
	
	@Test(priority=5)
	public void assignTemplate() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.assignTemplate1("005");
		sp.assignTemplate2("Patient Information ( 1.0)");
		sp.assignTemplateAlert();
	}
	
	@Test(priority=6)
	public void editTemplate() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.editVisit1("005");
		sp.editVisit2("Home Visit");
		sp.editVisitAlert();
	}
	
	@Test(priority=7)
	public void deleteTemplate() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.deleteVisit("005");
		sp.deleteVisitAlert();
	}

}
