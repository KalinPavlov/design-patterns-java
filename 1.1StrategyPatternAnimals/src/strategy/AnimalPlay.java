package strategy;

import animals.Bird;
import animals.Dog;

public class AnimalPlay {

	public static void main(String[] args) {
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		
		System.out.println("Dog: "  + sparky.tryToFly());
		System.out.println("Bird: "  + tweety.tryToFly());
		
		sparky.setFlyingType(new ItFlies());
		System.out.println("Dog: "  + sparky.tryToFly());
	}

}
