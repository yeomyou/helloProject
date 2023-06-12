package com.yedam.memo;

import java.util.*;

public class MemoApp {
	static int index;
	static Scanner sc = new Scanner(System.in);
	static List<Memo> list = new ArrayList<>();
	public static void main(String[] args) {
//		new Memo(1, "20230503", "내용1");
		
		MemoList memoApp = new MemoListImpl();
		
		boolean run = true;
		int selNo = -1;
		int searchNo = -1;
		int delNo = -1;
		while(run) {
			memoApp.menuShow();
			selNo = Integer.parseInt(sc.nextLine());
			
			switch(selNo) {
			case 1: 
				System.out.println("메모할 내용을 입력해주세요.");
				String mem = sc.nextLine();
				Memo memo = new Memo(index++, "20230608", mem);
				
				memoApp.input(memo);
				break;
			case 2:
				System.out.println("수정할 메모의 번호를 입력해주세요.");
				int upNo = Integer.parseInt(sc.nextLine());
				System.out.println("수정할 내용을 입력해주세요.");
				String mem2 = sc.nextLine();
				
				memoApp.update(new Memo(upNo, "20230608",mem2));
				break;
			case 3:
				System.out.println("1)번호로 삭제 2)날짜로 삭제");
				delNo = Integer.parseInt(sc.nextLine());
				if(delNo==1) {
					System.out.println("삭제할 메모의 번호를 입력해주세요.");
					int tmpdelNo = Integer.parseInt(sc.nextLine());
					memoApp.delete(tmpdelNo);
				}else if(delNo==2) {
					System.out.println("삭제할 메모의 날짜를 입력해주세요.");
					String tmpdelDate = sc.nextLine();
					memoApp.delete(tmpdelDate);
				}
				break;
			case 4:
				System.out.println("1)번호로 조회 2)날짜로 조회");
				searchNo = Integer.parseInt(sc.nextLine());
				if(searchNo==1) {
					System.out.println("조회할 메모의 번호를 입력해주세요.");
					int tmpsearNo = Integer.parseInt(sc.nextLine());
					memoApp.search(tmpsearNo);
				}else if(searchNo==2) {
					System.out.println("조회할 메모의 번호를 입력해주세요.");
					String tmpsearDate = sc.nextLine();
					memoApp.search(tmpsearDate);
				}
				break;
			case 5:
				memoApp.print();
				break;
			case 6:
				run = false;
				break;
			}
		}
		System.out.println("end.");
		
	}
}
