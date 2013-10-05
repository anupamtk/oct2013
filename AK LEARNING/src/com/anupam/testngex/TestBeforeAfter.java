package com.anupam.testngex;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


/**
 * @description 
 * {assertTrue, assertFalse, @BeforeClass, @AfterClass}
 * 
 * @author Anupam
 *
 */
public class TestBeforeAfter{
	
	public static Calculator calc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calc = new Calculator();
		System.out.println("BeforeClass is here.");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		calc = null;
		System.out.println("AfterClass is here.");
	}
	
	@BeforeMethod
	public void setUpBefore() throws Exception {
		System.out.println("BeforeMethod is here.");
	}

	@AfterMethod
	public void tearDownAfter() throws Exception {
		System.out.println("AfterMethod is here.");
	}
	
	@Test
	public void checkPrefixForTrueTest(){
//		Calculator calc = new Calculator();
		Assert.assertTrue(calc.checkPrefixForTrue("truedheaawe"));
		System.out.println("checkPrefixForTrueTest is here.");
	}
	
	@Test
	public void checkPrefixForFalseTest(){
//		Calculator calc = new Calculator();
		Assert.assertFalse(calc.checkPrefixForFalse("falsedheaawe"));
		System.out.println("checkPrefixForFalseTest is here.");
	}
	
}
