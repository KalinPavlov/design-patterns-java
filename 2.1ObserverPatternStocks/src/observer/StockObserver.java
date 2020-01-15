package observer;

public class StockObserver implements Observer {

	private double ibmProce;
	private double aaplPrice;
	private double googPrice;
	
	public StockObserver() {
	}
	
	@Override
	public void update(double ibmPrice, double aaplPrice, double googPrice) {
		this.ibmProce = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
		
		printThePrices();
	}

	private void printThePrices() {
		System.out.println("IBM: " + ibmProce + "\nAAPLE: " + aaplPrice + "\nGOOG: " + googPrice);
	}
	
	@Override
	public String toString() {
		return "Stock Observer";
	}
}
