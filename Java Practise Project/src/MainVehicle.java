
public class MainVehicle {

	public static void main(String[] args) {
		Bmw myBmw = new Bmw();
		Ferrari myFerrari = new Ferrari();
		Sonet mySonet = new Sonet();
		
		myBmw.accelerate();
		myBmw.accelerate();
		myBmw.accelerate();
		myBmw.breaking();
		System.out.println(myBmw.currentSpeed());
		
		myFerrari.accelerate();
		myFerrari.accelerate();
		myFerrari.accelerate();
		myFerrari.breaking();
		System.out.println(myFerrari.currentSpeed());
		
		mySonet.accelerate();
		mySonet.breaking();
		System.out.println(mySonet.currentSpeed());
		 Vehicle v = new Vehicle();

	}

}
