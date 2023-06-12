package com.yedam.list;

import java.io.BufferedWriter;
import java.io.*;
import java.io.OutputStreamWriter;
import java.util.NoSuchElementException;
import java.util.*;

public class ScannerEx {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("C:/temp/sample.txt"));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			try {
				String input = sc.nextLine();
				System.out.println(input);
				if(input == null) {
					break;
				}
				
			}catch(NoSuchElementException e) {
				break;
			}
		}	System.out.println("end.");
	}
}
