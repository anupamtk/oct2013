package com.anupam.collections;

public class Employee implements Comparable<Employee>{
	
	private int empid;
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	private String empName;
	
	Employee(int id, String name){
		empid = id;
		empName = name;
	}
	
	
	// Below overridden method is to sort emp by id
	@Override
	public int compareTo(Employee arg0) {
		return this.empid - arg0.empid;
	}
	
	//Below overridden method is to sort emp by name
	/*@Override
	public int compareTo(Employee arg0) {
		return this.empName.compareTo(arg0.empName);
	}*/

}
