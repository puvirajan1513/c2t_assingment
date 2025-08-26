package userdefinedexception_assignment;

public class BankDemo {

	public static void main(String[] args) {
		BankAccount account=new BankAccount(1001,5000.0);
		
		try {
            account.displayBalance();

            // Deposit money
            account.deposit(2000);
            account.displayBalance();

            // Withdraw money
            account.withdraw(3000);
            account.displayBalance();

            // Trying invalid deposit
            account.deposit(-100);  

        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction attempt complete.");
        }

	}

}
