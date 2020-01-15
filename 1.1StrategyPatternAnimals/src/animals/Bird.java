package animals;

import strategy.Animal;
import strategy.ItFlies;

public class Bird extends Animal {
	
	public Bird() {
		super();
		
		setSound("Tweet");
		setFlyingType(new ItFlies());
	}
	
}
