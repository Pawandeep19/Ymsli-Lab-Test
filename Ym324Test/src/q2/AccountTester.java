package q2;


public class AccountTester {
	public static void main(String[] args) {
		
		Date date = new Date(04,11,1998);
		Owner owner = new Owner("Pawandeep", "YM324", date);
		
		SavingAccount account = new SavingAccount();
		account.setBalance(10000);
		account.setNumber("204137");
		account.setOwner(owner);
		account.setInterestRate(7);
		account.print();
		account.deposit(5000);
		account.withdraw(4500.50f);
		
		System.out.println("-------------------------");
		
		CurrentAccount account2 = new CurrentAccount();
		account2.setBalance(50000);
		account2.setOwner(owner);
		account2.setNumber("12345");
		account2.setMinimumBalance(10000);
		account2.print();
		
		account2.withdraw(45000);
		account2.withdraw(40000);
		account2.deposit(15000);
		
		
	}
}
