package com.yedam.polymorphism;

public class AppleSpeaker implements Speaker{

	AppleSpeaker(){
		System.out.println("객체 생성");
	}
	
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("볼륨업");
	}

	@Override
	public void volumeDowm() {
		// TODO Auto-generated method stub
		System.out.println("볼륨다운");
	}

}
