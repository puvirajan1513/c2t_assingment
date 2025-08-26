package userdefinedexception_assignment;

public class BankAccount {
	private int accno;
	private double bal;
	public BankAccount(int accno, double bal) {
		this.accno = accno;
		this.bal = bal;
	}
	
	public void deposit(double amo) throws InvalidAmountException{
		if(amo<=0) {
			throw new InvalidAmountException("Deposit amount must be positive");
		}
		bal+=amo;
		System.out.println("Successfully deposited: "+amo);
	}
	
	public void withdraw(double amo) throws InvalidAmountException,InsufficientFundsException{
		if(amo<=0) {
			throw new InvalidAmountException("Withdraw ampunt must be positive.");
			
		}
		if(amo>bal) {
			throw new InsufficientFundsException("Insufficient funds current balance. "+bal);
		}
		bal-=amo;
		System.out.println("Successfully withdraw: "+amo);
	}
	public void displayBalance() {
        System.out.println("Account Number: " + accno + " | Balance: " + bal);
    }
	
	
	
	

}
