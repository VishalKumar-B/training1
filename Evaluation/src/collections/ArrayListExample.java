package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
	
		List<String> l = new ArrayList<>();
		
		l.add("vishal");
		l.add("kumar");
		l.add("B");

		Iterator<String> it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("using for each loop");
		
		for(String s : l) {
			System.out.println(s);
		}
	}

}
