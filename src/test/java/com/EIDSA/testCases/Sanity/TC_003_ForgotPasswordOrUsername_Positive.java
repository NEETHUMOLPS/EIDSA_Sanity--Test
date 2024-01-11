package com.EIDSA.testCases.Sanity;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.ForgotPassword;
import Base.BaseClass;

public class TC_003_ForgotPasswordOrUsername_Positive extends BaseClass{
	
	@Test(priority=1, description = "Forgot password")
	public void forgotPassword() throws IOException, InterruptedException
	{
		ForgotPassword fp = new ForgotPassword(driver);
		fp.clickForgotPassword_ForgotUsername();
		fp.setEmail("neethumolp@datamatica.uk");
		fp.clickSubmit();
		fp.Alert1();
	}	
	
	@Test(priority=2, description = "Forgot username")
	public void forgotUsername() throws IOException, InterruptedException
	{
		ForgotPassword fp = new ForgotPassword(driver);
		fp.clickForgotPassword_ForgotUsername();
		fp.clickUsername();
		fp.setEmail("neethumolp@datamatica.uk");
		fp.clickSubmit();
		fp.Alert2();
	}
	
}