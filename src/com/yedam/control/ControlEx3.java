package com.yedam.control;

import java.util.Scanner;

public class ControlEx3 {
	static int blank = 0;
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
		
//		System.out.println("몇월의 달력을 보시겠습니까?");
//		int month = s.nextInt();
		
		for(int monthes = 1 ; monthes <=12; monthes++)
		{
		
		getDate(monthes);
		
		
		System.out.println("\n\n\n========="+monthes + " 월의달력=========");
		String days = "\nSun Mon Tue Wed Thr Fri Sat";
		System.out.println(days);
		System.out.println("===========================");
		for(int i=1 ; i<=blank; i++) {
			System.out.printf("%3s ", "");			
		}
		
		for (int day = 1; day<=30; day++) {
			System.out.printf("%3d ", day);
			if(blank==0) {
				if(day % 7 == 0) {
					System.out.println();
				}
			}
			else if(day % 7 == (7-blank)) {
				System.out.println();
			}
		}
		}
	}
		
		public static int getDate(int month) {
			blank = 0;
			switch(month) {
			case 5 :
				blank = 1; break;
			case 8:
				blank = 2;  break;
			case 2, 3,11 :
				blank = 3;  break;
			case 6:
				blank = 4;  break;				
			case 4,7:
				blank = 6;  break;
			case 9,12 :
				blank = 5;  break;
			}
			return blank;	
		}
		


		
		
		
		
}

