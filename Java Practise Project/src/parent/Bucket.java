package parent;

import java.util.ArrayList;

public class Bucket {
//Class level la defined a variable names datatype of ArrayList<String>
//Cause we need names as major role for b
	ArrayList<String> names = new ArrayList<String>();
	
	
	
	
	public void addNames(String a) {
		names.add(a);
		 }
	
	//Getting the size of items in the bucket
	public int itemSize() {
		return names.size();
		
	}

	

	public static void main(String[] args) {
		Bucket bucket1 = new Bucket();
		bucket1.addNames("Jack");
		bucket1.addNames("Pranav");
		Bucket bucket2 = new Bucket();
		bucket2.addNames("Aari");
		System.out.println(bucket1.itemSize());
		System.out.println(bucket2.itemSize());
	}
	

}
