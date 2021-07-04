package arrayIterator;

public class ArrayIterator {
	
	public int[] arrayValue;
	public int counter=0;
	

	
	public ArrayIterator(int[] arrayValue) {
		this.arrayValue=arrayValue;
	}

	public Integer getFirstElement() {
		if(arrayValue.length > 0) {
			return arrayValue[0];
		}else {
			return 0;
		}
	}
	
	public Integer getLastElement() {
		if(arrayValue.length > 0) {
			return arrayValue.length-1;
		}else {
			return 0;
		}
	}
	
/*Create a method called next, this method is used to get the value of the next element in the array. For this we would be
 *  using the counter class variable to keep track of the value
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
			return counter;
		}else {
			return null;
		}
			
	}
	

	
	public boolean hasNext() {
		if(counter+1 < arrayValue.length) {
			return true;
		}else {
			return false;
		}
	}


	public void reset() {
		counter=0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
