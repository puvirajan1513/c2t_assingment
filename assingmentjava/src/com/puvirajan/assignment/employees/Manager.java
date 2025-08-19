package com.puvirajan.assignment.employees;

public class Manager extends Employees {
	private String Department;
	
	public Manager(String name,String employeeId,double salary,String Department) {
		super(name,employeeId,salary);
		this.Department=Department;
		
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}
	
	@Override

	public String disman() {
		return "Manager [Department=" + Department + "]";
	}
	

}
