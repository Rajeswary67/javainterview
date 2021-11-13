package javainterview;

public class StringManipulation {

	public static void main(String[] args) {
		String str = "lakshivkethan";
		String str1= "mythrimadhu";
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('v'));
		System.out.println(str.indexOf('k', 3));
		System.out.println(str.indexOf('n'));
		System.out.println(str.codePointAt(0));
		System.out.println(str.codePointBefore(4));
		System.out.println(str.codePointCount(0, 12));
		//System.out.println(str.compareTo(str1 with str));
		//System.out.println(str.indexOf(a,str.indexOf('a')+1));
        //System.out.println(str, equals(str1));
		String s2= "   rajeswary mythri  ";
		System.out.println(s2.trim() );
		System.out.println(s2.replaceFirst(" ", " "));
		System.out.println(s2.replace('r', 'g'));
		System.out.println(s2.compareToIgnoreCase(str1));
		System.out.println(s2.concat(str1));
		System.out.println(s2.contentEquals(str1));
		System.out.println(s2.endsWith("is"));
		String date= "2-08-1986";
		System.out.println(date.replace('-', '/'));
		String test= "Hello_selenium_world";
		String testval[]= test.split("_");
	    for(int i=0; i<=testval.length; i++)
	    System.out.println(testval[i]);
	    
}
}