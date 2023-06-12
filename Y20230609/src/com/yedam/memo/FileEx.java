package com.yedam.memo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("sample.txt");
			fos.write(10);
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
