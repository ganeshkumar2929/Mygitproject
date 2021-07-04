package loan;

public class EducationLoan extends Loan {

	public String collegeName;
	public String degree;
	
	public EducationLoan(String customerName, Integer term, Integer principal, String collegeName, String degree) {
		super(customerName,term,principal);
		this.collegeName=collegeName;
		this.degree=degree;
		}
	
	public double getInterestRate() {
		return 10.0;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
