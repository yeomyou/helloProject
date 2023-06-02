package com.yedam.object;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObjectEx2Bank {
			static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			static int index = 0;
			static Bank account[] = new Bank[100];
			public static void main(String[] args) throws IOException {
				boolean run = true;

				while(run) {
					System.out.println("=============================================");
					System.out.println("1.등록  2.조회  3.입금  4.출금  5.종료 6.모든정보 조회");
					System.out.println("=============================================");
					int selectNum = Integer.parseInt(br.readLine());
					if(selectNum == 1) {
						createAcc();
					}else if(selectNum ==2) {
						searchAcc();
					}	
					else if(selectNum ==3) {
						plusBal();
					}
					else if(selectNum ==4) {
						minusBal();
					}
					else if(selectNum ==5) {
						System.out.println("등록을 그만두려면 'exit'을, 더 등록하려면 's'를 입력하세요.");
						String isOk = br.readLine();
						if(isOk.equals("exit")){
							run = false;
							break;
						}else if(isOk.equals("s")) {
						index++;
						continue;
						}
					}
					else if(selectNum==6) {
						searchAll();
					}
					
				
				}
				System.out.println("end.");
			}
			public static boolean checkAccount(String accountNo) {
				boolean isExist = false;
				for(int q =0; q<account.length; q++) {
					if(account[q] != null && account[q].getAccountNo().equals(accountNo)) {
						isExist = true;
						break;
					}
				}
				return isExist;
			}
			public static void createAcc() throws IOException {
				Bank acc = new Bank();
				System.out.println("등록할 예금주 명을 입력하세요.");
				acc.setOwner(br.readLine());
				System.out.println("등록할 계좌번호를 입력하세요.");
				acc.setAccountNo(br.readLine());
				acc.setBal(0);
				account[index] = acc;
			}
			public static void searchAcc() throws IOException {
				System.out.println("검색할 계좌번호를 입력하세요.");
				String accountNo = br.readLine();
				
				for(int i =0; i<account.length; i++) {
					if(account[i] != null && account[i].getAccountNo().equals(accountNo))
					{
						System.out.println("예금주 명 : "+account[i].getOwner());
						System.out.println("계좌번호 : "+account[i].getAccountNo());
						System.out.println("보유 금액 : "+account[i].getBal());		
						break;
					}
					else {
						System.out.println("계좌가 없습니다.");
						break;
					}
				}
				
			}
			public static void plusBal() throws IOException {
				System.out.println("계좌번호 입력> ");
				String acc = br.readLine();
				boolean isOk = checkAccount(acc);
				if(!isOk) {
					System.out.println("계좌가 없습니다.");
						return;
				}
				else {
				System.out.println("현재 잔액 : " + account[index].getBal());
				System.out.println("입금할 금액을 입력해주세요.");
				account[index].setBal(account[index].getBal()+Integer.parseInt(br.readLine()));
				}
			}
			public static void minusBal() throws IOException {
				System.out.println("현재 잔액 : " + account[index].getBal());
				account[index].setBal(account[index].getBal()-Integer.parseInt(br.readLine()));
			}
			public static void searchAll() {
				for(int i =0; i<account.length; i++) {
					if(account[i] != null) {
						System.out.println("\n====="+i+"번째 등록 정보 ======");
						System.out.println("예금주 명 : "+account[i].getOwner());
						System.out.println("계좌번호 : "+account[i].getAccountNo());
						System.out.println("보유 금액 : "+account[i].getBal());		
						System.out.println("==============================\n\n");
						
					}
					
				}
			}
			
			public static void removeAccount() throws IOException {
				System.out.println("삭제할 계좌번호 입력> ");
				String tmpAccount = br.readLine();
				
				for(int i =0; i< account.length; i++) {
					if(account[i] != null && account[i].getAccountNo().equals(tmpAccount)) {
						account[i] = null;
						System.out.println("정상적으로 삭제되었습니다.");
						break;
					}
				}
			}
		
		//
}

