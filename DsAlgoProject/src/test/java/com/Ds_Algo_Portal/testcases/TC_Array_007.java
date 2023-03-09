package com.Ds_Algo_Portal.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.Ds_Algo_Portal.PageObject.Array;
import com.Ds_Algo_Portal.PageObject.ArrayPracticePage;
import com.Ds_Algo_Portal.PageObject.QuestionPage;
import com.Ds_Algo_Portal.PageObject.TryEditor;

public class TC_Array_007 extends BaseClass {
	

	@Test
	public void clickGetStaredButtonOfArrayTest32() {
		driver.get(homeURL);
		Array ar = new Array(driver);
		ar.click_array_getStared();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(arrayURL)) {
			Assert.assertTrue(true);
		} else {
		Assert.assertTrue(false);
		}
	}

	@Test
	public void clickarraysInPythonButtonTest33() {
		driver.get(arrayURL);
		Array ar = new Array(driver);
		ar.click_arraysInPythonButton();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(arrayInPythonURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clickarraysInPythonTryHereTest34() {
		driver.get(arrayInPythonURL);
		Array ar = new Array(driver);
		TryEditor ed = new TryEditor(driver);
		ar.click_arraysInPythonTryHere();
		String code = "print \"Hello\";";
		ed.setCode(code);
		ed.clickRunBut();
		System.out.println(driver.getCurrentUrl());

		if (driver.getCurrentUrl().equals(tryEditorURL) && ed.checkTryEditorRunButton()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clickarryUsingListTest35() {
		driver.get(arrayURL);
		Array ar = new Array(driver);
		ar.click_arraysUsingList();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(arrayUsingListURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clicktryHereInArrayUsingListTest36() {
		driver.get(arrayUsingListURL);
		Array ar = new Array(driver);
		TryEditor ed = new TryEditor(driver);
		ar.click_arraysUsingListTryHere();
		String code = "print \"Hello\";";
		ed.setCode(code);
		ed.clickRunBut();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(tryEditorURL) && ed.checkTryEditorRunButton()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clickBasicOperationInlIstButtonTest37() {
		driver.get(arrayURL);
		Array ar = new Array(driver);
		ar.click_basicOperationInListButton();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(basicOperationInListURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clickBasicOperationInlIstTryHereTest38() {
		driver.get(basicOperationInListURL);
		Array ar = new Array(driver);
		TryEditor ed = new TryEditor(driver);
		ar.click_basicOperationInlIstTryHere();
		String code = "print \"Hello\";";
		ed.setCode(code);
		ed.clickRunBut();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(tryEditorURL) && ed.checkTryEditorRunButton()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clickApplicationOFArrayButtonTest39() {
		driver.get(arrayURL);
		Array ar = new Array(driver);
		ar.click_applicationOfArrayButton();
		System.out.println(driver.getCurrentUrl());
		if (driver.getCurrentUrl().equals(applicatinOfArrayURL)) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clickApplicationOfArrayTryHereTest40() {
		driver.get(applicatinOfArrayURL);
		Array ar = new Array(driver);
		TryEditor ed = new TryEditor(driver);
		ar.click_basicOperationInlIstTryHere();
		System.out.println(driver.getCurrentUrl());
		String code = "print \"Hello\";";
		ed.setCode(code);
		ed.clickRunBut();
		if (driver.getCurrentUrl().equals(tryEditorURL) && ed.checkTryEditorRunButton()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clickArrayPagePracticeQuestionButton41() {
		driver.get(applicationArrayURL);
		Array ar = new Array(driver);
		ar.click_arrayPagePracticeQuestion();
		
	}

	@Test
	public void clickSearchTheArrayLink42() throws InterruptedException {// not working
		driver.get(arrayPracticeURL);
		ArrayPracticePage arrayp = new ArrayPracticePage(driver);
		QuestionPage qusp = new QuestionPage(driver);
		arrayp.click_SearchTheArrayLink();
		qusp.clearTextBox();
		String code = "print \"Hello\";";
		qusp.setCode(code);
		System.out.println("entering the code: " + code);
		qusp.clickRunBtn();
		System.out.println(driver.getCurrentUrl());
		System.out.println(qusp.checkQuestion());
		System.out.println(qusp.checkQuestionRunButton());
		System.out.println(qusp.checkQuestioSubmitButton());
		if (qusp.checkQuestion() && qusp.checkQuestionRunButton() && qusp.checkQuestioSubmitButton()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

	@Test
	public void clickMaxConsecutiveOnesLink43() {
		driver.get(arrayPracticeURL);
		ArrayPracticePage arrayp = new ArrayPracticePage(driver);
		QuestionPage qusp = new QuestionPage(driver);
		arrayp.click_maxConswquativeOnesLink();
		System.out.println(driver.getCurrentUrl());
		qusp.clearTextBox();
		String code = "print \"Hello\";";
		qusp.setCode(code);
		System.out.println("entering the code: " + code);
		qusp.clickRunBtn();
//		if (qusp.checkQuestion() && qusp.checkQuestionRunButton() && qusp.checkQuestioSubmitButton()) {
//			Assert.assertTrue(true);
//		} else {
//			Assert.assertTrue(false);
//		}
	}

	@Test
	public void clickFindNumberWithEvenNumbersOfDigitsLink44() {
		driver.get(arrayPracticeURL);

		ArrayPracticePage arrayp = new ArrayPracticePage(driver);
		QuestionPage qusp = new QuestionPage(driver);
		arrayp.click_findNumbWithEvnNumbOfDigtLink();
		System.out.println(driver.getCurrentUrl());
		qusp.clearTextBox();
		String code = "print \"Hello\";";
		qusp.setCode(code);
		System.out.println("entering the code: " + code);
		qusp.clickRunBtn();
//		if (qusp.checkQuestion() && qusp.checkQuestionRunButton() && qusp.checkQuestioSubmitButton()) {
//			Assert.assertTrue(true);
//		} else {
//			Assert.assertTrue(false);
//		}
	}

	@Test
	public void clickSquaresOfasortedArrayLink45() {
		driver.get(arrayPracticeURL);
		logger.info("User is at Array Page");
		ArrayPracticePage arrayp = new ArrayPracticePage(driver);
		QuestionPage qusp = new QuestionPage(driver);
		arrayp.click_sequencesOfASortedArray();
		System.out.println(driver.getCurrentUrl());
		qusp.clearTextBox();
		String code = "print \"Hello\";";
		qusp.setCode(code);
		System.out.println("entering the code: " + code);
		qusp.clickRunBtn();
		if (qusp.checkQuestion() && qusp.checkQuestionRunButton() && qusp.checkQuestioSubmitButton()) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}
}