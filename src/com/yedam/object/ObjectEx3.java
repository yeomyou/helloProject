package com.yedam.object;

class Person{
	String name;
	int age;
	Person(){
		name = "기본값";
		age = 10;
	}
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	void setName(String name) {
		this.name = name;
		
	}
	
	String getName() {
		return this.name;
	}
	
	void setAge(int age) {
		if(age<=0) {
			this.age = 1;
		}
		this.age = age;	
	}
	int getAge() {
		return this.age;
	}
	void showInfo() {
		System.out.printf("이름은 %s이고 나이는 %d입니다. \n", name,age);
	}
	
	
}
public class ObjectEx3 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(20);
	}
}
