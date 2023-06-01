package solution;

import java.util.Arrays;

public class Solution0531_2 {
	public static void main(String[] args) {
		String park[] = {"SOO", "OOO", "OOO"};
		String routes[] = {"E 2","S 2", "W 1"};
		int ss[] = solution(park, routes);
		System.out.println(Arrays.toString(ss));
	}
	
	
	
	
	   public static int[] solution(String[] park, String[] routes) {
	        int[] answer = new int[2];
	        
	        int width = park[0].length();
	        int height = park.length;
	        int sq[][] = new int[width][height];
	        for(int i=0; i<width; i++) {
	        	for(int j=0; j<height; j++) {
	        		if(park[i].charAt(j)== 'S') {
	        			answer[0] = j;
	        			answer[1] = i;
	        		}else if(park[i].charAt(j)== 'O') {
	        			sq[i][j] = 0;
	        		}else if(park[i].charAt(j)== 'X'){
	        			sq[i][j] = -1;
	        		}
	        	
	        }
	        // ㅣ height , ㅡ width  (height, width)
	       //  answer[0] = h, answer[1] = w,   /////answer=[h,w] 
	       // i = width, j = height;
	        /// 0,0 -> e 2 = 0,2 
	        
	        	
	        	
	        for(int k = 0; i<routes.length; k++) {
	        	String dr[][] = new String[50][50];

	        	
	        	dr[k] = routes[k].split(" ");

	        switch(dr[k][0]) {
	        	case "E": 
	        		if(Integer.parseInt(dr[k][1]) + answer[1] > width) {
	        			continue;
	        		}else {
	        			answer[1] += Integer.parseInt(dr[k][1]);
	        			System.out.println(k+"번째 현재좌표 : " + answer[0]+","+answer[1]);
	        		}
	        		continue;
	        	case "W":
	        		if(Integer.parseInt(dr[k][1]) - answer[1] > 0) {
	        			continue;
	        		}else {
	        			answer[1] -= Integer.parseInt(dr[k][1]);
	        			System.out.println(k+"번째 현재좌표 : " + answer[0]+","+answer[1]);
	        		}
	        		continue;
	        	case "S":
	        		if(Integer.parseInt(dr[k][1]) + answer[0] > height) {//0,1+0 
	        			continue;
	        		}else {
	        			answer[0] += Integer.parseInt(dr[k][1]);
	        			System.out.println(k+"번째 현재좌표 : " + answer[0]+","+answer[1]);
	        		}
	        		continue;
	        	case "N":
	        		if(Integer.parseInt(dr[k][1]) - answer[0] > 0) {
	        			continue;
	        		}else {
	        			answer[0] -= Integer.parseInt(dr[k][1]);
	        			System.out.println(k+"번째 현재좌표 : " + answer[0]+","+answer[1]);
	        		}
	        		continue;
	        
	        	}//switch
	        } //for문
	       
	    }
	
	        return answer;
	   }
	   
}

