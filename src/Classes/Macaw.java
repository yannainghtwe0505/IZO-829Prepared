package Classes;

class Bird {
    int feathers = 0;

    Bird(int x) {
	this.feathers = x;
    }

    Bird fly() {
	return new Bird(1);
    }
}

public class Macaw extends Parrot {
    public static void main(String... sing) {
	Parrot p = new Macaw(4);
	System.out.print(p.fly().text);
    }

    String text = "macaw";

    public Macaw(int z) {
	super(z);
    }

    @Override
    public Macaw fly() {
	return new Macaw(3);
    }
}

class Parrot extends Bird {
    String text = "parrot";

    protected Parrot(int y) {
	super(y);
    }

    @Override
    protected Parrot fly() {
	return new Parrot(2);
    }
}