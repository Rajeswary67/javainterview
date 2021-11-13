package OOPinheritance;

public  class Car extends Vehicle {
	int speed=100;
	public  void start() {
		System.out.println("car..start method");
	}

	public void stop() {
		System.out.println("car..stop method");
	}

	public void refuel() {
		System.out.println("car..refuel method");
	}
}
