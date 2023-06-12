package com.yedam.interfaces;

public interface RemoteControl {
	int MAX_VOLUME = 10;
	
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
}
