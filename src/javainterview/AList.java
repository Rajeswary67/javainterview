package javainterview;
import java.util.ArrayList;
public class AList {
public static void main (String[]args){
	ArrayList ar=new ArrayList();
	System.out.println(ar.size());
	ar.add(100);
	System.out.println(ar.get(0));
	ar.add(200);
	ar.add(300);
	ar.add(400);
	ar.add(500);
	System.out.println(ar.size());
	System.out.println(ar.get(2));
	System.out.println(ar.remove(3));
	ar.add(3,900);
	System.out.println(ar.get(4));
	for(int i=0;i<ar.size();i++)
	{
		System.out.println(ar.get(i));
	}
	
	for(Object e: ar)
	{
		System.out.println(e);
	}
	System.out.println("*********************");
	//Generics in java
	ArrayList<String> ar1= new ArrayList<String>();
	ar1.add("aaa");
	ar1.add("bbb");
	ar1.add("ccc");
	System.out.println(ar1.size());
	System.out.println(ar1.get(0));

	for(int j=0;j<ar1.size();j++) {
		System.out.println(ar1.get(j));
	}
	
	System.out.println("@@@@@@@@@@@@@@");
	
	ArrayList<Object> ar2=new ArrayList<Object>(5);
	ar2.add("lakshiv");
	ar2.add(9);
	ar2.add('M');
	ar2.add(4);
	ar2.add("india");
	
	
	for(int k=0;k<ar2.size();k++) {
		System.out.println(ar2.get(k));
	}
	for(Object e:ar2)
	{
		System.out.println(e);
	}
	
	
}

}
