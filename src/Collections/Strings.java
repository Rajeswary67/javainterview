package Collections;

public class Strings {

	public static void main(String[] args) {
		String s="Rajeswary";
		int len=s.length();
		String rev="";
		for(int i=s.length()-1;i>=0; i-- )
		{
			rev=rev+s.charAt(i);
		
		}
		System.out.println(rev);
	}

}
