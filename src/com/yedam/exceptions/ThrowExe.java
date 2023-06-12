package com.yedam.exceptions;

public class ThrowExe {
	public static void main(String[] args){
		divide(3,0);
		System.out.println("오류");
		try {
			method("java.lang.String");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(Exception ee) {
			System.out.println("알 수 없는 예외");
		}
	}
	public static void method(String cls) throws ClassNotFoundException, Exception{
		
		Class.forName(cls);
			System.out.println("end method");
		
	}
	
	public static int divide(int a, int b) throws ArithmeticException{
		return a/b;
	}
}
