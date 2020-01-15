package observer;
import java.util.Observable;

public class StockMarket extends Observable {
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockMarket(double ibmPrice, double aaplPrice, double googPrice) {
		this.ibmPrice = ibmPrice;
		this.aaplPrice = aaplPrice;
		this.googPrice = googPrice;
	}
	
	@Override
	public String toString() {
		return "Prices: IBM: " + ibmPrice + " AAPL: " + aaplPrice + " GOOG: " + googPrice;
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		setChanged();
		notifyObservers();
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		setChanged();
		notifyObservers();
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		setChanged();
		notifyObservers();
	}
}
