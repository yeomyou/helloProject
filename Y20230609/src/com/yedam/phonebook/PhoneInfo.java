package com.yedam.phonebook;

import java.io.Serializable;

public class PhoneInfo implements Serializable{
	private String name;
	private String phoneNumber;
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public void showPhoneInfo() {
		System.out.println("이름: " + name + ",번호 : " + phoneNumber);
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public boolean equals(Object obj) {
		PhoneInfo info = (PhoneInfo) obj;
		if(info.name.compareTo(this.name)==0) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return INPUT_SELECT.NORMAL + "," + name + "," + phoneNumber+"\n";
	}
}
