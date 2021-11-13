package javainterview;
import java.util.ArrayList;
import java.util.Collections;
public class SubList {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("aaa");
		ar.add("bbb");
		ar.add("ccc");
		System.out.println(ar.get(1));
		ar.remove(0);
        
	ar.add(0,"llll");
	System.out.println(ar.get(0));
	ar.trimToSize();
	for(int i=0; i<ar.size(); i++) {
    	System.out.println(ar.get(i));
    }
  
	String a="jan";
	String b="feb";
	a=b;
	b=a;
	System.out.println(a);
	System.out.println(b);
	System.out.println(ar);
	//System.out.println(ArrayList <String> ar swap(ar,1,2));
	Collections.swap(ar,1,2);
	System.out.println(ar);
	System.out.println(ar.removeAll(ar));
	System.out.println(ar);
}	
		
}