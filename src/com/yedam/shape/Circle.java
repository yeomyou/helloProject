package com.yedam.shape;

public class Circle extends Shape implements Drawable, Movable{

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("원 이동.");
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("원 그림.");
	}

}
