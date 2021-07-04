package loan;

import org.junit.Test;

public class Exercise11 {

	@Test
	
	
	public void myJunit() {
/*Within the main method create an instance of a personnel loan ("Jagadeesh",800000,24) 
 * and print the monthly emi for the personnel loan in the following format A personnel loan for amount 800000 is granted
 *  to Jagadeesh for a period of 24 months. 
 * The monthly emi is
 */
		
		PersonnelLoan PersonnelLoan1 = new PersonnelLoan("Jagadeesh",24,800000);
		System.out.println("The monthly EMI is" +PersonnelLoan1.getMonthlyEMI());
		
		
		
		
		
		
		

	}

}
