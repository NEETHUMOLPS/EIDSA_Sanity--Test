package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.EIDSA.pageObjects.FieldPrivilege;

import Base.BaseClassTest;

public class TC_029_FieldPrivilege_Negative extends BaseClassTest {
	
	@Test(priority=1)
	public void negative1() throws IOException, InterruptedException
	{
		FieldPrivilege fp = new FieldPrivilege(driver);
		fp.clickFieldPrivilege();
		fp.selectStudy("Trial study");
		fp.clickSetPrivilege("Case Report");
		fp.negative1();
		fp.Alert2();
		logger.info("Negative test passed");
	}

}
