package singleton;

public class Test {

	public static void main(String[] args) {
		new Thread(new LoggingThread()).start();
		new Thread(new LoggingThread()).start();
		new Thread(new LoggingThread()).start();
		new Thread(new LoggingThread()).start();
		new Thread(new LoggingThread()).start();
		new Thread(new LoggingThread()).start();
	}

}

class LoggingThread implements Runnable {
	
	@Override
	public void run() {
		Logger logger = Logger.getInstance();
		System.out.println("This is logger: " + logger);
	}
	
}
