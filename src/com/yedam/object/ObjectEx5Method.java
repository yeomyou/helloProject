package com.yedam.object;

public class ObjectEx5Method {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int result = sum(num1, num2);
		double result1 = div(num1, num2);
		result = sum(new int[] { 1,2,3});
		
		ObjectEx5Method o1 = new ObjectEx5Method();
	}	
	

	public static void showNumber(int[] ary) {
		for(int a : ary) {
			System.out.println(a);
		}
	}
	public static Person makePerson(String name, int age) {
		return new Person(name,age);
	}
	public static int[] makeAry(int size) {
		int[] ary = new int[size];
		for(int i=0; i<ary.length; i++) {
			ary[i] = (int)(Math.random()*10);
		}
		return ary;
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
	public static int sum (int[] ary) {
		int result =0;
		for(int num : ary) {
			result+=num;
		}
		return result;
	}
	public static double div(int n1, int n2) {
		return (double) n1/n2;
	}
}
