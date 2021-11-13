package ConstructorConcept;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		Set<String> str = new HashSet<String>();
		str.add("kethan");
		str.add("Lakshiv");
		str.add("Raju");
		str.add("madhu");
		System.out.println(str);
		for (int i = 0; i <= str.size(); i++) {
			System.out.println(str.contains(null));
		}
		Iterator<String> it = str.iterator();
		while (it.hasNext()) {
			String key = it.next();
			System.out.println(key);
		}
       str.remove("Raju");
       System.out.println(str);
	}

}
 