package solution;
import java.util.*;

public class Solutions0609 {
	public static void main(String[] args) {
		int [] lottos = {0, 0, 0, 0, 0, 0};
		int [] win = {31, 10, 45, 1, 6, 19};
		int [] sol = solution(lottos, win);
		for(int a : sol) {
			System.out.println(a);
		}
	}

	    public static int[] solution(int[] lottos, int[] win_nums) {
	        Stack<Integer> arr = new Stack<>();
	        int maxRank = 0;
	        int minRank = 0;
	        int sameNum = 0;
	        int zeroNum = 0;
	        for(int a : lottos){
	        	if(a==0) {
	        		zeroNum++;
	        		sameNum++;
	        	}else {
	        		arr.add(a);
	        		for(int win : win_nums) {
	        			if(arr.contains(win)) {
	        				sameNum++;
	        			}
	        		}
	        		arr.pop();
	            } 
	        }
	        switch(sameNum) {
	        case 0,1: maxRank = 6;
	        	minRank = 6;
	        	break;
	        case 2,3,4,5,6: 
	        	maxRank = 7-sameNum;
	        	if(zeroNum==6) {
	        	minRank = 6;
	        	}else {
	        	minRank = 7-(sameNum-zeroNum);
	        	}
	        	break;
	        }
	        int[] answer = {maxRank, minRank};
	        return answer;
	    }
	
}

