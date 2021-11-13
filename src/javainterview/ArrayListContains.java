package javainterview;
import java.util.ArrayList;
public class ArrayListContains {

	public static void main(String[] args) {
		ArrayList<String> Contains=new ArrayList<String>();
		Contains.add("Brown");
		Contains.add("Yellow");
		System.out.println(Contains.size());
		System.out.println(Contains.get(0));
		System.out.println(Contains.set(0,"pink"));
		System.out.println(Contains.get(0));
		if(Contains.contains("pink"));
		{
			System.out.println("yes pink is available");		
		}
		

	}

}
