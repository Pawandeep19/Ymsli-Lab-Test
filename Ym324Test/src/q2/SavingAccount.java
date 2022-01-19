package q2;

public class SavingAccount extends Account{
	private float interestRate;

	public SavingAccount() {
	}

	public SavingAccount(SavingAccount tempAccount) {
		super(tempAccount);
		this.interestRate = tempAccount.interestRate;
	}
	
	

	public float getInterest() {
		return interestRate*(this.getBalance());
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}
	
	
	
	public float getInterestRate() {
		return interestRate;
	}

	@Override
	public void print() {
		System.out.println("------Saving Account details:-----------");
		super.print();
		System.out.println("Interest rate: " + this.interestRate);
	}

	@Override
	public String toString() {
		return "SavingAccount [interestRate=" + interestRate + "]";
	}

	@Override
	public void deposit(float amount) {
		float newBalance = this.getBalance() + amount;
		this.setBalance(newBalance);
		System.out.println("Amount deposited successfully!!");
		System.out.println("Current balance:"+getBalance());
	}

	@Override
	public void withdraw(float amount) {
		float newBalance = this.getBalance() - amount;
		if(newBalance < 0) {
			System.out.println("Insufficient amount! Cannot withdraw...");
		}else {
			this.setBalance(newBalance);
			System.out.println("Withdrawal Successfull");
			System.out.println("Current balance:"+getBalance());
		}
	}
	

	
}
