package ganesh.exercise6;

public class Bank {
	static int count =0;

/*Requirement 2: Create a static property called loans to keep track of all loans granted to the customers. 
 * Initialise this property with an empty array.
                        Name : loans, Data type : Array of LoanBuilder
[ Hint: this is how you define an array variable and assign it a value of empty array "String[] a = new String[]{};"]*/
	
	public static LoanBuilder[] loans = new LoanBuilder[10];
	
/*Requirement 3 : Create a static method called applyLoan, this method is intended to create a loan instance and keep track of all 
 * such loans in the loans property
                       Name: applyLoan
                       Return Type: void
                       Arguments: 3 
                         1. Name: nameOfTheApplicant , Data type: String
                         2. Name: loanAmount , Data type: Integer
                         3. Name: loanPeriod , Data type: Integer
                       Logic:
  within this method create an object of LoanBuilder by invoking the constructor. Add the created loanBuilder object to the array*/
	
	public static void applyLoan(String nameOfTheApplicant, int loanAmount, int loanperiod) {
		LoanBuilder lb = new LoanBuilder(nameOfTheApplicant, loanperiod, loanperiod);
		loans[count] = lb;
		count = count + 1;
		}
	
/*Requirement 4 : Create a static method to Print the loans applied so far,
                       Name: printLoanDetails
                       Return Type: void
                       Arguments: no
Logic: Iterate through all elements of the array and invoke the print method of the respective loanBuilder object 
[Hint, you should be using the for loop the syntax will be like "for (int i=0; i < loans.length; i++) .
Array has a property called length which will give the total number of elements in the array.]*/
	
	public static void printLoanDetails() {
		for(int i =0; i < loans.length; i++) {
			if(loans[i] != null) {
			loans[i].printLoanGrantForm();
			}
		}
	}
	
/*Requirement 5 : Create a class called Exercise 6, with static void main to apply the following logic,
     A. You should be using the applyLoan method in the Bank class to apply for the following loans
     1. Apply loan for "Jagadeesh" , for an amount of "800000" for a period of "24" months
     2.. Apply loan for "Ganesh" , for an amount of "500000" for a period of "12" months
     B. Invoke the print method of the Bank class to the print the loan details 
     [Note: The expected output is both the loan details will be printed, Hint: The output should be same as Exercise 5]*/
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


		
		
	
		
	}

