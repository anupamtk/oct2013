package com.anupam.java;

public class StaticClass {
	
	public static final String name = "Anupam";
	
	public static String getName(){
		return name;
	}
	
	public static class Address{
		
		@Override
		public String toString() {return "My address is Pune";};
		String address1 = "Pune";
		String address2 = "Patna";
	}
	
	public static void main(String[] arg){
		System.out.println(StaticClass.name);
		System.out.println(StaticClass.getName());
		System.out.println(StaticClass.Address.class);
	}

}
