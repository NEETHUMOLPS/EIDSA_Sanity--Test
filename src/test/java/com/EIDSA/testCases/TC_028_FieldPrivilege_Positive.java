package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.EIDSA.pageObjects.FieldPrivilege;

import Base.BaseClassTest;

public class TC_028_FieldPrivilege_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void setFieldPrivilege() throws IOException, InterruptedException
	{
		FieldPrivilege fp = new FieldPrivilege(driver);
		fp.clickFieldPrivilege();
		fp.selectStudy("Trial study");
		fp.clickSetPrivilege("Case Report");
		fp.setPrivilege("Administrator");
		fp.Alert4();
		logger.info("Privilege added successfully");
	}

}
