package com.yedam.emp;

public abstract class EmpList {
	
	abstract void init(); //저장 초기화.
	
	abstract void input(); // 사원정보 입력.
	
	abstract String search(int employeeId); // 조회.
	
	abstract void print(); //사원정보 출력.
}
