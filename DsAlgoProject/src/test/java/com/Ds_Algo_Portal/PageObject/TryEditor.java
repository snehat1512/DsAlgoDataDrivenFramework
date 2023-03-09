package com.Ds_Algo_Portal.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TryEditor {
	WebDriver driver = null;

	public TryEditor(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id='answer_form']/button")
	WebElement runButton;

	public boolean checkTryEditorRunButton() {
		return runButton.getText().equals("Run");

	}

	public void clickRunBut() {
		runButton.click();
	}

	@FindBy(xpath = "//*[@id='answer_form']/div/div/div[1]/textarea")
	WebElement tryEditorBox;

	public void setCode(String codeInput) {
		tryEditorBox.sendKeys(codeInput);
	}

}
