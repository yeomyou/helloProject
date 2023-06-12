package com.yedam.interfaces;

public class SmartTelevision implements RemoteControl, Searchable {

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

}
