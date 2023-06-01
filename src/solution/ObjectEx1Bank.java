package workspace_y_j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ObjectEx1Bank {
	static int index = 0;
	static Banks account[] = new Banks[100];
	public static void main(String[] args) throws IOException {
		boolean run = true;

		while(run) {
			System.out.println("=================================");
			System.out.println("1.등록  2.조회  3.입금  4.출금  5.종료");
			System.out.println("=================================");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
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
			
		
		}
	}
	public static void createAcc() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Banks acc = new Banks();
		System.out.println("등록할 예금주 명을 입력하세요");
		acc.owner = br.readLine();
		System.out.println("등록할 계좌번호를 입력하세요.");
		acc.accounts = br.readLine();
		acc.balance = 0;
		account[index] = acc;
	}
	public static void searchAcc() {
		System.out.println("예금주 명: "+account[index].owner);
		System.out.println("계좌번호 : "+account[index].accounts);
		System.out.println("보유 금액: "+account[index].balance);		
	}
	public static void plusBal() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("현재 잔액 : " + account[index].balance);
		account[index].balance += Integer.parseInt(br.readLine());
	}
	public static void minusBal() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("현재 잔액 : " + account[index].balance);
		account[index].balance -= Integer.parseInt(br.readLine());
	}
}
