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

import com.EIDSA.pageObjects.Roles;
import com.EIDSA.pageObjects.UserPage;

import Base.BaseClassTest;

public class TC_014_userDelete_Positive extends BaseClassTest {
	
	@Test
	public void userDelete() throws IOException, InterruptedException
	{
		UserPage up=new UserPage(driver);
		up.clickUser();
		Thread.sleep(3000);	
		up.searchEmail("automationterabcef@yopmail.com");
		Thread.sleep(3000);	
		up.searchClick();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/i[1]")).click();
		//up.delete("automationtesterabc@yopmail.com");
		Thread.sleep(3000);	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("Are you sure you want to delete this user?"));
		alert.accept();
		logger.info("User deleted successfully");
		driver.navigate().refresh();
	
		
	}

}
