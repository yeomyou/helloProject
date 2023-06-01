package solution;

import java.util.Arrays;

public class Solutions0531 {
	public static void main(String[] args) {
		String[] a = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
		solution(a);
	}
	
	
	
	
   public static int[] solution(String[] wallpaper) {
        
        int wall[][] = new int[50][50];
        
        for(int i=0; i<wallpaper.length; i++) {
        	//i (i,#1), (i,#2)
        	for(int j=0; j<wallpaper[i].length(); j++) {
        		if(wallpaper[i].charAt(j) == '#') {
        			wall[i][j] = 1;
        		}else {
        			wall[i][j] = 0;
        		}
        	}
        	
        } // 2단배열에 0,1 넣기
    	int lux = 50;
		int luy = 50;
		int rdx = 0;
		int rdy = 0;
        for(int i = 0; i<wall.length; i++) {
        	for(int j=0; j<wall[i].length; j++) {
        	
        		if(wall[i][j]==1) {
        			if(i<lux) {
        				lux = i;
        			}
        			if(j<luy) {
        				luy = j;
        			}
        			if(i>rdx) {
        				rdx = i;
        			}
        			if(j>rdy) {
        				rdy = j;
        			}
        		} //최솟값 x,y위치

        	}
        }
        int [] answer = {lux, luy, rdx+1, rdy+1};
//        System.out.println(Arrays.toString(answer));
        
        return answer;
    }
}
