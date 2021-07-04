
public class LoanBuilder1 {
	/*Requirement 5: Create the following private properties in the class
                         1. Name: nameOfTheApplicant , Data type: String
                         2. Name: loanAmount , Data type: Integer
                         3. Name: loanPeriod , Data type: Integer
                         4. Name: interestRate , Data type: Double*/
	
	private String nameOfTheApplicant;
	private int loanAmount;
	private int loanPeriod;
	private double interestRate;
	
/*Requirement 6: Create a constructor with 3 arguments which would be values for nameOfTheApplicant,loanAmount,loanPeriod
   Within the constructor do the following
   1. Set the value of the arguments to the value of the class properties
   2. Calculate the interest rate based and store the value in the interestRate class property 
   [Hint: you have to use the InterestCalculator static method]*/
	
	public LoanBuilder1 (String applicantName, int amount, int period) {
		nameOfTheApplicant = applicantName;
		loanAmount = amount;
		loanPeriod = period;
		interestRate = InterestCalculator.getInterestRate(amount, period);
		}
	
/*Requirement 7:  Create a method to print the loan grant form
 No Arguments, No return type , Logic is to print the loan details in the following format

Loan Application
Name of the applicant : <Value of the nameOfTheApplicant>
Loan amount granted : <Value of the loanAmount>
Loan period : <Value of the loanPeriod>
Interest Rate : <Value of the interestRate>*/
	
	
	public void printLoanGrantForm () {
		System.out.println("Name of the applicant :"+nameOfTheApplicant );
		System.out.println("Loan amount granted :"+loanAmount);
		System.out.println("Loan period :"+loanPeriod);
		System.out.println("Interest Rate :"+interestRate);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
