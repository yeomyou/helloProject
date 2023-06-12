package com.yedam.io;

import java.io.*;
import java.util.*;

public class CharEx {
	public static void main(String[] args) {
		try {
			read1();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void read1() throws IOException {
		FileReader fr = new FileReader("c:/temp/addr.text");
		char[] buf = new char[10];
		while(true) {
			int readInt = fr.read(buf);
			if(readInt == -1 ) {
				break;
				
			}
			for(int i=0; i<readInt; i++) {
			System.out.print((char) buf[i]);
			}
		}
		fr.close();
	}
	public static void write1() throws IOException {
		FileWriter fr = new FileWriter("c:/temp/addr.text");
		Scanner sc = new Scanner(System.in);
		System.out.println("입력>   (종료:quit) ");
		String input = "";
		while(true) {
			input = sc.nextLine();
			if(input.equals("quit")) {
				break;
			}
			fr.write(input);
		}
		fr.flush();
		fr.close();
		sc.close();
	}
}
