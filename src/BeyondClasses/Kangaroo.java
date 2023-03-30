package BeyondClasses;

public class Kangaroo extends Marsupial {
//    public  boolean isBiped() {
//	return true;
//    }

    public static void main(String[] args) {
	Kangaroo joey = new Kangaroo();
	Marsupial moey = joey;
	System.out.println(joey.isBiped());
	System.out.println(moey.isBiped());
	System.out.println(joey.age);
	System.out.println(moey.age);
    }

    protected int age = 6;
}

class Marsupial {
    protected static int age = 2;

    public static boolean isBiped() {
	return false;
    }
}
