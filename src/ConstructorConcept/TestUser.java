package ConstructorConcept;

public class TestUser {
public static void main(String[] args) {
	User u1= new User("tom",34,"hyd");
	System.out.println(u1.getname());
	System.out.println(u1.getage());
	System.out.println(u1.getcity());
}
}
