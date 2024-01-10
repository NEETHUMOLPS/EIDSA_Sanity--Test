package com.EIDSA.testCases.Sanity;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.LoginPage;
import Base.BaseClass;
public class TC_001_loginTest_Positive extends BaseClass {
	
	@Test(priority = 1 , description = "Login with valid credentials")
	public void LoginTest() throws IOException, InterruptedException
	{
		
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.login("Neethumol","neethumolp@datamatica.uk","Neethu@6");
		Thread.sleep(4000);
		lp.logout();
	}
	

}

