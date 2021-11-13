package BuilderPattern;

public class Employee {
	public Employee getEmployeeInfo()
	{
		System.out.println("get emp Info");
		return new Employee();
	}
    public Employee getName()
    {
    	return this;
    }
}
