package com.EIDSA.testCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EIDSA.pageObjects.RolePrivilege;

import Base.BaseClassTest;

public class TC_008_rolePrivilege_Negative extends BaseClassTest {
	@Test
	public void RolePrivilege() throws IOException, InterruptedException
	{
		RolePrivilege rp=new RolePrivilege(driver);
		Thread.sleep(3000);
		rp.clickRolePrivilege();
		rp.clickSave_negative();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(rp.errMsg(), "Please select a role");
		softAssert.assertAll();
		logger.info("Negative test passed"); 
	}

}
