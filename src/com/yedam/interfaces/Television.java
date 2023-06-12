package com.yedam.interfaces;

public class Television implements RemoteControl{
	int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("tv켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("tv끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > MAX_VOLUME ) {
			this.volume = MAX_VOLUME;
			
		}else {
			this.volume = volume;
		}
		System.out.println("볼륨 : " + this.volume);	
		
	}

}
