package com.EIDSA.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.SubmitForm;

import Base.BaseClassTest;

public class TC_034_SubmitForm_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void SaveForm() throws IOException, InterruptedException
	{
		SubmitForm fp = new SubmitForm(driver);
		fp.clickSubmitForm();
		fp.selectSubmitForm("01");
		fp.fillFormSave();
		fp.Alert1();
		logger.info("Form saved successfully");		
		Thread.sleep(4000);
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void ReviewandSubmitForm() throws IOException, InterruptedException
	{
		SubmitForm fp = new SubmitForm(driver);
		fp.clickSubmitForm();
		fp.selectSubmitForm("01");
		fp.fillFormReviewAndSubmit();
		fp.Alert2();
		logger.info("Form submitted successfully");	
		Thread.sleep(4000);
		driver.navigate().refresh();
	}
	
	/*@Test(priority=3)
	public void submit_Tree_Save() throws IOException, InterruptedException
	{
		SubmitForm fp = new SubmitForm(driver);
		fp.clickSubmitForm();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//label[contains(text(),'Demo01')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[contains(text(),'demo05')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[3]/div/div[2]/ul/li[7]/ul[4]/li/ul[2]/li/label/span")).click();
		Thread.sleep(4000);
		fp.fillFormSave();
		fp.Alert1();
		logger.info("Form saved successfully");		
		Thread.sleep(4000);
		driver.navigate().refresh();	
	}
	
	@Test(priority=4)
	public void submit_Tree_ReviewAndSubmit() throws IOException, InterruptedException
	{
		SubmitForm fp = new SubmitForm(driver);
		fp.clickSubmitForm();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//label[contains(text(),'Demo01')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//label[contains(text(),'demo05')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[3]/div/div[2]/ul/li[7]/ul[4]/li/ul[2]/li/label/span")).click();
		Thread.sleep(4000);
		fp.fillFormReviewAndSubmit();
		fp.Alert2();
		logger.info("Form submitted successfully");		
		Thread.sleep(4000);
		driver.navigate().refresh();	
	}*/

}
