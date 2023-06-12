package com.yedam.listTest;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("Apple");
		
		
		for (int i = 0; i < list.size(); i++) {
			Object result = list.get(i);
			if(result instanceof String) {
				System.out.println((String)result);
			} else if (result instanceof Integer) {
				System.out.println((Integer)result);
			}
			
		}
	}
}
