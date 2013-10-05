/**
 * 
 */
package com.anupam.testngex;

import org.testng.annotations.Test;

/**
 * @description 
 * test(expected=Exception.class)
 * test(timeout=1000)
 * 
 * @author Anupam
 *
 */
public class TestTimeoutAndException {

	@Test(expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void seeExceptionTest() throws ArrayIndexOutOfBoundsException {
		Calculator calc = new Calculator();
		calc.seeException(5, 1);
		System.out.println("seeExceptionTest is here.");
	}
	
	@Test(timeOut = 10000)
	public void longLoopFailTest(){
		Calculator calc = new Calculator();
		calc.longLoop();
		System.out.println("longLoopTest is here.");
	}
	
	@Test(timeOut = 20000)
	public void longLoopPassTest(){
		Calculator calc = new Calculator();
		calc.longLoop();
		System.out.println("longLoopTest is here.");
	}

}
