package prototype;

public class PrototypeTest {

	public static void main(String[] args) {
		try {

			PrototypeCapable moviePrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE);
			System.out.println(moviePrototype);

			PrototypeCapable albumPrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelType.ALBUM);
			System.out.println(albumPrototype);

			PrototypeCapable showPrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelType.SHOW);
			System.out.println(showPrototype);

		} catch (CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}
	}

}
