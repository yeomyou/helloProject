package com.yedam.io;

import java.io.*;
import java.util.*;

public class BufferEx {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	}
	
	public static void bufferStream() throws IOException {
		FileInputStream fis = new FileInputStream("c:/temp/vscode.exe");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
//		FileOutputStream fos = new FileOutputStream("c:/temp/coyp2.exe");
//		BufferedOutputStream bos = new BufferedOutputStream(fos);
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("c:/temp/copy2.exe"));
		int readBuf = 0;
		while((readBuf = bis.read()) != -1) {
//			int readBuf = bis.read();
//			if(readBuf == -1 ) {
//				break;
//			}
			bos.write(readBuf);
		}
		bos.close();
		bis.close();
		fis.close();	
	}
}
