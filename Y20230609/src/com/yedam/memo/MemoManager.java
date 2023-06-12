package com.yedam.memo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class MemoManager {
	List<Memo> storage = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	MemoManager(){
		readFromFile();
	}

	public void inputData() {
		System.out.println("번호를 입력> ");
		int no = Integer.parseInt(sc.nextLine());
		System.out.println("날짜를 입력> ");
		String data = sc.nextLine();
		System.out.println("내용을 입력> ");
		String content = sc.nextLine();
		storage.add(new Memo(no, data, content));
	}

	public void storeToFile() {
		try {
			FileOutputStream fos = new FileOutputStream("c:/temp/memobook.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(storage);
			oos.close();
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void searchData() {
		System.out.println("날짜> ");
		String date = sc.nextLine();
		boolean isYn = false;
		for(int i=0; i<storage.size(); i++) {
			if(date.equals(storage.get(i).getDate())){
				System.out.println(storage.get(i)/*.getContent()*/);
				isYn = true;
			}
		}
		if(!isYn) {
			System.out.println("해당 날짜의 메모가 없습니다.");
		}
	}

	public void deleteData() {
		System.out.println("번호> ");
		int no = Integer.parseInt(sc.nextLine());
		boolean isYn = false;
		for(int i=0; i<storage.size(); i++) {
			if(no == storage.get(i).getNo()){
				storage.remove(i);
				isYn = true;
			}
		}
		if(!isYn) {
			System.out.println("해당 번호의 메모가 없습니다.");
		}
	}
	public void readFromFile() {
		try {
			FileInputStream fis = new FileInputStream("c:/temp/memobook.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			storage = (List<Memo>) ois.readObject();
			ois.close();
			fis.close();
			
		} catch (FileNotFoundException | ClassNotFoundException e) {
//			System.out.println("계속 진행 하세요.");
		} catch (IOException e) {
//			e.printStackTrace();
		}
	}
}
