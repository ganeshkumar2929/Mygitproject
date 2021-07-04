package ganesh.exercise10;

public class Exercise10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Create a class called Exercise 10 with static void method,

Create an instance of tiago factory and nexon factory

Call the createCar method from both the instance and print the class properties of the car instance.*/
		TiagoFactory tf = new TiagoFactory();
		NexonFactory nf = new NexonFactory();
		Car q = tf.createCar("Shanmugham", "White");
		System.out.println(q.engine);
		System.out.println(q.colour);
		
		
		Car w = nf.createCar("Jagadeesh", "Black");
		System.out.println(w.engine);
		System.out.println(w.steering);
		
		Car c1 = new Car();
		//System.out.println(c1.setBrakes("Powerbrake"));
		c1.setColour("Black");
		System.out.println(c1.colour);
		
		
		
		
		

	}

}
