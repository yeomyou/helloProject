package com.yedam.control;

public class ControlEx4 {
	public static void main(String[] args) {
		System.out.println(method1());
		method2();
		method3();
		method4();
		
		
		
	}
	public static int method1() {
		int sum = 0;
		for(int i =1; i<=100; i++) {
			if(i%3 == 0) {
				sum+=i;
			}
		}
		return sum;
	}
	public static void method2() {
		int ran1 = 0;
		int ran2 = 0;
		
		
		while(true) {
		ran1 = (int)(Math.random()*10)+1;
		ran2 = (int)(Math.random()*10)+1;
			if(ran1 + ran2 == 5) {
				System.out.println("ran 1 = " + ran1 + "\nran 2 = " + ran2 + "\nran1 + ran2= " +(ran1+ran2));
				break;
			}
		}
		
		}
	public static void method3() {
		
		for(int i=1; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
	
	public static void method4() {
		for(int i=1; i<5; i++) {
			for(int k=4; k>i; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
