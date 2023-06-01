package solution;

import java.util.*;

public class Solutions0601_1 {
	public static void main(String[] args) {
		String id_list[] = {"muzi", "frodo", "apeach", "neo"};
		String report[] = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		solution(id_list, report, k);
		
		
	}
	  public static int[] solution(String[] id_list, String[] report, int k) {
	        int[] answer = new int[id_list.length];
	        
	        HashMap<String, Integer> hash = new HashMap<>();
	        HashSet<String> set = new HashSet<>(Arrays.asList(report));
	        
	        for(int i=0; i<id_list.length; i++) {
	        	hash.put(id_list[i], 0);
	        } //해시맵에 유저 넣기
	        
	        
	        for(String repo : set) {
	        	int blank = repo.indexOf(" ");
	        	
	        	String reporter = repo.substring(0,blank); //신고자 이름
	        	String reported = repo.substring(blank+1); //신고당하는 이름
	        	
	        	hash.put(reported, hash.getOrDefault(reported, 0)+1);
	     
	        }
	        
	        for(String key : hash.keySet()) {
	        	if(hash.get(key)>=k) {
	        		
	        	}
	        }
	        
	        System.out.println(hash);
	      
	        return answer;
	    }
	}

  