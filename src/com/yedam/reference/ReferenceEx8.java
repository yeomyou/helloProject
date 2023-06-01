package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean run = true;
		int studentNum = 0;
		int scores[] = null;
		
		while(run) {
		System.out.println("------------------------------------------------");
		System.out.println("1.학생 수 2.점수입력 3.점수리스트 4.분석(최고,평균) 5.종료");
		System.out.println("------------------------------------------------");
		System.out.print("선택>");
		
		int selNo = s.nextInt();
		if(selNo == 3 && scores == null) {
			System.out.println("학생 점수를 먼저 입력해주세요.");
			continue;
		}
		
		switch(selNo) {
		
			
		
		case 1: 
			System.out.print("학생수 >");
			studentNum = s.nextInt();
			
			break;
		case 2:
			if(studentNum == 0) {
				System.out.println("학생 수를 먼저 입력해주세요.");
				break;
			}
			scores = new int[studentNum];
			for(int i =0; i<studentNum; i++) {
				System.out.print("scores[" + i + "] > ");
				scores[i] = s.nextInt();
			}
			System.out.println();
			break;
			
		case 3:
			for(int i =0; i<studentNum; i++) {
				System.out.print("scores[" + i + "] > " + scores[i]+"\n");
				
			}
			break;
		case 4:
			if(scores.length == 0) {
				System.out.println("학생 점수 먼저 입력해주세요.");
				break;
			}
			int max = -1;
			int sum = 0;
			for(int i =0; i<studentNum; i++) {
				sum += scores[i];
				if(max<scores[i]) {
					max = scores[i];
				}
			}
			System.out.println("최고점수: " + max);
			System.out.println("평균점수: " + (sum/studentNum));
			break;
		case 5: run=false; break;
		
		
		}
		
		
		
		}
		System.out.println("end of prog");
		
	}
}
