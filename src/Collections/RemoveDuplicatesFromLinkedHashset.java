package Collections;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Arrays;
import java .util.stream.Collectors;
public class RemoveDuplicatesFromLinkedHashset {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList= new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4,5,5,6,9,9,99));
		
		LinkedHashSet<Integer> LinkedHashSet=new LinkedHashSet<Integer>(arrList);
		ArrayList<Integer> numbersWithoutDuplicates=new ArrayList<Integer>(LinkedHashSet);
		System.out.println(numbersWithoutDuplicates);
		
		ArrayList<Integer> arrList1= new ArrayList<Integer>(Arrays.asList(1,2,2,3,3,4,5,5,6,9,9,99));
		List<Integer>  MarksuniqueList=arrList.stream().distinct().collect(Collectors.toList());
		
		System.out.println( MarksuniqueList);
		
	}

}
