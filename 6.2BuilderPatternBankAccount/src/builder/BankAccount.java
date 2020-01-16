package builder;

public class BankAccount {
	private final long accountNumber;
	private final String ownerFirstName;
	private final String ownerLastName;
	private final double balance;
	
	public BankAccount(BankAccountBuilder builder) {
		this.accountNumber = builder.accountNumber;
		this.ownerFirstName = builder.ownerFirstName;
		this.ownerLastName = builder.ownerLastName;
		this.balance = builder.balance;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public String getOwnerFirstName() {
		return ownerFirstName;
	}

	public String getOwnerLastName() {
		return ownerLastName;
	}

	public double getBalance() {
		return balance;
	}
	
	@Override
	public String toString() {
		return "Bank Account with number: " + accountNumber + " owned by: " + ownerFirstName + " " + ownerLastName + ", Balance: " + balance;
	}
	
	public static class BankAccountBuilder {
		
		private final long accountNumber;
		private String ownerFirstName;
		private String ownerLastName;
		private double balance;
		
		public BankAccountBuilder(long accountNumber) {
			this.accountNumber = accountNumber;
		}
		
		public BankAccountBuilder ownerFirstName(String firstName) {
			this.ownerFirstName = firstName;
			return this;
		}
		
		public BankAccountBuilder ownerLastName(String lastName) {
			this.ownerLastName = lastName;
			return this;
		}
		
		public BankAccountBuilder balance(double balance) {
			this.balance = balance;
			return this;
		}
		
		public BankAccount build() {
			return new BankAccount(this);
		}
		
	}
	
}
