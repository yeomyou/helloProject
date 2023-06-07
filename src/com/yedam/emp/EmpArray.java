package com.yedam.emp;

public class EmpArray extends EmpList{
	Employee[] employees;
	int index;
	@Override
	void init() {
		System.out.println("사원 수 입력>");
		int num = Integer.parseInt(sc.nextLine());
		employees = new Employee[num];
	}

	@Override
	void input() {
		System.out.println(index + "사번 > " );
		int no = Integer.parseInt(sc.nextLine());
		System.out.println("이름 > ");
		String name = sc.nextLine();
		System.out.println("급여 > ");
		int salary = Integer.parseInt(sc.nextLine());
		
		employees[index++] = new Employee(no, name, salary);
	}

	@Override
	String search(int employeeId) {
		for(int i = 0; i<employees.length; i++) {
			if(employees[i] != null && employees[i].getEmployeeId() == employeeId) {
				return "이름은 : "+ employees[i].getName()+" 급여는 : " + employees[i].getSalary();
			}
		}
		return null;
	}

	@Override
	void print() {
		for(Employee emp : employees) {
			if(emp != null) {
			System.out.println("사번: "+emp.getEmployeeId()+"이름: "+emp.getName()+" 급여: "+emp.getSalary() 
					); 
			}
		}
		
	}

}
