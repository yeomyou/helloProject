package com.yedam.object;

public class Bank {
	String accountNo; // unique. ex) 11-23-1234
	String owner; // 예금주 ex) 홍길동
	int balance; //잔고 ex)

	
	void setAccountNo(String acNo) {
		accountNo = acNo;
	}
	String getAccountNo() {
		return accountNo;
	}
	
	void setOwner(String owner) {
		this.owner = owner;
	}
	String getOwner() {
		return this.owner;
	}
	
	void setBal(int balance) {
		this.balance = balance;
	}
	int getBal() {
		return this.balance;
	}
}
