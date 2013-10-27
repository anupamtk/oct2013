package com.anupam;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.*;

import com.anupam.resources.BaseTest;

public class testFirst extends BaseTest{

	
//	@DataProvider(name = "TestData", parallel = true)
//	public static Iterator<Object[]> getTestData(Method m, ITestContext testContex) throws Exception {
//			EasyFilter filter = EasyFilter.equalsIgnoreCase("TestObject.TestMethod", m.getName());
//			//filter = EasyFilter.and(filter, EasyFilter.equalsIgnoreCase("TestObject.TestSite", ContextManager.getTestLevelContext(testContex).getSite()));
//			filter = TestFilterUtil.addFilter(filter);//New code added for Filter
//			LinkedHashMap<String, Class<?>> classMap = new LinkedHashMap<String, Class<?>>();
//			classMap.put("TestObject", TestObject.class);
//			classMap.put("Item", ItemType.class);
//			classMap.put("LabelFlowTestContext", LabelFlowTestContext.class);
//			classMap.put("ShippingFlowTestContext", ShippingFlowTestContext.class);
//			classMap.put("Transaction", Transaction.class);
//			classMap.put("BuyingFlowTestContext", BuyingFlowTestContext.class);
//			classMap.put("BulkShippingFlowTestContext", BulkShippingFlowTestContext.class);
//			return SpreadSheetUtil.getEntitiesFromSpreadsheet(BulkShippingLabelTest.class, classMap, "TestData.xls", 0, null, filter);
//      }
	
	
	@Test(groups = {"new"})
	public void test1(ITestContext ctx) {
		
		driver.get("http://www.google.com");
		// Alternatively the same thing can be done like this
		// driver.navigate().to("http://www.google.com");

		// Find the text input element by its name
		WebElement element = driver.findElement(By.name("q"));

		// Enter something to search for
		element.sendKeys("Cheese!");

		// Now submit the form. WebDriver will find the form for us from the
		// element
		element.submit();

		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());

		// Google's search is rendered dynamically with JavaScript.
		// Wait for the page to load, timeout after 10 seconds
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase().startsWith("cheese!");
			}
		});

		// Should see: "cheese! - Google Search"
		System.out.println("Page title is: " + driver.getTitle());
		
		
		
		System.out.println(ctx.getSuite().getXmlSuite().getParameter("abc"));
	}
	
	@Test(groups = {"new"})
	public void test2(ITestContext ctx) {
		
		driver.get("http://www.google.com");
		// Alternatively the same thing can be done like this
		// driver.navigate().to("http://www.google.com");

		// Find the text input element by its name
		WebElement element = driver.findElement(By.name("q"));

		// Enter something to search for
		element.sendKeys("TestNG");

		// Now submit the form. WebDriver will find the form for us from the
		// element
		element.submit();

		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());

		// Google's search is rendered dynamically with JavaScript.
		// Wait for the page to load, timeout after 10 seconds
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase().startsWith("TestNG");
			}
		});
 
		// Should see: "cheese! - Google Search"
		System.out.println("Page title is: " + driver.getTitle());
		
	}
	
	@BeforeClass(alwaysRun=true)
	 public static void beforeClass1()
	 {
		
		System.out.println("BeforeC");
	 }
	
	@AfterClass(alwaysRun=true)
	 public static void afterClass1()
	 {
	  	System.out.println("AfterC");
	 }
	
	@BeforeMethod(alwaysRun=true)
	 public static void beforeMethod1()
	 {
		
		System.out.println("BeforeM");
	 }
	
	@AfterMethod(alwaysRun=true)
	 public static void afterMethod1()
	 {
	  	System.out.println("AfterM");
	 }
	
	@BeforeSuite(alwaysRun=true)
	 public static void beforeSuite1()
	 {
		
		System.out.println("BeforeSuite");
	 }
	
	@AfterSuite(alwaysRun=true)
	 public static void afterSuite1()
	 {
	  	System.out.println("AfterSuite");
	 }
	
}
