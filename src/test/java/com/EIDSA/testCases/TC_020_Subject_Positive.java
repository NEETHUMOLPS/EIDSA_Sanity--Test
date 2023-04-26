
package com.EIDSA.testCases;

import java.io.IOException;

import com.EIDSA.pageObjects.SitePage;
import com.EIDSA.pageObjects.SubjectPage;
import com.EIDSA.utilities.XLUtility;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClassTest;

public class TC_020_Subject_Positive extends BaseClassTest {
	
	@Test(priority=1, dataProvider = "SubjectData")
	public void siteCreation(String subid,String date,String previsit,String postvisit,String ct,String pc,String notes) throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.createSubject(subid,date,previsit, postvisit,ct,pc,notes);
		sp.subjectAlert();
		logger.info("Subject created successfully");
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void siteVerification() throws IOException, InterruptedException
	{	
		SubjectPage sp = new SubjectPage(driver);
		Thread.sleep(4000);
		sp.clickSubject();
		sp.verifySubject("demo01");
		logger.info("Subject verified successfully");	
		driver.navigate().refresh();
	}

	@Test(priority=3)
	public void searchValidation() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		Thread.sleep(4000);
		sp.clickSubject();
		sp.searchSiteCode("Demo01");
		sp.Search();
		Assert.assertTrue(sp.siteCodeSearchValidation("Demo01"));
		logger.info("Site code search functionality verified");
		sp.searchSubjectId("demo222");
		sp.Search();
		Assert.assertTrue(sp.subIdeSearchValidation("demo222"));
		logger.info("Subject Id search functionality verified");
		sp.searchStatus("New");
		sp.Search();
		Assert.assertTrue(sp.statusSearchValidation("New"));
		logger.info("Subject Id search functionality verified");	
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void SubjectEdit() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		Thread.sleep(4000);
		sp.clickSubject();
		sp.searchSiteCode("Demo01");
		sp.Search();
		Thread.sleep(4000);
		sp.editSubject("demo222");
		sp.editSub();
		sp.subjectEditAlert();
		logger.info("Subject updated successfully");
		driver.navigate().refresh();
	}
	
	@Test(priority=5)
	public void auditTrail() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		Thread.sleep(4000);
		sp.clickSubject();	
		sp.searchSiteCode("Demo01");
		sp.Search();
		sp.auditTrail("demo222");
		logger.info("Audit trail verified successfully");	
		driver.navigate().refresh();
	}
	
	@Test(priority=6)
	public void delete() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		Thread.sleep(4000);
		sp.clickSubject();
		sp.searchSiteCode("Demo01");
		sp.Search();
		sp.delSubject("demo222");
		sp.subjectDelAlert();
		logger.info("Subject deleted successfully");
		driver.navigate().refresh();
	}
	
	@Test(priority=7)
	public void withdrawPatient() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		Thread.sleep(4000);
		sp.clickSubject();
		sp.searchSiteCode("Demo01");
		sp.Search();
		sp.withdrawnSubject("demo223");
		sp.subjectWithdrawAlert();
		logger.info("Subject withdrew successfully");
		driver.navigate().refresh();
	}
	
	@Test(priority=8)
	public void schedule() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		Thread.sleep(4000);
		sp.clickSubject();
		sp.searchSiteCode("Demo01");
		sp.Search();
		Thread.sleep(5000);
		sp.scheduleSubject("demo223");
		sp.scheduleAlert();
		logger.info("Schedule created successfully");	
	}
	
	@Test(priority=9)
	public void completePatient() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		Thread.sleep(4000);
		sp.clickSubject();
		sp.searchSiteCode("Demo01");
		sp.Search();
		Thread.sleep(4000);
		sp.completeSubject("demo225");
		sp.subjectCompleteAlert();
		logger.info("Subject completed successfully");	
	}
	
	@Test(priority=10)
	public void duplicateSub() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		Thread.sleep(4000);
		sp.clickSubject();
		sp.clickCreateSubject();
		sp.duplicateSiteCode("Demo01");
		sp.duplicateSubjectId("demo02");
		sp.duplicatedate("14-03-2023");
		sp.saveSub();
		sp.duplicateAlert();
		logger.info("Duplicate subject id cannot be created");	
		driver.navigate().refresh();
	}
	
	@Test(priority=11)
	public void CompleteSubjectWithEnrolledStatus() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		Thread.sleep(4000);
		sp.clickSubject();
		sp.searchSiteCode("UiVision site01");
		sp.searchSubjectId("UiVision site01	");
		sp.Search();
		sp.completeSubject("UiVision site01");
		sp.completeSubjectWithEnrolledStatusAlert();
		logger.info("All the visit status should be either completed or withdrawn for completing patient");		
		driver.navigate().refresh();
	}
	
	@DataProvider(name="SubjectData")
	 String [][] getData() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\lenovo\\Desktop\\Selenium\\Subject_Positive.xlsx";
int rownum=XLUtility.getRowCount(path, "Sheet1");
	int colcount=XLUtility.getCellCount(path, "Sheet1", 1);
	
	String subdata[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			subdata[i-1][j]=XLUtility.getCellData(path, "Sheet1", i, j);
		}
	}
	
	return subdata;		
	
	
	}
	
}
