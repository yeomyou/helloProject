package com.yedam.exceptions;

public class ClassNotFoundExe {
	public static void main(String[] args) throws Exception {
		Class.forName("java.lang.String");
	}
}
