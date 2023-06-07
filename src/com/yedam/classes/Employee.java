package com.yedam.classes;

public class Employee {
	private static int employeeId;
	private static String firstName;
	private static String lastName;
	private Department dept;
	
	Employee(){
		
	}
	Employee(int employeeId, String firstName){
		this.employeeId = employeeId;
		this.firstName = firstName;
	}
	
	Employee(int employeeId, String firstName, String lastName, Department dept){
		this(employeeId, firstName); //정수, 문자열 생성자 호출;
		this.lastName = lastName;
		this.dept = dept;
		
	}
	public static int getEmployeeId() {
		return employeeId;
	}
	public static void setEmployeeId(int employeeId) {
		Employee.employeeId = employeeId;
	}
	public static String getFirstName() {
		return firstName;
	}
	public static void setFirstName(String firstName) {
		Employee.firstName = firstName;
	}
	public static String getLastName() {
		return lastName;
	}
	public static void setLastName(String lastName) {
		Employee.lastName = lastName;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [dept=" + dept + "]";
	}
	
	
}
