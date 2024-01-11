package com.EIDSA.testCases.Sanity;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.EIDSA.pageObjects.FillForm;

import Base.BaseClassTest;

public class TC_010_FillForm_Positive extends BaseClassTest {
	
	@Test(priority=1, description = "Save the form")
	public void SaveForm() throws IOException, InterruptedException
	{
		FillForm fp = new FillForm(driver);
		fp.clickFillForm();
		fp.selectForm2();
		fp.fillFormSave("Neethu");
		fp.Alert1();
		logger.info("Form saved successfully");		
	}
	
	@Test(priority=2, description = "Submit the form")
	public void ReviewandSubmitForm() throws IOException, InterruptedException
	{
		FillForm fp = new FillForm(driver);
		fp.clickFillForm();
		fp.selectForm1();
		fp.fillFormReviewAndSubmit("Neethu");
		fp.Alert2();
		logger.info("Form submitted successfully");	
		fp.clickFillForm();
	}



}
