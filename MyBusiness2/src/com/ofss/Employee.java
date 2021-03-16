package com.ofss;

public class Employee {
	int employeeId;
	String employeeName;
	int departmentId;

	public Employee()
	{
		
	}
	
	public Employee(int eId, String eName, int dId )
	{
		employeeId=eId;
		employeeName=eName;
		departmentId=dId;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	
}