package com.EIDSA.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.FormTransfer;

import Base.BaseClassTest;

public class TC_066_FormTransfer_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void FormTransfer() throws IOException, InterruptedException
	{
			FormTransfer gq = new FormTransfer(driver);
			gq.clickFormTransfer();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[2]/div/div[2]/ul/li[1]/label")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[2]/div/div[2]/ul/li[1]/ul[8]/li/label")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[2]/div/div[2]/ul/li[1]/ul[8]/li/ul[2]/li/label")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[3]/div/div[2]/ul/li[1]/label")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[3]/div/div[2]/ul/li[1]/ul[8]/li/label")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[3]/div/div[2]/ul/li[1]/ul[8]/li/ul[3]/li/label")).click();
			Thread.sleep(3000);
			gq.clickTransfer();
			gq.Alert4();
			logger.info("Form transffered");
			driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void FormTransfer2() throws IOException, InterruptedException
	{
		FormTransfer gq = new FormTransfer(driver);
		gq.clickFormTransfer();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[2]/div/div[2]/ul/li[1]/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[2]/div/div[2]/ul/li[1]/ul[8]/li/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[2]/div/div[2]/ul/li[1]/ul[8]/li/ul[4]/li/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[3]/div/div[2]/ul/li[1]/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[3]/div/div[2]/ul/li[1]/ul[8]/li/label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[3]/div/div[2]/ul/li[1]/ul[8]/li/ul[1]/li/label")).click();
		Thread.sleep(3000);
		gq.clickTransfer();
		gq.Alert1();
		logger.info("Form transffered");
		driver.navigate().refresh();
	}


}
