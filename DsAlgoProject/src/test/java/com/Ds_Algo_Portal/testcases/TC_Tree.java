package com.Ds_Algo_Portal.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Ds_Algo_Portal.PageObject.Tree;
//import com.Ds_Algo_Porttal.Screenshot.DsalogoScreenshot;

public class TC_Tree extends BaseClass {

	private Tree treepage;

	@BeforeClass
	public void initDriver() {
		treepage = new Tree(driver);

		treepage.loadtreePage();
		logger.info("User is at Tree Page");
		assertEquals("Tree", driver.getTitle());
	}

	@BeforeMethod
	public void loadtree() {
		treepage.loadtree();
		assertEquals("Overview of Trees", driver.getTitle());
	}

	@Test(priority = 1)
	public void testTree() {

		treepage.tree();
		assertEquals("Assessment", driver.getTitle());

	}

	@Test(priority = 2)
	public void testTerminology() {

		treepage.terminology();
		assertEquals("Assessment", driver.getTitle());
		//DsalogoScreenshot.takeScreenshot(driver, "treeTerminology");

	}

	@Test(priority = 3)
	public void testTreeTypes() {

		treepage.treeTypes();
		assertEquals("Assessment", driver.getTitle());
		//DsalogoScreenshot.takeScreenshot(driver, "treetypesAssessment");
	}

	@Test(priority = 4)
	public void testTreeTraversals() {

		treepage.treeTraversals();
		assertEquals("Assessment", driver.getTitle());
		//DsalogoScreenshot.takeScreenshot(driver, "treetraversalAssessment");

	}

	@Test(priority = 5)
	public void testTraversalIllustration() {

		treepage.traversalIllustration();
		assertEquals("Assessment", driver.getTitle());
		//DsalogoScreenshot.takeScreenshot(driver, "treetraversalillustrationAssessment");
	}

	@Test(priority = 6)
	public void testBinaryTree() {

		treepage.binaryTree();
		assertEquals("Assessment", driver.getTitle());
		//DsalogoScreenshot.takeScreenshot(driver, "binaryTreeAssessment");

	}

	@Test(priority = 7)
	public void testBinaryTreeTypes() {

		treepage.binaryTypes();
		assertEquals("Assessment", driver.getTitle());
		//DsalogoScreenshot.takeScreenshot(driver, "binarytreetypesAssessment");

	}

	@Test(priority = 8)
	public void testPythonimplementation() {

		treepage.pythonimplementation();
		assertEquals("Assessment", driver.getTitle());
		//DsalogoScreenshot.takeScreenshot(driver, "pythonImplementAssessment");
	}

	@Test(priority = 9)
	public void testBinaryTreeTraversal() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		treepage.binaryTraversal();
		assertEquals("Assessment", driver.getTitle());
		//DsalogoScreenshot.takeScreenshot(driver, "binarytreetraverslAssessment");

	}

	@Test(priority = 10)
	public void testBinaryTreeImplementation() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		treepage.binaryImplement();
		assertEquals("Assessment", driver.getTitle());
		//DsalogoScreenshot.takeScreenshot(driver, "binarytreeImplementAssessment");
	}

	@Test(priority = 11)
	public void testBinaryApplication() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		treepage.binaryApplication();
		assertEquals("Assessment", driver.getTitle());
		//DsalogoScreenshot.takeScreenshot(driver, "binarytreeApplicationAssessment");

	}

	@Test(priority = 12)
	public void testBinarySearchTree() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		treepage.binarySearch();
		assertEquals("Assessment", driver.getTitle());
		//DsalogoScreenshot.takeScreenshot(driver, "tbinaryreeSearchAssessment");
	}

	@Test(priority = 13)
	public void testBSTImplementation() {

		treepage.bstImplement();
		assertEquals("Assessment", driver.getTitle());
		//DsalogoScreenshot.takeScreenshot(driver, "BSTImplementAssessment");
	}

}
