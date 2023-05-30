package com.yedam.operator;

import java.util.Scanner;

public class OperatroEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 개의 수를 입력하시오.");
		int tmpNum = 0;
		int tmpNum2 = 0;
		tmpNum = sc.nextInt();
		tmpNum2 = sc.nextInt();
		thirdMethod(tmpNum, tmpNum2);
		
		sc.close();
	}
	
	public static void firstMethod() {
		
	}
	public static void secondMethod() {
		Scanner sc = new Scanner(System.in);
		
		long a = 0;
		long b = 0;
		long sum = 1;
		
		a = sc.nextLong();
		b = sc.nextLong();
		for(int i = 0; i<b; i++) {
			sum = a*sum;
		}
		
		System.out.println(sum);
		sc.close();
	}
	
	public static void thirdMethod(int a, int b) {
		int result = a+b;
		System.out.println(result);
	}
}
