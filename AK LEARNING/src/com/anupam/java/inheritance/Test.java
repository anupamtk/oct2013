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

		//Check overriding
		System.out.println("####Check overriding");
		Cars car3 = new WagonR("Vx");
		Cars car4 = new WagonRLX();
		WagonR car5 = new WagonRLX();
		WagonRLX car6 = new WagonRLX();
		WagonR car7 = (WagonR) new WagonRLX();
		
		System.out.println(car3.whoAmI());
		System.out.println(car4.whoAmI());
		System.out.println(car5.whoAmI());
		System.out.println(car6.whoAmI());
		System.out.println(car7.whoAmI());
		
		/* output 
		Driving car WagonR Vx
		Apply break on car WagonR Vx
		Driving car WagonR Luxary
		Apply break on car WagonR Luxary
		Drifting car WagonRLuxary
		####Check overriding
		I am WagonR
		I am WagonR LX model
		I am WagonR LX model
		I am WagonR LX model
		I am WagonR LX model
		*/
		
	}

}
