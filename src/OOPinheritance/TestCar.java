package OOPinheritance;

public class TestCar {

	public static void main(String[] args) {
		Car c=new Car();
		c.start();
		c.stop();
		c.refuel();
		BMW b=new BMW();
		b.start();
		b.autoParking();
		b.stop();
		b.refuel();
		//c.autoParking();
		
		Car c1=new BMW();
		c1.stop();
		c1.refuel();
		c1.start();
		//c1.autoParking();
		//BMW b1=(BMW)new Car();
		
		//System.out.println(c.speed);
		Vehicle v=new Vehicle();
		v.Service();
		// c.Service();
		AUDI a=new AUDI();
		a.openTop();
		HONDA h=new HONDA();
		h.acController();
		a.refuel();
		h.stop();
		//a.autoParking();
		b.Service();
		//a.Sevice()
		a.start();
		h.start();
		h.refuel();
		h.stop();
		h.Service();
		b.Service();
		
		Vehicle v1=new Car();
		v1.Service();
		//Car c2=new Vehicle();
		
		//h.openTop();
	//AUDI a1=(AUDI) new BMW();
		Truck t=new Truck();
		t.heavyLoad();
		//t.autoParking();
		t.stop();
		
		Vehicle vh=new BMW();
		
		

		
	}

}
