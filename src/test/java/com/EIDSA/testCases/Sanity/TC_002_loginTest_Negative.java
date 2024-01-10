package com.EIDSA.testCases.Sanity;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.EIDSA.pageObjects.LoginPage;
import com.EIDSA.utilities.XLUtility;
import Base.BaseClass;

public class TC_002_loginTest_Negative extends BaseClass{

	@Test(priority=1, description = "Login with invalid email/password")
	public void loginWithInvalidEmailAndPassword() throws InterruptedException
	{
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.login("Neethumol", "neethumolp@datamatica.u", "Neethu@4");
		Thread.sleep(1000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(lp.ErrorMsg1(), "Invalid email or password.");
		softAssert.assertAll();
        logger.info("Negative test passed");
        driver.navigate().refresh();
	}	

	@Test(priority=2, description = "Login with invalid username")
	public void loginWithInvalidUsername() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login("Neethumolps", "neethumolp@datamatica.uk", "Neethu@6");
		Thread.sleep(1000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(lp.ErrorMsg2(), "The username is not associated with this account.");
		softAssert.assertAll();
        logger.info("Negative test passed");
        lp.clearLoginCredentials();
	}
	
	
}