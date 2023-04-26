package com.EIDSA.testCases;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.StudyPage;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_016_study_create_verify_search_auditTrail_edit_delete_Positive extends BaseClassTest {

	@Test(dataProvider = "StudyData")
	public void Study_positive(String studId,String studName,String postvisit,String Sponsor,String StudyNotes,String PreVisit,String NumberOfSites,String NumberOfSubject) throws IOException, InterruptedException
	{
	
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.createStudy(studId,studName,postvisit,Sponsor,StudyNotes,PreVisit,NumberOfSites,NumberOfSubject);
		sp.studyAlert();
		logger.info("Study created successfully");
		sp.verifyStudy(studId);
		logger.info("Study verified successfully");
		sp.searchStudyId("SIDA15");
		sp.searchStudyStatus("New");
		sp.studySearch();
		Thread.sleep(8000);
		Assert.assertTrue(sp.studySearchValidation("SIDA15"));
		Assert.assertTrue(sp.studyStatusValidation("New"));
		logger.info("Study search functionality verified");
		sp.auditTrail("SIDA15");
		sp.editStudyIcon("SIDA15");
		sp.editStudy("SIDC14");
		sp.editAlert();
		logger.info("Study updated successfully");	
		sp.delStudyIcon("SIDC14");
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
