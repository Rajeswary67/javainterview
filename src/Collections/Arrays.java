package Collections;
import java.util.ArrayList;
public class Arrays{
	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("aaa");
		cars.add("bbb");
		cars.add("ccc");
		System.out.println(cars);
		cars.add(3, "ddd");
		System.out.println(cars);
		cars.add(4,"ddd");
		for(int i=0;i<cars.size();i++)
		{
			System.out.println(cars.get(i));
		}
		cars.remove(0);
		
		System.out.println(cars);
		
	
	}

}
