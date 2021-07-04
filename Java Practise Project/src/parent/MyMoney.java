package parent;

public class MyMoney {
	public Integer depositedMoney;
	public Integer totalMoneyGivenAsLoan=0;
	
//Defining constructor
public MyMoney(Integer depositedMoney ) {
	this.depositedMoney = depositedMoney;
}

public void depositMoney(Integer x) {
	this.depositedMoney = x;
}

public String grantLoan(Integer money) {
	
	if((depositedMoney - totalMoneyGivenAsLoan) > money){
		this.totalMoneyGivenAsLoan = money;
		return "Loan Granted";
	}else {
		return "Insufficent Funds, Loan Rejected";
	}
}

public void printStatement() {
	System.out.println("Deposited Money ::::" + depositedMoney);
	System.out.println("Amount given as Loan :::::" +totalMoneyGivenAsLoan);
	System.out.println("Balance Amount ::::" + (depositedMoney - totalMoneyGivenAsLoan));
}	
	public static void main(String[] args) {
		MyMoney MyMoney1 = new MyMoney(10000);
		System.out.println(MyMoney1.grantLoan(2000));
		MyMoney1.printStatement();
		MyMoney1.depositMoney(4000);
		MyMoney1.printStatement();
		System.out.println(MyMoney1.grantLoan(11000));
		System.out.println(MyMoney1.grantLoan(5000));
		MyMoney1.printStatement();
	}
}
























