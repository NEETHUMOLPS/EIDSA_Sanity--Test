package com.EIDSA.testCases;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.EIDSA.pageObjects.Roles;
import Base.BaseClassTest;

public class TC_008_roles_Negative extends BaseClassTest{
	
	//without filling mandatory and optional field
			@Test(priority=1)
			public void negativeTest1() throws InterruptedException
			{
				Roles rp=new Roles(driver);
				rp.clickRoles();
				Thread.sleep(3000);	
				rp.clickCreateRole();
				Thread.sleep(3000);
				rp.clickSubmit();
				SoftAssert softAssert = new SoftAssert();
				softAssert.assertEquals(rp.errMsg(), "Please enter role name");
				softAssert.assertAll();
				logger.info("Negative test passed"); 
			}

}


