package com.anupam.testngex;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestExcersise1 {
	
	@Test
	public void testPositive(){
		Excersise1 ex = new Excersise1("Kookies", 21);
		Assert.assertTrue(ex.equals(new Excersise1("Kookies", 21)));
	}
	
	@Test
	public void testNegative1(){
		Excersise1 ex = new Excersise1("Kook", 21);
		Assert.assertFalse(ex.equals(new Excersise1("Kookies", 21)));
	}
	
	@Test
	public void testNegative2(){
		Excersise1 ex = new Excersise1("Kookies", 1);
		Assert.assertFalse(ex.equals(new Excersise1("Kookies", 21)));
	}
	
	@Test
	public void testNegative3(){
		Excersise1 ex = new Excersise1("Kookies", 1);
		class ab extends Excersise1{
			public ab(String a, int b){
				super(a,b);
			}
		}
		Assert.assertTrue(ex.equals(new ab("Kookies", 21)));
	}

}
