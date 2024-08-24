public class CheckingAccountClient {
	public static void main(String[] args) {
		// BankAccount b1 = new BankAccount(1000.);
		// System.out.println("New non-default bank account:\n" + b1 +"\n");
		
		// BankAccount b2 = new BankAccount();
		// System.out.println("New default bank account:\n" + b2+"\n");

		CheckingAccount c1 = new CheckingAccount(100, 7.5);
		System.out.println("New non-default checking account:\n" + c1+"\n");
		
		CheckingAccount c2 = new CheckingAccount();
		System.out.println("New default checking account:\n" + c2+"\n");

		System.out.println("*********************************************************");
		c1.deposit(350.75);
		System.out.println("\nAfter depositing $350.75 to the non-default checking account: " + c1);

		c1.withdraw(200.25);
		System.out.println("\nAfter withdrawing $200.25: " + c1);
		
		c1.setMonthlyFee(6);;
		System.out.println("\nAfter setting monthly fee to $6.00: " + c1);

		c1.applyMonthlyFee();;
		System.out.println("\nAfter applying monthly fee: " + c1);


	}
}