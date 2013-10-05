/**
 * 
 */
package com.anupam.junitex;

import org.junit.Test;

/**
 * @description 
 * test(expected=Exception.class)
 * test(timeout=1000)
 * 
 * @author Anupam
 *
 */
public class TestCalculator3 {

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void seeExceptionTest() throws ArrayIndexOutOfBoundsException {
		Calculator calc = new Calculator();
		calc.seeException(5, 1);
		System.out.println("seeExceptionTest is here.");
	}
	
	@Test(timeout = 10000)
	public void longLoopFailTest(){
		Calculator calc = new Calculator();
		calc.longLoop();
		System.out.println("longLoopTest is here.");
	}
	
	@Test(timeout = 20000)
	public void longLoopPassTest(){
		Calculator calc = new Calculator();
		calc.longLoop();
		System.out.println("longLoopTest is here.");
	}

}
