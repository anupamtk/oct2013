package com.anupam.junitex;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @author Anupam
 *
 */
@RunWith(Parameterized.class)
public class TestCalculator4 {
	
	private double number1;
	private double number2;
	private double number3;
	 
	public TestCalculator4(double number1, double number2, double number3) {
		super();
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
	}

	@Parameters
	 public static Collection<Object[]> data() {
	   Object[][] data = new Object[][] { { 1 ,2,3}, { 2,3,5 }, { 3.3,4.3,7.6 }, { -4.3 ,5,0.7} };
	   return Arrays.asList(data);
	 }

	 @Test
	 public void pushTest() {
		 Calculator calc = new Calculator();
			assertEquals("Not equal", number3, calc.add(number1,number2), 0.000001);
		 System.out.println("Parameterized is here");

	 }


	
}
