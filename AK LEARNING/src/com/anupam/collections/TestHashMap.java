package com.anupam.collections;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	enum Pets {DOG, CAT, HORSE }

	class Dog {
		public Dog(String n) {
			name = n;
		}

		private String name;

		public boolean equals(Object o) {
			if ((o instanceof Dog) && (((Dog) o).name == name)) {
				return true;
			} else {
				return false;
			}
		}

		public int hashCode() {
			return name.length();
		}
	}
		
	class Cat { }
		
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
			TestHashMap thm = new TestHashMap();
		
			Map<Object, Object> m = new HashMap<Object, Object>();
			m.put("k1", thm.new Dog("tommmmy")); // add some key/value pairs
			m.put("k2", Pets.DOG);
			m.put(Pets.CAT, "CAT key");
			Dog d1 = thm.new Dog("pillu"); // let's keep this reference
			m.put(d1, "Dog key");
			m.put(thm.new Cat(), "new Cat key");
			System.out.println(m.get("k1")); // #1
			String k2 = "k2";
			System.out.println(m.get(k2)); // #2
			Pets p = Pets.CAT;
			System.out.println(m.get(p)); // #3
			System.out.println(m.get(d1)); // #4
			System.out.println(m.get(thm.new Cat())); // #5
			System.out.println(m.size()); // #6
			}
		
}


