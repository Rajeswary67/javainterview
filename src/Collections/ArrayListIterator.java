package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class ArrayListIterator {
	public static void main(String[] args)
	{
	ArrayList<String> tvSeries= new ArrayList<String>(Arrays.asList("aaa","bbb","ccc","aaa"));
	
	tvSeries.add("ram");
	tvSeries.add("madu");
	
	System.out.println(tvSeries);
	LinkedHashSet Series= new LinkedHashSet(tvSeries);
	ArrayList<String> Str=new ArrayList<String>(Series);
	System.out.println(Str);
	tvSeries.forEach(shows ->{
		System.out.println(shows);
	
	
	});

}
}

