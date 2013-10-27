package com.anupam.java.inheritance;


public class WagonR implements Cars{
	
	public final String carType = "WagonR";
	public String model;

	@Override
	public void drive() {
		System.out.println("Driving car " + carType + " " + model);		
	}

	public WagonR(String model) {
		super();
		this.model = model;
	}

	@Override
	public void applyBreak() {
		System.out.println("Apply break on car " + carType + " " + model);	
		
	}

}
