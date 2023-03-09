package com.Ds_Algo_Portal.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.Ds_Algo_Portal.PageObject.Sign_in_page;

public class TC_Sign_in_page_004 extends BaseClass {

	@Test(priority = 0)
	public void clickLoginWithEmptyUsernamePasswordTest21() {
		driver.get(signinURL);
		Sign_in_page signP = new Sign_in_page(driver);
		signP.clickLoginButton();

		String validationMessage = signP.userNameValidationMsg();
		System.out.println(validationMessage);

		if (validationMessage.equals("Please fill out this field.")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 1)
	public void clickLoginWithEmptyPasswordTest22() {
		driver.get(signinURL);
		Sign_in_page signP = new Sign_in_page(driver);
		signP.setUserName(userName);

		signP.clickLoginButton();

		String validationMessage = signP.passwordValidationMsg();
		System.out.println(validationMessage);

		if (validationMessage.equals("Please fill out this field.")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 2)
	public void clickLoginInvalidPasswordTest23() {
		driver.get(signinURL);
		Sign_in_page signP = new Sign_in_page(driver);
		signP.setUserName(userName);
		signP.setPassword("ab12cr5");
		signP.clickLoginButton();

		String alertMessage = signP.alert_primary_msg();
		System.out.println(alertMessage);

		if (alertMessage.equals("Invalid Username and Password")) {

			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 4)
	public void youAreLoggedInTest24() {
		driver.get(signinURL);
		Sign_in_page signP = new Sign_in_page(driver);
		signP.setUserName(userName);
		signP.setPassword(password);
		signP.clickLoginButton();

		String alertMessage = signP.alert_primary_msg();
		System.out.println(alertMessage);
		System.out.println(signP.loggedinUserNamemsg().toUpperCase().equals(userName.toUpperCase()));

		if (alertMessage.equals("You are logged in")
				&& signP.loggedinUserNamemsg().toUpperCase().equals(userName.toUpperCase())) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 2)
	public void inValidUserNamewithValidPasswordTest25() {
		driver.get(signinURL);
		Sign_in_page signP = new Sign_in_page(driver);
		signP.setUserName("sam4546");
		signP.setPassword(password);
		signP.clickLoginButton();

		String alertMessage = signP.alert_primary_msg();
		System.out.println(alertMessage);

		if (alertMessage.equals("Please check your user id"))// will fail
		{
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 3)
	public void validUserNamewithInvalidPasswordTest26() {
		driver.get(signinURL);
		Sign_in_page signP = new Sign_in_page(driver);
		signP.setUserName(userName);
		signP.setPassword("er45ygb45");
		signP.clickLoginButton();

		String alertMessage = signP.alert_primary_msg();
		System.out.println(alertMessage);

		if (alertMessage.equals("Please check your user password"))// will fail
		{
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}
