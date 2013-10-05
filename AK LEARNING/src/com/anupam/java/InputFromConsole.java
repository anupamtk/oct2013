package com.anupam.java;

import java.util.Scanner;

public class InputFromConsole {
	
	   public static void main(String[] args) {

	       String name;
	       int age;
	       Scanner in = new Scanner(System.in);

	       // Reads a single line from the console 
	       // and stores into name variable
	       System.out.print("Please enter your name: ");
	       name = in.nextLine();

	       // Reads a integer from the console
	       // and stores into age variable
	       System.out.print("Please enter your age: ");
	       age=in.nextInt();
	       in.close();            

	       // Prints name and age to the console
	       System.out.println("Name :"+name);
	       System.out.println("Age :"+age);

	    }

}
