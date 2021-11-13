package javainterview;

public class Kethan {
	


		String name;
		int age;
		double sal;
		boolean isActive;
		int phone;
		public static void main(String[] args) {			
	Kethan e1=new Kethan();
		e1.name="tom";
		e1.age=34;
		e1.sal=12.34;
		e1.isActive=true;
		System.out.println(e1.name);
		System.out.println(e1.name+" "+e1.age+" "+e1.sal+" "+e1.isActive);
		e1.phone=98980980;
		System.out.println(e1.phone);
		new Kethan().name="lakshiv";
		Kethan e5= new Kethan();
		//e5.null;
		System.out.println(e5.name);
		System.out.println(e1.age);
		System.gc();
		

	}

}

	
	


