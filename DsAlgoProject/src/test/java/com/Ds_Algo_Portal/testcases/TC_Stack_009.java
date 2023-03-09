package com.Ds_Algo_Portal.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.Ds_Algo_Portal.PageObject.Stack;
import com.Ds_Algo_Portal.PageObject.TryEditor;

public class TC_Stack_009 extends BaseClass {
	@Test(priority =1)
	public void clickGetStaredButtonOfStackTest62() {
		driver.get(homeURL);
		Stack st = new Stack (driver); 
		st.click_stack_getStared();
		System.out.println(driver.getCurrentUrl());
		
		
		if (driver.getCurrentUrl().equals(stackURL))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=2)
	public void clickOperationInStackButtonTest63() {
		driver.get(stackURL);
		logger.info("User is at Stack Page");
		Stack st = new Stack (driver); 
		st.click_operationInStackButton();
		System.out.println(driver.getCurrentUrl());
		
		
		if (driver.getCurrentUrl().equals(operationInStackURL))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority = 3)
	public void clickOperationInStackTryHereButtonTest64() throws InterruptedException {
		driver.get(operationInStackURL);
		Stack st = new Stack (driver); 
		TryEditor ted = new TryEditor(driver);
		st.click_operationInStackTryHereButton();
		
		String code = "print \"Hello\";";
		ted.setCode(code);
		System.out.println("Code got entered: "+code);
		ted.clickRunBut();
		System.out.println(driver.getCurrentUrl());
		
		
		if (driver.getCurrentUrl().equals(tryEditorURL) && ted.checkTryEditorRunButton())
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	

	@Test(priority = 4)
	public void clickImplementationButtonTest65() {
		driver.get(stackURL);
		Stack st = new Stack (driver); 
		st.click_implementationButton();
		System.out.println(driver.getCurrentUrl());
		
		
		if (driver.getCurrentUrl().equals(stackImplementationURL))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority = 5 )
	public void clickImplementationTryHereButtonTest66() throws InterruptedException {
		driver.get(stackImplementationURL);
		Stack st = new Stack (driver); 
		TryEditor ted = new TryEditor(driver);
		st.click_implementationTryHereButton();
		
		String code = "print \"Hello\";";
		ted.setCode(code);
		System.out.println("Code got entered: "+code);
		ted.clickRunBut();
		System.out.println(driver.getCurrentUrl());
		
		
		if (driver.getCurrentUrl().equals(tryEditorURL) && ted.checkTryEditorRunButton())
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
}
	
	@Test(priority = 6)
	public void clickApplicationsButtonTest67() {
		driver.get(stackURL);
		Stack st = new Stack (driver); 
		st.click_stackApplicationButton();
		System.out.println(driver.getCurrentUrl());
		
		
		if (driver.getCurrentUrl().equals(stackApplicationURL))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority = 7)
	public void clickApplicationsTryHereButtonTest68() throws InterruptedException {
		driver.get(stackApplicationURL);
		Stack st = new Stack (driver); 
		TryEditor ted = new TryEditor(driver);
		st.click_applicationsTryHereButton();
		
		String code = "print \"Hello\";";
		ted.setCode(code);
		System.out.println("Code got entered: "+code);
		ted.clickRunBut();
		System.out.println(driver.getCurrentUrl());
		
		
		if (driver.getCurrentUrl().equals(tryEditorURL) && ted.checkTryEditorRunButton())
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
}
	@Test(priority = 8)
	public void clickPracticequestionButtonTest69() {
		driver.get(operationInStackURL);
		Stack st = new Stack (driver); 
		st.click_stackPagePracticeQuestion();
		System.out.println(driver.getCurrentUrl());
		
	
}
	
}
