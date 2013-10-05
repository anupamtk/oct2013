package com.anupam.regex;

import java.util.regex.*;

public class egRegularExpression {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String simple = "Anupam Kumar";
		Pattern pat = Pattern.compile(".*m K.*");
		Matcher mat = pat.matcher(simple);
		boolean found = mat.matches();
		
		System.out.println("found: " + found);
		
		
		

	}

}
