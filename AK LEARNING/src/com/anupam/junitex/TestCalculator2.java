package com.anupam.junitex;

//import junit.framework.TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * @description 
 * {assertTrue, assertFalse, @BeforeClass, @AfterClass}
 * 
 * @author Anupam
 *
 */
public class TestCalculator2{
	
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
	
	@Before
	public void setUpBefore() throws Exception {
		System.out.println("Before is here.");
	}

	@After
	public void tearDownAfter() throws Exception {
		System.out.println("After is here.");
	}
	
	@Test
	public void checkPrefixForTrueTest(){
//		Calculator calc = new Calculator();
		assertTrue(calc.checkPrefixForTrue("truedheaawe"));
		System.out.println("checkPrefixForTrueTest is here.");
	}
	
	@Test
	public void checkPrefixForFalseTest(){
//		Calculator calc = new Calculator();
		assertFalse(calc.checkPrefixForFalse("falsedheaawe"));
		System.out.println("checkPrefixForFalseTest is here.");
	}
	
}
