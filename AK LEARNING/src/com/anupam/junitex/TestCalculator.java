package com.anupam.junitex;

//import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @description 
 * {assertEqual, @Before, @After}
 * 
 * @author Anupam
 *
 */
public class TestCalculator{
	
	public static Calculator calc;
		
	@Before
	public void instantiateCalculator(){
		calc = new Calculator();
		System.out.println("Before is here.");
	}
	
	@After
	public void ClearCalculator(){
		calc = null;
		System.out.println("After is here.");
	}
	
	@Test
	public void addTest(){
//		Calculator calc = new Calculator();
		assertEquals("Not equal", 10.33, calc.add(5.11,5.22), 0);
		System.out.println("addTest is here.");
	}

	@Test
	public void subTest(){
//		Calculator calc = new Calculator();
		assertEquals("Not correct", 1.04, calc.sub(6.2651,5.22), 0.009);
		System.out.println("subTest is here.");
	}
	
	@Test
	public void mulTest(){
//		Calculator calc = new Calculator();
		assertEquals("Not correct", 6.2651*5.22, calc.mul(6.2651,5.22), 0);
		System.out.println("mulTest is here.");
	}
	
}
