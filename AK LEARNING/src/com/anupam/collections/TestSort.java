package com.anupam.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestSort {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("################ SORT EMPLOYEE BY NAME ####");
		
		List<Employee> lst = new ArrayList<Employee>();
		lst.add(new Employee(12,"Ram"));
		lst.add(new Employee(5,"Aam"));
		lst.add(new Employee(22,"Shyam"));
		lst.add(new Employee(15,"Vijay"));
		lst.add(new Employee(11,"Ajay"));

		System.out.println("##################   1     ##################");
		Iterator<Employee> it = lst.iterator();
		while(it.hasNext()){
			System.out.println("Employee :" + it.next());  
		}
		
		System.out.println("##################   2     ##################");
		Iterator<Employee> it2 = lst.iterator();
		while(it2.hasNext()){
			Employee emp = it2.next();
			System.out.println("Id :" + emp.getEmpid() + " NAME: " + emp.getEmpName()); //#4,5,6
		}
		
		System.out.println("##################   3     ##################");
		
		Collections.sort(lst);
		
		Iterator<Employee> it3 = lst.iterator();
		while(it3.hasNext()){
			Employee emp = it3.next();
			System.out.println("Id :" + emp.getEmpid() + " NAME: " + emp.getEmpName()); //#7,8,9
		}
	}

}