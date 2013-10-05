package com.anupam.testngex;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


/**
 * @author Anupam
 *
 */
public class TestDataProvider {
	
	@DataProvider(name="data")
	public static Object[][] data() {
	   Object[][] data = new Object[][] { { 1 ,2,3}, { 2,3,5 }, { 3.3,4.3,7.6 }, { -4.3 ,5,0.7} };
	   return data;
	}

	 @Test(dataProvider = "data", dataProviderClass=TestDataProvider.class )
	 public void pushTest(double number1, double number2, double number3) {
		 Calculator calc = new Calculator();
			Assert.assertEquals(number3, calc.add(number1,number2), 0.000001);
		 System.out.println("Parameterized is here");

	 }
	
}
