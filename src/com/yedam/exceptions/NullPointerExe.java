package com.yedam.exceptions;

public class NullPointerExe {
	public static void main(String[] args)  {
		String msg = "hello";
		msg = null;
		
		try {
		System.out.println(msg.length());
		
		}
		catch(NullPointerException e) {
			System.out.println(e.getClass() + e.getMessage());
		
		}catch(NumberFormatException ee) {
			
		}catch(Exception e) {
			
		}
		System.out.println("end");
	}
}
