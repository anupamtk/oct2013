package com.anupam.resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class BaseTest {
	
	protected static WebDriver driver;
	
	@BeforeClass(alwaysRun=true)
	 public static void beforeClass(ITestContext ctx)
	 {
		/*Step 1: In order to run, we need to download IE Driver & Chrome Driver and we can download from https://code.google.com/p/selenium/downloads/list?can=2&q=IE
			http://chromedriver.storage.googleapis.com/index.html*/
		
		String browser = ctx.getSuite().getXmlSuite().getParameter("browser");
		Assert.assertNotNull(browser);
		if(browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}else{
			Assert.fail("browser should be either of followings - \"firefox\" \"ie\" or \"chrome\"");
		}
	  }
	
	@AfterClass(alwaysRun=true)
	 public static void afterClass()
	 {
	  driver.quit();
	 }

}
