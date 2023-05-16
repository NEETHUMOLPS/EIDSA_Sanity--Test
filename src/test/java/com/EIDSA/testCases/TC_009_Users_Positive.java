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

public class TC_009_Users_Positive extends BaseClassTest{
	
	@Test(dataProvider="UserData",priority=1)
	public void StudyPage(String FirstName, String LastName, String PrimaryEmail, String SecondaryEmail, String DOB, String PhoneNumber, String Address1, String Address2) throws IOException, InterruptedException
	{		
		UserPage up=new UserPage(driver);
		up.clickUser();
		Thread.sleep(3000);	
		up.AddUser();
		Thread.sleep(3000);	
		up.ClearFirstName();
		Thread.sleep(3000);	
		up.SetFirstName(FirstName);
		Thread.sleep(3000);	
		up.ClearLastName();
		Thread.sleep(3000);	
		up.SetLastName(LastName);
		Thread.sleep(3000);	
		up.ClearPrimaryEmail();
		Thread.sleep(3000);	
		up.SetPrimaryEmail(PrimaryEmail);
		Thread.sleep(3000);	
		up.ClearSecondaryEmail();
		Thread.sleep(3000);	
		up.SetSecondaryEmail(SecondaryEmail);
		Thread.sleep(3000);	
		up.ClickUserType();
		Thread.sleep(3000);	
		up.ClickRole();
		Thread.sleep(3000);	
		up.ClickCountry();
		Thread.sleep(3000);	
		up.SetDOB(DOB);
		Thread.sleep(3000);	
		up.ClearPhoneNumber();
		Thread.sleep(3000);	
		up.SetPhoneNumber(PhoneNumber);
		Thread.sleep(3000);	
		up.ClearAddress1();
		Thread.sleep(3000);	
		up.SetAddress1(Address1);
		Thread.sleep(3000);	
		up.ClearAddress2();
		Thread.sleep(3000);	
		up.SetAddress2(Address2);
		Thread.sleep(5000);	
		up.ClickSave();
		Thread.sleep(3000);	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("User created successfully."));
		alert.accept();
		logger.info("User created successfully");
		driver.navigate().refresh();
		}
	
	@Test(priority=2)
	public void EmailSearch() throws IOException, InterruptedException
	{		
		UserPage up=new UserPage(driver);
		up.clickUser();
		Thread.sleep(3000);	
		up.searchEmail("neethumolp@datamatica.uk");
		up.searchClick();
		Thread.sleep(3000);
		Assert.assertTrue(up.emailStatusValidation("neethumolp@datamatica.uk"));
		logger.info("Email search functionality verified");	
		driver.navigate().refresh();
	}
	
	@Test(priority=3)
	public void RoleSearch() throws IOException, InterruptedException
	{		
		UserPage up=new UserPage(driver);
		up.clickUser();
		Thread.sleep(3000);	
		up.searchRole("Administrator");
		up.searchClick();
		Thread.sleep(3000);
		Assert.assertTrue(up.RoleValidation("Administrator"));
		logger.info("Role search functionality verified");	
		driver.navigate().refresh();
	}
	
	@Test(priority=4)
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
	    //up.SetAddress1("NA");
	    //Thread.sleep(3000);	
	    up.ClickSave();
	    Thread.sleep(3000);	
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("User updated successfully."));
		alert.accept();
	    logger.info("User updated successfully");
	    driver.navigate().refresh();
	}
	
	@Test(priority=5)
	public void userPrivilege() throws InterruptedException
	{
		UserPage up=new UserPage(driver);
		up.clickUser();
		Thread.sleep(3000);	
		up.searchEmail("neethumolp@datamatica.uk");
		Thread.sleep(3000);	
		up.searchClick();
		Thread.sleep(3000);	
		up.privilege("neethumolp@datamatica.uk");
		Thread.sleep(2000);	
	    up.privilegeAlert();
	    Thread.sleep(2000);	
	    logger.info("User privilege updated successfully");
	    driver.navigate().refresh();
	}
	
	@Test(priority=6)
	public void auditTrail() throws IOException, InterruptedException
	{
		UserPage up=new UserPage(driver);
		up.clickUser();
		Thread.sleep(3000);		
		up.searchEmail("neethumolp@datamatica.uk");
		Thread.sleep(3000);	
		up.searchClick();
		Thread.sleep(3000);	
		//up.auditTrail("neethumolp@datamatica.uk");
		driver.findElement(By.xpath("//tbody/tr[1]/td[10]/i[1]")).click();
		WebElement e = driver.findElement(By.xpath("//strong[contains(text(),'neethumolp@datamatica.uk')]"));
		String actualText=e.getText();
		String expText="neethumolp@datamatica.uk";
		
		if(actualText.equals(expText))
		{
			Assert.assertTrue(true);
			logger.info("Audit trail verified");
			driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]/div[3]/div[1]/div[1]/div[1]/i[1]")).click();
		}
		else
		{
			captureScreen(driver, "auditTrail");
			Assert.assertTrue(false);
			logger.info("Audit trail verification failed");
		}
		driver.navigate().refresh(); 
		
	}
	
	@Test(priority=7)
	public void userDelete() throws IOException, InterruptedException
	{
		UserPage up=new UserPage(driver);
		up.clickUser();
		Thread.sleep(3000);	
		up.searchEmail("automationtesternewn01@yopmail.com");
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
