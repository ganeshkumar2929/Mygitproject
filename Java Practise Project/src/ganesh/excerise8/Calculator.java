package ganesh.excerise8;

public class Calculator {
	
/*Requirement 2: Create a method to add 2 or more numbers
                      Name of the method: add
                      Argument : 1 [name of Argument - numbers, dataType -> Array of Integer]
                      Return Type: Integer*/
	
	public int add(int[] numbers) {
		int result = 0;
		for(int i=0; i<numbers.length; i++) {
			//System.out.println(numbers[i]);
			result = numbers[i]+result;
		}
			return result;
			
		}

/*Logic: You should iterate through the array of numbers which was passed on to the method through the 
 * argument and add them and return the result
 Requirement 3: Create a method to multiple 2 or more numbers
			                      Name of the method: add
			                      Argument : 1 [name of Argument - numbers, dataType -> Array of Integer]
			                      Return Type: Integer*/
	
	public int multiple(int[] numbers) {
		int result = 1;
		for(int i=0; i<numbers.length; i++) {
			result = numbers[i]*result;
		}
		return result;
		}
	
/*Requirement 4: Create a method to subtract 2  numbers
                      Name of the method: subtract
                      Argument : 2 [(name of Argument - number1, dataType -> Integer),(name of Argument - number2, dataType -> Integer)]
                      Return Type: Integer

Logic: Just subtract the number1- number2 and return the result.*/
	
	public int subtract(int number1, int number2) {
		int result;
		return result = number1 - number2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
