package com.yedam;

public class ObjectEx {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		Member m1 = new Member();
		Member m2 = new Member();
		
		m1.setId("user1");
		m2.setId("user1");
		
		m1.setPw("1111");
		m2.setPw("2222");
		
		
		System.out.println(m1.equals(m2));
	}
}
