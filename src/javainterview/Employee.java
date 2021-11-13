package javainterview;


public class Employee {
	String names;
	int age;
	char gender ;
	double sal;
	String city;
	public static void main(String[]args) {
    Employee e1=new Employee();
	e1.names="madhu";
	e1.age=34;
	e1.gender='F';
	e1.sal=12.44444;
	e1.city="hyd";
	System.out.println(e1.city);
	System.out.println(e1.names+" " +e1.age+" "+e1.gender+" "+e1.sal+" "+e1.city);
	Employee e2=new Employee();
	e2.names="raju";
	e2.city="pune";
	System.out.println(e2.city);
	System.out.println(e2.names+" " +e2.age+" "+e2.gender+" "+e2.sal+" "+e2.city);
	e2.sal=44444.5;
	
	System.out.println(e2.names+" " +e2.age+" "+e2.gender+" "+e2.sal+" "+e2.city);
	new Employee();
	new Employee().names= "aaa";
	new Employee().age= 34;
	System.out.println(new Employee().names= "aaa");
	System.out.println(new Employee().age= 34);
	Employee e3= new Employee();
	e3=null;
	//System.out.println(e3.names);
	//System.gc();	
}
}
