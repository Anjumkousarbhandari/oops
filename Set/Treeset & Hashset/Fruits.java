package set;

import java.util.HashSet;

public class Fruits {

		public static void main(String[] args) {
			HashSet set = new HashSet();
			set.add("Apple");
			set.add("orange");
			set.add("pomegranite");
			set.add("Pine apple");
			set.add("Mango");
			set.add("Fig");
			set.add("Banana");
			set.add("Grapes");
			set.add(null);
			set.add("Apple");
			set.add("Mango");

			System.out.println(set);
			System.out.println(set.contains("Apple"));
			
			set.remove("Apple");
			set.remove("Banana");
			set.remove("Grapes");
			System.out.println(set);
			
			set.removeAll(set);
			System.out.println(set);
			System.out.println(set.contains("Jackfruit"));
			
			
		}
}
