package treeset;

import java.util.TreeSet;

public class Demotreeset {

	public static void main(String[] args) {
		TreeSet  tree = new TreeSet () ;
			tree.add(123);
			tree.add(456);
			tree.add(246);
			tree.add(25);
			tree.add(40);
			System.out.println(tree);
			
		TreeSet  treeset = new TreeSet () ;
		treeset.add("Apple");
		treeset.add("Apple");
		treeset.add("Butterfly");
		treeset.add("Camel");
		treeset.add("Deer");
		treeset.add("Ballpen");
		treeset.add("Ink");
		
		System.out.println(treeset);
		
		
	}
}