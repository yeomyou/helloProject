package com.yedam.phonebook;

public class PhoneCompanyInfo extends PhoneInfo{
	private String company;
	
	public PhoneCompanyInfo(String name, String phoneNumber, String company) {
		super(name, phoneNumber);
		this.company = company;
	}
	
	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("회사 정보 : " + company);
	}
	@Override
	public String toString() {
		return INPUT_SELECT.UNIV + "," + this.getName() + "," + this.getPhoneNumber()+"," + company + "\n";
	}
}
