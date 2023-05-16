package com.EIDSA.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.DesignForm;

import Base.BaseClassTest;

public class TC_065_DesignForm_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void CreateForm() throws IOException, InterruptedException
	{
		DesignForm df = new DesignForm(driver);
		df.clickDesignForm();
		df.CreateForm("Demo02");
		df.Alert1();
		logger.info("Form created");
		df.CreatePage();
		logger.info("Page created");
		Thread.sleep(3000);
		WebElement From=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[3]/a[1]/div[1]/img[1]"));
		WebElement To=driver.findElement(By.xpath("//div[contains(text(),'Drag elements here')]"));
		Actions action = new Actions(driver);
		action.dragAndDrop(From, To).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")).click();
		WebElement From1=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[9]/a[1]/div[1]/img[1]"));
		WebElement To1=driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]"));
		Actions action1 = new Actions(driver);
		action1.dragAndDrop(From, To).build().perform();
		driver.findElement(By.xpath("//input[@id='headdingtext']")).sendKeys("Patient Details");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='instructionstext']")).sendKeys("Data");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//body/div[@id='app']/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/img[1]")).click();
		df.completeDesign();
		df.Alert11();
		logger.info("Design completed");
		
	}

}
