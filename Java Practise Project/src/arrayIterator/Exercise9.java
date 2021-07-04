package arrayIterator;

public class Exercise9 {

	public static void main(String[] args) {
/*1. Create an Integer array with values - 0,40,80,78,1
                 2. Create an instance of ArrayIterator and pass the value of the integer array created in the previous 
                 step as argument to the constructor
                 3. Print the value of the first element in array using the getFirstElement method in the arrayIterator
                 4. Print the value of the last element in array using the getLasttElement method in the arrayIterator
                 5. Print the value returned by the next method
                 6. Print the value returned by the next method (Call it second time)
                 7. Print the value returned by the next method (Call it third time)
                 8. Call the reset method
                 9. Print the value returned by the next method
Note: In this method we have invoked the next method thrice instead we can also use a while loop to iterate through all elements of the array. 
Which we will learn today about what is while loop. For the moment let's keep calling the next method thrice.*/
		int[] x = {0,40,80,78,1};
		ArrayIterator ArrayIterator1 = new ArrayIterator(x);
		System.out.println(ArrayIterator1.getFirstElement());
		System.out.println(ArrayIterator1.getLastElement());
		System.out.println(ArrayIterator1.next());
		System.out.println(ArrayIterator1.next());
		System.out.println(ArrayIterator1.next());
		ArrayIterator1.reset();
		System.out.println(ArrayIterator1.next());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
