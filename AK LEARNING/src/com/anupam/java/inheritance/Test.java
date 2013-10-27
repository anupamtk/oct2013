package com.anupam.java.inheritance;

public class Test {

	public static void main(String[] args) {
		
		Cars car1 = new WagonR("Vx");
		car1.drive();
		car1.applyBreak();
		
		WagonRLX car2 = new WagonRLX();
		car2.drive();
		car2.applyBreak();
		car2.driftMe();

	}

}
