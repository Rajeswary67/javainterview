package javainterview;

public class Circle {

	public static void main(String[] args) {
		Circle c1=new Circle();
		double r=5;
		double i =c1.circumference( 5); 
	   System.out.println(i);
	   double j=c1.area(8);
	   System.out.println(j);
	}
	

	public double circumference(int r)
    {
    	double c;
    	c=2*3.14*r;
    //	System.out.println(c);
    	return c;
    	
    }
	
	public double area(int r)
	{
		double  d;
		d=3.14*r*r;
		return d;
	}
	
	
	
	
	
	
	
	
	
}
