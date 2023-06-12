package com.yedam;
import java.util.*;
public class StringEx {
	public static void main(String[] args) {
		String str = "c:/temp/images/sample.jpg";
		
		method1(str);
		
		
		String[] ssn = {"950102-1234567", "960405 2345678", "9703041234567", "0501013456789", "0604014545678", "250903-3234567"};
		method2(ssn);
	}
	
	public static void method1(String str) {
		ArrayList<String> arr = new ArrayList<>();
		String[] dot = str.split("[.]");
		for(String a : dot) {
			arr.add(a);
		}
		String file = arr.get(arr.size()-1);
		String[] slash = dot[0].split("[/]");
		String filename = slash[slash.length-1];
		System.out.println("확장자: "+file+"  파일이름: "+filename);
		
	}
	
	public static void method2(String[] str) {
		StringBuilder sb = new StringBuilder();
		
		for(String a : str) {
			if(!(a.length()==13 || a.length() == 14)) {
				sb.append(" null ");
			}
			else if(a.length()==13){
				if(a.charAt(6)=='1' || a.charAt(6)=='3') {
					sb.append(" 남 ");
				}else if(a.charAt(6)=='2' || a.charAt(6)=='4') {
					sb.append(" 여 ");
				}
			}else if(a.length()==14) {
				if(a.charAt(7)=='1' || a.charAt(7)=='3') {
					sb.append(" 남 ");
				}else if(a.charAt(7)=='2' || a.charAt(7)=='4') {
					sb.append(" 여 ");
				}
				
				
				
			}
		}
		String answer = sb.toString();
		System.out.println(answer);
		
	
	}
		
		

}
