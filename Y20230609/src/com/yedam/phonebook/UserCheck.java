package com.yedam.phonebook;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

class User{
	String id;
	String pw;
	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	
}
public class UserCheck {
	private static UserCheck instance;

	public static UserCheck getInstance() {
		if (instance == null) {
			instance = new UserCheck();
		}
		return instance;
	}
	
	
	HashSet<User> userList = new HashSet<>();
	File dataFile = new File("c:/temp/userlist.txt");
	
	UserCheck(){
		readFromFile();
	}
	
	public boolean loginCheck(String id, String pw) {
		boolean isExist = false;
		boolean pwOk = false;
		for(User user : userList) {
			if(user.getId().equals(id)) {
				isExist = true;
				if(user.getPw().equals(pw)) {
					pwOk = true;
				}
				
			}
		}

		if(isExist==true && pwOk == true) {
			return true;
		}
		return false;
	}
	public void readFromFile() {
		try {
			FileReader fr = new FileReader(dataFile);
			BufferedReader br = new BufferedReader(fr);
			String str = "";
			User info = null;
			while ((str = br.readLine()) != null) {
				String[] record = str.split(" ");
				String user = record[0];
				String pswd = record[1];
				
				info = new User(user, pswd);
				userList.add(info);
				}
			
			br.close();
			fr.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
