package com.yedam.inherit;

public class Friend {
	private String name;
	private String phone;
	
	Friend (){}
	Friend (String name, String phone){
		this.name = name;
		this.phone = phone;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String showInfo() {
		// TODO Auto-generated method stub
		return "이름은 " + name + " 번호는 " + phone;
	}
}
