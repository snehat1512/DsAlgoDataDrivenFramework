package com.Ds_Algo_Portal.testcases;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Ds_Algo_Portal.PageObject.Graph;
//import com.Ds_Algo_Porttal.Screenshot.DsalogoScreenshot;

public class TC_Graph extends BaseClass {

	private Graph graphpage;

	@BeforeClass
	public void initDriver() {
		graphpage = new Graph(driver);
	}

	@BeforeMethod
	public void loadgraph() {
		graphpage.loadgraph();
	}

	@Test(priority = 1)
	public void testGraph() {

		assertEquals("Graph", driver.getTitle());
		graphpage.graph();
		assertEquals("Assessment", driver.getTitle());
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

	}

	@Test(priority = 2)
	public void testGraphRepresentation() {
		logger.info("User is at Graph Page");
		assertEquals("Graph", driver.getTitle());
		graphpage.graphRepresentation();
		assertEquals("Assessment", driver.getTitle());
		//Screenshots.takeScreenshot(driver, "graphRepresentation");

	}
}
