package com.yedam.hr;

import java.util.Scanner;

public class EmpListApp {
	public static void main(String[] args) {
		EmpList app = new EmpList();
		Scanner sc = new Scanner(System.in);
		int selectNo = 0;
		boolean run = true;
		
		
		while(run) {
			System.out.println("1.사원수 2.사원등록 3.사원목록 4.검색 5.급여 합계 6.종료");
			
			System.out.print(""
					+ "선택 >  ");
			selectNo =  Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				app.init();
			}else if(selectNo == 2) {
				app.input();
			}else if(selectNo == 3) {
			
				app.print();
			}else if(selectNo == 4) {
				System.out.print("사원번호 > ");
				int a = Integer.parseInt(sc.nextLine());
				String name = app.search(a);
				System.out.println("이름은 " + name);
			}else if(selectNo ==5) {
				int sum = app.sum();
				System.out.println("총 급여는 " + sum);
			}else if(selectNo == 6) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		}
	}
}
