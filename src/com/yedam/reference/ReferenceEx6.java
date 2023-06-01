package com.yedam.reference;

import java.util.Scanner;

public class ReferenceEx6 {
	public static void main(String[] args) {
		
		
	int intAry[][] = new int[10][10]; 
		
	
	String[] nameAry = {"홍길동", "김길동", "박길동" };
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("학생이름 : ");
	String serName = sc.nextLine();
	
	for(int i=0; i<nameAry.length; i++) {
		if(nameAry[i].equals(serName)) {
			System.out.printf("%s 의 영어점수는 %d, 수학점수는 %d", nameAry[i], intAry[i][0], intAry[i][1]);
		}
	}
	
	sc.close();
	}
}
