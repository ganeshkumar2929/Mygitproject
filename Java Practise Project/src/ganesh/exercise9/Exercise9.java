package ganesh.exercise9;

public class Exercise9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Requirement 8: Create a class called Exercise9 with a static void main method, within the class we will be creating 
 * an array object and using the ArrayIterator class which we created before we would be accessing the various values 
 * for that, write the following
 1. Create an Integer array with values - 0,40,80,78,1
 2. Create an instance of ArrayIterator and pass the value of the integer array created in the previous 
 step as argument to the constructor
 3. Print the value of the first element in array using the getFirstElement method in the arrayIterator
 4. Print the value of the last element in array using the getLasttElement method in the arrayIterator
                 5. Print the value returned by the next method
                 6. Print the value returned by the next method (Call it second time)
                 7. Print the value returned by the next method (Call it third time)
                 8. Call the reset method
                 9. Print the value returned by the next method
Note: In this method we have invoked the next method thrice instead we can also use a while loop to 
iterate through all elements of the array. Which we will learn today about what is while loop. 
For the moment let's keep calling the next method thrice*/
		int[] arrayValues = new int[] {0,40,80,78,1};
		ArrayIterator instOfArrayIterator = new ArrayIterator(arrayValues);
		System.out.println(instOfArrayIterator.getFirstElement());
		System.out.println(instOfArrayIterator.getLastElement());
		System.out.println(instOfArrayIterator.next());
		System.out.println(instOfArrayIterator.next());
		System.out.println(instOfArrayIterator.next());
		instOfArrayIterator.reset();
		System.out.println(instOfArrayIterator.next());
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
