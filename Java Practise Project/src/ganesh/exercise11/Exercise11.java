package ganesh.exercise11;

public class Exercise11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*Within the main method create an instance of a personnel loan ("Jagadeesh",800000,24) 
 and print the monthly emi for the personnel loan in the following format A personnel loan for 
 amount 800000 is granted to Jagadeesh for a period of 24 months. The monthly emi is*/

/*Within the main method create an instance of a education loan ("Yogi",300000,48,"SRM institute","BBA") 
 and print the monthly emi for the Education loan in the following format An education loan for amount 
 300000 is granted to Yogi for a period of 48 months. The monthly emi is*/
		
/*Within the main method create an instance of a Home loan ("Jagadeesh",10000000,240,"1st Main road, Mars") 
  and print the monthly emi for the Home loan in the following format A home loan for amount 1000000 is granted to 
  JAGADEESH for a period of 240 months against the property 1ST MAIN ROAD MARS. The monthly emi is*/

		
		PersonnelLoan instOfPersonnelLoan = new PersonnelLoan("Jagadeesh", 800000, 24);
		System.out.println("The monthly emi is "+instOfPersonnelLoan.getMonthlyEMI());
		EducationLoan instOfEducationLoan = new EducationLoan("Yogi", 300000, 48, "SRM institute", "BBA");
		System.out.println("The monthly emi is "+instOfEducationLoan.getMonthlyEMI());
		HomeLoan instOfHomeLoan = new HomeLoan("Jagadeesh", 10000000, 240, "1st Main road, Mars");
		System.out.println("A home loan for amount 1000000 is granted to JAGADEESH for a period of 240 months against the property 1ST MAIN ROAD MARS. The monthly emi is "+instOfHomeLoan.getMonthlyEMI());
		
		
		
		
		
		
 

	}

}
