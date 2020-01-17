package decorator;

public class Garland extends TreeDecorator {

	public Garland(ChristmasTree tree) {
		super(tree);
	}

	@Override
	public String decorate() {
		return super.decorate() + decorateWithBubbleLights();
	}
	
	private String decorateWithBubbleLights() {
		return " with garland";
	}
}
