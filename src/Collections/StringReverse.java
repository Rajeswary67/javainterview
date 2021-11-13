package Collections;

public class StringReverse {

	public static void main(String[] args) {

		String s = "madhu";
//		int len=s.length();
//		System.out.println(len);
//		String rev="";
//		
//		for(int i=s.length()-1; i>=0; i--)
//		{
//			rev=rev+s.charAt(i);
//			
//		}
//	
//	System.out.println(rev);
//	}
		
		StringBuffer sf = new StringBuffer(s);
		{
			StringBuffer s1=sf.reverse();
			System.out.println(s1);
			
		}
		

}
}