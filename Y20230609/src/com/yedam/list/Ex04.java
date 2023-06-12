package com.yedam.list;

import java.util.*;
import java.util.Map.Entry;

public class Ex04 {
	public static void main(String[] args) {
		Map<Integer, String> key = new HashMap<>();
		Map<HashMap<Integer,String>, Integer> map;
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		String[] inputs = input.split(" ");
		
		
		key.put(Integer.parseInt(inputs[0]),inputs[1]);
		map.put(key, Integer.parseInt(inputs[2]));
		
		System.out.println("---------");
		
		
		Set<HashMap<Integer, String>> keys = map.keySet();
		Iterator<HashMap<Integer, String>> iter = keys.iterator();
		while(iter.hasNext()) {
			HashMap<Integer, String> key = iter.next();
			Integer val = map.get(key);
			Set<Entry<Integer,String>> entry = key.entrySet();
			for(Entry<Integer, String> ent : entry) {
				System.out.printf("사번 : $d, 이름 : %s, 급여 : %d\n", ent.getKey(), ent.getValue(), val);
			}
			
		}
	}
}
