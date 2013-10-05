package com.anupam.testngex;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



/**
 * @description 
 * {assertEqual, @Before, @After}
 * 
 * @author Anupam
 *
 */
public class TestCalculator{
	
	public static Calculator calc;
		
	@BeforeMethod
	public void instantiateCalculator(){
		calc = new Calculator();
		System.out.println("Before is here.");
	}
	
	@AfterMethod
	public void ClearCalculator(){
		calc = null;
		System.out.println("After is here.");
	}
	
	@Test
	public void addTest(){
//		Calculator calc = new Calculator();
		Assert.assertEquals(10.33, calc.add(5.11,5.22), 0);
		System.out.println("addTest is here.");
	}

	@Test
	public void subTest(){
//		Calculator calc = new Calculator();
		Assert.assertEquals(1.04, calc.sub(6.2651,5.22), 0.009);
		System.out.println("subTest is here.");
	}
	
	@Test
	public void mulTest(){
//		Calculator calc = new Calculator();
		Assert.assertEquals(6.2651*5.22, calc.mul(6.2651,5.22), 0);
		System.out.println("mulTest is here.");
	}
	
}
