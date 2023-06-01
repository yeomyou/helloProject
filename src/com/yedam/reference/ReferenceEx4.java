package com.yedam.reference;

public class ReferenceEx4 {
	public static void main(String[] args) {
		String[] strAry = {"홍길동", "김민수", "최수민" };
	
		for(int i =0; i<strAry.length; i++) {
			System.out.println(strAry[i]);
		}
		strAry = new String[] { "HONG", "KIM", "CHOI"};
		
		for(int i =0; i<strAry.length; i++) {
			System.out.println(strAry[i]);
		}
		
		String s1 = "hongkildong";
		int result = s1.charAt(4);
		System.out.println(result);
		
		int result1 = s1.indexOf("k");
		System.out.println(result1);
		
		String[] idAry = { "950304-1234567", "950404-2234567"};
		for(int i=0; i< idAry.length; i++) {
			if(idAry[i].charAt(7) == '1') {
				System.out.println((i+1)+"번째 는 남자입니다.");
			}else if (idAry[i].charAt(7) == '2') {
				System.out.println((i+1)+"번째 는 여자입니다.");
			}
			
		}
	}
}
