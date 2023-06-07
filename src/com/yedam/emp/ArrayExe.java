package com.yedam.emp;

import java.util.ArrayList;

class Member{
	private String memberId;
	private String memberName;
	private int score;
	
	Member(String memberId, String memberName, int score){
		this.memberId = memberId;
		this.memberName = memberName;
		this.score = score;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}

public class ArrayExe {
	public static void main(String[] args) {
		ArrayList<Member> members = new ArrayList<Member>();
		members.add(new Member("001", "홍길동", 100));
		
		for(int i = 0; i<members.size(); i++) {
			if(members.get(i).getMemberName().equals("홍길동"));
//				members.remove(i);
				members.set(i, new Member("010", "김민식", 150));
		}
		
		for(int i = 0; i<members.size(); i++) {
			if(((Member)members.get(i)).getMemberName().equals("홍길동")) {
				members.remove(i);
			}
		}
		
		
//		ArrayList arry = new ArrayList();
//		arry.add("홍길동");
//		arry.add("김길동");
//		arry.add(100);
//		
//		
//		for(Object name : arry) {
//			System.out.println((String)name);
//		}
	}
}
