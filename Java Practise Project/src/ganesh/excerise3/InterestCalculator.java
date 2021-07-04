package ganesh.excerise3;

public class InterestCalculator {

	
	
	public static double getInterestRate(Integer loanAmount, Integer loanPeriod) {
		double loanAmountInterestRate;
		double loanPeriodInterestRate;
		if(loanAmount < 50000) {
			 loanAmountInterestRate =7.5;
		}else if (loanAmount >50000 && loanAmount <100000) {
			loanAmountInterestRate=8.0;
		}else{
			loanAmountInterestRate=9.0;
		}
		
		if(loanPeriod <= 12) {
			loanPeriodInterestRate=2;
		}else if(loanPeriod >12 && loanPeriod <24) {
			loanPeriodInterestRate=3;
		}else {
			loanPeriodInterestRate=4;
		}
		
		 double finalInterestRate =(loanAmountInterestRate + loanPeriodInterestRate);
		return finalInterestRate;
	}
	public static void main(String[] args) {
		System.out.println(InterestCalculator.getInterestRate(75000, 12));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
