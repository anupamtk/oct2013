package com.anupam.junitex;

public class JustLikeThat {
	
	public String b;
	
	public JustLikeThat(String b) {
		super();
		this.b = b;
	}

	public String colorList(int a){
		switch(a){
			case 1: {b="Red"; break;}
			case 2: {b="Yellow"; break;}
			case 3: {b="Black"; break;}
			case 4: {b="Green"; break;}
			case 5: {b="White"; }			
		}
		return b;
	}
}
