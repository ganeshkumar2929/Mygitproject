package ganesh.exercise11;

public class HomeLoan extends AbstractLoan {
	
	public String propertyAddress;
	
/*Create a constructor with 4 arguments in the education loan class for values customerName, term , principal , 
propertyAddress and set the values to the respective class properties*/
	
	public HomeLoan(String customerNames, Integer principals, Integer terms, String address) {
		super(customerNames,principals,terms);
		this.propertyAddress = address;
		}
	
/*The interest rate for education loans is 7.5 hence, Override the parent method called getInterestRate 
 and return value 7.5. Let's create a main method to create some loans and test our classes*/
	
	public Double getInterestRate() {
		return 7.5;
	}

 

}
