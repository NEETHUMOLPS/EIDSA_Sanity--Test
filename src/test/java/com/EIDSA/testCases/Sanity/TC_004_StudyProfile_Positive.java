package com.EIDSA.testCases.Sanity;

import java.io.IOException;

import org.testng.annotations.Test;
import com.EIDSA.pageObjects.StudyProfile;
import Base.BaseClassTest;

public class TC_004_StudyProfile_Positive extends BaseClassTest {

	@Test(priority=1, description = "Create study")
	public void createStudy() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.StudyCreation("DMS01", "DMS01");
		sp.studyCreationAlert();
	}
	
	@Test(priority=2, description = "Edit study")
	public void editStudy() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.editStudy("NA");
		sp.studyEditAlert();
	}
	
	@Test(priority=3, description = "Create template")
	public void createTemplate() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.createForm("Patient Information");
		sp.formCreationAlert();
		sp.createPage01("01","Patient Name","Name","Full Name","Name in capitals");
		sp.designCompleteAlert();
		sp.backToStudyProfile();
		Thread.sleep(3000);
		sp.createForm("Patient Details");
		sp.formCreationAlert();
		sp.createPage02("01","Patient Name","Name","Full Name","Name in capitals");
		sp.designCompleteAlert();
		sp.backToStudyProfile();
		
	}
	
	@Test(priority=4, description = "Add new version")
	public void createNewVersion() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.createNewVersion1("Patient Information");
		sp.createNewVersion2("1.0", "1.1");
		sp.templateAdditionAlert();
		sp.createNewVersion3("Patient Address", "Address");
		sp.designCompleteAlert();
		sp.backToStudyProfile();
		
	}
	
	@Test(priority=5, description = "Create visit")
	public void createVisit() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.createVisit("001", "001", "Home Visit", "Patient Information");
		sp.visitCreationAlert();
		Thread.sleep(2000);
	}
	
	@Test(priority=6, description = "Assign template")
	public void assignTemplate() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.assignTemplate1("001");
		sp.assignTemplate2("Patient Information ( 1.0)");
		sp.assignTemplateAlert();
	}
	
	@Test(priority=7, description = "Edit visit")
	public void editVisit() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.editVisit1("001");
		sp.editVisit2("Site Visit");
		sp.editVisitAlert();
	}
	
	@Test(priority=8, description = "Create site")
	public void createSite() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.createSite("001");
		sp.siteCreationAlert();
	}
	
	@Test(priority=9, description = "Create subject")
	public void createSubject() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.createSubject("001","001","12-01-2024","Neethumol P S");
		sp.subjectCreationAlert();
	}

	
	@Test(priority=10, description = "Retire form")
	public void retireForm() throws IOException, InterruptedException
	{
		StudyProfile sp = new StudyProfile(driver);
		sp.retireForm1("Patient Details");
		sp.retireForm2();
		sp.formRetireAlert();
		
	}

}
