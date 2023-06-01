package com.yedam.operator;

import java.io.IOException;

public class OperatorEx4 {
	public static void main(String[] args) {
		
		
		while(true) {
		System.out.println("값을 입력하세요 // (q)는 종료.");
		try {
			int result = System.in.read();
			if(result == 113) {
				break;
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		}
		System.out.println("끝.");
		
	}
}
