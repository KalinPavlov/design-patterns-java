package builder;

public class Test {

	public static void main(String[] args) {
		User user = new User.UserBuilder("Alex", "Larson")
				.age(28)
				.phone("+165498765")
				.address("USA, Las Vegas 1600")
				.build();
		System.out.println(user);
	}

}
