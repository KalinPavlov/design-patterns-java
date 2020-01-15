package operations;

import strategy.Strategy;

public class Division implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		return num1 / num2;
	}

}
