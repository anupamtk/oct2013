package com.anupam.collections;

public class Test1 {
	
	private class A {
		private int a;
		String b = "hello";
		A(int aa){
			a=aa;
		}
		
		public void demo(){
			System.out.println(b+" to you by " + a);
		}
	}
	
	private class B {
		private int a;
		String b = "hello";
		B(int aa){
			a=aa;
		}
		
		public void demo(){
			System.out.println(b+" to you by " + a);
		}
	}
	
	public static void main(String[] args) {
		Test1 tt = new Test1();
		System.out.println(tt.new A(5).equals(tt.new B(5)));


	}

}
