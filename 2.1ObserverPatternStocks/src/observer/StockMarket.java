package observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Observable {

	private List<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	public StockMarket() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
	}

	@Override
	public void addObserver(Observer o) {
		observers.add(o);
		System.out.println("New observer added: " + o);
	}

	@Override
	public void removeObserver(observer.Observer o) {
		int observerIndex = observers.indexOf(o);
		System.out.println("Observer " + (observerIndex + 1) + " deleted");
		observers.remove(observerIndex);
	}

	public void setIbmPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObservers();
	}

	public void setAaplPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObservers();
	}

	public void setGoogPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObservers();
	}

}
