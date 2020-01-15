package animals;

import strategy.Animal;
import strategy.CantFly;

public class Dog extends Animal {
	
	public Dog() {
		super();
		
		setSound("Bark");
		setFlyingType(new CantFly());
	}

	public void digHole() {
		System.out.println("Dug a hole");
	}
	
}
