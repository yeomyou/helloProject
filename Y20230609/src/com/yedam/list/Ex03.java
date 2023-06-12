package com.yedam.list;
import java.util.*;

class Emp{
	int empNo;
	String empName;
	int salary;
	Emp(int empNo, String empName, int salary){
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}
}
public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Emp> employees = new ArrayList<>();
		
		System.out.println("ex) 100 홍길동 1000");
		while(true) {
			String input = sc.nextLine();
			if(input.equals("quit")) {
				System.out.println("종료합니다.");
				break;
			}
			
			String [] puts = input.split(" ");
			if(puts.length != 3) {
				System.out.println("값을 다시 입력");
				continue;
			}
			employees.add(new Emp( Integer.parseInt(puts[0]),puts[1], Integer.parseInt(puts[2])));
		}
		
		for(Emp emp : employees) {
			System.out.println("사번 : " + emp.empNo + ", 이름 : " + emp.empName + ", 급여 : " + emp.salary);
		}
	}
}
