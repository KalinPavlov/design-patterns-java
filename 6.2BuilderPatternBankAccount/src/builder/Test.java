package builder;

public class Test {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount.BankAccountBuilder(65654654)
				.ownerFirstName("Frank")
				.ownerLastName("Miller")
				.balance(32654.65)
				.build();
		
		System.out.println(bankAccount);
	}

}
