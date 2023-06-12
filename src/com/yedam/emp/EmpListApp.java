package com.yedam.emp;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpListApp {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		EmpList app = null;
		app = new EmpArray();
		
		EmpList appAL = null;
		appAL = new EmpArrayList();
		
		app.init();
		app.input();
		app.print();
		boolean run = true;
		while(run) {
			System.out.println("조회할 사번을 입력하세요. 뒤로 돌아가려면 exit을 입력하세요.");
			String id = sc.nextLine();
			if(id.equals("exit")) {
				run = false;
				break;
				
			}else {
			int empId = Integer.parseInt(id);
			System.out.println(app.search(empId));
			}
		
		}

		appAL.init();
		appAL.input();
		appAL.print();
		
		boolean isOk = true;
		while(isOk) {
			System.out.println("조회할 사번을 입력하세요.. 뒤로 돌아가려면 exit을 입력하세요.");
			String id2 = sc.nextLine();
			if(id2.equals("exit")) {
				isOk = false;
				break;
				
			}else {
			int empId = Integer.parseInt(id2);
			System.out.println(appAL.search(empId));
			}
		}
	
		}
}

