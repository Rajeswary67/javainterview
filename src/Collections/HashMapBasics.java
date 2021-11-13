package Collections;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapBasics {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
		map.put("madhu", "Mythri");
		map.put("kathan", "lakshiv");
		map.put("karthik", "brahmani");
		map.put(null, "aaa");
		map.put("bbb", null);
		map.put(null, "ccc");
		System.out.println(map.get("bbb"));

		// System.out.println(***********using iterators**********);
		// Iterator<String> it=map.keySet().iterator();
//		while(it.hasNext())
//		{
//			String key=it.next();
//			String val=map.get(key);
//			System.out.println(key);
//		}
//		

		Iterator<String> key = map.keySet().iterator();

		while (key.hasNext()) {
			String val = key.next();
			String l = map.get(val);
			System.out.println(l);
		}
System.out.println(map.size());
System.out.println(map.remove(null));
System.out.println(map);
	}

}
