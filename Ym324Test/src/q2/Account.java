package q2;

public abstract class Account {
	private Owner owner;
	private float balance;
	private String number;
	
	public Account() {}

	public Account(Owner owner, String number,float balance) {
		this.owner = owner;
		this.balance = balance;
		this.number = number;
	}
	
	public Account(Account tempAccount) {
		this.owner = tempAccount.getOwner();
		this.balance = tempAccount.getBalance();
		this.number = tempAccount.getNumber();
	}
	
	

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public void print() {
		owner.print();
		System.out.println("Account number: " + this.number+"\nBalance: " + this.balance );
	}
	
	public abstract void deposit(float amount);
	
	public abstract void withdraw(float amount);
	
	@Override
	public String toString() {
		return "Account [owner=" + owner + ", balance=" + balance + ", number=" + number + "]";
	}
	
	
	
}
