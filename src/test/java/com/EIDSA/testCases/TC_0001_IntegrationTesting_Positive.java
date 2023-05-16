package com.EIDSA.testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.FormSummary;
import com.EIDSA.pageObjects.Forms;
import com.EIDSA.pageObjects.FormsInReview;
import com.EIDSA.pageObjects.LoginPage;
import com.EIDSA.pageObjects.PatientLogin;
import com.EIDSA.pageObjects.RolePrivilege;
import com.EIDSA.pageObjects.Roles;
import com.EIDSA.pageObjects.SitePage;
import com.EIDSA.pageObjects.StudyPage;
import com.EIDSA.pageObjects.StudyVisit;
import com.EIDSA.pageObjects.SubVisitScheduleList;
import com.EIDSA.pageObjects.SubjectPage;
import com.EIDSA.pageObjects.SubmitForm;
import com.EIDSA.pageObjects.UserPage;
import com.EIDSA.pageObjects.VisitTemplate;

import Base.BaseClassTest;

public class TC_0001_IntegrationTesting_Positive extends BaseClassTest {
	
	@Test(priority=2)
	public void RoleCreation() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.clickRoles();
		rp.createRoles("Integration Testernew", "NA");
		rp.Alert1();
		logger.info("Role added successfully");	
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void RolePrivilege() throws IOException, InterruptedException
	{		
		Thread.sleep(5000);
		RolePrivilege rp1=new RolePrivilege(driver);
		Thread.sleep(3000);
		rp1.clickRolePrivilege();
		rp1.setRolePrivilege("Integration Testernew");
		rp1.Alert1();
		logger.info("Role privilege added successfully");
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void UserCreation() throws IOException, InterruptedException
	{
		
		Thread.sleep(5000);
		UserPage up=new UserPage(driver);
		up.clickUser();
		Thread.sleep(3000);	
		up.AddUser();
		Thread.sleep(3000);	
		up.ClearFirstName();
		Thread.sleep(3000);	
		up.SetFirstName("Neethumol");
		Thread.sleep(3000);	
		up.ClearLastName();
		Thread.sleep(3000);	
		up.SetLastName("G");
		Thread.sleep(3000);	
		up.ClearPrimaryEmail();
		Thread.sleep(3000);	
		up.SetPrimaryEmail("neethumolpsG571@yopmail.com");
		Thread.sleep(3000);	
		up.ClickUserType();
		Thread.sleep(3000);	
		up.ClickRole();
		Thread.sleep(3000);	
		up.ClickSave();
		Thread.sleep(3000);	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("User created successfully."));
		alert.accept();
		logger.info("User created successfully");
		driver.navigate().refresh();
	}	
		
	@Test(priority=5)
	public void StudyCreation() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.createStudy("Int04","Int04","1","NA","NA","1","1","1");
		sp.studyAlert();
		logger.info("Study created successfully");
		driver.navigate().refresh();
	}
	
	@Test(priority=6)
	public void VisitCreation() throws IOException, InterruptedException
	{
		StudyVisit sp = new StudyVisit(driver);
		sp.clickStudy();
		sp.StudyNameOrIdSearch("Int04");
		sp.searchStudy();
		sp.visitIcon("Int04");
		sp.createVisit("intv04", "intv004", "Home Visit");
		sp.Alert1();
		logger.info("Visit added");
		driver.navigate().refresh();
	}
	
	@Test(priority=7)
	public void SiteCreation() throws IOException, InterruptedException
	{
		SitePage sp = new SitePage(driver);
		Thread.sleep(4000);
		sp.clickSite();
		sp.createSite("ints04","ints04","Neethumol","ints004@yopmail.com","1","1");
		sp.siteAlert();
		logger.info("Site created successfully");
		driver.navigate().refresh();
	}
	
	@Test(priority=8)
	public void SubjectCreation() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.createSubject("ints04","intsub04","08-05-2023","1", "1","Alappuzha","686021","NA");
		sp.subjectAlert();
		logger.info("Subject created successfully");
		driver.navigate().refresh();
	}
	
	@Test(priority=9)
	public void SUbjectSchedule() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		Thread.sleep(4000);
		sp.clickSubject();
		Thread.sleep(4000);
		sp.searchSiteCode("ints04");
		sp.Search();
		Thread.sleep(5000);
		sp.scheduleSubject("intsub04");
		sp.scheduleAlert();
		logger.info("Schedule created successfully");	
		driver.navigate().refresh();
	}
	
	@Test(priority=10)
	public void UnscheduledVisitCreation() throws IOException, InterruptedException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.clickSubject();
		sp.searchSiteCode("ints04");
		sp.findSubId("intsub04");
		sp.createUnScheduleVisit("intuns04", "intuns04", "1", "1", "08-05-2023");
		sp.creationAlert();
		logger.info("Unsheduled visit created successfully");
		driver.navigate().refresh();
	}
	
	@Test(priority=11)
	public void PatientLogin() throws IOException, InterruptedException
	{
		PatientLogin pl = new PatientLogin(driver);
		pl.clickPatientLogin();
		pl.SearchSiteCode("ints04");
		pl.Search();
		Thread.sleep(3000);
		pl.findSubId("intsub04");
		pl.AddLogin("intsub004@yopmail.com");
		pl.CreationAlert();
		logger.info("Login added successfully");
		driver.navigate().refresh();
	}
	
	@Test(priority=12)
	public void VisitTemplate() throws IOException, InterruptedException
	{
		VisitTemplate vp = new VisitTemplate(driver);
		vp.clickVisitTemplate();
		vp.SiteCode("ints04");
		vp.SubId("intsub04");
		Thread.sleep(3000);
		vp.SearchVisitName("intuns04");
		vp.SearchVisitNo("intuns04");
		vp.clickSearch();
		vp.edit("intuns04");
		vp.Template("Case Report-en-1.0");
		vp.AssignAlert1();
		logger.info("Template assigned successfully");
		driver.navigate().refresh();
	}
	
	
	@Test(priority=13)
	public void SaveForm() throws IOException, InterruptedException
	{
		SubmitForm fp = new SubmitForm(driver);
		fp.clickSubmitForm();
		fp.selectSubmitForm("intuns04");
		fp.fillFormSave();
		fp.Alert1();
		logger.info("Form saved successfully");		
		Thread.sleep(4000);
		driver.navigate().refresh();
	}
	
	@Test(priority=14)
	public void ViewForm1() throws IOException, InterruptedException
	{
		FormsInReview fs = new FormsInReview(driver);
		fs.clickFormsInReview();
		fs.searchSiteCode("ints04");
		fs.searchSubId("intsub04");
		fs.ClickSearch();
		fs.view("intuns04");
		logger.info("Form opened");
		driver.navigate().refresh();
	}

	
	@Test(priority=15)
	public void ReviewandSubmitForm() throws IOException, InterruptedException
	{
		FormsInReview fs = new FormsInReview(driver);
		fs.clickFormsInReview();
		fs.searchSiteCode("ints04");
		fs.searchSubId("intsub04");
		fs.ClickSearch();
		fs.view("intuns04");
		Thread.sleep(3000);
		fs.reviewAndSubmit();
		fs.Alert1();
		logger.info("Form submitted");
		driver.navigate().refresh();
	}
	
	@Test(priority=16)
	public void FormOpened() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.searchSiteCode("ints04");
		Thread.sleep(3000);
		fs.searchSubId("intsub04");
		Thread.sleep(3000);
		fs.ClickSearch();
		Thread.sleep(3000);
		fs.view("intuns04");
		logger.info("Form opened");
		driver.navigate().refresh();
	}
	
	@Test(priority=17)
	public void formQuery() throws IOException, InterruptedException
	{
		FormSummary fs = new FormSummary(driver);
		fs.clickFormSummary();
		fs.view("intuns04");
		fs.formQuery("Low");
		fs.Alert2();
		logger.info("Query raised");
		driver.navigate().refresh();		
	}
	
	@Test(priority=18)
	public void Archive() throws IOException, InterruptedException
	{
		Forms fs = new Forms(driver);
		fs.clickForms();
		fs.clickArchive();
		fs.Alert1();
		logger.info("Form archived");
	}

}