package inhertiance;

public class Exercise10 {

	public static void main(String[] args) {
		
/*Create an instance of tiago factory and nexon factory

Call the createCar method from both the instance and print the class properties of the car instance.*/
		
		TiagoFactory TiagoFactory1 = new TiagoFactory();
		TiagoFactory1.createCar("Pranav", "Red");
		System.out.print(TiagoFactory1.getEngine());
		System.out.println(TiagoFactory1.getBrakeType());
		System.out.println(TiagoFactory1.getDriveMode());
		System.out.println(TiagoFactory1.getSteering());
		
		NexonFactory NexonFactory1 = new NexonFactory();
		NexonFactory1.createCar("Aari", "Black");
		System.out.println(NexonFactory1.getBluetooth());
		
		
	}
}
