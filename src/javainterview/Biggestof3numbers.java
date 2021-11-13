package javainterview;

public class Biggestof3numbers {

	public static void main(String[] args) {
		//public static void main(String[] args) {                      
			int A=800;
			int B=1200;
		    int C=400;
		 if(A>=B && A>=C)
	 {
	    if(A==B)
	    System.out.println("A and B are the greatest numbers");
        else if(A==C)
	    System.out.println("A and C are the greatest numbers");
	    else
	    System.out.println("A is the greatest number");
	 }
		else if(B>=C)
   {
			if(B==C)
			System.out.println("B and C are the greatest numbers");
		 else
	     System.out.println(" B is the greatest number");
	}
		 else
		 { System.out.println("C is the greatest number");
		 }
   
}
}