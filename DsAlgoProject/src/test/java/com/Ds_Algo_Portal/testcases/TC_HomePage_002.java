package com.Ds_Algo_Portal.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Ds_Algo_Portal.PageObject.HomePage;
import com.Ds_Algo_Portal.PageObject.WelcomePage;

public class TC_HomePage_002 extends BaseClass {

	@Test
	public void hpdatastructure_test() {
		driver.get(baseURL);
		WelcomePage wp = new WelcomePage(driver);
		HomePage hp = new HomePage(driver);
		wp.clickGetStarted();

		System.out.println(driver.getCurrentUrl());
		if (hp.panes.size() == 7) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void datstructure_dropd_test() {
		driver.get(homeURL);
		HomePage hp = new HomePage(driver);
		hp.click_dataStructure_dropdown();

	}

	@Test
	public void click_hp_datastructure_getsarted_test() {

		driver.get(homeURL);
		HomePage hp = new HomePage(driver);
		hp.click_datastructure_getstarted();
		if (hp.alert_primary_msg().equals("You are not logged in")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void click_firstdropdown_option_test() {

		driver.get(homeURL);
		HomePage hp = new HomePage(driver);
		hp.click_firstdropdown_option();
//		if (hp.alert_primary_msg().equals("You are not logged in")) {
//			Assert.assertTrue(true);
//		} else {
//			Assert.assertTrue(false);
//		}
	}

	@Test
	public void click_signin_tab_test_11() {

		driver.get(homeURL);
		HomePage hp = new HomePage(driver);
		hp.click_signin_tab();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(signinURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void click_register_tab_test_12() {

		driver.get(homeURL);
		HomePage hp = new HomePage(driver);
		hp.click_register_tab();
		System.out.println(driver.getCurrentUrl());

		if (driver.getCurrentUrl().equals(registerURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}