package com.yedam.abstracts;

public class AnimalExe {
	public static void main(String[] args) {
		Animal animal = null;
		animal = new Bird();
		animal.breathe();
		animal.sound();
		
		Bird bird = new Bird();	
		bird.sound();
		
		Animal cat = new Cat();
		cat.breathe();
		cat.sound();
	}
	
}
