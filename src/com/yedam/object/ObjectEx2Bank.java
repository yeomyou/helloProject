package com.yedam.object;

import java.util.Scanner;

public class ObjectEx2Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank[] accounts = new Bank[3];
		boolean run = true;
		
		while(run) {
			System.out.println("1.등록 2.조회(계좌) 3.입금 4.출금 5.종료");
			int sel = Integer.parseInt(sc.nextLine());
			int accNum = 0;
//			try {
//				accounts[accNum] = new Bank();
//			}
//			catch(NullPointerException e) {
//			
//			}
 			
			if(sel == 1) {
				accounts[accNum] = new Bank();
				System.out.println("등록할 계좌의 예금주 이름을 입력해주세요");
				
				accounts[accNum].owner = sc.nextLine();
				
				System.out.println("등록할 계좌 번호를 입력해주세요");
				accounts[accNum].accountNo = sc.nextLine();
				System.out.println("계좌의 잔액을 입력해주세요");
				accounts[accNum].balance = Integer.parseInt(sc.nextLine());
				
			}else if(sel ==2 ) {
				System.out.println("예금주 : " + accounts[accNum].owner);
				System.out.println("계좌번호 : "+accounts[accNum].accountNo);
				System.out.println("현재 잔액 :" + accounts[accNum].balance);
			}else if(sel ==3 ) {
				System.out.println("입금할 금액을 입력해주세요");
				accounts[accNum].balance += Integer.parseInt(sc.nextLine());
				
			}else if(sel ==4 ) {
				System.out.println("출금할 금액을 입력해주세요");
				accounts[accNum].balance -= Integer.parseInt(sc.nextLine());
			}else if(sel ==5) {
				accNum++;
				continue;
			}
		}
		
		for(int i=0; i<accounts.length;i++) {
			System.out.println(i+"번째 : "+accounts[i].owner);
			System.out.println(i+"번째 : "+accounts[i].accountNo);
			System.out.println(i+"번째 : "+accounts[i].balance);
		}
		
		System.out.println("end.");
		sc.close();
	}
}
