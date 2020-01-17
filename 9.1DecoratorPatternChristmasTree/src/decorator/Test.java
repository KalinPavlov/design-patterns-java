package decorator;

public class Test {

	public static void main(String[] args) {
		ChristmasTree tree = new ChristmasTreeImpl();
		System.out.println(tree.decorate());
		
		ChristmasTree tree1 = new Garland(tree);
		System.out.println(tree1.decorate());
		
		ChristmasTree tree2 = new BubbleLights(tree);
		System.out.println(tree2.decorate());
	}

}
