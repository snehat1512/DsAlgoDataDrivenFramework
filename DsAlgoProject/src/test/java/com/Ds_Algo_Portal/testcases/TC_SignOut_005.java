package com.Ds_Algo_Portal.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Ds_Algo_Portal.PageObject.HomePage;

public class TC_SignOut_005 extends BaseClass {

	@Test(dependsOnMethods = "com.Ds_Algo_Portal.testcases.TC_Sign_in_page_004.youAreLoggedInTest24")
	public void signoutTest27() {
		driver.get(homeURL);
		HomePage hp = new HomePage(driver);
		// hp.click_signin_tab();
		hp.click_signout_tab();
		logger.info("User Is SignedOut");
		System.out.println("Clicked");

		if (hp.alert_primary_msg().equals("Logged out successfully")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}
