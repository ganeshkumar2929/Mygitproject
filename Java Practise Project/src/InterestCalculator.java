
public class InterestCalculator {
	
/*Requirement 2: Create a static public method in this class to find the interest rate based on the given arguments.
                           Name of the method: getInterestRate, 
                           Arguments: 2, 
                                    1. Name - loanAmount, Datatype -Integer 
                                    2. Name - loanPeriod [No of months], Datatype - Integer
                           Return type: Double (will be computed interest rate for the loan)
 Logic: There would be a separate interest rate based on the loanamount and a separate rate based on the loanPeriod. 
 the final rate would be sum of the two rates:
                     Interest rate for LoanAmount: if Loan Amount is 
                                            <500000, then 7.5 
                                            >500000 & < 1000000, then 8.0 
                                            <1000000 , then 9.0
                     Interest rate for LoanPeriod: if Loan Period is 
                                            <12, then 2 
                                            >12 & < 24, then 3 
                                            >24 , then 4
  Final interest rate for the loan is -> sum (Interest rate for LoanAmount,Interest rate for LoanPeriod)
 (So if I need loan for 750000 & for period of 24 months then my interest rate would be 11 [8.0+3])	*/
	
	public static double getInterestRate (int loanAmount, int loanPeriod) {
		double interestRateForLoanAmount;
		double interestRateForLoanPeriod;
		//double interestRateForTheLoan;
		if (loanAmount <= 500000) {
			 interestRateForLoanAmount = 7.5;
		}else if (loanAmount >500000 && loanAmount <=1000000) {
			interestRateForLoanAmount= 8.0;
		
		}else {
			interestRateForLoanAmount = 9.0;
		}
	
		if (loanPeriod <=12) {
			interestRateForLoanPeriod = 2.0;
		}else if (loanPeriod >12 && loanPeriod <=24) {
			interestRateForLoanPeriod = 3.0;
		}else {
			interestRateForLoanPeriod = 4.0;
			
	}
		
		return  interestRateForLoanAmount +interestRateForLoanPeriod;
		
		
	}

}
