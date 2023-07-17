package Classes;

public class Hippo extends Animal {
//    final String name;
    final static String anme;
    static {
	System.out.print("B");
    }

    public static void main(String[] grass) {
	System.out.print("C");
	new Hippo();
	new Hippo();
	new Hippo();
    }

    public void play() {
	final String name;
    }
}