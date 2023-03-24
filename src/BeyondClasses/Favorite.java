package BeyondClasses;

public class Favorite {
    enum Flavors {
	CHOCOLATE, STRAWBERRY, VANILLA;

	static final Flavors DEFAULT = STRAWBERRY;

	public void play() {
	}
    }

    public static void main(String[] args) {
	for (final var e : Flavors.values())
	    System.out.print(e.ordinal() + " ");
    }
}