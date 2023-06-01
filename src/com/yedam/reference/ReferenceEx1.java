package com.yedam.reference;

public class ReferenceEx1 {
	public static void main(String[] args) {
		int age = 25;
		double price = 100.5;
		
		int age1 = age;
		age = 30;
		System.out.println("age: " + age + ", age1: " + age1);
		
		String name = new String("길동");
		String name1 = new String("김길동");
		String name2 = "길동";
		String name3 = new String("김길동");
		System.out.println("name : " + name + ", name1: " +name1 );
		
		System.out.println(System.identityHashCode(name));
		System.out.println(System.identityHashCode(name1));
		System.out.println(System.identityHashCode(name2));
		System.out.println(System.identityHashCode(name3));
		
		String hobby = "독서";				
	}
}
