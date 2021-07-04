package calculator;

public class Calculator {
	
	

	public Integer add(int[] numbers) {
		int result=0;
		for(int i=0; i<numbers.length; i++) {
			result=numbers[i]+result;
		}
		return result;
	}
	
	public Integer subtract(Integer number1, Integer number2 ) {
		return number1-number2;
		}
	
	public Integer multiple(int[] numbers) {
		int result=1;
		for(int i=0; i<numbers.length; i++) {
			result =numbers[i]*result;
		}
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
