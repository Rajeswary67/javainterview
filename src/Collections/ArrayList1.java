package Collections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Object> arr=new ArrayList<Object>();
		ArrayList<Object> list=new ArrayList<Object>();
		
		list.add("hhh");
		arr.add("kkk");
		arr.add("1mm");
        arr.equals(list);
        arr.retainAll(list);
        System.out.println(arr.get(1));
	}

}
