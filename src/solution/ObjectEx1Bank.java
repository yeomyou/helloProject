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
			System.out.println("1.���  2.��ȸ  3.�Ա�  4.���  5.����");
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
				System.out.println("����� �׸��η��� 'exit'��, �� ����Ϸ��� 's'�� �Է��ϼ���.");
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
		System.out.println("����� ������ ���� �Է��ϼ���");
		acc.owner = br.readLine();
		System.out.println("����� ���¹�ȣ�� �Է��ϼ���.");
		acc.accounts = br.readLine();
		acc.balance = 0;
		account[index] = acc;
	}
	public static void searchAcc() {
		System.out.println("������ ��: "+account[index].owner);
		System.out.println("���¹�ȣ : "+account[index].accounts);
		System.out.println("���� �ݾ�: "+account[index].balance);		
	}
	public static void plusBal() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���� �ܾ� : " + account[index].balance);
		account[index].balance += Integer.parseInt(br.readLine());
	}
	public static void minusBal() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���� �ܾ� : " + account[index].balance);
		account[index].balance -= Integer.parseInt(br.readLine());
	}
}
