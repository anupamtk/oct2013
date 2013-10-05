package com.anupam.junitex;

public class Calculator {
	
	public double add(double a, double b){
		return a+b;
	}
	
	public double sub(double a, double b){
		return a-b;
	}
	
	public double mul(double a, double b){
		return a*b;
	}
		
	public boolean checkPrefixForTrue(String a){
		boolean c = false;
		try {
			String b = a.substring(0, 4);
			c = new Boolean(b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	
	public boolean checkPrefixForFalse(String a){
		boolean c = true;
		try {
			String b = a.substring(0, 5);
			c = new Boolean(b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
	
	public double seeException(double a, double b){
		double c[]= new double[2];
		try {
			c[0] = a;
			c[1] = b;
			c[2] = a/b;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c[2];
	}
	
	public void longLoop(){
		for(long a=0; a<500000; a++){
			System.out.print(a);
		}
	}

}
