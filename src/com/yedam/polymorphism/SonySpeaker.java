package com.yedam.polymorphism;

public class SonySpeaker implements Speaker{

	
	SonySpeaker(){
		System.out.println("소니객체 생성");
	}
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("소니 볼륨업");
	}

	@Override
	public void volumeDowm() {
		// TODO Auto-generated method stub
		System.out.println("소니 볼륨다운");
	}

}
