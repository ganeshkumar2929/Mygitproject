package parent;

public class LoanBuilder {
	
	
	private String nameOfTheAppicant;
	private Integer loanAmount;
	private Integer loanPeriod;
	private double interestRate;

	
	public LoanBuilder(String nameOfTheAppicant,Integer loanAmount, Integer loanPeriod ) {
		this.nameOfTheAppicant=nameOfTheAppicant;
		this.loanAmount=loanAmount;
		this.loanPeriod=loanPeriod;
		
		interestRate=InterestCalculator.getInterestRate(loanAmount, loanPeriod);
	}

	
	public void loanGranted() {
		System.out.println("Name of the applicant :" +nameOfTheAppicant );
		System.out.println("Loan amount granted :" +loanAmount);
		System.out.println("Loan period :"+loanPeriod);
		System.out.println("Interest Rate :"+interestRate);
	}
	
	

}
