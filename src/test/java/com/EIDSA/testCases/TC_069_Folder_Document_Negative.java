package com.EIDSA.testCases;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EIDSA.pageObjects.StudyPage;

import Base.BaseClassTest;

public class TC_069_Folder_Document_Negative extends BaseClassTest{
	
	@Test(priority=1)
	public void negative_1() throws IOException, InterruptedException, Exception
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		sp.Negative1();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(sp.Err1(), "Please enter a folder name");
		softAssert.assertAll();
        logger.info("Negative test1 passed");
        driver.navigate().refresh();		
	}
	
	@Test(priority=2)
	public void negative_2() throws IOException, InterruptedException, Exception
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		sp.Negative2();
		logger.info("Negative test2 passed");
        driver.navigate().refresh();		
	}
	
	@Test(priority=3)
	public void negative_3() throws IOException, InterruptedException, Exception
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		sp.Negative3();
		sp.Alert2();
		logger.info("Negative test3 passed");
        driver.navigate().refresh();		
	}
	
	@Test(priority=4)
	public void negative_4() throws IOException, InterruptedException, Exception
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		sp.Negative4();
		sp.Alert3();
		logger.info("Negative test4 passed");
        driver.navigate().refresh();		
	}

}
