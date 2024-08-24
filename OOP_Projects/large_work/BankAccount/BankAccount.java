import java.text.DecimalFormat;

public abstract class BankAccount {
	public final DecimalFormat MONEY = new DecimalFormat("$#,##0.00");
	private double balance;

	public BankAccount() {
		deposit(0);
	}

	public BankAccount(double startBalance) {
		deposit(startBalance);
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount >= 0.0)
			balance += amount;
		else
			System.err.println("Deposit amount must be positive.");
	}

	public void withdraw(double amount) {
		if (amount >= 0.0 && amount <= balance)
			balance -= amount;
		else
			System.err.println("Withdrawal amount must be positive and cannot be greater than balance");
	}

	public abstract String toString();
}