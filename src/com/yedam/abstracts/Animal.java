package com.yedam.abstracts;

public abstract class Animal {
	String kind;
	
	Animal(){}
	
	Animal(String kind){
		this.kind = kind;
	}
	
	void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	abstract void sound();
}
