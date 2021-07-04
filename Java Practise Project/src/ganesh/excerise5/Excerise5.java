package ganesh.excerise5;
import InterestCalculator;
import LoanBuilder1;

public class Excerise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*Requirement 8: Create a class called Exercise 5 with static void main method in it
Within the class create an instance of a loanBuilder with argument values ("Jagadeesh", 800000,36) 
and the print Jagadeesh's loan details, Similarly create one with argument values ("Ganesh",500000,12) 
and the print Ganesh's loan details*/
	
		LoanBuilder1 lb1 = new LoanBuilder1("Jagadeesh", 800000, 36);
		lb1.printLoanGrantForm();
		LoanBuilder1 lb2 = new LoanBuilder1("Ganesh",500000,12);
		lb2.printLoanGrantForm();
		
		System.out.println(InterestCalculator.getInterestRate(900000, 24));
		
		
		}

}
