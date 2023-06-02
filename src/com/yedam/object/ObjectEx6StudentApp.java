package com.yedam.object;

import java.util.Scanner;

public class ObjectEx6StudentApp {
	static Scanner sc = new Scanner(System.in);
	static Student[] students = new Student[100];
	static int index = 0;
	public static void main(String[] args) {
		//학생정보, 이름, 성별, 점수
		//조회(이름)
		boolean isRun = true;
		while(isRun) {
			menu();
			int selNo = Integer.parseInt(sc.nextLine());
			roop:
			switch(selNo) {
			
			case 1:
				register();
				break roop;
			case 2:
				list();
				break roop;
			case 3:
				search();
				break roop;
			case 4:
				modify();
				break roop;
			case 5:
				remove();
				break roop;
			case 6:
				isRun = false;
				break roop;
			
			
			
			
			}
			
		}
		
		
	}
	public static void menu() {
		System.out.println("==============================================");
		System.out.println("1.학생 등록 2.학생 목록 3.학생 조회 4.수정 5.삭제 6.종료");
		System.out.println("==============================================");
	}
	
	public static void register() {
		Student stu = new Student();
		students[index] = stu;
		System.out.println("등록할 학생 이름을 입력해주세요.");
		students[index].setName(sc.nextLine());
		System.out.println("등록할 학생 ID를 입력해주세요");
		students[index].setId(sc.nextLine());
		boolean isSexOk = true;
		while(isSexOk) {
			System.out.println("등록한 학생의 성별(남,여)을 입력해주세요");
			String tmpSex = sc.nextLine();
			if(tmpSex.equals("남") || tmpSex.equals("여")) {
				students[index].setSex(tmpSex);
				isSexOk = false;
					break;
			}
		}
		System.out.println("등록한 학생의 점수를 입력해주세요");
		students[index].setScore(Integer.parseInt(sc.nextLine()));
		index++;
	}
	public static void list() { // 남,여 num , max score
		
		int man = 0;
		int woman = 0;
		int maxScore = 0;
		int maxStu = 0;
		for(int i = 0; i<students.length; i++) {
			while(students[i] != null) {
				System.out.println(students[i].getName() + ", ID:" + students[i].getId()+", 성별:"+students[i].getSex()+", 점수 :"+students[i].getScore());
				if(students[i].getScore()>maxScore) {
					
					maxScore = students[i].getScore();
					maxStu = i;
					
				}
				if(students[i].getSex().equals("남")) {
					man++;
					break;
				}else if(students[i].getSex().equals("여")) {
					woman++;
					break;
				}
			}
		}
		System.out.println("남자: "+man+", 여자: "+woman+", 최고점수 : "+ students[maxStu].getName()+"-"+ maxScore);
	
	}
	public static void search() {
		System.out.println("조회할 학생의 ID를 입력해주세요");
		String tmpId = sc.nextLine();
		boolean isEmpty = false;
	
		for(int i = 0; i<students.length; i++) {
			if(students[i] != null && students[i].getId().equals(tmpId)) {
				System.out.println("이름: "+students[i].getName());
				System.out.println("점수: "+students[i].getScore());
				isEmpty = true;
			}
			
			
		}
		
		if(!isEmpty) {
			System.out.println("조회할 학생이 존재하지 않습니다.");
			return;
		}
		
	}
	public static void modify() {
		System.out.println("점수를 수정할 학생의 ID 를 입력해주세요.");
		String tmpId = sc.nextLine();
		boolean isEmpty = false;
		for(int i = 0; i<students.length; i++) {
			if(students[i] != null && students[i].getId().equals(tmpId)) {
				System.out.println("수정할 점수를 입력해주세요.");
				students[i].setScore(Integer.parseInt(sc.nextLine()));
				System.out.println("점수가 정상적으로 수정되었습니다.");
				isEmpty = true;
			}
		}
		if(!isEmpty) {
			System.out.println("수정할 학생이 존재하지 않습니다.");
			return;
		}
	}
	public static void remove() {
		System.out.println("삭제할 학생의 ID를 입력해주세요.");
		String tmpId = sc.nextLine();
		boolean isEmpty = false;
		for(int i = 0; i<students.length; i++) {
			if(students[i] != null && students[i].getId().equals(tmpId)) {
				students[i] = null;
				System.out.println("정상적으로 삭제되었습니다.");
				isEmpty = true;
			}
		}
		if(!isEmpty) {
			System.out.println("삭제할 학생이 존재하지 않습니다.");
			return;
		}
	//이름이 null
	//2번 작동 X
	}
}

class Student {
	String id;
	String name;
	String sex;
	int score;

	void setId(String id){
		this.id = id;
	}
	String getId() {
		return this.id;
	}
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return this.name;
	}
	void setSex(String sex) {
		this.sex = sex;
	}
	String getSex() {
		return this.sex;
	}
	void setScore(int score) {
		this.score = score;
	}
	int getScore() {
		return this.score;
	}

}
