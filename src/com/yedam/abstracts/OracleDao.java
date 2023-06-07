package com.yedam.abstracts;

public class OracleDao extends Dao{
	


	@Override
	void add() {
		System.out.println("Oracle 등록");
		
	}

	@Override
	void remove() {
		System.out.println("Oracle 삭제");
		
	}

	@Override
	void modify() {
		System.out.println("Oracle 수정");
	}
}
