
public class MyMoney {
	
	
/*Requirement 2: Create the following class properties
 1. Name : depositedMoney, Data type : Integer, Description : This property will be used to keep track of total money which was deposited
 2. Name : totalMoneyGivenAsLoan,  Data type : Integer, Give it a default value of 0 , 
 Description : This property will be used to keep track of total money which is given as loan.	*/
	
	public int depositedMoney;
	public int totalMoneyGivenAsLoan = 0;
	
	
/*Requirement 3: Create a constructor with one attribute an argument, 
 * the data type of the argument would be an integer and the value will be set to the class property depositedMoney.*/	
	public MyMoney(int moneyDeposited) {
		depositedMoney = moneyDeposited;
		
	}
/*Requirement 4: As the financier would like to keep depositing more money (which he might get as interest or money from other sources), 
 * let's create a method to add money to the existing depositedAmount.
 NameofMethod: depositMoney, Argument : 1 of data type Integer , Return type : void, 
 Logic : Add the amount passed on the argument to the value of the class property depositedMoney and 
 update the depositedMoney with the new value.	*/
	
	public void depositMoney(int moneyDeposited) {
		depositedMoney = moneyDeposited;
		
		
	}
	

/*Requirement 5: As the financier needs to give loan to others, there needs to be a method to grant loan, provided he has the amount left with him.
 NameofMethod: grantLoan, Argument: 1 of data type Integer, Return type: String, 
 Logic: Check if the difference of depositedMoney - totalMoneyGivenAsLoan > value of the argument. 
 If the before condition is true then add the value of argument to the totalMoneyGivenAsLoan and return "Loan Granted"; 
 If the condition is false (which means we don't have that much money to give) return result as "Insufficent Funds, Loan Rejected*/
	
	public String grantLoan(int loanAmount) {
		if((depositedMoney - totalMoneyGivenAsLoan) > loanAmount) {
			totalMoneyGivenAsLoan = totalMoneyGivenAsLoan + loanAmount;
			return "Loan Granted";			
		}
		else {
			return "Insufficent Funds, Loan Rejected";
		}
	}
	
/*Requirement 6: As the financier would like to print a statement of his balance, let's create a print method
NameOftheMethod: printStatement Argument: 0, Return type: void, 
Logic: Print the value of depositedMoney & totalMoneyGivenAsLoan in the following format
Deposited Money :::: <value of depositedAmount>
Amount given as Loan ::::: <value of totalMoneyGivenAsLoan>
Balance Amount :::: <depositedAmount - totalMoneyGivenAsLoan>*/

		public void printstatement() {
			System.out.println("Deposited Money ::"+depositedMoney);
			System.out.println("Amount given as Loan ::"+totalMoneyGivenAsLoan);
			System.out.println("Balance Amount::"+(depositedMoney - totalMoneyGivenAsLoan));
			
			
		}

/*Requirement 7: To test the above method, I wanted you to create a main method within the MyMoney class and do the following
 1. create an instance of myMoney with 10000 as the initial deposit amount (Hint: create an instance of MyMoney with 10000 as the value of 
 argument to the constructor)
 2. Grant a loan of 2000 (Hint: call the grantLoan method with the value of 2000) and print the output of the grant loan method.
 3. Print statement
 4. Deposit an amount of 4000 
 5. Print Statement
 6. Grant a loan of 11000 and print the output of the grant loan method.
 7. Grant a loan of 5000 and print the output of the grant loan method.
 8. Print statement.*/
		
		public static void main(String[] a1) {
			
			MyMoney instanceofmyMoney = new MyMoney(10000);
			System.out.println(instanceofmyMoney.grantLoan(2000));
			instanceofmyMoney.printstatement();
			instanceofmyMoney.depositMoney(4000);
			instanceofmyMoney.printstatement();
			System.out.println(instanceofmyMoney.grantLoan(11000));
			System.out.println(instanceofmyMoney.grantLoan(5000));
			instanceofmyMoney.printstatement();
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
