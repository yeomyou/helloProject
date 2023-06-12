package com.yedam.list;
import java.util.*;
import java.util.Map.Entry;
public class Ex02 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("user1", 96);
		map.put("user2", 96);
		map.put("user3", 98);
		
		String name = "";
		int max = 0;
		int total = 0;
		
		
		for(String key : map.keySet()) {
			total+=map.get(key);
			if(map.get(key)>max) {
				max = map.get(key);
				name = key;
			}
		}
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		
		
		
		System.out.println("점수합계: "+ total);
		System.out.println("최고점수: " + max);
		System.out.println("최고점수 user: " + name);
		
	}
}
