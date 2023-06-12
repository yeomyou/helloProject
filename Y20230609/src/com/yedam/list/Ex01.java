package com.yedam.list;

import java.util.*;

class Student{
	int studentNum;
	String name;
	Student(int studentNum, String name){
		this.studentNum = studentNum;
		this.name = name;
	}
	
	public int getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(int studentNum) {
		this.studentNum = studentNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return this.studentNum;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			if(obj.hashCode()==this.studentNum) {
				return true;
			}
		}
		return false;
	
}
}


public class Ex01 {
	public static void main(String[] args) {
		Set<Student> students = new HashSet<>();
		
		
		students.add(new Student(1, "홍길동"));
		students.add(new Student(2, "김길동"));
		students.add(new Student(1, "박길동"));
		
		Iterator<Student> it = students.iterator();
		
		while(it.hasNext()) {
			Student result  = it.next();
			System.out.println(result.studentNum);
			System.out.println(result.name);
		}
	}
}
