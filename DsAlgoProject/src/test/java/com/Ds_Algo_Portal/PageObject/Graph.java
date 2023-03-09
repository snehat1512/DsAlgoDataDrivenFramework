package com.Ds_Algo_Portal.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Graph {

	@FindBy(linkText="Graph")WebElement graph;
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement typeHere;
	@FindBy(xpath=" //textarea[@tabindex='0']") WebElement textBox;
	@FindBy(xpath="//button[@type='button']") WebElement run;
	@FindBy(linkText="Graph Representations")WebElement representation;
	
	
	private WebDriver driver;
	
	public Graph(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void loadGraphPage() {
		
		driver.get("https://dsportalapp.herokuapp.com/graph");
	
	}
	
	public void loadgraph() {
		 driver.navigate().to("https://dsportalapp.herokuapp.com/graph/");
	}
	
	public void graph() {
		
		graph.click();
	    typeHere.click();
	    textBox.sendKeys("print 'Graphs'");
	    run.click();
	}
	
	public void graphRepresentation() {
		
		representation.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	    typeHere.click();
	    textBox.sendKeys("print 'Graph Representations'");
	    run.click();
	    
	}	
}
