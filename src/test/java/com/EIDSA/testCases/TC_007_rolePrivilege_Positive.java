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
import com.EIDSA.pageObjects.RolePrivilege;
import Base.BaseClassTest;

public class TC_007_rolePrivilege_Positive extends BaseClassTest {
	@Test
	public void RolePrivilege() throws IOException, InterruptedException
	{
		RolePrivilege rp=new RolePrivilege(driver);
		Thread.sleep(3000);
		rp.clickRolePrivilege();
		rp.setRolePrivilege("Internal");
		rp.Alert1();
		logger.info("Role screen privilege updated successfully");   
	}
}
