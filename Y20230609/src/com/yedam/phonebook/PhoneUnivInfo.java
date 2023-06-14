package com.yedam.phonebook;

public class PhoneUnivInfo extends PhoneInfo{
	private String major;
	private int year;
	
	public PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
		super(name, phoneNumber);
		this.major = major;
		this.year = year;
	}
	
	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("전공 : " + major + " 학년 : " + year);
	}
	@Override
	public String toString() {
		return INPUT_SELECT.UNIV + "," + this.getName() + "," + this.getPhoneNumber()+"," + major + "," + year + "\n";
	}
}
