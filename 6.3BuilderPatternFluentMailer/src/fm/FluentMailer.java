package fm;

import java.util.function.Consumer;

public class FluentMailer {
	private String fromAddress;
	private String toAddress;
	private String subject;
	private String body;
	
	private FluentMailer() {}
	
	public FluentMailer from(final String address) {
		this.fromAddress = address;
		return this; 
	}
	
	public FluentMailer to(final String address) {
		this.toAddress = address;
		return this; 
	}
	
	public FluentMailer subject(final String line) {
		this.subject = line;
		return this; 
	}
	
	public FluentMailer body(final String message) {
		this.body = message;
		return this; 
	}
	
	public static void send(Consumer<FluentMailer> block) {
		final FluentMailer mailer = new FluentMailer();
		
		block.accept(mailer);
		System.out.println("Sending...");
	}
}
