package Classes;

class GiraffeFamily {
    static {
	System.out.print("A");
//	System.out.print(a);
    }
    int a = 3;
    {
	System.out.print("B");
    }

    public GiraffeFamily() {
	System.out.print("D");
    }

    public GiraffeFamily(int stripes) {
	System.out.print("E");
    }

    public GiraffeFamily(String name) {
	this(1);
	System.out.print("C");
    }
}

public class Okapi extends GiraffeFamily {
    private static int aa = 0;
    static {
	System.out.print("F");
    }

    public static void main(String[] grass) {
	new Okapi(1);
	System.out.println();
	new Okapi(2);
    }

    int a = 4;

    {
	System.out.print("H");
    }

    public Okapi(int stripes) {
	super("sugar");
	System.out.print("G");
    }
}