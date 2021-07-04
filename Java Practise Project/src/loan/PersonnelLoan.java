package loan;

public class PersonnelLoan extends Loan{
	

	public PersonnelLoan(String customerName, Integer term, Integer principal) {
		super(customerName,term,principal);  
	}
	
	public double getInterestRate() {
		return 14.0;
	}
	}
