package javainterview;

public class EmployeeRegistration {
	private String Name;
	private int age;
	private double Salary;
	private boolean isActive;
	private char Gender;
	
	public String getEmployeeRegistration()
	{
		String info= Name+age+Salary+isActive+Gender;
		return info;
	}

	public String getEmployeeRegistration1()
	{
		String info1= Name+age+Salary+isActive+Gender;
		return info1;
	}
	
	public String getEmployeeRegistration2()
	{
		String info2= Name+age+Salary+isActive+Gender;
		return info2;
	}
	
	
	
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
}