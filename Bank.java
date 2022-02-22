package week3.day2;

public class Bank extends SBI implements CICBIL,PNB {

	public void creditScore() {
		System.out.println("Your creditScore is:8.5");
		// TODO Auto-generated method stub
		
	}

	public void minimumBalance() {
		System.out.println("Your Minimum Balance is:5000");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void bankBalance() {
		System.out.println("Your bankBalance is:20000");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maximumLoanAmount() {
		System.out.println("Your maximumLoanAmount is:500000");
		// TODO Auto-generated method stub
		
	}

	public void cibilScore() {
		System.out.println("Your Minimum Balance is:14000");
	}
		// TODO Auto-generated method stub
		
	
	public static void main(String[] args) {
		//using single object
		Bank get=new Bank();
		get.bankBalance();
		get.cibilScore();
		get.creditScore();
		get.ITLoan();
		get.maximumLoanAmount();
		get.minimumBalance();
	}
	
}
