package com.EIDSA.testCases;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.ForgotPassword;
import Base.BaseClass;

public class TC_003_forgotPassword_Positive extends BaseClass{
	@Test
	public void forgotPassword_positive() throws IOException, InterruptedException
	{
		logger.info("URL is opened");
		ForgotPassword fp = new ForgotPassword(driver);
		fp.clickforgotPassword();
		logger.info("Clicked on Forgot Password");
		fp.clickEmail();
		fp.setEmail("neethumolp@datamatica.uk");
		fp.clickSubmit();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert = driver.switchTo().alert();
		Assert.assertTrue(alert.getText().contains("We have sent you a password reset link. Please check your email."));
		alert.accept();
		if(driver.getCurrentUrl().equals("https://eidsa.dev.datamatica.uk/"))
		{
		Assert.assertTrue(true);
		logger.info("Successfully sent password reset link");
		}
		else
		{
		captureScreen(driver, "forgotPassword_positive");
		Assert.assertTrue(false);
		logger.info("Test case failed-sending password reset link");
		}
		}	
}