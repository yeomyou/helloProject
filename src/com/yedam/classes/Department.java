package com.yedam.classes;

public class Department {
	private int departmentId;
	private String departmentName;
	private int managerId;
	
	Department(){
		
	}
	
	Department(int departmenrId){
		this.departmentId = departmentId;
	}
	
	Department(int departmentId, String departmentName){
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	
	Department(int departmentId, String departmentName, int managerId){
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.managerId = managerId;
	}
	
	void setDepartmentID(int departmenrId) {
		this.departmentId = departmentId;
	}
	
	void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	
	int getDepartmentId() {
		return departmentId;
	}
	String getDepartmentName() {
		return departmentName;
	}
	int getManagerId() {
		return managerId;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
	
}
	