package com.EIDSA.testCases.Sanity;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.LoginPage;
import com.EIDSA.pageObjects.SubmittedForm;

import Base.BaseClassTest;

public class TC_011_SubmittedForm_Positive extends BaseClassTest {	
	
	@Test(priority=1, description = "Open the submitted form")
	public void clickView() throws IOException, InterruptedException
	{
		SubmittedForm fs = new SubmittedForm(driver);
		LoginPage lp=new LoginPage(driver);
		fs.clickOnSubmittedForm();
		fs.viewForm();
		logger.info("Form opened");
		lp.logout();
	}

}
