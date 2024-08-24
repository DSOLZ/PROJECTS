
public class BankAccountClient {

	public static void main(String[] args) {

//		BankAccount b1 = new BankAccount();
//		BankAccount b2 = new BankAccount(1000);

		BankAccount c1 = new CheckingAccount();
		BankAccount c2 = new CheckingAccount(100, 7.5);

		BankAccount s1 = new SavingsAccount();
		BankAccount s2 = new SavingsAccount(2500, 0.008);

		BankAccount[] accounts = { c1, c2, s1, s2 };

		for (int i = 0; i < accounts.length; i++) {
			System.out.println(accounts[i]);
		}
		System.out.println("*************************************************");
		
//		for (int i = 0; i<accounts.length; i++) {
//			accounts[i].withdraw(1);
//			System.out.println(accounts[i] + "\n");
//		}
		
	}

}