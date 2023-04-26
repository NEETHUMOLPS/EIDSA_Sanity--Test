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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.UserPage;
import com.EIDSA.utilities.XLUtility;


import Base.BaseClassTest;

public class TC_011_userCreation_Positive extends BaseClassTest{
	
	@Test(dataProvider="UserData")
	public void StudyPage(String FirstName, String LastName, String PrimaryEmail, String SecondaryEmail, String DOB, String PhoneNumber, String Address1, String Address2) throws IOException, InterruptedException
	{
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("scroll(0, 3000);");
		UserPage up=new UserPage(driver);
		JavascriptExecutor je1 = (JavascriptExecutor) driver;
		je1.executeScript("scroll(0, 3000);");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[7]/ul[1]/li[2]/a[1]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
		Thread.sleep(3000);	
		JavascriptExecutor je2 = (JavascriptExecutor) driver;
		je2.executeScript("window.scrollBy(0, -3000);");
		Thread.sleep(3000);	
		up.AddUser();
		up.ClearFirstName();
		up.SetFirstName(FirstName);
		up.ClearLastName();
		up.SetLastName(LastName);
		up.ClearPrimaryEmail();
		up.SetPrimaryEmail(PrimaryEmail);
		up.ClearSecondaryEmail();
		up.SetSecondaryEmail(SecondaryEmail);
		up.ClickUserType();
		up.ClickRole();
		up.ClickCountry();
		up.SetDOB(DOB);
		up.ClearPhoneNumber();
		up.SetPhoneNumber(PhoneNumber);
		up.ClearAddress1();
		up.SetAddress1(Address1);
		up.ClearAddress2();
		up.SetAddress2(Address2);
		up.ClickSave();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("User created successfully."));
		alert.accept();
		logger.info("User created successfully");		    
		/*if(driver.getCurrentUrl().equals("https://eidsa.dev.datamatica.uk/userlisting"))
		{
		Assert.assertTrue(true);
		logger.info("User created successfully");
		}
		else
		{
		captureScreen(driver, "UserPage");
		Assert.assertTrue(false);
		logger.info("User creation got failed");
		}*/
				      
		}
	@DataProvider(name="UserData")
	 String [][] getData() throws IOException
	{
	
		String path = "C:\\Users\\lenovo\\Desktop\\Selenium\\User creation_Positive.xlsx";
		int rownum=XLUtility.getRowCount(path, "Sheet1");
		int colcount=XLUtility.getCellCount(path, "Sheet1", 1);
	
		String userdata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++)
		{
		for(int j=0;j<colcount;j++)
		{
			userdata[i-1][j]=XLUtility.getCellData(path, "Sheet1", i, j);
		}
		}
	
		return userdata;	
		}

}
