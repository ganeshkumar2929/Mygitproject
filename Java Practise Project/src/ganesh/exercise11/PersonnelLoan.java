package ganesh.exercise11;

public class PersonnelLoan extends AbstractLoan {

/*Create a constructor with 3 arguments in the personnel loan class for values customerName, term & principal and 
set the values to the class properties*/
	
	public PersonnelLoan(String customerNames, Integer principals, Integer terms) {
		super(customerNames,principals,terms);
		}
	
/*The interest rate for personnel loans is 14 hence, Override the parent 
 method called getInterestRate and return value 14.*/
	
	public Double getInterestRate() {
		return 14.0;
	}
 

}
