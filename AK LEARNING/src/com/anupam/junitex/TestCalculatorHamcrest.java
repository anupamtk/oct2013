package com.anupam.junitex;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.AnyOf.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
* @description 
* {assertThat, is(), anyOf(is("Red"), is("Yellow")));}
* 
* @author Anupam
*
*/
public class TestCalculatorHamcrest{
		
	@Test
	public void addTest(){
		Calculator calc = new Calculator();
		assertThat(calc.add(5.12,5.22), is(10.34));
		System.out.println("addTest hamcrest is here.");
	}
	
	@Test
	public void colorTest(){
		JustLikeThat jlt = new JustLikeThat("none");
		assertThat(jlt.colorList(1), anyOf(is("Red"), is("Yellow")));
		System.out.println("anyOf hamcrest is here.");
	}
	
}
