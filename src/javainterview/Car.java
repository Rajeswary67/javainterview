package javainterview;

public class Car {
String name;
int price;
String color;

static int wheels=4;
		public static void main(String[] args)
		{
			Car c1= new Car();
			c1.name="Bmw";
			c1.price=40;
			c1.color="white";
	System.out.println(c1.name+" "+c1.price+" "+c1.color+" "+Car.wheels);
		}

}
