package com.EIDSA.testCases;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.SubVisitScheduleList;
import com.EIDSA.utilities.XLUtility;

import Base.BaseClassTest;

public class TC_019_Sub_VisitScheduleList_Positive extends BaseClassTest{
	
	@Test(priority=1, dataProvider = "unsheduledVisit")
	public void unsheduledVisitCreation(String visitno,String visitname,String previsit,String postvisit,String date) throws IOException, InterruptedException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.clickSubject();
		sp.searchSiteCode("Demo05");
		sp.findSubId("demo05");
		sp.createUnScheduleVisit(visitno, visitname, previsit, postvisit, date);
		sp.creationAlert();
		logger.info("Unsheduled visit created successfully");
	}
	
	@Test(priority=2)
	public void verifyUnSheduledVisitCreation() throws IOException, InterruptedException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.clickSubject();
		sp.searchSiteCode("Demo05");
		sp.findSubId("demo05");
		sp.SearchVisitName("Visit100");
		sp.Search();
		sp.verifyUnscheduledVisit("Visit100");
		logger.info("Unsheduled visit verified");		
	}

	@Test(priority=3)
	public void visitNameSearchValidation() throws IOException, InterruptedException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.clickSubject();
		sp.searchSiteCode("Demo05");
		sp.findSubId("demo05");
		sp.SearchVisitName("Visit100");
		sp.Search();
		Thread.sleep(3000);
		Assert.assertTrue(sp.visitNameSearchValidation("Visit100"));
		logger.info("Visit name search validation successfully completed");
		Thread.sleep(3000);
		driver.navigate().refresh();
	}
		@Test(priority=4)
		public void visitStatusSearchValidation() throws IOException, InterruptedException
		{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.clickSubject();
		Thread.sleep(3000);
		sp.searchSiteCode("Demo05");
		sp.findSubId("demo05");
		Thread.sleep(2000);	
		sp.SearchVisitSchedule("Overdue");
		Thread.sleep(2000);	
		sp.Search();
		Thread.sleep(3000);
		Assert.assertTrue(sp.visitScheduleSearchValidation("Overdue"));
		logger.info("Visit schedule search validation successfully completed");		
	}
	
	@Test(priority=5)
	public void dateSearchValidation() throws IOException, InterruptedException, ParseException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.clickSubject();
		sp.searchSiteCode("Demo05");
		sp.findSubId("demo05");
		sp.Search();
		sp.SearchVisitDate("27-04-2023", "28-04-2023");
		sp.Search();
		Thread.sleep(8000);
		sp.dateSearchValidation("27/04/2023");
		Thread.sleep(3000);
		logger.info("Date search validated ");	
	}
	
	/*@Test(priority=6)
	public void withdraw() throws IOException, InterruptedException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.clickSubject();
		sp.searchSiteCode("Demo05");
		sp.findSubId("demo05");
		sp.SearchVisitName("12");
		sp.Search();
		sp.withdraw("12");
		sp.withdrawAlert();
		logger.info("Visit withdrew successfully");
	}*/
	
	@Test(priority=7)
	public void view() throws IOException, InterruptedException
	{
		SubVisitScheduleList sp = new SubVisitScheduleList(driver);
		sp.clickSubject();
		sp.searchSiteCode("Demo05");
		sp.findSubId("demo05");
		sp.SearchVisitName("11");
		sp.Search();
		sp.view("11");
		logger.info("Opened successfully");
	}
	
	@DataProvider(name="unsheduledVisit")
	 String [][] getData() throws IOException
	{
		//String path=System.getProperty("user.dir")+"/src/main/java/com/EIDSA/testData/EIDSA_Login_Negative.xlsx.xlsx";
		String path = "C:\\Users\\lenovo\\Desktop\\Selenium\\Unsheduled visit_Positive.xlsx";
int rownum=XLUtility.getRowCount(path, "Sheet1");
	int colcount=XLUtility.getCellCount(path, "Sheet1", 1);
	
	String data[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
		for(int j=0;j<colcount;j++)
		{
			data[i-1][j]=XLUtility.getCellData(path, "Sheet1", i, j);
		}
	}
	
	return data;		
	
	
	}
	

}
