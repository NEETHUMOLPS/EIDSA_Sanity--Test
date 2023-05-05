package com.EIDSA.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.StudyPage;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_016_study_Positive extends BaseClassTest {

	@Test(dataProvider = "StudyData",priority=1)
	public void Study_positive(String studId,String studName,String postvisit,String Sponsor,String StudyNotes,String PreVisit,String NumberOfSites,String NumberOfSubject) throws IOException, InterruptedException
	{
	
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.createStudy(studId,studName,postvisit,Sponsor,StudyNotes,PreVisit,NumberOfSites,NumberOfSubject);
		sp.studyAlert();
		logger.info("Study created successfully");
		driver.navigate().refresh();
	}
	@Test(priority=2)
	public void searchStudyIdValidation() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.searchStudyId("Clinical 1");
		sp. studySearch();
		Thread.sleep(4000);
		Assert.assertTrue(sp.studySearchValidation("Clinical 1"));
		logger.info("Study search functionality verified");
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void searchStatusValidation() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.searchStudyStatus("New");
		sp. studySearch();
		Thread.sleep(4000);
		Assert.assertTrue(sp.studyStatusValidation("New"));
		logger.info("Study status functionality verified");
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void auditTrail() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.searchStudyId("TIDYAB15");
		sp. studySearch();
		sp.auditTrail("TIDYAB15");
		logger.info("Audit trail verified");
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
	public void edit() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.searchStudyId("TIDYAB15");
		sp. studySearch();
		sp.editStudyIcon("TIDYAB15");
		sp.editStudy("TIDYAB156");
		sp.editAlert();
		logger.info("Study updated successfully");	
		driver.navigate().refresh();
	}
	

	@Test(priority=5)
	public void delete() throws IOException, InterruptedException
	{	
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.searchStudyId("TIDYAB156");
		sp. studySearch();
		sp.delStudyIcon("TIDYAB156");
		sp.deleteAlert();
		logger.info("Study deleted successfully");
		
	}
	
	@DataProvider(name="StudyData")
	 String [][] getData() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\lenovo\\Desktop\\Selenium\\Study_Site_Positive.xlsx";
int rownum=XLUtility.getRowCount(path, "Sheet1");
	int colcount=XLUtility.getCellCount(path, "Sheet1", 1);
	
	String studydata[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			studydata[i-1][j]=XLUtility.getCellData(path, "Sheet1", i, j);
		}
	}
	
	return studydata;		
	
	
	}
	
	

}
