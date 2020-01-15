package observer;

public class StocksTest {

	public static void main(String[] args) {
		StockMarket market = new StockMarket(197.00, 677.60, 676.40);
		
		market.addObserver(new WallStreetBroker());
		market.addObserver(new NormalPerson());
		
		market.setIbmPrice(197.50);
		System.out.println();
		market.setAaplPrice(677.90);
		System.out.println();
		market.setGoogPrice(677.20);
	}

}
