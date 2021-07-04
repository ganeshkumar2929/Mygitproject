package loan;

public class HomeLoan extends Loan{
	
	String propertyAddress;
	
public HomeLoan(String customerName, Integer term, Integer principal, String propertyAddress) {
		super(customerName,term,principal);
		this.propertyAddress=propertyAddress;
	}
	
public double getInterestrate() {
	return  7.5;
}
	
	
	
	
	
	
	
}
