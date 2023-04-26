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
			Thread.sleep(3000);
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("scroll(0, 3000);");
			Thread.sleep(3000);
			UserPage up=new UserPage(driver);
			WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[7]/ul[1]/li[2]/a[1]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.click();
			Thread.sleep(3000);	
			JavascriptExecutor je2 = (JavascriptExecutor) driver;
			je2.executeScript("window.scrollBy(0, -3000);");
			Thread.sleep(3000);	
			
			WebElement mytable = driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[2]/div/table/tbody"));
			List<WebElement> r_table = mytable.findElements(By.tagName("tr"));
		    String b_xpath = "//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[2]/div/table/tbody/tr[";
		    String a_xpath = "]/td[1]";
		    int rs_c = r_table.size();
		    for (int r = 2;r <= rs_c; r++) {
		    String n = driver.findElement(By.xpath(b_xpath + r + a_xpath)).getText();
		    if(n.contains("Ashish Philip"))
		    {
		    driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[3]/div[2]/div[2]/div/table/tbody/tr["+r+"]/td[9]")).click();
		    break;
		    }
		    up.SetAddress1("NA");
		    up.ClickSave();
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			Assert.assertTrue(alert.getText().contains("User updated successfully."));
			alert.accept();
		    logger.info("User updated successfully");
		    }
		}

}
