package javainterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Remove {

	public static void main(String[] args) {
		ArrayList<String> emp = new ArrayList<String>();
		emp.add("aaa");
		emp.add("bbb");
		emp.add("ccc");
		emp.add("ddd");
		emp.add("eee");

		System.out.println(emp.remove(3));
		System.out.println(emp.size());
		emp.add(3, "lakshiv");
		System.out.println(emp.get(3));
		System.out.println(emp.size());
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList("aa", "bb","eee","fff","mmm"));
		ArrayList<String> a2 = new ArrayList<String>(Arrays.asList("aa", "bb","jjjj","mmm","eee"));
		Collections.sort(a1);
		Collections.sort(a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1.retainAll(a2));
		System.out.println(a1);
a1.clear();
System.out.println(a1);
	}
	
}
