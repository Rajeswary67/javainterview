package javainterview;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {

	public static void main(String[] args) {
		ArrayList<Integer> Rev=new ArrayList<Integer>();
		Rev.add(123);
		Rev.add(567);
		for(int i=Rev.size()-1; i>0; i--)
		{
		System.out.println(Rev.get(i));
	

	}
        Collections.reverse(Rev);
		System.out.println(Rev);
}
}
