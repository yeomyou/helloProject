package com.yedam.emp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpArrayList extends EmpList{
	ArrayList<Employee> employees;

	@Override
	void init() {
	
		employees = new ArrayList<Employee>();
	}

	@Override
	void input() {
		System.out.println(employees.size()+"사번 > " );
		int no = Integer.parseInt(sc.nextLine());
		System.out.println("이름 > ");
		String name = sc.nextLine();
		System.out.println("급여 > ");
		int salary = Integer.parseInt(sc.nextLine());
		
		employees.add(new Employee(no, name, salary));
		
	}

	@Override
	String search(int employeeId) {
		for(int i=0; i<employees.size(); i++) {
			if(employees.get(i).getEmployeeId() == employeeId) {
				return "이름은: "+employees.get(i).getName()+" 급여 : "+employees.get(i).getSalary();
			}
		}
		return null;
	}

	@Override
	void print() {
		for(int i=0; i<employees.size(); i++) {
			if(employees.get(i) != null) {
				System.out.println("사번 : "+employees.get(i).getEmployeeId() + " 이름 : " + employees.get(i).getName()+ " 급여 : " + employees.get(i).getSalary());
			}
		}
	}

}
