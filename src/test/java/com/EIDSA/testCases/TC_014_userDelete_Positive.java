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

		Thread.sleep(5000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("scroll(0, 900);");
		Thread.sleep(6000);
		UserPage up=new UserPage(driver);
		WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[7]/ul[1]/li[2]/a[1]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		Thread.sleep(5000);	
		up.searchEmail("automationtesterabc@yopmail.com");
		up.searchClick();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//tbody/tr[1]/td[11]/i[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("Are you sure you want to delete this user?"));
		alert.accept();
		logger.info("User deleted successfully");
	
		
	}

}
