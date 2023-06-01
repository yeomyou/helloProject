package com.yedam.control;

import java.util.Scanner;

public class ControlEx2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = 0;
		System.out.println("알고싶은 월을 입력하시오 (1~12)");
		n = s.nextInt();
		System.out.println(n+"월달의 마지막 날은 " + getLastDate(n));
		s.close();
	}
	
	public static int getLastDate(int month) {
		int result = 30;
		switch (month) {
		case 1,3,5,7,8,10,12 :
			result = 31;
			break;
		case 2:
			result = 28;
			break;
		
		
		}
		return result;
		}
}
