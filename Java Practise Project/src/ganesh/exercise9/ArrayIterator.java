package ganesh.exercise9;

public class ArrayIterator {

/*Requirement 1: Create a class called ArrayIterator with one class property called arrayValue and another class property called counter
                          1.  Property Name: arrayValue
                               Data type: Integer Array
                          2.  Property Name: counter
                               Data type: Integer
                               Default Value : 0*/
	int[] arrayValue = new int[] {};
	public int counter = 0;
	
/*Requirement 2: Create a constructor with one argument of type and set the value of the argument to the arrayValue class property*/
	
	public ArrayIterator(int[] arrayValues) {
		arrayValue = arrayValues;
	}
	
/*Requirement 3: Create a method called getFirstElement, this method is used to get the value of the first element in the array
                            Method Name: getFirstElement
                            Arguments : 0
                            Return Type: Integer
        Logic: Within the method, if length of array is greater than 0 then return the value of the zeroth index, else return zero.*/
	
	public int getFirstElement() {
		if(arrayValue.length > 0) {
			return arrayValue[0];
		}
			return 0;
		}

/*Requirement 4: Create a method called getLastElement, this method is used to get the value of the last element in the array
                            Method Name: getLastElement
                            Arguments : 0
                            Return Type: Integer
 Logic: Within the method, if length of array is greater than 0 then return the value of the last element [hint : length-1], else return zero*/
	
	public int getLastElement() {
		if(arrayValue.length > 0) {
			return arrayValue[arrayValue.length-1];
		}
		return 0;
	}
	
/*Requirement 5: Create a method called next, this method is used to get the value of the next element in the array. 
 * For this we would be using the counter class variable to keep track of the value
                            Method Name: next
                            Arguments : 0
                            Return Type: Integer
        Logic: Within the method, 
if the value of the counter is less than the length of the arrayvalue, 
then , Increase the value of counter, and return value of the element in the counter position in the array.
else return null.*/

	public Integer next() {
		if(counter < arrayValue.length) {
		counter=counter+1;
		return arrayValue[counter-1];
		}
		return null;
		}
	
/*Requirement 6: Create a method called hasNext, this method is used to return a boolean value if the value of counter + 1 is less than length.
                            Method Name: hasNext
                            Arguments : 0
                            Return Type: Boolean
        Logic: Within the method, 
if the value of the counter + 1 is less than the length of the arrayvalue, then return true else return false. 
[Note: You should not be increase the value of the counter class variable, just check the condition don't assigned the increased value, 
hint [if (counter+1 < arrayvalue.length) {// logic goes here}]*/
	
	public Boolean hasNext() {
		if(counter +1 < arrayValue.length) {
			return true;
		}else {
			return false;
		}
	}
	
/*Requirement 7: Create  a method called reset and within the method set the value of the value of the counter class variable to zero.
                            Method Name: reset
                            Arguments : 0
                            Return Type: void
        Logic: set the value of the value of the counter class variable to zero*/
	
	public void reset() {
		counter =0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
