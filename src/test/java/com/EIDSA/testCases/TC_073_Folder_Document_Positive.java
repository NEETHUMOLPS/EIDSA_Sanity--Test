package com.EIDSA.testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.InvalidArgumentException;
import com.EIDSA.pageObjects.StudyPage;

import Base.BaseClassTest;

public class TC_073_Folder_Document_Positive extends BaseClassTest{
	
	/*@Test(priority=1)
	public void folder() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		//sp.FolderCreation2("Clinical 1");
		sp.Folder3();
	}*/
	
	@Test(priority=2)
	public void Document() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		sp.Document1();
	}
	
	/*@Test(priority=3)
	public void DocumentVerification() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		sp.DocumentNameSearch("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		Assert.assertTrue(sp.DocumentNameSearchValidation("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx"));
		logger.info("Document name search verified");
		Thread.sleep(3000);
		sp.DocumentDateSearch("05-05-2023");
		Assert.assertTrue(sp.DateSearchValidation("05/05/2023"));
		logger.info("Document date search  verified");
		Thread.sleep(3000);
		sp.UploadedBySearch("Neethu P S");
		Assert.assertTrue(sp.UploadedBySearchValidation("Neethu P S"));
		logger.info("Document created by search  verified");
	}

	@Test(priority=4)
	public void edit() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		sp.DocumentNameSearch("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		sp.edit("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		sp.edit1();
		sp.documentAlert2();
		logger.info("Document edited");
		driver.navigate().refresh();
	}
	
	@Test(priority=6)
	public void view() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		sp.DocumentNameSearch("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		sp.View("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		logger.info("Document opende");
		driver.navigate().refresh();
	}
	
	@Test(priority=7)
	public void Approvals() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		sp.DocumentNameSearch("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		sp.Approvals("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		logger.info("Approver selected");
		driver.navigate().refresh();
		
	}
	
	@Test(priority=8)
	public void Download() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		sp.DocumentNameSearch("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		sp.Download("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		logger.info("Downloaded");
		driver.navigate().refresh();
	}
	
	@Test(priority=9)
	public void Delete() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		sp.DocumentNameSearch("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		sp.delete("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		logger.info("Deleted");
	}
	*/
}
