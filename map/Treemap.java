package com.q.java;

import java.util.TreeMap;

public class Treemap {
	
	public static void main(String[] args) {
		TreeMap map = new TreeMap();
		
		map.put("one", 1);
		map.put("two", 2);
		map.put("Three", 3);
		map.put("Four", 4);
		System.out.println(map);
		
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.get("one"));
		System.out.println(map.size());
		System.out.println(map.clone());
		System.out.println(map.firstKey());
		System.out.println(map.isEmpty());
		System.out.println(map.toString());
		System.out.println(map.lastEntry());
		System.out.println(map.comparator());
		System.out.println(map.descendingKeySet());
		System.out.println(map.pollFirstEntry());
		
	}

}
