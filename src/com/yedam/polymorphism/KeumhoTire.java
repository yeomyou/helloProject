package com.yedam.polymorphism;

public class KeumhoTire extends Tire{

	public KeumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		setAccumulatedRotation(getAccumulatedRotation()+1);
		if(getAccumulatedRotation()<getMaxRotation()) {
			System.out.println((getMaxRotation()-getAccumulatedRotation()) + "회, 위치 : "
					+ getLocation()) ;
			return true;
		}else {
			System.out.println("금호 타이어 펑크 *** \n 위치 : " + getLocation());
			return false;
		
		}
	}
}
