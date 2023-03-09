package com.Ds_Algo_Portal.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;


import com.Ds_Algo_Portal.PageObject.Linked_List;
import com.Ds_Algo_Portal.PageObject.TryEditor;


public class TC_LinkedList_008 extends BaseClass {

	@Test(priority = 0)
	public void clickLikedListGetStartedButtonTest46() {
		driver.get(homeURL);
		Linked_List llist = new Linked_List(driver);
		llist.clickLinkedListGetStared();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(linkedListURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test(priority = 1)
	public void clickIntroductionButton47() {
		driver.get(linkedListURL);
		Linked_List llist = new Linked_List(driver);
		llist.clickIntroductionbutton();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(linkedListIntroductionURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 2)
	public void clickIntroductionTryHereButton48() {
		driver.get(linkedListIntroductionURL);
		Linked_List llist = new Linked_List(driver);
		TryEditor tr = new TryEditor(driver);
		llist.clicklinkedListTryHereButton();
		String code = "print \"Hello\";";
		tr.setCode(code);
		tr.clickRunBut();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(tryEditorURL) && tr.checkTryEditorRunButton()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 3)
	public void clickCreatingLinkedListButton49() {
		driver.get(linkedListURL);
		logger.info("User is at Linkkelist Page");
		Linked_List llist = new Linked_List(driver);
		llist.clickCreatLinkedListButton();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(linkedListCreateLinkListURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test(priority = 4)
	public void clickLinkedListCreatingLinkedListTryHereButton50() {
		driver.get(linkedListCreateLinkListURL);
		Linked_List llist = new Linked_List(driver);
		TryEditor tr = new TryEditor(driver);
		llist.clickLinkedListCreatingLinkedListTryHereButton();
		String code = "print \"Hello\";";
		tr.setCode(code);
		tr.clickRunBut();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(tryEditorURL) && tr.checkTryEditorRunButton()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clickTypesOfLinkedListButton51() {
		driver.get(linkedListURL);
		Linked_List llist = new Linked_List(driver);
		llist.clickTypesOfLinkedListButton();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(linkedListTypesOfLinkedListURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void clickTypeOfLinkedListTryHereButton52() {
		driver.get(linkedListTypesOfLinkedListURL);
		Linked_List llist = new Linked_List(driver);
		TryEditor tr = new TryEditor(driver);
		llist.clickTypeOfLinkedListTryHereButton();
		System.out.println(driver.getCurrentUrl());
		String code = "print \"Hello\";";
		tr.setCode(code);
		tr.clickRunBut();
		if (driver.getCurrentUrl().equals(tryEditorURL) && tr.checkTryEditorRunButton()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clickImplimentLinkedList53() {
		driver.get(linkedListURL);
		Linked_List llist = new Linked_List(driver);
		llist.clickImplimentLinkesListInPythonButton();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(implimentLinkedListInPythonURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void clickTypeOfLinkedListTryHereButton54() {
		driver.get(linkedListTypesOfLinkedListURL);
		Linked_List llist = new Linked_List(driver);
		TryEditor tr = new TryEditor(driver);
		llist.clickImplimentLinkedListInPythonTryHereButton();
		String code = "print \"Hello\";";
		tr.setCode(code);
		tr.clickRunBut();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(tryEditorURL) && tr.checkTryEditorRunButton()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clickTraversal55() {
		driver.get(linkedListURL);
		Linked_List llist = new Linked_List(driver);
		llist.clickTraversalButton();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(linkedListTraversalURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void clickTraversalTryHereButton56() {
		driver.get(linkedListTypesOfLinkedListURL);
		Linked_List llist = new Linked_List(driver);
		TryEditor tr = new TryEditor(driver);
		llist.clickTraversalTryHereButton();
		String code = "print \"Hello\";";
		tr.setCode(code);
		tr.clickRunBut();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(tryEditorURL) && tr.checkTryEditorRunButton()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clickInsertionl57() {
		driver.get(linkedListURL);
		Linked_List llist = new Linked_List(driver);
		llist.clickInsertionButton();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(linkedListInsertionURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void clicknsertionTryHereButton58() {
		driver.get(linkedListInsertionURL);
		Linked_List llist = new Linked_List(driver);
		TryEditor tr = new TryEditor(driver);
		llist.clickInsertionTryHereButton();
		System.out.println(driver.getCurrentUrl());
		String code = "print \"Hello\";";
		tr.setCode(code);
		tr.clickRunBut();
		if (driver.getCurrentUrl().equals(tryEditorURL) && tr.checkTryEditorRunButton()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clickDeletion59() {
		driver.get(linkedListURL);
		System.out.println(driver.getCurrentUrl());
		Linked_List llist = new Linked_List(driver);
		llist.clickDeletionButton();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(linkedListDeletionURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}

	}

	@Test
	public void clicknsertionTryHereButton60() {
		driver.get(linkedListDeletionURL);
		Linked_List llist = new Linked_List(driver);
		TryEditor tr = new TryEditor(driver);
		llist.clickdeletionTryHereButton();
		System.out.println(driver.getCurrentUrl());
		String code = "print \"Hello\";";
		tr.setCode(code);
		tr.clickRunBut();
		if (driver.getCurrentUrl().equals(tryEditorURL) && tr.checkTryEditorRunButton()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clickPracticeQuestionlButton61() {
		driver.manage().window().maximize();
		driver.get(linkedListIntroductionURL);
		System.out.println(driver.getCurrentUrl());
		Linked_List llist = new Linked_List(driver);
		llist.click_linkedlistPracticeQuestion();
		System.out.println(driver.getCurrentUrl());

	}
}