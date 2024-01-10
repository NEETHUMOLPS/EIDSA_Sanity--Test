package com.EIDSA.testCases.Sanity;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.UserPage;
import com.EIDSA.utilities.XLUtility;


import Base.BaseClassTest;

public class TC_004_Users_Positive extends BaseClassTest{
	
	@Test(priority=1, description = "Create user")
	public void userCreation() throws IOException, InterruptedException
	{		
		UserPage up=new UserPage(driver);
		up.clickUser();
		up.createUser("Neethu", "Gokul", "Neethug", "neethug@yopmail.com", "option 1", "Administrator");
		up.userCreationAlert();
	}	
	
	@Test(priority=2, description = "Set user privilege")
	public void userPrivilege() throws InterruptedException
	{
		UserPage up=new UserPage(driver);
		up.searchEmailOrName("neethug@yopmail.com");
		up.privilege1("neethug@yopmail.com");
		up.privilege2();
	    up.privilegeAlert();
	    logger.info("User privilege updated successfully");
	}
	
	@Test(priority=3, description = "Delete the user")
	public void userDelete() throws IOException, InterruptedException
	{
		UserPage up=new UserPage(driver);
		up.searchEmailOrName("neethug@yopmail.com");
		up.delete("neethug@yopmail.com");	
		up.userDeletionAlert();
	}


}
