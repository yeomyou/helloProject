package com.yedam.memo;

public interface MemoList {
	void input(Memo memo);
	
	void update(Memo memo);
	
	void delete(int no);
	void delete(String date);
	
	void search(int no);
	void search(String date);
	
	void print();
	void menuShow();
	
}
