import java.text.DecimalFormat;

public class SavingsAccount extends BankAccount {

	public final double DEFAULT_RATE = 0.03;
	private double interestRate;
	public final DecimalFormat PERCENTAGE = new DecimalFormat("0.0###%");

	public SavingsAccount() {
		super(100);
		setInterestRate(DEFAULT_RATE);
	}
	
	public SavingsAccount (double startBalance, double rate) {
		super(100);
		setInterestRate(rate);
		if (startBalance >= 100) {
			deposit(startBalance - 100);
		} else {
			System.err.println("A savings account balance cannot go below $100");
		}
		
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double rate) {
		interestRate = rate;
	}
	
	public void applyInterest() {
		deposit(interestRate * getBalance());
	}
	
	public void withdraw(double amount) { // override
		if ((getBalance() - amount) >= 100) {
			super.withdraw(amount);
			
		} else {
			System.err.println("A savings account balance cannot go below $100");
		}
	}

	public String toString() {
		return "balance is " + MONEY.format(getBalance()) + "; interest rate is " + PERCENTAGE.format(interestRate);
	}

	public static void main(String[] args) {

		SavingsAccount s1 = new SavingsAccount();
		System.out.println("New default saving account:\n" + s1 +"\n");
		
		SavingsAccount s2 = new SavingsAccount(50, 0.008);
		System.out.println("New non-default saving account:\n" + s2 + "\n");
		
		System.out.println("*****************************************************");
		
		s2.deposit(2000);
		System.out.println("\nAfter depositing $2000 to the non-default checking account: \n" + s2);
		
		s2.applyInterest();
		System.out.println("\nAfter applying interest: \n" +s2);
		
		
		s2.withdraw(2000);
		System.out.println("\nAfter trying to withdraw $2000 \n" + s2 +"\n");
		
		s2.withdraw(50);
		System.out.println("After trying to withdraw another $50 \n" + s2);

		
	}

}