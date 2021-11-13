package Collections;

import java.util.HashMap;

public class HashSet {

	public static void main(String[] args) {
		HashMap<String,String> hashset=new HashMap<String,String>();
		hashset.put("madhu","mythri");
		hashset.put("lakshiv","kethan");
		hashset.put("india","usa");
		hashset.put("somerset","skybrook");
		hashset.put("null", "null");
		hashset.put("null", "aaa");
		hashset.put("null", "bbb");
		System.out.println(hashset.get("india"));
		
		
		System.out.println(hashset.get("null"));
		System.out.println(hashset.get("somerset"));
		
	}

}
