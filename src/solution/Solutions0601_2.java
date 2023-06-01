package solution;
import java.util.*;
public class Solutions0601_2 {
	public static void main(String[] args) {
		String s = "(())()";
		Solution.solution(s);
	}
	
}
class Solution {
    static boolean solution(String s) {

        boolean answer = true;
        if(s.startsWith(")") || s.endsWith("(") || s.length()%2!=0){
         	answer = false;
        	return answer;
        } // ) 로 시작하거나, (로 끝나거나, 홀수의 사이즈인 경우 false)

        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i<s.length(); i++) {
        	if(s.charAt(i)=='(') {
        		stack.push('(');
        	}else if(s.charAt(i)==')') {
        		if(stack.size()==0) {
        		answer = false;
				return answer;
        		}
        		stack.pop();
        	}
        }
        return stack.isEmpty();
    }
}

