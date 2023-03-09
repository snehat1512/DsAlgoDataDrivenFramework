package com.Ds_Algo_Portal.Utilities;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.Ds_Algo_Portal.testcases.BaseClass;
import com.Ds_Algo_Portal.testcases.BasePage;

import io.qameta.allure.Attachment;

public class Listener implements ITestListener{
	
	public static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}
	
	@Attachment
	public byte[] saveFailureScreenShot(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	
	
	// Text attachments for Allure
		@Attachment(value = "{0}", type = "text/plain")
		public static String saveTextLog(String message) {
			return message;
		}
		
		
		@Override
		public void onStart(ITestContext iTestContext) {
			System.out.println("I am in onStart method " + iTestContext.getName());
			//iTestContext.setAttribute("WebDriver", BasePage.getDriver());
		}

		@Override
		public void onFinish(ITestContext iTestContext) {
			System.out.println("I am in onFinish method " + iTestContext.getName());
		}

		@Override
		public void onTestStart(ITestResult iTestResult) {
			System.out.println("I am in onTestStart method " + getTestMethodName(iTestResult) + " start");
		}

		@Override
		public void onTestSuccess(ITestResult iTestResult) {
			System.out.println("I am in onTestSuccess method " + getTestMethodName(iTestResult) + " succeed");
		}

		@Override
		public void onTestFailure(ITestResult iTestResult) {
			System.out.println("I am in onTestFailure method " + getTestMethodName(iTestResult) + " failed");
			
			
			/*try {
				
				takeScreenshot(driver, stepName);
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}*/
			
			
			/*Object testClass = iTestResult.getInstance();
			WebDriver driver = BasePage.getDriver();
			
			// Allure ScreenShotRobot and SaveTestLog
			if (driver instanceof WebDriver) {
				System.out.println("Screenshot captured for test case:" + getTestMethodName(iTestResult));
				saveFailureScreenShot(driver);
			}
			// Save a log on allure.
			saveTextLog(getTestMethodName(iTestResult) + " failed and screenshot taken!");	*/	
		}

		@Override
		public void onTestSkipped(ITestResult iTestResult) {
			System.out.println("I am in onTestSkipped method " + getTestMethodName(iTestResult) + " skipped");
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
			System.out.println("Test failed but it is in defined success ratio " + getTestMethodName(iTestResult));
		}

}
