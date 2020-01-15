package strategy;

import operations.Addition;
import operations.Division;
import operations.Multiplication;
import operations.Substraction;

public class StrategyPatternDemo {

	public static void main(String[] args) {
		Context context = new Context(new Addition());
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
		
		context.setStrategy(new Substraction());
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
		
		context.setStrategy(new Division());
		System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
		
		context.setStrategy(new Multiplication());
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}

}
