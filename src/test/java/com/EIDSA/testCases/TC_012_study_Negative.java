package com.EIDSA.testCases;

import java.io.IOException;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.StudyPage;

import Base.BaseClassTest;

public class TC_012_study_Negative extends BaseClassTest {
	@Test(priority=1)
	public void Study_negative1() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.clickCreateSudy();
		sp.clickSave();
		SoftAssert softAssert = new SoftAssert();
		String ActualErrorMEssage1 = driver.findElement(By.xpath("//span[contains(text(),'Please enter a study ID')]")).getText();
        Thread.sleep(3000);	
        String ActualErrorMEssage2 = driver.findElement(By.xpath("//span[contains(text(),'Please enter a study name')]")).getText();
        Thread.sleep(3000);	
        softAssert.assertEquals(ActualErrorMEssage1, "Please enter a study ID");
        softAssert.assertEquals(ActualErrorMEssage2, "Please enter a study name");
        softAssert.assertAll();
        logger.info("Negative test1 passed");	
        driver.navigate().refresh();

	}
	
	@Test(priority=2)
	public void Study_negative2() throws IOException, InterruptedException
	{
	
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.createStudy_Negative("Clinical 1","Clinical 1");
		sp.DuplicateAlert();
		logger.info("Negative test2 passed");
		driver.navigate().refresh();
	}
}
