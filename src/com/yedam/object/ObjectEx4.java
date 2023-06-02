package com.yedam.object;

public class ObjectEx4 {
	public static void main(String[] args) {
		
		Person[] families = {new Person("fa", 60),
				new Person("ma", 50),
				new Person("bro", 15)};
		
		Member m1 = new Member();
		m1.memberId = "user1";
		m1.memberName = "홍길동";
		m1.point = 1000;
		m1.families = families;
		
		m1.families[0].getName();
		m1.families[0].getAge();
		
		Member m2 = new Member();
		
		Member[] members = new Member[10];
		members[0] = m1;
		members[1] = m2;
		
		for(int i = 0 ; i < members.length; i++) {
			String name = members[i].families[0].getName();
		}
		
		
		
	}
}
