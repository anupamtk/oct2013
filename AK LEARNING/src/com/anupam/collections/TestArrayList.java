package com.anupam.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.junit.Assert;


public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> stuff = new ArrayList<String>(); // #1
		stuff.add("Denver");
		stuff.add("Boulder");
		stuff.add("Vail");
		stuff.add("Aspen");
		stuff.add("Telluride");
		
		System.out.println("unsorted stuff" + stuff);
		
		ArrayList<String> newStuff = new ArrayList<String>(); // #1
		newStuff.add("Vail");
		newStuff.add("Aspen");
		newStuff.add("Telluride");
		newStuff.add("Denver");
		newStuff.add("Boulder");
		System.out.println("unsorted newStuff" + newStuff);
		
		System.out.println(stuff.indexOf("Vail"));
		System.out.println(stuff.get(0));
		System.out.println(stuff.equals(newStuff));
		
		Collections.sort(stuff); // #2
		System.out.println("sorted stuff" + stuff);
		Collections.sort(newStuff); // #2
		System.out.println("sorted newStuff" + newStuff);
		
		System.out.println(stuff.indexOf("Vail"));
		System.out.println(stuff.get(0));
		System.out.println(stuff.equals(newStuff));
		
		System.out.println("************************************");
		
		Iterator<String> ii = stuff.iterator();
		int i=0;
		while(ii.hasNext()){
		System.out.println("This is iterator " + (i++) + " " + ii.next());
		}
	}

}
