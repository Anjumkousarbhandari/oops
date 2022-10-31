package treeset;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		TreeSet evenNumbers= new TreeSet();
		evenNumbers.add(2);
		evenNumbers.add(8);
		evenNumbers.add(12);
		evenNumbers.add(4);
		evenNumbers.add(14);
		evenNumbers.add(6);
		System.out.println(evenNumbers);
		
		TreeSet numb = new TreeSet();
		numb.addAll(evenNumbers);
		System.out.println(evenNumbers);

		
	}
}
