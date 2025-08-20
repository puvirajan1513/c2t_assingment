package bankingSystem;

public class SavingAccount extends Account{
	
	private double interestRate = 0.03;

    public SavingAccount(String accNum, double balance) {
        super(accNum, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount + (amount * interestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance in Savings Account!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

}
