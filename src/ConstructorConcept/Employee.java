package ConstructorConcept;

public class Employee {

	private  String Name;
	private int Age;
	public Employee()
	{
		System.out.println("default Constructor");
	}
	public Employee(String Name) {
		System.out.println("1 parameter constructor is called");
		//return Name;
	}
	public String getName(String Name)
	{
		this.Name=Name;
		return Name;
	}
	public Employee(String Name, int Age)
	{
		System.out.println("2 parameter constructor is called");
	}
	
	public int getAge(int Age)
	{
		this.Age=Age;
		return Age;
	}
	
	
}

	
//public static void main(String[] args)
//{
//	Employee e1=new Employee();
//	Employee e2=new Employee("madhu");
//	Employee e3=new Employee("madhu",40);
//	
//	
//}
//}

