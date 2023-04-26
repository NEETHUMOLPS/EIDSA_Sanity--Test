package com.EIDSA.testCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.LoginPage;
import com.EIDSA.pageObjects.Roles;

import Base.BaseClass;
import Base.BaseClassTest;

public class TC_007_roleDelete_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void roleDelete01() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.clickRoles();
		rp.searchRoles("Automation Tester06");
		rp.clickSearch();
		rp.delete("Automation Tester06");
		rp.Alert3();
		logger.info("Role deleted successfully");	
		driver.navigate().refresh();
	}
	
	@Test(priority=2)
	public void roleDelete02() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.clickRoles();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,-700)");
		Thread.sleep(3000);
		rp.searchRoles("AutomationTester");
		rp.clickSearch();
		rp.delete("AutomationTester");
		rp.Alert4();
		logger.info("Test passed");			
	}
	
}
