package com.dev.emp;



public class HelloEx {
	public static void main(String[] args) {
		for(String str : args) {
			System.out.println(str);
		}
		
		Hello hello = new Hello();
		
//		hello.name = "hong";
		hello.age = 20;
		hello.height = 179.0;
		
		World world = new World();
		System.out.println("end.");
	}
}
