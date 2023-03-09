package com.Ds_Algo_Portal.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.Ds_Algo_Portal.PageObject.HomePage;
import com.Ds_Algo_Portal.PageObject.RegisterPage;

public class TC_RegisterPage_003 extends BaseClass {

	@Test(priority = 0)
	public void registerPageEmptyInputTest13() {
		driver.get(registerURL);
		RegisterPage rp = new RegisterPage(driver);
		rp.click_register_button();

		String validationMessage = rp.userNameValidationMsg();
		System.out.println(validationMessage);

		if (validationMessage.equals("Please fill out this field.")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 1)
	public void registerPageUsernameInputTest14() {
		driver.get(registerURL);
		RegisterPage rp = new RegisterPage(driver);
		rp.setUserName("jabcd12390");
		rp.click_register_button();

		String validationMessage = rp.passwordValidationMsg();
		System.out.println(validationMessage);

		if (validationMessage.equals("Please fill out this field.")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 2)
	public void registerPageUsernamePasswordInputTest15() {
		driver.get(registerURL);
		RegisterPage rp = new RegisterPage(driver);
		rp.setUserName("abcd123");
		rp.setPassword("AB1234CD");
		rp.click_register_button();

		String validationMessage = rp.passwordConfirmationValidationMsg();
		System.out.println(validationMessage);

		if (validationMessage.equals("Please fill out this field.")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 3)
	public void registerPageUsernameCharacterInputTest16() {
		driver.get(registerURL);
		RegisterPage rp = new RegisterPage(driver);
		rp.setUserName("$%^&");
		rp.setPassword("AB1234CD");
		rp.setConfirmationPasword("AB1234CD");
		rp.click_register_button();

		String alertMessage = rp.alert_primary_msg();
		System.out.println(alertMessage);

		if (alertMessage.equals("Please enter a valid username")) // testcase will fail
		{
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 4)
	public void registerPagePasswordMismatchInputTest17() {
		driver.get(registerURL);
		RegisterPage rp = new RegisterPage(driver);
		rp.setUserName("abcd12345");
		rp.setPassword("AB1234CD");
		rp.setConfirmationPasword("XY1234ZZ");
		rp.click_register_button();

		String alertMessage = rp.alert_primary_msg();
		System.out.println(alertMessage);

		if (alertMessage.equals("password_mismatch:The two password fields didn’t match.")) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 5)
	public void registerPagePasswordLessThen8InputTest18() {
		driver.get(registerURL);
		RegisterPage rp = new RegisterPage(driver);
		rp.setUserName("abcd12345");
		rp.setPassword("!#$%");
		rp.setConfirmationPasword("!@#$%");
		rp.click_register_button();

		String alertMessage = rp.alert_primary_msg();
		System.out.println(alertMessage);

		if (alertMessage.equals("Password should contain atleast 8 characters"))// test case will fail
		{
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 6)
	public void registerPagePasswordNumbersInputTest19() {
		driver.get(registerURL);
		RegisterPage rp = new RegisterPage(driver);
		rp.setUserName("abcd12345");
		rp.setPassword("43215678");
		rp.setConfirmationPasword("43215678");
		rp.click_register_button();

		String alertMessage = rp.alert_primary_msg();
		System.out.println(alertMessage);

		if (alertMessage.equals("Your password can’t be entirely numeric."))// fail
		{
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 7)
	public void registerPageRedirectingHomePageWithAccountCreatedMsgTest20() {
		driver.get(registerURL);
		RegisterPage rp = new RegisterPage(driver);
		HomePage hp = new HomePage(driver);
		String userName = "sanw1234590";
		rp.setUserName(userName);
		rp.setPassword("Te$ting12");
		rp.setConfirmationPasword("Te$ting12");
		rp.click_register_button();
		System.out.println(driver.getCurrentUrl());

		String alertMessage = hp.alert_primary_msg();
		System.out.println(alertMessage);

		if (alertMessage.equals("New Account Created. You are logged in as " + userName)
				&& driver.getCurrentUrl().equals(homeURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

}
