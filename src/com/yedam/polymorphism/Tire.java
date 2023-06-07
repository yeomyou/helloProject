package com.yedam.polymorphism;



public class Tire {
	private int maxRotation;
	private int accumulatedRotation;
	private String location;
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		accumulatedRotation++;
		if(accumulatedRotation<maxRotation) {
			System.out.println((maxRotation-accumulatedRotation) + "회, 위치 : "
					+ location) ;
			return true;
		}else {
			System.out.println("타이어 펑크 *** \n 위치 : " + location);
			return false;
		}
		
	}

	public int getMaxRotation() {
		return maxRotation;
	}

	public void setMaxRotation(int maxRotation) {
		this.maxRotation = maxRotation;
	}

	public int getAccumulatedRotation() {
		return accumulatedRotation;
	}

	public void setAccumulatedRotation(int accumulatedRotation) {
		this.accumulatedRotation = accumulatedRotation;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
