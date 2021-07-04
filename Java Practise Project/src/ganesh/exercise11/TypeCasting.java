package ganesh.exercise11;

public class TypeCasting {
	
	public static void printLoanDetails(AbstractLoan Loans) {
		System.out.println(Loans.getMonthlyEMI()+"  "+Loans.customerName+"  "+Loans.term+"  "+Loans.principal);
		if (Loans instanceof EducationLoan) {
			EducationLoan eLoan = (EducationLoan) Loans;
			System.out.println(eLoan.getMonthlyEMI()+" "+eLoan.collegeName+"  "+eLoan.degree);
		}else if (Loans instanceof HomeLoan) {
			HomeLoan hLoan = (HomeLoan) Loans;
			System.out.println(hLoan.propertyAddress);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonnelLoan ganesh = new PersonnelLoan("Ganesh", 100000, 24);
		printLoanDetails(ganesh);
		EducationLoan buchuu = new EducationLoan("Buchu", 20000, 12, "SRM", "B.E");
		printLoanDetails(buchuu);
		HomeLoan chitra = new HomeLoan("Chitra", 30000, 18, "24 Ist street laxmipuram");
		printLoanDetails(chitra);
		
		
		
		
		
	}

}
