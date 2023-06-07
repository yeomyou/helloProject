package com.yedam.classes;

public class ScoreApp {
	public static void main(String[] args) {
		KorScore score = new KorScore();
		System.out.println(score);
		
		
		
		score.printAll();
		score.sum();
		score.Maximum();
		
		KorScore score1 = new KorScore();
		System.out.println(score1);
		
		score1.kor = new int[] {77, 88, 99};
		score1.printAll();
		score1.sum();
		score1.Maximum();
	}
}
