package com.EIDSA.testCases.Sanity;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.Roles;
import com.EIDSA.pageObjects.StudyProfile;
import com.EIDSA.utilities.XLUtility;
import Base.BaseClassTest;

public class TC_006_Roles_Positive extends BaseClassTest {
	
	@Test(priority=1, description = "Create role")
	public void roleCreation() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.clickRoles();
		rp.createRoles("Automation Tester01", "Testing");
		rp.Alert1();
		logger.info("Role added successfully");	
	}
	
	@Test(priority=2, description = "Delete role")
	public void roleDelete() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.searchRoles("Automation Tester01");
		rp.delete("Automation Tester01");
		rp.Alert4();
		logger.info("Role deleted successfully");	
	}
}
