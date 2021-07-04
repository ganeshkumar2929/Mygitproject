package ganesh.excerise8;

public class Excerise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Requirement 5: Create a class called Exercise 8 with a static void main method in it
Within the method create an instance of a calculator class and do,

1. Print the sum of the following numbers - 100,90,80,4,89,200
2. Print the sum of the following numbers - 100,90
3. Print the Multiplied value of the following numbers - 100,90,80,4
4. Print the difference between 100 and 90*/
		Calculator c1 = new Calculator();
		System.out.println(c1.add(new int[] {100,90,80,4,89,200}));
		System.out.println(c1.add(new int[] {100,90}));
		System.out.println(c1.multiple(new int[] {100,90,80,4}));
		System.out.println(c1.subtract(100,90));
		

		
		
		
		


	}

}
