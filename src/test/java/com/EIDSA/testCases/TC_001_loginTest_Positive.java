package com.EIDSA.testCases;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.LoginPage;
import Base.BaseClass;
public class TC_001_loginTest_Positive extends BaseClass {
	
	@Test
	public void LoginTest() throws IOException
	{
		
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.setUsername(username);
		logger.info("Entered username");
		lp.setPassword(password);
		logger.info("Enterd password");
		lp.clickLogin();
		String strUrl = driver.getCurrentUrl();
	    if(driver.getTitle().equals("eidsa"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");
		}
		else
		{
			captureScreen(driver, "LoginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
		}
	}

}

