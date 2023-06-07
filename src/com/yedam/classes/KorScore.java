package com.yedam.classes;

public class KorScore {
	int kor[] = new int[] {1,2,3,4,5};
	
	
	KorScore(){
		
	}
	
	KorScore(int[] scores){
		kor = scores;
	}
	
	
	public void printAll(){
		for(int score : kor) {
			System.out.println(score);
		}
	}
	
	public void sum() {
		int sum = 0;
		for(int score : kor) {
			score += sum;
		}
		System.out.println(sum);
		
	}
	
	public void Maximum() {
		int tmp = -1;
		
		for(int score : kor) {
			if(score>tmp) {
				tmp = score;
			}
		}
		System.out.println(tmp);
	}
}
