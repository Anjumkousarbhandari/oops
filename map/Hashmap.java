package set.map;

import java.util.HashMap;

public class Map {
	
	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put("Anjum", 500);
		map.put("kousar", 100);
		map.put("Ayaz", 450);
		map.put("Sayyed", 200);
		map.put("Ateeq", 150);
		
		System.out.println(map);
		System.out.println(map.get(200));
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.size());
		System.out.println(map.get("Anjum"));
		System.out.println(map.clone());
		System.out.println(map.containsValue(150));
		System.out.println(map.hashCode());
		System.out.println(map.remove("Ateeq"));
			
		
	}
}
