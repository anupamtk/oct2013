package com.anupam.java.stringex;

public class StringTest {
	
	public static void main(String[] args) {
		
		//String is immutable
		
		String a = "ABC";
		a.toLowerCase();
		System.out.println(a); // OUTPUT ABC
		
		a = a.toLowerCase();
		System.out.println(a); // OUTPUT abc
	}

}
