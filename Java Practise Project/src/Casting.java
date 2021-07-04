
public class Casting {

	

	int myInt = 9;
	
	public static void main(String[] args) {
		//Automatic casting- int to double
		
		int myInt = 9;
		double myDouble = myInt;
		
		System.out.println(myInt);
		System.out.println(myDouble);
		Casting myCasting = new Casting();
		System.out.println(myCasting.myInt);
		
		//Widening casting
		
		double myyDouble =7.89;
		int myyInt = (int) myyDouble;
		System.out.println(myyInt);
		System.out.println(myyDouble);
		
		
		
	}

}
