package loan;

public class Loan {

	
	String customerName;
	Integer principal;
	Integer term;
	

	public Loan(String customerName, Integer term, Integer principal) {
		this.customerName=customerName;
		this.principal=principal;
		this.term=term;
	}
	

	public double getInterestRate() {
		return 2;
	}
	
	public double getMonthlyEMI() {
		
		return (principal + (principal * (term/getInterestRate()))/term );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
