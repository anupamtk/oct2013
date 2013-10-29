package com.anupam.java.inheritance;

public class WagonRLX extends WagonR{

	public WagonRLX() {
		super("Luxary");
	}
	
	public void driftMe() {
		System.out.println("Drifting car " + carType + model);
	}
	
	@Override
	public String whoAmI() {
		return "I am WagonR LX model";
	}

}
