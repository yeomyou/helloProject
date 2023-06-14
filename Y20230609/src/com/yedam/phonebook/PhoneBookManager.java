package com.yedam.phonebook;

import java.io.*;
import java.util.*;

//추가, 조회, 삭제, 종료(저장)
public class PhoneBookManager {
	HashSet<PhoneInfo> infoStorage = new HashSet<>();
	File dataFile = new File("c:/temp/phonebook.txt");
	File dataStream = new File("c:/temp/phonebook.dat");

	private static PhoneBookManager instance;

	public static PhoneBookManager getInstance() {
		if (instance == null) {
			instance = new PhoneBookManager();
		}
		return instance;
	}

	private PhoneBookManager() {
		readFromFile();
//		readFromStream();
	}

	public void inputData() throws MenuChoiceException {
		System.out.println("전화번호 구분");
		System.out.println("1.일반 2.대학 3.회사");
		System.out.print("선택 > ");

		int menu = MenuViewer.sc.nextInt();
		MenuViewer.sc.nextLine();

		if (menu < INPUT_SELECT.NORMAL || menu > INPUT_SELECT.COMPANY) {
			throw new MenuChoiceException(menu);
		}
		PhoneInfo info = null;
		switch (menu) {
		case INPUT_SELECT.NORMAL:
			info = readFriendInfo(menu);
			break;
		case INPUT_SELECT.UNIV:
			info = readFriendInfo(menu);
			break;
		case INPUT_SELECT.COMPANY:
			info = readFriendInfo(menu);
			break;
		}
		infoStorage.add(info);

		boolean isAdded = infoStorage.add(info);
		if (!isAdded) {
			System.out.println("등록완료");
		} else {
			System.out.println("등록오류");
		}
	}

	private PhoneInfo readFriendInfo(int menu) {
		if (menu == 1) {
			System.out.print("이름 >");
			String name = MenuViewer.sc.nextLine();
			System.out.print("전화번호 >");
			String phone = MenuViewer.sc.nextLine();
			return new PhoneInfo(name, phone);
		} else if (menu == 2) {
			System.out.print("이름 >");
			String name = MenuViewer.sc.nextLine();
			System.out.print("전화번호 >");
			String phone = MenuViewer.sc.nextLine();
			System.out.print("전공 >");
			String major = MenuViewer.sc.nextLine();
			System.out.print("학년  >");
			int year = MenuViewer.sc.nextInt();
			MenuViewer.sc.nextLine();
			return new PhoneUnivInfo(name, phone, major, year);
		} else if (menu == 3) {
			System.out.print("이름 >");
			String name = MenuViewer.sc.nextLine();
			System.out.print("전화번호 >");
			String phone = MenuViewer.sc.nextLine();
			System.out.print("회사 >");
			String company = MenuViewer.sc.nextLine();
			return new PhoneCompanyInfo(name, phone, company);
		} else {
			return null;
		}
	}
	// storeToStream() => ObjectOutputStream()  : implements Serializable 
	public void storeToStream() {
		try {
			FileOutputStream fos = new FileOutputStream(dataStream);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Iterator<PhoneInfo> iter = infoStorage.iterator();
			PhoneInfo info = null;
			while(iter.hasNext()) {
				info = iter.next();
				oos.writeObject(info);
			}
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void storeToFile() {
		System.out.println("종료합니다.");
		try {
			FileWriter fw = new FileWriter(dataFile);
			Iterator<PhoneInfo> iter = infoStorage.iterator();
			while (iter.hasNext()) {
				fw.write(iter.next().toString());
			}
			fw.flush();
			fw.close();
			System.out.println("저장완료");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	//readFromStream() => ObjectInputStream()
	public void readFromStream() {
	
		try {
			FileInputStream fis = new FileInputStream(dataStream);
			ObjectInputStream ois = new ObjectInputStream(fis);
			PhoneInfo info = null;
			while((ois.read() == -1)) {
				info = (PhoneInfo) ois.readObject();
				infoStorage.add(info);
			}

			ois.close();
			fis.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	
	}
	public void readFromFile() {
		if(!dataFile.exists()) {
			return;
		}
		try {
			FileReader fr = new FileReader(dataFile);
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			PhoneInfo info = null;
			while ((str = br.readLine()) != null) {
				String[] record = str.split(",");
				int kind = Integer.parseInt(record[0]);
				switch (kind) {
				case INPUT_SELECT.NORMAL:
					info = new PhoneInfo(record[1], record[2]);
					break;
				case INPUT_SELECT.UNIV:
					info = new PhoneUnivInfo(record[1], record[2], record[3], Integer.parseInt(record[4]));
					break;
				case INPUT_SELECT.COMPANY:
					info = new PhoneCompanyInfo(record[1], record[2], record[3]);
					break;
				}
				infoStorage.add(info);
			}
			br.close();
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	//삭제
	public void deleteData() {
		System.out.print("이름> ");
		String name = MenuViewer.sc.nextLine();
		
		Iterator<PhoneInfo> iter = infoStorage.iterator();
		while(iter.hasNext()) {
			PhoneInfo curr = iter.next();
			if(curr.getName().equals(name)) {
				iter.remove();
				System.out.println("삭제완료.");
				return;
			}
		}
		System.out.println("삭제할 이름이 없습니다.");
	}
	//
	public void searchData() {
		System.out.print("이름> ");
		String name = MenuViewer.sc.nextLine();

		PhoneInfo info = search(name);
		if(info == null) {
			System.out.println("찾는 이름이 없습니다.");
		}else {
			info.showPhoneInfo();
		}
	}
	
	public PhoneInfo search(String name) {
		Iterator<PhoneInfo> iter = infoStorage.iterator();
		while(iter.hasNext()) {
			PhoneInfo currItem = iter.next();
			if(currItem.getName().equals(name)) {
				return currItem;
			}
		}
		return null;
	}
}
