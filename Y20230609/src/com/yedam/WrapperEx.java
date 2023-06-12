package com.yedam;

public class WrapperEx {
	public static void main(String[] args) {
		Integer i1 = 100;
		int n1 = i1;
//		i1 = 100;
		n1 = 50;
		
		Integer result = i1 + n1;
		
		System.out.println(result);
		
		byte b = Byte.parseByte("10");
		System.out.println(b);
	}
}
