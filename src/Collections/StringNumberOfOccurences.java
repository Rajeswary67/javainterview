package Collections;

public class StringNumberOfOccurences {

	public static void main(String[] args) {
		String s="Java Selenium Java";
		int totlength=s.length();
		int afterremove=s.replace("a", "").length();
		int count= totlength-afterremove;
		System.out.println(count);
		
	}

}
