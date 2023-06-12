package com.yedam.memo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoListImpl implements MemoList{
	Scanner sc = new Scanner(System.in);
	List<Memo> list = new ArrayList<>(100);
	int index;
	@Override
	public void input(Memo memo) {
	
		list.add(memo);
	}

	@Override
	public void update(Memo memo) {
		int tmpindex = -1;
		for(int i =0; i<list.size(); i++) {
			if((list.get(i)).getNo()==memo.getNo()) {
				tmpindex = i;
				System.out.println("같음~");
			}	
		}
		list.set(tmpindex,memo);
	}

	@Override
	public void delete(int no) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getNo()==no) {
				list.remove(no);
			}
		}
	}

	@Override
	public void delete(String date) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getDate().equals(date)) {
				list.remove(i);
			}
		}
	}

	@Override
	public void search(int no) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getNo()==no) {
				System.out.println("번호: "+list.get(i).getNo() +") 날짜 : "+ list.get(i).getDate()+") 내용 ==>" + list.get(i).getContent());
			}
		}
	}

	@Override
	public void search(String date) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getDate().equals(date)) {
				System.out.println("번호: "+list.get(i).getNo() +") 날짜 : "+ list.get(i).getDate()+") 내용 ==>" + list.get(i).getContent());
			}
		}
	}

	@Override
	public void print() {
		for(int i = 0; i<list.size(); i++) {
			System.out.println("번호: "+list.get(i).getNo() +") 날짜 : "+ list.get(i).getDate()+") 내용 ==>" + list.get(i).getContent());
		}
		
	}
	public void menuShow() {
		System.out.println("---------------------------------------------------");
		System.out.println("1)추가  2)수정  3)삭제(번,날)  4)조회(번,날)  5)목록  6)종료");
		System.out.println("---------------------------------------------------");
	}

}
