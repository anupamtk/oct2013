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
		
//		String simple2 = "B1 36 AGCWarje 52";
		String simple2 = "B1 36 AGC Warje 52";
//		Pattern pat2 = Pattern.compile("B1 [0-3][6-9] --- [A-B] .*");
		Pattern pat2 = Pattern.compile("B1 [0-3][6-9] AG[F|C][ |[A-Z]][A-Za-z]{4,5} [0-9]{2}");
		Matcher mat2 = pat2.matcher(simple2);
		boolean found2 = mat2.matches();
		
		System.out.println("found: " + found2);
		
/*		Regular Expression	Description
		.	Matches any character
		^regex	regex must match at the beginning of the line
		regex$	Finds regex must match at the end of the line
		[abc]	Set definition, can match the letter a or b or c
		[abc][vz]	Set definition, can match a or b or c followed by either v or z
		[^abc]	When a "^" appears as the first character inside [] when it negates the pattern. This can match any character except a or b or c
		[a-d1-7]	Ranges, letter between a and d and figures from 1 to 7, will not match d1
		X|Z	Finds X or Z
		XZ	Finds X directly followed by Z
		$	Checks if a line end follows

		Metacharacters
		The following metacharacters have a pre-defined meaning and make certain common pattern easier to use, e.g. \d instead of [0..9].

		Table 2. 

		Regular Expression	Description
		\d	Any digit, short for [0-9]
		\D	A non-digit, short for [^0-9]
		\s	A whitespace character, short for [ \t\n\x0b\r\f]
		\S	A non-whitespace character, for short for [^\s]
		\w	A word character, short for [a-zA-Z_0-9]
		\W	A non-word character [^\w]
		\S+	Several non-whitespace characters
		\b	Matches a word boundary. A word character is [a-zA-Z0-9_] and \b matches its bounderies.

		3.3. Quantifier
		A quantifier defines how often an element can occur. The symbols ?, *, + and {} define the quantity of the regular expressions

		Table 3. 

		Regular Expression	Description	Examples
		*	Occurs zero or more times, is short for {0,}	X* - Finds no or several letter X, .* - any character sequence
		+	Occurs one or more times, is short for {1,}	X+ - Finds one or several letter X
		?	Occurs no or one times, ? is short for {0,1}	X? -Finds no or exactly one letter X
		{X}	Occurs X number of times, {} describes the order of the preceding liberal	\d{3} - Three digits, .{10} - any character sequence of length 10
		{X,Y}	Occurs between X and Y times,	\d{1,4}- \d must occur at least once and at a maximum of four
		*?	 ? after a quantifier makes it a reluctant quantifier, it tries to find the smallest match.	 
*/
		
	}

}
