package com.anupam.testngex;

public class Excersise1 {

	private String title;
	private double price;

	/**
	 * Constructor
	 * 
	 * @param title
	 * @param price
	 */

	public Excersise1(String title, double price) {
		this.title = title;
		this.price = price;
	}

	/**
	 * Check if an object is an instance of Excersise1 and the values of title
	 * and price are equal then return true, otherwise return false
	 */
	public boolean equals(Object object) {
		if (object instanceof Excersise1) {
			Excersise1 Excersise1 = (Excersise1) object;
			return getTitle().equals(Excersise1.getTitle())
					&& getPrice() == Excersise1.getPrice();
		}
		return false;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public static void main(String args[]) {
		Excersise1 Excersise1 = new Excersise1("Roots", 600);
		System.out.println("Excersise1 Name is: " + Excersise1.getTitle()
				+ " Price : " + Excersise1.getPrice());
	}
}