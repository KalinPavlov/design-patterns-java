package observer;

public class GrabStocks {
	public static void main(String[] args) {
		StockMarket stockMarket = new StockMarket();
		
		StockObserver observer1 = new StockObserver();
		
		stockMarket.addObserver(observer1);
		stockMarket.setIbmPrice(197.00);
		stockMarket.setIbmPrice(677.60);
		stockMarket.setIbmPrice(676.40);
		
		StockObserver observer2 = new StockObserver();
		
		stockMarket.setIbmPrice(197.00);
		stockMarket.setIbmPrice(677.60);
		stockMarket.setIbmPrice(676.40);
		
		stockMarket.removeObserver(observer1);
		
		stockMarket.setIbmPrice(197.00);
		stockMarket.setIbmPrice(677.60);
		stockMarket.setIbmPrice(676.40);
		
		Runnable getIBM = new GetTheStock(2, "IBM", 197.00, stockMarket);
		Runnable getAAPL = new GetTheStock(2, "AAPL", 677.60, stockMarket);
		Runnable getGOOG = new GetTheStock(2, "GOOG", 676.40, stockMarket);
		
		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();
	}
}
