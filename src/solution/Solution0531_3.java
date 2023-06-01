package solution;

import java.util.*;

public class Solution0531_3 {
	public static void main(String[] args) {
		int igd[] = {1, 1, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1, 2, 3, 1};
		System.out.println(solution(igd));
	}
	
	public static int solution(int[] igd) {
	    int answer = 0;
	    
	    Stack<Integer> stack =new Stack<Integer>();
	    
	    for(int in : igd) {
	    	stack.push(in);
	    		
	    	if(stack.size() >=4) {
	    		if(stack.get(stack.size()-4)== 1
	    			&& stack.get(stack.size()-3) == 2
	    			&& stack.get(stack.size()-2) == 3
	    			&& stack.get(stack.size()-1) == 1) {
	    			
	    			
	    			answer++;
	    			stack.pop();
	    			stack.pop();
	    			stack.pop();
	    			stack.pop();
	    		}
	    	}
	    					
	    }
	    return answer;
	}
	
}
