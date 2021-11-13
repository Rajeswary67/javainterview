package javainterview;
import java.util.ArrayList;
public class ArrayListColors {

	public static void main(String[] args) {
		ArrayList<String> ar= new ArrayList<String>();
		ar.add("Voilet");
		ar.add("Yellow");
		ar.add("Blue");
		ar.add("Green");
		ar.add("Red");
		ar.add("Black");
		System.out.println(ar.size());
		System.out.println(ar.get(5));
		for(int i=0; i<ar.size();i++)
		{
			System.out.println(ar.get(i));
	     }

}
}