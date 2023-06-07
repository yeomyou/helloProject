package com.yedam.classes;

public class Calculator {
	final static double PI = 3.14;
	
	
	
	public static void sum(int num1 , int num2) {
		int result = num1 + num2;
		System.out.println(result);
		
	}
	
	public static void minus(int num1, int num2) {
		int result = num1-num2>0 ? (num1-num2) : (num2-num1);
		
		System.out.println("- 결과 : " + result);
	}
	
	public static void radArea(int radius) {
		
		double result = PI * radius * radius;
		System.out.println(result);
	}

	
}
