package com.EIDSA.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.EIDSA.pageObjects.UserPage;

import Base.BaseClassTest;

public class TC_012_userPage_Negative extends BaseClassTest{
	
	//without filling mandatory and optional field
		@Test(priority=1)
		public void negativeTest1() throws InterruptedException
		{
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("scroll(0, 3000);");
			UserPage up=new UserPage(driver);
			JavascriptExecutor je1 = (JavascriptExecutor) driver;
			je.executeScript("scroll(0, 3000);");
			Thread.sleep(3000);
			WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[7]/ul[1]/li[2]/a[1]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.click();
			Thread.sleep(3000);	
			JavascriptExecutor je2 = (JavascriptExecutor) driver;
			je.executeScript("window.scrollBy(0, -3000);");
			Thread.sleep(3000);	
			up.AddUser();
			up.ClearFirstName();
			up.SetFirstName("");
			up.ClearLastName();
			up.SetLastName("");
			up.ClearPrimaryEmail();
			up.SetPrimaryEmail("");
			up.ClearSecondaryEmail();
			up.SetSecondaryEmail("");
			//up.ClickUserType();
			//up.ClickRole();
			//up.ClickCountry();
			up.SetDOB("");
			up.ClearPhoneNumber();
			up.SetPhoneNumber("");
			up.ClearAddress1();
			up.SetAddress1("");
			up.ClearAddress2();
			up.SetAddress2("");
			up.ClickSave();
			SoftAssert softAssert = new SoftAssert();
			String ActualErrorMEssage1 = driver.findElement(By.xpath("//span[contains(text(),'Please enter first name.')]")).getText();	
		    String ActualErrorMEssage2 = driver.findElement(By.xpath("//span[contains(text(),'Please enter last name.')]")).getText();
	        String ActualErrorMEssage3 = driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid email address.')]")).getText();
			String ActualErrorMEssage4 = driver.findElement(By.xpath("//span[contains(text(),'Please select a user type.')]")).getText();
	        String ActualErrorMEssage5 = driver.findElement(By.xpath("//span[contains(text(),'Please select role.')]")).getText();
		    softAssert.assertEquals(ActualErrorMEssage1, "Please enter first name.");
			softAssert.assertEquals(ActualErrorMEssage2, "Please enter last name.");
			softAssert.assertEquals(ActualErrorMEssage3, "Please enter a valid email address.");
			softAssert.assertEquals(ActualErrorMEssage4, "Please select a user type.");
			softAssert.assertEquals(ActualErrorMEssage5, "Please select role.");
			softAssert.assertAll();
			logger.info("Negative test passed"); 
		}
		
		//without filling mandatory field
		@Test(priority=2)
		public void negativeTest2() throws InterruptedException
		{
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("scroll(0, 3000);");
			UserPage up=new UserPage(driver);
			JavascriptExecutor je1 = (JavascriptExecutor) driver;
			je.executeScript("scroll(0, 3000);");
			Thread.sleep(3000);
			WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[7]/ul[1]/li[2]/a[1]"));
			((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
			element.click();
			Thread.sleep(3000);	
			JavascriptExecutor je2 = (JavascriptExecutor) driver;
			je.executeScript("window.scrollBy(0, -3000);");
			Thread.sleep(3000);	
			up.AddUser();
			up.ClearFirstName();
			up.SetFirstName("");
			up.ClearLastName();
			up.SetLastName("");
			up.ClearPrimaryEmail();
			up.SetPrimaryEmail("");
			up.ClearSecondaryEmail();
			up.SetSecondaryEmail("abc@yopmail.com");
			//up.ClickUserType();
			//up.ClickRole();
			//up.ClickCountry();
			up.SetDOB("10-10-2000");
			up.ClearPhoneNumber();
			up.SetPhoneNumber("1234567893");
			up.ClearAddress1();
			up.SetAddress1("adsgdg");
			up.ClearAddress2();
			up.SetAddress2("adadgf");
			up.ClickSave();
			SoftAssert softAssert = new SoftAssert();
			String ActualErrorMEssage1 = driver.findElement(By.xpath("//span[contains(text(),'Please enter first name.')]")).getText();	
			String ActualErrorMEssage2 = driver.findElement(By.xpath("//span[contains(text(),'Please enter last name.')]")).getText();
			String ActualErrorMEssage3 = driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid email address.')]")).getText();
			String ActualErrorMEssage4 = driver.findElement(By.xpath("//span[contains(text(),'Please select a user type.')]")).getText();
			String ActualErrorMEssage5 = driver.findElement(By.xpath("//span[contains(text(),'Please select role.')]")).getText();
			softAssert.assertEquals(ActualErrorMEssage1, "Please enter first name.");
		    softAssert.assertEquals(ActualErrorMEssage2, "Please enter last name.");
			softAssert.assertEquals(ActualErrorMEssage3, "Please enter a valid email address.");
			softAssert.assertEquals(ActualErrorMEssage4, "Please select a user type.");
			softAssert.assertEquals(ActualErrorMEssage5, "Please select role.");
			softAssert.assertAll();
			logger.info("Negative test passed"); 
		}

		//without filling one of the mandatory 
				@Test(priority=3)
				public void negativeTest3() throws InterruptedException
				{
					JavascriptExecutor je = (JavascriptExecutor) driver;
					je.executeScript("scroll(0, 3000);");
					UserPage up=new UserPage(driver);
					JavascriptExecutor je1 = (JavascriptExecutor) driver;
					je.executeScript("scroll(0, 3000);");
					Thread.sleep(3000);
					WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[7]/ul[1]/li[2]/a[1]"));
					((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
					element.click();
					Thread.sleep(3000);	
					JavascriptExecutor je2 = (JavascriptExecutor) driver;
					je.executeScript("window.scrollBy(0, -3000);");
					Thread.sleep(3000);	
					up.AddUser();
					up.ClearFirstName();
					up.SetFirstName("");
					up.ClearLastName();
					up.SetLastName("P");
					up.ClearPrimaryEmail();
					up.SetPrimaryEmail("asd@yopmail.com");
					up.ClearSecondaryEmail();
					up.SetSecondaryEmail("abc@yopmail.com");
					up.ClickUserType();
					up.ClickRole();
					up.ClickCountry();
					up.SetDOB("10-10-2000");
					up.ClearPhoneNumber();
					up.SetPhoneNumber("1234567893");
					up.ClearAddress1();
					up.SetAddress1("adsgdg");
					up.ClearAddress2();
					up.SetAddress2("adadgf");
					up.ClickSave();
					SoftAssert softAssert = new SoftAssert();
					String ActualErrorMEssage1 = driver.findElement(By.xpath("//span[contains(text(),'Please enter first name.')]")).getText();	
			        //String ActualErrorMEssage2 = driver.findElement(By.xpath("//span[contains(text(),'Please enter last name.')]")).getText();
			        //String ActualErrorMEssage3 = driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid email address.')]")).getText();
			        //String ActualErrorMEssage4 = driver.findElement(By.xpath("//span[contains(text(),'Please select a user type.')]")).getText();
			       //String ActualErrorMEssage5 = driver.findElement(By.xpath("//span[contains(text(),'Please select role.')]")).getText();
			        softAssert.assertEquals(ActualErrorMEssage1, "Please enter first name.");
			       //softAssert.assertEquals(ActualErrorMEssage2, "Please enter last name.");
			        //softAssert.assertEquals(ActualErrorMEssage3, "Please enter a valid email address.");
			        //softAssert.assertEquals(ActualErrorMEssage4, "Please select a user type.");
			        //softAssert.assertEquals(ActualErrorMEssage5, "Please select role.");
			       //softAssert.assertAll();
			       logger.info("Negative test passed"); 
				}
				
				//without filling one of the mandatory 
				@Test(priority=4)
				public void negativeTest4() throws InterruptedException
				{
					JavascriptExecutor je = (JavascriptExecutor) driver;
					je.executeScript("scroll(0, 3000);");
					UserPage up=new UserPage(driver);
					JavascriptExecutor je1 = (JavascriptExecutor) driver;
					je.executeScript("scroll(0, 3000);");
					Thread.sleep(3000);
					WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[7]/ul[1]/li[2]/a[1]"));
					((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
					element.click();
							Thread.sleep(3000);	
							JavascriptExecutor je2 = (JavascriptExecutor) driver;
							je.executeScript("window.scrollBy(0, -3000);");
							Thread.sleep(3000);	
							up.AddUser();
							up.ClearFirstName();
							up.SetFirstName("Neethu");
							up.ClearLastName();
							up.SetLastName("");
							up.ClearPrimaryEmail();
							up.SetPrimaryEmail("asd@yopmail.com");
							up.ClearSecondaryEmail();
							up.SetSecondaryEmail("abc@yopmail.com");
							up.ClickUserType();
							up.ClickRole();
							up.ClickCountry();
							up.SetDOB("10-10-2000");
							up.ClearPhoneNumber();
							up.SetPhoneNumber("1234567893");
							up.ClearAddress1();
							up.SetAddress1("adsgdg");
							up.ClearAddress2();
							up.SetAddress2("adadgf");
							up.ClickSave();
							
							SoftAssert softAssert = new SoftAssert();
					       // String ActualErrorMEssage1 = driver.findElement(By.xpath("//span[contains(text(),'Please enter first name.')]")).getText();	
					        String ActualErrorMEssage2 = driver.findElement(By.xpath("//span[contains(text(),'Please enter last name.')]")).getText();
					        //String ActualErrorMEssage3 = driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid email address.')]")).getText();
					        //String ActualErrorMEssage4 = driver.findElement(By.xpath("//span[contains(text(),'Please select a user type.')]")).getText();
					        //String ActualErrorMEssage5 = driver.findElement(By.xpath("//span[contains(text(),'Please select role.')]")).getText();
					        //softAssert.assertEquals(ActualErrorMEssage1, "Please enter first name.");
					        softAssert.assertEquals(ActualErrorMEssage2, "Please enter last name.");
					        //softAssert.assertEquals(ActualErrorMEssage3, "Please enter a valid email address.");
					        //softAssert.assertEquals(ActualErrorMEssage4, "Please select a user type.");
					        //softAssert.assertEquals(ActualErrorMEssage5, "Please select role.");
					        //softAssert.assertAll();
					        logger.info("Negative test passed"); 
				}
				
				//without filling one of the mandatory 
				@Test(priority=5)
				public void negativeTest5() throws InterruptedException
				{
					JavascriptExecutor je = (JavascriptExecutor) driver;
					je.executeScript("scroll(0, 3000);");
					UserPage up=new UserPage(driver);
					JavascriptExecutor je1 = (JavascriptExecutor) driver;
					je.executeScript("scroll(0, 3000);");
					Thread.sleep(3000);
					WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[7]/ul[1]/li[2]/a[1]"));
					((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
					element.click();
							Thread.sleep(3000);	
							JavascriptExecutor je2 = (JavascriptExecutor) driver;
							je.executeScript("window.scrollBy(0, -3000);");
							Thread.sleep(3000);	
							up.AddUser();
							up.ClearFirstName();
							up.SetFirstName("Neethu");
							up.ClearLastName();
							up.SetLastName("P");
							up.ClearPrimaryEmail();
							up.SetPrimaryEmail("");
							up.ClearSecondaryEmail();
							up.SetSecondaryEmail("abc@yopmail.com");
							up.ClickUserType();
							up.ClickRole();
							up.ClickCountry();
							up.SetDOB("10-10-2000");
							up.ClearPhoneNumber();
							up.SetPhoneNumber("1234567893");
							up.ClearAddress1();
							up.SetAddress1("adsgdg");
							up.ClearAddress2();
							up.SetAddress2("adadgf");
							up.ClickSave();
							
							SoftAssert softAssert = new SoftAssert();
					        //String ActualErrorMEssage1 = driver.findElement(By.xpath("//span[contains(text(),'Please enter first name.')]")).getText();	
					        //String ActualErrorMEssage2 = driver.findElement(By.xpath("//span[contains(text(),'Please enter last name.')]")).getText();
					        String ActualErrorMEssage3 = driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid email address.')]")).getText();
					        //String ActualErrorMEssage4 = driver.findElement(By.xpath("//span[contains(text(),'Please select a user type.')]")).getText();
					        //String ActualErrorMEssage5 = driver.findElement(By.xpath("//span[contains(text(),'Please select role.')]")).getText();
					       // softAssert.assertEquals(ActualErrorMEssage1, "Please enter first name.");
					        //softAssert.assertEquals(ActualErrorMEssage2, "Please enter last name.");
					        softAssert.assertEquals(ActualErrorMEssage3, "Please enter a valid email address.");
					        //softAssert.assertEquals(ActualErrorMEssage4, "Please select a user type.");
					        //softAssert.assertEquals(ActualErrorMEssage5, "Please select role.");
					        //softAssert.assertAll();
					        logger.info("Negative test passed"); 
				}
				
				//without filling one of the mandatory 
				@Test(priority=6)
				public void negativeTest6() throws InterruptedException
				{
					JavascriptExecutor je = (JavascriptExecutor) driver;
					je.executeScript("scroll(0, 3000);");
					UserPage up=new UserPage(driver);
					JavascriptExecutor je1 = (JavascriptExecutor) driver;
					je.executeScript("scroll(0, 3000);");
					Thread.sleep(3000);
					WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[7]/ul[1]/li[2]/a[1]"));
					((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
					element.click();
							Thread.sleep(3000);	
							JavascriptExecutor je2 = (JavascriptExecutor) driver;
							je.executeScript("window.scrollBy(0, -3000);");
							Thread.sleep(3000);	
							up.AddUser();
							up.ClearFirstName();
							up.SetFirstName("Neethu");
							up.ClearLastName();
							up.SetLastName("P");
							up.ClearPrimaryEmail();
							up.SetPrimaryEmail("asd@yopmail.com");
							up.ClearSecondaryEmail();
							up.SetSecondaryEmail("abc@yopmail.com");
							//up.ClickUserType();
							up.ClickRole();
							up.ClickCountry();
							up.SetDOB("10-10-2000");
							up.ClearPhoneNumber();
							up.SetPhoneNumber("1234567893");
							up.ClearAddress1();
							up.SetAddress1("adsgdg");
							up.ClearAddress2();
							up.SetAddress2("adadgf");
							up.ClickSave();
							
							SoftAssert softAssert = new SoftAssert();
					       // String ActualErrorMEssage1 = driver.findElement(By.xpath("//span[contains(text(),'Please enter first name.')]")).getText();	
					        //String ActualErrorMEssage2 = driver.findElement(By.xpath("//span[contains(text(),'Please enter last name.')]")).getText();
					        //String ActualErrorMEssage3 = driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid email address.')]")).getText();
					        String ActualErrorMEssage4 = driver.findElement(By.xpath("//span[contains(text(),'Please select a user type.')]")).getText();
					        //String ActualErrorMEssage5 = driver.findElement(By.xpath("//span[contains(text(),'Please select role.')]")).getText();
					        //softAssert.assertEquals(ActualErrorMEssage1, "Please enter first name.");
					        //softAssert.assertEquals(ActualErrorMEssage2, "Please enter last name.");
					        //softAssert.assertEquals(ActualErrorMEssage3, "Please enter a valid email address.");
					        softAssert.assertEquals(ActualErrorMEssage4, "Please select a user type.");
					        //softAssert.assertEquals(ActualErrorMEssage5, "Please select role.");
					        //softAssert.assertAll();
					        logger.info("Negative test passed"); 
				}
				
				//without filling one of the mandatory 
				@Test(priority=7)
				public void negativeTest7() throws InterruptedException
				{
					JavascriptExecutor je = (JavascriptExecutor) driver;
					je.executeScript("scroll(0, 3000);");
					UserPage up=new UserPage(driver);
					JavascriptExecutor je1 = (JavascriptExecutor) driver;
					je.executeScript("scroll(0, 3000);");
					Thread.sleep(3000);
					WebElement element = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[7]/ul[1]/li[2]/a[1]"));
					((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
					element.click();
							Thread.sleep(3000);	
							JavascriptExecutor je2 = (JavascriptExecutor) driver;
							je.executeScript("window.scrollBy(0, -3000);");
							Thread.sleep(3000);	
							up.AddUser();
							up.ClearFirstName();
							up.SetFirstName("Neethu");
							up.ClearLastName();
							up.SetLastName("P");
							up.ClearPrimaryEmail();
							up.SetPrimaryEmail("asd@yopmail.com");
							up.ClearSecondaryEmail();
							up.SetSecondaryEmail("abc@yopmail.com");
							up.ClickUserType();
							//up.ClickRole();
							up.ClickCountry();
							up.SetDOB("10-10-2000");
							up.ClearPhoneNumber();
							up.SetPhoneNumber("1234567893");
							up.ClearAddress1();
							up.SetAddress1("adsgdg");
							up.ClearAddress2();
							up.SetAddress2("adadgf");
							up.ClickSave();
							
							SoftAssert softAssert = new SoftAssert();
					        //String ActualErrorMEssage1 = driver.findElement(By.xpath("//span[contains(text(),'Please enter first name.')]")).getText();	
					        //String ActualErrorMEssage2 = driver.findElement(By.xpath("//span[contains(text(),'Please enter last name.')]")).getText();
					        //String ActualErrorMEssage3 = driver.findElement(By.xpath("//span[contains(text(),'Please enter a valid email address.')]")).getText();
					        //String ActualErrorMEssage4 = driver.findElement(By.xpath("//span[contains(text(),'Please select a user type.')]")).getText();
					        String ActualErrorMEssage5 = driver.findElement(By.xpath("//span[contains(text(),'Please select role.')]")).getText();
					        //softAssert.assertEquals(ActualErrorMEssage1, "Please enter first name.");
					        //softAssert.assertEquals(ActualErrorMEssage2, "Please enter last name.");
					        //softAssert.assertEquals(ActualErrorMEssage3, "Please enter a valid email address.");
					        //softAssert.assertEquals(ActualErrorMEssage4, "Please select a user type.");
					        softAssert.assertEquals(ActualErrorMEssage5, "Please select role.");
					        //softAssert.assertAll();
					        logger.info("Negative test passed"); 
				}
}
