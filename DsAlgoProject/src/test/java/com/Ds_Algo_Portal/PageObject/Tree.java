package com.Ds_Algo_Portal.PageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tree {
	
	WebDriver driver = null;

	public Tree(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(linkText="Overview of Trees")WebElement overview ;
	@FindBy(xpath="//a[@href='/tryEditor']")WebElement typeHere;
	@FindBy(xpath=" //textarea[@tabindex='0']")WebElement textBox;
	@FindBy(xpath="//button[@type='button']")WebElement run;
	
	@FindBy(linkText="Terminologies")WebElement terminologies;
	@FindBy(linkText="Types of Trees")WebElement treeTypes;
	@FindBy(linkText="Tree Traversals")WebElement treeTraversal;
	@FindBy(linkText="Traversals-Illustration")WebElement traversalIllustration;
	@FindBy(linkText="Binary Trees")WebElement binaryTree;
	@FindBy(linkText="Types of Binary Trees")WebElement binaryTypes;
	@FindBy(linkText="Implementation in Python")WebElement implementation;
	@FindBy(linkText="Binary Tree Traversals")WebElement binaryTraversal;
	@FindBy(linkText="Implementation of Binary Trees")WebElement binaryImplementation ;
	@FindBy(linkText="Applications of Binary trees")WebElement application ;
	@FindBy(linkText="Binary Search Trees")WebElement binarySearch;
	@FindBy(linkText="Implementation Of BST")WebElement bstImplementation ;
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void loadtreePage() {
		
		driver.get("https://dsportalapp.herokuapp.com/tree");
	
	}
	
	public void loadtree() {
		driver.navigate().to("https://dsportalapp.herokuapp.com/tree/overview-of-trees/");
	}
	
    public void tree() {
    	
		overview.click();
	    typeHere.click();
	    textBox.sendKeys("print 'Overview of Trees'");
	    run.click();
    }
    
    public void terminology() {
    	
		terminologies.click();
	    typeHere.click();
	    textBox.sendKeys("print 'Terminologies'");
	    run.click();
    }
    
    public void treeTypes() {
    	
		treeTypes.click();
	    typeHere.click();
	    textBox.sendKeys("print 'Types of Trees'");
	    run.click();
    }
    
    public void treeTraversals() {
    	
		treeTraversal.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)");
	    typeHere.click();
	    textBox.sendKeys("print 'Tree Traversals'");
	    run.click();
    }
    
    public void traversalIllustration() {
    	
		traversalIllustration.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,200)");
	    typeHere.click();
	    textBox.sendKeys("print 'Traversals-Illustration'");
	    run.click();
    }
    
    public void binaryTree() {
    	
		binaryTree.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,300)");
	    typeHere.click();
	    textBox.sendKeys("print 'Binary Trees'");
	    run.click();
    }
    
    public void binaryTypes() {
    	
		binaryTypes.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,300)");
	    typeHere.click();
	    textBox.sendKeys("print 'Types of Binary Trees'");
	    run.click();
    }
    
    public void pythonimplementation() {
    	
		implementation.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)");
	    typeHere.click();
	    textBox.sendKeys("print 'Implementation in Python'");
	    run.click();
    }
    
    public void binaryTraversal() {
    	
		binaryTraversal.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)");
	    typeHere.click();
	    textBox.sendKeys("print 'Binary Tree Traversals'");
	    run.click();
    }
    
    public void binaryImplement() {
    	
		binaryImplementation.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)");
	    typeHere.click();
	    textBox.sendKeys("print 'Implementation of Binary Trees'");
	    run.click();
    }
    
    public void binaryApplication() {
    	
		application.click();
	    typeHere.click();
	    textBox.sendKeys("print 'Applications of Binary trees'");
	    run.click();
    }
    
    public void binarySearch() {
    	
		binarySearch.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollBy(0,500)");
	    typeHere.click();
	    textBox.sendKeys("print 'Binary Search Trees'");
	    run.click();
    }
    
    public void bstImplement() {
    	
		bstImplementation.click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
	    typeHere.click();
	    textBox.sendKeys("print 'Implementation Of BST'");
	    run.click();
    }

}
