package com.Ds_Algo_Portal.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Ds_Algo_Portal.PageObject.Queue;
import com.Ds_Algo_Portal.PageObject.TryEditor;

public class TC_Queue_010 extends BaseClass {
	
	@Test(priority=1)
	public void clickQueueGetStartedButtonTest70() {
		driver.get(homeURL);
		Queue que = new Queue (driver); 
		que.clickQueueGetStartedButton();;
		System.out.println(driver.getCurrentUrl());
		
		
		if (driver.getCurrentUrl().equals(queueURL))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=2)
	public void clickImplementationOfQueuePythonTest71() {
		driver.get(queueURL);
		logger.info("User is at Queue Page");
		Queue que = new Queue (driver); 
		que.clickImplementationOfQueuePythonButton();;
		System.out.println(driver.getCurrentUrl());
		
		
		if (driver.getCurrentUrl().equals(implementationOfQueueInPythonURL))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority=3)
	public void clickImplementationOfQueueInPythonTryHere72() throws InterruptedException {
		driver.get(implementationOfQueueInPythonURL);
		Queue que = new Queue (driver);
		TryEditor te = new TryEditor(driver);
		que.clickImplementationOfQueueInPythonTryHereButton();
		
		String code = "print \"Hello\";";
		te.setCode(code);
		System.out.println("Code got entered: "+code);
		te.clickRunBut();
		System.out.println(driver.getCurrentUrl());
		
		if (driver.getCurrentUrl().equals(tryEditorURL) && te.checkTryEditorRunButton())
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	@Test(priority=4)
	public void clickImplementationOfUsingCollectionsTest73() {
		driver.get(queueURL);
		Queue que = new Queue (driver); 
		que.clickImplimentationCollectionsButton();
		
		System.out.println(driver.getCurrentUrl());
		
		
		if (driver.getCurrentUrl().equals(implementationUsingCollectionURL))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	@Test(priority=5)
	public void clickImplementationUsingCollectionTryHere74() throws InterruptedException {
		driver.get(implementationUsingCollectionURL);
		Queue que = new Queue (driver);
		TryEditor te = new TryEditor(driver);
		que.clickImplementationCollectionsTryHereButton();
		String code = "print \"Hello\";";
		te.setCode(code);
		System.out.println("Code got entered: "+code);
		te.clickRunBut();
		System.out.println(driver.getCurrentUrl());
		
		if (driver.getCurrentUrl().equals(tryEditorURL) && te.checkTryEditorRunButton())
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}
	
	@Test(priority=6)
	public void clickImplementationUsingArrayTest75() {
		driver.get(queueURL);
		Queue que = new Queue (driver); 
		que.clickImplimentationUsingArayButton();
		System.out.println(driver.getCurrentUrl());
		
	}
	@Test(priority=7)
	public void clickImplementationUsingArrayTryHere76() throws InterruptedException {
		driver.get(implementationUsingArrayURL);
		Queue que = new Queue (driver);
		TryEditor te = new TryEditor(driver);
		que.clickImplementationArrayTryHereButton();
		
		String code = "print \"Hello\";";
		te.setCode(code);
		System.out.println("Code got entered: "+code);
		te.clickRunBut();
		System.out.println(driver.getCurrentUrl());
		
	}
	
	@Test(priority=8)
	public void clickQueueOperationsTest77() {
		driver.get(queueURL);
		Queue que = new Queue (driver); 
		que.clickQueueOperationsButton();
		System.out.println(driver.getCurrentUrl());
		
		
		if (driver.getCurrentUrl().equals(queueOperationURL))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}
	@Test(priority=9)
	public void clickQueueOperationsTryHere78() throws InterruptedException {
		driver.get(queueOperationURL);
		Queue que = new Queue (driver);
		TryEditor te = new TryEditor(driver);
		que.clickQueueOperationsTryHereButton();
		String code = "print \"Hello\";";
		te.setCode(code);
		System.out.println("Code got entered: "+code);
		te.clickRunBut();
		System.out.println(driver.getCurrentUrl());
		
		if (driver.getCurrentUrl().equals(tryEditorURL) && te.checkTryEditorRunButton())
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	}

	@Test(priority=10)
	public void clickQueuePracticeQuestionTest79() {
		driver.get(queueOperationURL);
		Queue que = new Queue (driver); 
		que.clickpracticeQuestionButton();
		System.out.println(driver.getCurrentUrl());
	}	

}
