package solution;

import java.util.*;

public class Solutions0601 {
	public static void main(String[] args) {
		String parti[] = {"mislav", "stanko", "mislav", "ana"};
		String compl[] = {"stanko", "ana", "mislav"};
		System.out.println(solution(parti, compl));
	
		
	}
	public static String solution(String[] participant, String[] completion) {
		String answer = "";
		
		Arrays.sort(participant);
		Arrays.sort(completion);

		Stack<String> stack = new Stack<>();
		int player = participant.length;
		
		for(String a : participant) {
			stack.push(a);
		}
	
		return answer;
			
	}
}
