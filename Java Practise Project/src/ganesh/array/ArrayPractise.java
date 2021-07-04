package ganesh.array;
import ganesh.excerise3.*;

public class ArrayPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Buchuu";
		name.toUpperCase();
		String[] nameArray = new String[] {"buchuu", "jags", "gan", "anni"};
		System.out.println(nameArray[0]);
		System.out.println(nameArray[1]);
		System.out.println(nameArray[2]);
		
		int[] numberArray = new int[] {1,2,3,4,5,6,7,8,9,10,11};
		
		Parcel parcel1 = new Parcel("jags", 92.8);
		
		Parcel parcel2 = new Parcel("jags", 92.8);
		Parcel[] parcel = new Parcel[] {parcel1, parcel2, new Parcel("buchuu", 12.6)};
		System.out.println(parcel[0].customerName);
		
		
		for(int i =0; i <numberArray.length; i++) {
			System.out.println(numberArray[i]);
		}
		
		ArrayPractise.testMethod(parcel);
		
	}
	
//create a method of void return type method name is test method which has one arugument of data type array of parcels
	
	public static void testMethod(Parcel[] parcels) {
		for(int i=0; i<parcels.length; i++ ) {
			System.out.println(parcels[i].customerName);
		}
	}
	
	
	
	
}
