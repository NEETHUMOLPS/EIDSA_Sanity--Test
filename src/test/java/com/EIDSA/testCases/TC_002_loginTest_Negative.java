package com.EIDSA.testCases;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.EIDSA.pageObjects.LoginPage;
import com.EIDSA.utilities.XLUtility;
import Base.BaseClass;

public class TC_002_loginTest_Negative extends BaseClass{

	@Test(dataProvider="LoginData")
	public void LoginTestNegative(String user, String pwd) throws InterruptedException
	{
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.clearUser();
		lp.setUsername(user);	
		logger.info("Username provided");
		lp.clearPwd();
		lp.setPassword(pwd);
		logger.info("Pssword provided");
		lp.clickLogin();
		Thread.sleep(3000);
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(lp.ErrorMsg(), "Invalid username or password.");
		softAssert.assertAll();
        logger.info("Negative test passed");
	}	
		
	@DataProvider(name="LoginData")
	 String [][] getData() throws IOException
	{
		
		String path = "C:\\Users\\lenovo\\Desktop\\Selenium\\Login_Negative.xlsx";
		int rownum=XLUtility.getRowCount(path, "Sheet1");
		int colcount=XLUtility.getCellCount(path, "Sheet1", 1);
		String logindata[][]=new String[rownum][colcount];
		for(int i=1;i<=rownum;i++)
		{
		for(int j=0;j<colcount;j++)
		{
			logindata[i-1][j]=XLUtility.getCellData(path, "Sheet1", i, j);
		}
	}	
	return logindata;		
	}	
}