package com.anupam.junitex;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestExcersise1 {
	
	@Test
	public void testPositive(){
		Excersise1 ex = new Excersise1("Kookies", 21);
		assertTrue("The test fails witk kookies and 21", ex.equals(new Excersise1("Kookies", 21)));
	}
	
	@Test
	public void testNegative1(){
		Excersise1 ex = new Excersise1("Kook", 21);
		assertFalse("The test fails witk kookies and 21", ex.equals(new Excersise1("Kookies", 21)));
	}
	
	@Test
	public void testNegative2(){
		Excersise1 ex = new Excersise1("Kookies", 1);
		assertFalse("The test fails witk kookies and 21", ex.equals(new Excersise1("Kookies", 21)));
	}
	
	@Test
	public void testNegative3(){
		Excersise1 ex = new Excersise1("Kookies", 1);
		class ab extends Excersise1{
			public ab(String a, int b){
				super(a,b);
			}
		}
		assertTrue("The test fails witk kookies and 21", ex.equals(new ab("Kookies", 21)));
	}

}
