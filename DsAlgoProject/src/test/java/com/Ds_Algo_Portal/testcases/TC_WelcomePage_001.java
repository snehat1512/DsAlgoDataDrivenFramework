package com.Ds_Algo_Portal.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.Ds_Algo_Portal.PageObject.WelcomePage;

public class TC_WelcomePage_001 extends BaseClass {

	@Test(priority = 0)
	public void welcomePageTest() {
		driver.get(baseURL);

		if (driver.getCurrentUrl().equals(baseURL)) {
			Assert.assertTrue(true);

		} else {
			Assert.assertTrue(false);

		}
	}

	@Test(priority = 1)
	public void welcomePageClickTest() {
		driver.get(baseURL);

		WelcomePage wp = new WelcomePage(driver);
		wp.clickGetStarted();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(homeURL)) {
			Assert.assertTrue(true);

		} else {
			Assert.assertTrue(false);

		}

	}

}