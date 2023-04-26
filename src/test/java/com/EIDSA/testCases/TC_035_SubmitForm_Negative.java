package com.EIDSA.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EIDSA.pageObjects.SubmitForm;

import Base.BaseClassTest;

public class TC_035_SubmitForm_Negative extends BaseClassTest {
	
	@Test(priority=1)
	public void SaveForm_negative1() throws IOException, InterruptedException
	{
		SubmitForm fp = new SubmitForm(driver);
		fp.clickSubmitForm();
		fp.selectSubmitForm("01");
		fp.save();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(fp.errorMsg1(), "Please enter a value");
		softAssert.assertEquals(fp.errorMsg2(), "Please enter a value");
		softAssert.assertEquals(fp.errorMsg3(), "Please enter a value");
		softAssert.assertEquals(fp.errorMsg4(), "Please enter a value");
		softAssert.assertAll();
        logger.info("Negative test passed");
	}
	
	@Test(priority=2)
	public void SaveForm_negative2() throws IOException, InterruptedException
	{
		SubmitForm fp = new SubmitForm(driver);
		fp.clickSubmitForm();
		fp.selectSubmitForm("01");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//*[@id=\"formElements\"]/form/div/div/div/div/div[2]/div/div[1]/div/div/input")).sendKeys("j");
		driver.findElement(By.xpath("//*[@id=\"formElements\"]/form/div/div/div/div/div[2]/div/div[2]/div/div/input")).sendKeys("j");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//*[@id=\"formElements\"]/form/div/div/div/div/div[11]/div/div[2]/div/div/input")).sendKeys("j");
		driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(fp.errorMsg5(), "Please enter a value between 100 and 999");
		softAssert.assertEquals(fp.errorMsg6(), "Number of characters should be between 3 and 7");
		softAssert.assertEquals(fp.errorMsg7(), "Number of characters should be between 2 and 4");
		softAssert.assertAll();
        logger.info("Negative test passed");
	}

}
