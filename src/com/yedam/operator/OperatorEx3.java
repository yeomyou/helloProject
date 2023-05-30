package com.yedam.operator;

import java.util.Scanner;

public class OperatorEx3 {
	public static void main(String[] args) {
		//변수 balance 선언
		// 입력값 판단, 1) balance 값 추가 , 2)값 빼기
		// 3) 현재 balance 값 출력 4) 종료.
		Scanner sc = new Scanner(System.in);
		
		int balance = 0;
		int tmp = 0;
		while(true) {
			System.out.println("1)추가, 2)차감 3) balance 출력 4) 종료");
			int menu = sc.nextInt();
			if(menu == 4) {
				break;
			}
			switch(menu) {
			case 1 :
				System.out.println("추가할 값을 입력하시오.");
				tmp = sc.nextInt(); 
				balance+=tmp;  break;
			case 2 :
				System.out.println("차감할 값을 입력하시오.");
				tmp = sc.nextInt();
				balance-=tmp;  break;
			case 3 : System.out.println("현재 값은 " + balance);  break;
			default: break;
			}
			
		
		}
		System.out.println("end of porg.");
		sc.close();
	}
	public static void method1() {
		//반복 처리. while (condition){}
		int num =1;
		boolean isOk = false;
		
		while(isOk) {
		
		}
	}
}
