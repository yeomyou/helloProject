package com.yedam.interfaces;

public class RemoteControlExe {
	public static void main(String[] args) {
		
//		Audio audio = new Audio();
		RemoteControl remote = new Audio();
		remote = new Television();
		remote.turnOn();
		remote.setVolume(6);
		remote.turnOff();
	}
}
