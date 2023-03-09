package com.Ds_Algo_Portal.testcases;

import java.util.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
//import com.Ds_Algo_Portal.Utilities.Listener;
import com.Ds_Algo_Portal.Utilities.ReadConfig;


import io.github.bonigarcia.wdm.WebDriverManager;

//@Listeners({Listener.class})
public class BaseClass {

	ReadConfig readconfig = new ReadConfig();

	public String baseURL = readconfig.getBaseURL();
	public String homeURL = "https://dsportalapp.herokuapp.com/home";
	public String signinURL = "https://dsportalapp.herokuapp.com/login";
	public String registerURL = "https://dsportalapp.herokuapp.com/register";
	public String dataStructureURL = "https://dsportalapp.herokuapp.com/data-structures-introduction/";
	public String tryEditorURL = "https://dsportalapp.herokuapp.com/tryEditor";
	public String timeComplexityURL = "https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/";
	public String arrayURL = "https://dsportalapp.herokuapp.com/array/";
	public String applicationArrayURL = "https://dsportalapp.herokuapp.com/array/applications-of-array/";
	public String arrayInPythonURL = "https://dsportalapp.herokuapp.com/array/arrays-in-python/";
	public String arrayUsingListURL = "https://dsportalapp.herokuapp.com/array/arrays-using-list/";
	public String basicOperationInListURL = "https://dsportalapp.herokuapp.com/array/basic-operations-in-lists/";
	public String applicatinOfArrayURL = "https://dsportalapp.herokuapp.com/array/applications-of-array/";
	public String PracticeQuestionURL = "https://dsportalapp.herokuapp.com/array/practice";
	public String arrayPracticeURL = "https://dsportalapp.herokuapp.com/array/practice";
	public String linkedListURL = "https://dsportalapp.herokuapp.com/linked-list/";
	public String linkedListIntroductionURL = "https://dsportalapp.herokuapp.com/linked-list/introduction/";
	public String linkedListCreateLinkListURL = "https://dsportalapp.herokuapp.com/linked-list/creating-linked-list/";
	public String linkedListTypesOfLinkedListURL = "https://dsportalapp.herokuapp.com/linked-list/types-of-linked-list/";
	public String implimentLinkedListInPythonURL = "https://dsportalapp.herokuapp.com/linked-list/implement-linked-list-in-python/";
	public String linkedListTraversalURL = "https://dsportalapp.herokuapp.com/linked-list/traversal/";
	public String linkedListInsertionURL = "https://dsportalapp.herokuapp.com/linked-list/insertion-in-linked-list/";
	public String linkedListDeletionURL = "https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/";
	public String stackURL = "https://dsportalapp.herokuapp.com/stack/";
	public String operationInStackURL = "https://dsportalapp.herokuapp.com/stack/operations-in-stack/";
	public String stackImplementationURL = "https://dsportalapp.herokuapp.com/stack/implementation/";
	public String stackApplicationURL = "https://dsportalapp.herokuapp.com/stack/stack-applications/";
	public String queueURL = "https://dsportalapp.herokuapp.com/queue/";
	public String implementationOfQueueInPythonURL = "https://dsportalapp.herokuapp.com/queue/implementation-lists/";
	public String implementationUsingCollectionURL = "https://dsportalapp.herokuapp.com/queue/implementation-collections/";
	public String implementationUsingArrayURL = "https://dsportalapp.herokuapp.com/queue/Implementation-array/";
	public String queueOperationURL = "https://dsportalapp.herokuapp.com/queue/QueueOp/";
	public String treeURL = "https://dsportalapp.herokuapp.com/tree/";
	public String grapthURL = "https://dsportalapp.herokuapp.com/graph/";

	public String userName = readconfig.getUserName();
	public String password = readconfig.getPassword();

	public static WebDriver driver;
	public static Logger logger;
	
	//public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	
	@Parameters("browser")
	@BeforeTest
	public void setup(@Optional("chrome") String browserName) {
		
		//BasePage bs =new BasePage();
		//bs.initialize_driver();
		
		logger = LogManager.getLogger(BaseClass.class);
		
		
		System.out.println("Browser name is :" + browserName);
		//System.out.println("Thread id :" + Thread.currentThread().getId());

		if (browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("useAutomationExtension", false);
			chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
			driver = new ChromeDriver(chromeOptions);
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		}
		
	}
	

//	@BeforeClass
//	public void youAreLoggedInTest24() {
//		
//		driver.get(signinURL);
//		
//		Sign_in_page signP = new Sign_in_page(driver);
//		System.out.println("password: " + password);
//		signP.setUserName(userName);
//		signP.setPassword(password);
//		signP.clickLoginButton();
//		logger.info("User SignedIn");
//		String alertMessage = signP.alert_primary_msg();
//		// System.out.println(alertMessage);
//		// System.out.println(signP.loggedinUserNamemsg().toUpperCase().equals(userName.toUpperCase()));
//
//		if (alertMessage.equals("You are logged in")
//				&& signP.loggedinUserNamemsg().toUpperCase().equals(userName.toUpperCase())) {
//			Assert.assertTrue(true);
//		} else {
//			Assert.assertTrue(false);
//		}
//
//	}

	@AfterClass
	public void tearDown() {
		// driver.quit();
	}
}
