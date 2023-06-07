package com.yedam.inherit;

//추가/수정/삭제/목록
//추가: 학교친구(이름,연락처,학교,전공) / 회사친구(이름,연락처,회사,부서)/친구(이름,연락처)
//수정: 이름조회 -> 학교:학교,전공 / 회사: 회사,부서 / 친구 :연락처.
//삭제 : 이름조회 -> 삭제.
//목록: 전부 출력.
import java.util.*;
public class FriendExe {
	static Friend[] frs = new Friend[100];
	static Scanner sc = new Scanner(System.in);
	static int index = 0;
	public static void main(String[] args) {
		
	}
	
	
	public static void method() {
		Friend[] friends = new Friend[10];
//	UnivFriend[] univs = new UnivFriend[10];
	
	friends[0] = new Friend("홍길동", "010-1111");
	friends[1] = new UnivFriend("김민기" , "010-2222", "대구대", "역사");
	friends[2] = new CompFriend("박호섭", "010-3333", "네이버", "개발부서");
	
	for(Friend friend : friends) {
		if(friend != null) {
			System.out.println(friend.showInfo());
		}
	}
	}
	
	public static void execute() {
		int selNo = -1;
		boolean run = true;
		while(run) {
			menuShow();
			selNo = Integer.parseInt(sc.nextLine());
			if(selNo==1) {
				regi();
			}else if(selNo==2){
				modify();
			}else if(selNo==3) {
				del();
			}else if(selNo==4) {
				list();
			}
			
			
		}
		
	}
	public static void menuShow() {
		System.out.println("==========================");
		System.out.println("1)추가  2)수정  3)삭제  4)목록");
		System.out.println("==========================");
		System.out.print("입력 > ");
	}
	public static void regi() {
		System.out.println("등록할 친구의 종류를 입력하세요.");
		System.out.println("1)회사친구 2)학교친구 3)친구(default)");
		int fNum = -1;
		fNum = Integer.parseInt(sc.nextLine());
		
		if(fNum ==1) {
			CompFriend fr = new CompFriend();
			System.out.println("등록할 친구 이름을 입력하세요.");
			fr.setName(sc.nextLine());
			System.out.println("등록할 친구 번호를 입력하세요.");
			fr.setPhone(sc.nextLine());
			System.out.println("등록할 회사 이름을 입력하세요.");
			fr.setComp(sc.nextLine());
			System.out.println("등록할 회사 부서를 입력하세요.");
			fr.setDept(sc.nextLine());
			frs[index++] = fr;
		}else if(fNum==2) {
			UnivFriend fr = new UnivFriend();
			System.out.println("등록할 친구 이름을 입력하세요.");
			fr.setName(sc.nextLine());
			System.out.println("등록할 친구 번호를 입력하세요.");
			fr.setPhone(sc.nextLine());
			System.out.println("등록할 친구 학교를 입력하세요.");
			fr.setUniv(sc.nextLine());
			System.out.println("등록할 친구 전공을 입력하세요.");
			fr.setMajor(sc.nextLine());
			frs[index++] = fr;
		}else if(fNum==3) {
			Friend fr = new Friend();
			System.out.println("등록할 친구 이름을 입력하세요.");
			fr.setName(sc.nextLine());
			System.out.println("등록할 친구 번호를 입력하세요.");
			fr.setPhone(sc.nextLine());
			frs[index++] = fr;
		}
		
		
	}
	public static void modify() {
		System.out.println("수정할 친구 이름을 입력하세요.");
		String name = sc.nextLine();
		for(int i = 0; i<frs.length; i++) {
			if(frs[i] != null && frs[i].getName().equals(name)) {
				
				if(frs[i] instanceof CompFriend) {
					CompFriend comf = (CompFriend) frs[i];
					System.out.println("수정할 회사 이름을 입력하세요.");
					String com = sc.nextLine();
					comf.setComp(com);
					System.out.println("수정할 회사 부서를 입력하세요.");
					String dept = sc.nextLine();
					comf.setDept(dept);
					frs[i] = comf;
					
				}else if(frs[i] instanceof UnivFriend) {
					UnivFriend univ = (UnivFriend) frs[i];
					System.out.println("수정할 학교 이름을 입력하세요.");
					String univName =sc.nextLine();
					univ.setUniv(univName);
					System.out.println("수정할 학교 전공을 입력하세요.");
					String majorName = sc.nextLine();
					univ.setMajor(majorName);
					frs[i] = univ;
					
				}else if(frs[i] instanceof Friend) {
					String phone = sc.nextLine();
					frs[i].setPhone(phone);
				}
			}
		}
		
	}
	public static void del() {
		System.out.println("삭제할 친구 이름을 입력하세요.");
		String name = sc.nextLine();
		for(int i = 0; i<frs.length; i++) {
			if(frs[i] != null && frs[i].getName().equals(name)) {
				frs[i] = null;
			}
		}
	}
	public static void list() {
		for(int i = 0; i<frs.length; i++) {
			if(frs[i]!=null) {
			System.out.println(frs[i].showInfo());
			}
		}
		
	}
}
