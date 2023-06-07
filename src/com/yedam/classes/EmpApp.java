package com.yedam.classes;

public class EmpApp {
	public static void main(String[] args) {
		Department dept1 = new Department();
		dept1.setDepartmentID(10);
		dept1.setDepartmentName("인사");
		dept1.setManagerId(120);
		
		Department dept2 = new Department(20, "기획");
		dept2.setManagerId(130);
		
		dept1.toString();
		
		
		Employee emp1 = new Employee();
		
		emp1.setEmployeeId(200);
		emp1.setFirstName("길동");
		emp1.setLastName("홍");
		emp1.setDept(dept1);
		
		Employee emp2 = new Employee(201, "민수", "김", dept1);
		
		System.out.println("부서정보 : " + emp1.getDept().getDepartmentName());
		
		Employee emp3 = new Employee(203, "이수", "김", new Department(30, "개발", 150));
	}
}
