package com.yedam.hr;

public class Employee {
	private int employeeId;
	private String name;
	private int departmentId;
	private String departmentName;
	//10 인사 20 개발 30영업 디폴트
	private int salary;
	private String email;
	
	
	Employee(){
		this.departmentId = 30;
	}
	
	Employee(int employeeId, String name, int salary, int departmenrId){
		this.employeeId = employeeId;
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
		
		if(departmentId == 10) {
			departmentName = "인사";
		}else if(departmenrId == 20) {
			departmentName = "개발";
			
		}else {
			departmentName = "영업";
		}
	}
	
	Employee(int employeeId, String name){
		this(employeeId, name, 0, 30);
	}
	Employee(int employeeId, String name, int salary){
		this(employeeId, name,salary, 30);
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
}


