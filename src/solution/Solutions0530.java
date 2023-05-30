package solution;

import java.util.Arrays;

public class Solutions0530 {
	public static void main(String[] args) {
		solution("foobar");
	}


    public static int[] solution(String s) {
        int answer[] = new int[s.length()];
        int tmpCount = -1;
        for(int i = 0; i<s.length(); i++) {
        	
        	String str = s.substring(i, i+1);	        
        	if(i<1) {
        	 tmpCount = -1;
        	 answer[i] = tmpCount;
        	}
        	
	        if(i>=1) {
	        	tmpCount = -1;
		        String tmpStr = s.substring(0,i);

		        if(tmpStr.contains(str)) {
		        		tmpCount = i-tmpStr.lastIndexOf(str);
		        		answer[i] = tmpCount;
		        	}
		        else {
		        	answer[i] = -1;
		        }
	        }
	        
        }
        
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
