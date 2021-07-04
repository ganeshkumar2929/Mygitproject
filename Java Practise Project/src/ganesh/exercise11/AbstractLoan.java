package ganesh.exercise11;

public abstract class AbstractLoan {

/*Let's create a class called Loan with the following properties Name: customerName , DataType: 
 String Name: principal , DataType: Integer Name: term , DataType: Integer*/

	public String customerName;
	public Integer principal;
	public Integer term;
	
/*Create a constructor with 3 arguments in loan class and assign the values of the argument to 
 * the three class properties defined above.*/
	
	public AbstractLoan(String customerNames, Integer principals, Integer terms) {
		this.customerName = customerNames;
		this.principal = principals;
		this.term = terms;
	}
	
/*Create a method called getInterestRate to get the interest rate of the loan. Name of The Method: getInterestRate , 
 * Argument : 0, ReturnType: Double.
Logic:
Return value 0;*/
	
	public abstract Double getInterestRate();
		

	
/*Create a method called getMonthlyEMI to calculate the monthly interest to the paid by the user. 
 * Name of The Method: getMonthlyEMI , 
 * Argument : 0, ReturnType: Double.
Logic:
the formula to calculate the emi is : (principal + (principal * (term/interestRate))/term Let's start creating 
child class*/
	
	public Double getMonthlyEMI() {
		return (this.principal + (this.principal * (this.term/this.getInterestRate()))/this.term);
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
