\|\import ganesh.FirstProgram;

public class SecondProgram{
	
	
	
	
	public static void main(String[] a1) {
		FirstProgram instanceOfFirstProgram = new FirstProgram();
		
		
		// Method calling
		System.out.println("addTwoNumbers ::"+instanceOfFirstProgram.addTwoNumbers(40,20));
		System.out.println("isEvenNumber ::"+instanceOfFirstProgram.isEvenNumber(30));

		System.out.println("getColour ::"+instanceOfFirstProgram.getColour());
		instanceOfFirstProgram.updateLaptopColour("black");
		
		FirstProgram instanceOfFirstProgram1 = new FirstProgram("Green",8,true);
		
		System.out.println("getColour for instance 1 ::"+instanceOfFirstProgram1.getColour());
		instanceOfFirstProgram1.updateLaptopColour("white");

		System.out.println("getColour for instance 0 after update::"+instanceOfFirstProgram.getColour());
		
		System.out.println("getColour for instance 1 after update::"+instanceOfFirstProgram1.getColour());

		
	}
	
	
}