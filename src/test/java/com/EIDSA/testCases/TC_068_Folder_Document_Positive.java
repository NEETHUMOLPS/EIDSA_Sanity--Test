package com.EIDSA.testCases;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.InvalidArgumentException;
import com.EIDSA.pageObjects.StudyPage;

import Base.BaseClassTest;

public class TC_068_Folder_Document_Positive extends BaseClassTest{
	
	/*@Test(priority=1)
	public void folder() throws IOException, InterruptedException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		sp.Folder3();
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void Document() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		sp.Document1();
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void DocumentVerification() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		driver.findElement(By.xpath("//label[contains(text(),'02')]")).click();
		sp.DocumentNameSearch("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		Assert.assertTrue(sp.DocumentNameSearchValidation("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx"));
		logger.info("Document name search verified");
		Thread.sleep(5000);
		//DateFormat dateFormat1 = new SimpleDateFormat("dd-MM-yyyy ");
		//Date date = new Date();
		//String date1= dateFormat1.format(date);
		//DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy ");
		//Date date2 = new Date();
		//String date3= dateFormat2.format(date2);
		sp.DocumentDateSearch("31-05-2023");
		Assert.assertTrue(sp.DateSearchValidation("31/05/2023"));
		logger.info("Document date search  verified");
		Thread.sleep(5000);
		sp.UploadedBySearch("Neethu P S");
		Assert.assertTrue(sp.UploadedBySearchValidation("Neethu P S"));
		logger.info("Document created by search  verified");
		driver.navigate().refresh();
	}

	@Test(priority=4)
	public void edit() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[contains(text(),'01')]")).click();
		Thread.sleep(3000);
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
		driver.findElement(By.xpath("//label[contains(text(),'01')]")).click();
		sp.DocumentNameSearch("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		sp.View("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		logger.info("Document opende");
		driver.navigate().refresh();
	}
	
	@Test(priority=7)
	public void Approvals1() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		driver.findElement(By.xpath("//label[contains(text(),'01')]")).click();
		sp.DocumentNameSearch("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		sp.Approvals1("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		sp.Alert5();		
		logger.info("Approver selected");
		driver.navigate().refresh();
		
	}
	
	@Test(priority=8)
	public void Download() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		driver.findElement(By.xpath("//label[contains(text(),'01')]")).click();
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
		driver.findElement(By.xpath("//label[contains(text(),'01')]")).click();
		sp.DocumentNameSearch("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		sp.delete("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		sp.Alert4();
		logger.info("Deleted");
	}*/
	
	@Test(priority=10)
	public void Approvals2() throws IOException, InterruptedException, AWTException
	{
		StudyPage sp = new StudyPage(driver);
		sp.clickStudy();
		sp.FolderCreation1("Clinical 1");
		driver.findElement(By.xpath("//label[contains(text(),'02')]")).click();
		sp.DocumentNameSearch("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		sp.Approvals2("EIDSA_STUDY_EIDSA_20230505022527_002.xlsx");
		sp.Alert5();	
		logger.info("Approver selected");
		sp.deleteApprover();
		sp.Alert6();
		logger.info("Approver deleted successfully");
		sp.closeApproverWindow();
		driver.navigate().refresh();
		
	}
	
}
