package com.yedam.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class OperatorEx1 {
	public static void main(String[] args)  {
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자를 입력하세요,");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num1 = 0;
		int num2 = 0;
		
		try {
		num1 = Integer.parseInt(br.readLine());
		num2 = Integer.parseInt(br.readLine());
		}
		catch(Exception e) {
			System.out.println("예외발생");
		}
		int sum = 0;
		for(int i = num1 ; i<=num2; i++) {
			sum +=i;
		}
		System.out.println(sum);
		scn.close();
		
	}
}
