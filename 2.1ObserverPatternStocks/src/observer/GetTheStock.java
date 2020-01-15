package observer;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {
	
	private int startTime;
	private String stock;
	private double price;
	
	private Observable stockMarket;

	public GetTheStock(int startTime, String stock, double price, Observable stockMarket) {
		super();
		this.startTime = startTime;
		this.stock = stock;
		this.price = price;
		this.stockMarket = stockMarket;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 20; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			double randNum = (Math.random() * (.06)) - .03;
			
			DecimalFormat df = new DecimalFormat("#.##");
			
			price = Double.valueOf(df.format(price + randNum));
			
			switch (stock) {
			case "IBM":
				((StockMarket) stockMarket).setIbmPrice(price);
				break;
			case "AAPL":
				((StockMarket) stockMarket).setAaplPrice(price);
				break;
			case "GOOG":
				((StockMarket) stockMarket).setGoogPrice(price);
				break;
			default:
				break;
			}
			
			System.out.println(stock + ": " + df.format(price + randNum) + " " + df.format(randNum));
			
			System.out.println();
		}
	}
	
}
