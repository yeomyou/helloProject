package com.yedam.io;

import java.io.*;
import java.util.*;

public class StudentEx {
	public static void main(String[] args) throws IOException{
		// c:/temp/students.txt 평균.
		// 최고점. 학생 이름./
		StringBuffer sb = new StringBuffer();
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		ArrayList<String[]> ar = new ArrayList<>();
//		FileInputStream fis = new FileInputStream("c:/temp/stu.txt");
		FileReader fr = new FileReader("c:/temp/stu.txt");
		char[] buf = new char[10];
		while(true) {
			int readInt = fr.read(buf);
			if(readInt == -1 ) {
				break;
				
			}
			for(int i=0; i<readInt; i++) {
			sb.append((char) buf[i]);
			}
		}
		String a = sb.toString();

		String students[] = a.split("[\n ]");

		for(int i =0; i<students.length; i=i+2) {
			map.put(students[i],  Integer.parseInt((students[i+1]).trim()));
		}
		int max = 0;
		String maxStu = "";
		int sum = 0;
		int count = 0;
		for(String key : map.keySet()) {
			sum += map.get(key);
			count++;
			if(map.get(key)>max) {
				max = map.get(key);
				maxStu = key;
			}
		}
		
		System.out.println("평균 : " + sum/count);
		System.out.printf("최고점수 : %d, 학생은 %s", max, maxStu);
	
	}
}
