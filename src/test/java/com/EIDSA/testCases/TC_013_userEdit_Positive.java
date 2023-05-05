package com.EIDSA.testCases;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.UserPage;

import Base.BaseClassTest;

public class TC_013_userEdit_Positive extends BaseClassTest{
	
	//without filling mandatory and optional field
		@Test(priority=1)
		public void userEdit() throws InterruptedException
		{
			UserPage up=new UserPage(driver);
			up.clickUser();
			Thread.sleep(3000);	
			up.searchEmail("neethumolp@datamatica.uk");
			Thread.sleep(3000);	
			up.searchClick();
			Thread.sleep(3000);	
			up.edit("neethumolp@datamatica.uk");
			Thread.sleep(3000);	
		    up.SetAddress1("NA");
		    Thread.sleep(3000);	
		    up.ClickSave();
		    Thread.sleep(3000);	
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("User updated successfully."));
			alert.accept();
		    logger.info("User updated successfully");
		}

}
