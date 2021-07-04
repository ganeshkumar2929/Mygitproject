package ganesh.exercise6;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Requirement 5 : Create a class called Exercise 6, with static void main to apply the following logic,
 A. You should be using the applyLoan method in the Bank class to apply for the following loans
 1. Apply loan for "Jagadeesh" , for an amount of "800000" for a period of "24" months
 2.. Apply loan for "Ganesh" , for an amount of "500000" for a period of "12" months
 B. Invoke the print method of the Bank class to the print the loan details 
 [Note: The expected output is both the loan details will be printed, Hint: The output should be same as Exercise 5]*/
		
		Bank.applyLoan("Jagadessh", 800000, 24);
		Bank.applyLoan("Ganesh", 500000, 12);
		Bank.printLoanDetails();
		

	}

}
