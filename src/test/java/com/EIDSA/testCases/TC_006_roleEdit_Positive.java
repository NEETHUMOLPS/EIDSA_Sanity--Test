package com.EIDSA.testCases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.Roles;
import Base.BaseClassTest;

public class TC_006_roleEdit_Positive  extends BaseClassTest {
	
	@Test
	public void RolePage() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.clickRoles();
		rp.searchRoles("Data Reviewer");
		rp.clickSearch();
		rp.edit("Data Reviewer");
		rp.editData("NA");
		rp.clickSubmit();
		Thread.sleep(3000);
		rp.Alert2();
		logger.info("Role updated");			
	   }
}

