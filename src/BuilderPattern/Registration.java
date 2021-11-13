package BuilderPattern;

public class Registration
{
	String firatName;
	String lastName;
	String emailid;
	String city;
	int Sal;
	char Gender;
	int Phno;
	public Registration(String firatName, String lastName, String emailid, String city, int sal, 
			char Gender,int phno) {
		//super();
		this.firatName = firatName;
		this.lastName = lastName;
		this.emailid = emailid;
		this.city = city;
		Sal = sal;
		Gender = 'F';
		Phno = phno;
	}
	public String getFiratName() {
		return firatName;
	}
	public void setFiratName(String firatName) {
		this.firatName = firatName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSal() {
		return Sal;
	}
	public void setSal(int sal) {
		Sal = sal;
	}
	public char getGender() {
		return Gender;
	}
	public void setGender(char gender) {
		Gender = gender;
	}
	public int getPhno() {
		return Phno;
	}
	public void setPhno(int phno) {
		Phno = phno;
	
	}
	
	public void Regi(Registration registration)
	{
	registration.getFiratName();
    registration.getLastName();
	registration.getCity();
//	//Regi.getemailid();
//	Regi.getphno();
//	Regi.getSal();
//	Regi.getGender();
	System.out.println("registration:" +getFiratName()+" "+getLastName());
	}
	
		
	}



