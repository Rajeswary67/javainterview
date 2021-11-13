package javainterview;

public class TestEmployeeRegistration {

	public static void main(String[] args) {	
		EmployeeRegistration e1=new EmployeeRegistration();
		e1.setName("Madhu");
		e1.setAge(40);
		e1.setSalary(44444.55);
		e1.setActive(true);
		e1.setGender('m');
System.out.println(e1.getName());
System.out.println(e1.getAge());
System.out.println(e1.getSalary());
System.out.println(e1.isActive());
System.out.println(e1.getGender());

EmployeeRegistration e2=new EmployeeRegistration();
e2.setName("Lakshiv");
e2.setAge(9);
e2.setSalary(66666.55);
e2.setActive(true);
e2.setGender('m');
System.out.println(e2.getName());
System.out.println(e2.getAge());
System.out.println(e2.getSalary());
System.out.println(e2.isActive());
System.out.println(e2.getGender());
EmployeeRegistration e3=new EmployeeRegistration();
e3.setName("Kethan");
e3.setAge(5);
e3.setSalary(88888.99);
e3.setActive(true);
e1.setGender('m');                                                                     
System.out.println(e3.getName());
System.out.println(e3.getAge());
System.out.println(e3.getSalary());
System.out.println(e3.isActive());
System.out.println(e3.getGender());

String info= e1.getEmployeeRegistration();
System.out.println(info);

String info1= e2.getEmployeeRegistration1();
System.out.println(info1);

String info2= e3.getEmployeeRegistration2();
System.out.println(info);





	}

}
