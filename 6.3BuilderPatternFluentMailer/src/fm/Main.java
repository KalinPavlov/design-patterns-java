package fm;

public class Main {

	public static void main(String[] args) {
		FluentMailer
				.send(mailer -> mailer.from("a@b.com").to("b@a.com").subject("no matter what").body("something else"));
	}
}
