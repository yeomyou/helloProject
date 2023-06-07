package com.yedam.hr;

public class EnumEx {
	public static void main(String[] args) {
		Student s1 = new Student("23-01", "홍길동", 80, Gender.MAN);
		Student s2 = new Student("23-02", "김길동", 80, Gender.WOMAN);
		Student s3 = new Student("23-03", "아무개", 80, Gender.MAN);
		Student s4 = new Student("23-04", "김무개", 80, Gender.WOMAN);
		
		
		Student[] students = { s1, s2, s3, s4};
		
		for(Student stu : students) {
			if(stu.getGender() == Gender.WOMAN) {
				System.out.printf("이름은 %s, 점수는 %d\n",stu.getName(), stu.getScore());
					
			}
		}
	}
}
