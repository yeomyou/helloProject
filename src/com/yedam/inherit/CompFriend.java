package com.yedam.inherit;

public class CompFriend extends Friend{
	private String comp;
	private String dept;
	
	public CompFriend() {
		super();
	}
	
	public CompFriend(String name, String phone, String comp, String dept) {
		super(name, phone);
		this.comp = comp;
		this.dept = dept;
	}

	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String showInfo() {
		return "이름은 " + getName()+ "번호는 " + getPhone()
		+ " 회사는 " + getComp() + " 부서는 " + getDept();
	}

}
