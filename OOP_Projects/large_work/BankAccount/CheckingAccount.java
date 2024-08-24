public class CheckingAccount extends BankAccount {
	public final double DEFAULT_FEE = 5.00;
	private double monthlyFee;

	public CheckingAccount() {
		super();
		setMonthlyFee(DEFAULT_FEE);
	}

	public CheckingAccount(double startBalance, double fee) {
		super(startBalance);
//		balance = startBalance;
		setMonthlyFee(fee);
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void applyMonthlyFee() {
		double fee = getMonthlyFee();
		withdraw(fee);
	}

	public void setMonthlyFee(double newMonthlyFee) {
		if (newMonthlyFee >= 0)
			monthlyFee = newMonthlyFee;
		else
			System.err.println("Fee Amount must be positive.");
	}

	public String toString() {
		return "balance is " + MONEY.format(getBalance()) + "; monthly fee is " + MONEY.format(monthlyFee);
	}
}