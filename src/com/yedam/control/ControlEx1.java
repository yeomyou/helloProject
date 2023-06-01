package com.yedam.control;

public class ControlEx1 {
	public static void main(String[] args) {
		int result = (int)(Math.random() * 10);
		System.out.println(result);
		
		if(result % 2== 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		int g = (int)(Math.random()*91 + 10);
		if(g>90) {
			System.out.println("A");
		} else if(g>=80) {
			System.out.println("B");
		} else if(g>=70) {
			System.out.println("C");
		} else {
			System.out.println("D");
			
		}
		 System.out.println(g);
	}
	
	
	
	
	
	
	
	
	
	
}
