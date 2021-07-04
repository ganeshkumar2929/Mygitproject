package ganesh.exercise11;

public class EducationLoan extends AbstractLoan{

/*Create a class called EducationLoan which extends Loan, and create the following properties in 
Education Loan Name: collegeName , DataType: String Name: degree , DataType: String*/
	
	public String collegeName;
	public String degree;
	
/*Create a constructor with 5 arguments in the education loan class for values customerName, term , principal , 
 collegeName & degree and set the values to the respective class properties*/
	
	public EducationLoan(String customerNames, Integer principals, Integer terms, String collegeNames, String degrees) {
		super(customerNames,principals,terms);
		this.collegeName = collegeNames;
		this.degree = degrees;
	}
 
/*The interest rate for education loans is 10 hence, 
Override the parent method called getInterestRate and return value 10.*/
	
	public Double getInterestRate() {
		return 10.0;
	}
 

}
