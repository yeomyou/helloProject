package com.yedam.polymorphism;

public class SamTv implements TV{
	private Speaker speaker;
	
	SamTv(Speaker speaker){
		this.speaker = speaker;
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비온");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("삼성티비오프");
	}

	@Override
	public void voulumeUp() {
		// TODO Auto-generated method stub
		this.speaker.volumeUp();
	}

	@Override
	public void voulumeDown() {
		// TODO Auto-generated method stub
		this.speaker.volumeDowm();
	}

}
