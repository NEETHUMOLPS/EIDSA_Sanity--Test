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
		rp.searchRoles("Automation Tester52");
		rp.clickSearch();
		rp.delete("Automation Tester52");
		rp.Alert3();
		logger.info("Role deleted successfully");	
		driver.navigate().refresh();
	}
	
}
