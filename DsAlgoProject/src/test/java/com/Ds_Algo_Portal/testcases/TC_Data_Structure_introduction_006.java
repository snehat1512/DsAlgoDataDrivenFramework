package com.Ds_Algo_Portal.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Ds_Algo_Portal.PageObject.Data_Structure_Introduction;

import com.Ds_Algo_Portal.PageObject.TryEditor;

public class TC_Data_Structure_introduction_006 extends BaseClass {

	@Test
	public void clickGetStaredButtonOfDataSructureTest28() {
		driver.get(homeURL);
		Data_Structure_Introduction dsi = new Data_Structure_Introduction(driver);
		dsi.click_datastructure_getstarted();
		System.out.println(driver.getCurrentUrl());

		if (driver.getCurrentUrl().equals(dataStructureURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clickTimeComplexityButtonTest29() {
		driver.get(dataStructureURL);
		Data_Structure_Introduction dsi = new Data_Structure_Introduction(driver);
		dsi.clickTimeComplexity();

		if (driver.getCurrentUrl().equals(timeComplexityURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}



	@Test
	public void clickTryHereTest31() {
		driver.get(timeComplexityURL);
		Data_Structure_Introduction dsi = new Data_Structure_Introduction(driver);
		TryEditor te = new TryEditor(driver);
		dsi.clickTryHereButton();
		String code = "print \"Hello\";";
		te.setCode(code);
		System.out.println("Code got entered: " + code);
		te.clickRunBut();

		System.out.println(driver.getCurrentUrl());

		if (driver.getCurrentUrl().equals("https://dsportalapp.herokuapp.com/tryEditor")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void clickPracticeQuestionButtonTest30() {
		driver.get(timeComplexityURL);
		Data_Structure_Introduction dsi = new Data_Structure_Introduction(driver);
		dsi.clickPracticeQuestion();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals("https://dsportalapp.herokuapp.com/data-structures-introduction/practice")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
}