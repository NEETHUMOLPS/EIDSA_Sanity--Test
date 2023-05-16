
package com.EIDSA.testCases;

import java.io.IOException;

import com.EIDSA.pageObjects.SitePage;
import com.EIDSA.pageObjects.SubjectPage;
import com.EIDSA.utilities.XLUtility;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Base.BaseClassTest;

public class TC_017_Subject_Positive extends BaseClassTest {
	
	@Test(priority=1, dataProvider = "SubjectData")
	public void siteCreation(String subid,String date,String previsit,String postvisit,String ct,String pc,String notes) throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		sp.createSubject("Demo01",subid,date,previsit, postvisit,ct,pc,notes);
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
		sp.searchSiteCode("Demo01");
		sp.Search();
		sp.verifySubject("demo02");
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
		Thread.sleep(3000);
		sp.searchSubjectId("demo226");
		sp.Search();
		Assert.assertTrue(sp.subIdeSearchValidation("demo226"));
		logger.info("Subject Id search functionality verified");
		Thread.sleep(3000);
		sp.searchStatus("New");
		sp.Search();
		Assert.assertTrue(sp.statusSearchValidation("New"));
		logger.info("Status search functionality verified");	
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
		sp.editSubject("demo226");
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
		sp.auditTrail("demo226");
		logger.info("Audit trail verified successfully");	
		driver.navigate().refresh();
	}
	
	@Test(priority=6)
	public void schedule() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		Thread.sleep(4000);
		sp.clickSubject();
		sp.searchSiteCode("Demo01");
		sp.Search();
		Thread.sleep(5000);
		sp.scheduleSubject("demo226");
		sp.scheduleAlert();
		logger.info("Schedule created successfully");	
	}
	
	@Test(priority=6)
	public void delete() throws IOException, InterruptedException
	{
		SubjectPage sp = new SubjectPage(driver);
		Thread.sleep(4000);
		sp.clickSubject();
		sp.searchSiteCode("Demo01");
		sp.Search();
		sp.delSubject("demo228");
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
		sp.withdrawnSubject("demo222");
		sp.subjectWithdrawAlert();
		logger.info("Subject withdrew successfully");
		driver.navigate().refresh();
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
		sp.completeSubject("demo227");
		sp.subjectCompleteAlert();
		logger.info("Subject completed successfully");	
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
