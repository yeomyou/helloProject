package com.yedam.hr;

import java.util.*;

public class EmpList {
	private static EmpList instance = new EmpList();
	public static EmpList getInstance() {
		return instance;
	}
	Employee[] list;
	int empNum;
	Scanner sc = new Scanner(System.in);
	
	EmpList(){}
	EmpList(Employee[] list){
		this.list =list;
		this.empNum = list.length;
	}
	
	public void init() {
		System.out.print("사원수 > ");
		int num = Integer.parseInt(sc.nextLine());
		list = new Employee[num];
	}
	
	public void input() {
		if(empNum>=list.length) {
			System.out.println("입력초과");
			return;
		}
		for(int i = 0; i<list.length; i++) {
		System.out.printf("%d 사번 > ", empNum);
		int no = Integer.parseInt(sc.nextLine());
		System.out.print("이름> ");
		String name = sc.nextLine();
		System.out.print("급여> ");
		int sal = Integer.parseInt(sc.nextLine());
		list[empNum++] = new Employee(no, name, sal);
		}
	}
	public String search(int employeeId) {
		for(int i = 0; i<list.length; i++) {
			if(list[i].getEmployeeId() == employeeId) {
				return list[i].getName();
			}
		}
		return "";
	}
	
	public void print() {
		for(int i = 0 ; i< list.length; i++) {
			System.out.printf("%5d %10s %7d\n", list[i].getEmployeeId(), list[i].getName(), list[i].getSalary());
		}
	}
	public int sum() {
		int sum = 0;
		for(int i = 0; i< list.length; i++) {
			sum+=list[i].getSalary();
		}
		return sum;
	}
}

