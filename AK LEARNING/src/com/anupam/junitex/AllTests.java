package com.anupam.junitex;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ TestCalculator2.class, TestCalculator.class,
		TestCalculatorHamcrest.class, TestCalculator3.class,
		TestCalculator4.class })
public class AllTests {

}
