package com.EIDSA.testCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.EIDSA.pageObjects.Roles;
import com.EIDSA.utilities.XLUtility;
import Base.BaseClassTest;

public class TC_005_Roles_Positive extends BaseClassTest {
	
	@Test(priority=1,dataProvider="roleData")
	public void RolePage(String rolename,String des) throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.clickRoles();
		rp.createRoles(rolename, des);
		rp.Alert1();
		logger.info("Role added successfully");	
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void RoleNameSearch() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.clickRoles();
		rp.searchRoleName("Data Reviewer");
		rp.clickSearch();
		Thread.sleep(3000);
		Assert.assertTrue(rp.roleNameSearchValidation("Data Reviewer"));
		logger.info("Role name search functionality verified");	
		driver.navigate().refresh();
		Thread.sleep(8000);
	}
	
	@Test(priority=3)
	public void RoleEdit() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.clickRoles();
		rp.searchRoles("Data Reviewer");
		rp.clickSearch();
		rp.edit("Data Reviewer");
		Thread.sleep(2000);
		rp.editData("NA");
		Thread.sleep(2000);
		rp.clickSubmit();
		Thread.sleep(2000);
		rp.Alert2();
		logger.info("Role updated");			
	 }
	@Test(priority=4)
	public void roleDelete() throws IOException, InterruptedException
	{
		Roles rp=new Roles(driver);
		rp.clickRoles();
		rp.searchRoles("Automation Tester");
		rp.clickSearch();
		rp.delete("Automation Tester");
		rp.Alert4();
		logger.info("Role deleted successfully");	
		driver.navigate().refresh();
	}
		
	@DataProvider(name="roleData")
	String [][] getData() throws IOException
	{
	String path = "C:\\Users\\lenovo\\Desktop\\Selenium\\Role creation_Positive.xlsx";	
    int rownum=XLUtility.getRowCount(path, "Sheet1");
	int colcount=XLUtility.getCellCount(path, "Sheet1", 1);
	String roledata[][]=new String[rownum][colcount];
	for(int i=1;i<=rownum;i++)
	{
	for(int j=0;j<colcount;j++)
	{
	roledata[i-1][j]=XLUtility.getCellData(path, "Sheet1", i, j);
	}
	}
	return roledata;	
	}
}
