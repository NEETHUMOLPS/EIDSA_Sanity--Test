package com.EIDSA.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.EIDSA.pageObjects.StudyTemplate;

import Base.BaseClassTest;

public class TC_033_StudyTemplate_Positive extends BaseClassTest {
	
	@Test(priority=1)
	public void StudyTemplate() throws IOException, InterruptedException
	{
		StudyTemplate st = new StudyTemplate(driver);
		st.clickStudyTemplate();
		st.selectStudy("Trial study");
		st.clickSelect("Fitness Activity");
		st.save();
		st.Alert1();
		logger.info("Study template updated successfully");
		
		
	}
}
