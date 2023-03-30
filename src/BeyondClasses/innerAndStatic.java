package BeyondClasses;

public class innerAndStatic {
    class B {
	class C {
	    private static int b = 40;
	    private int a = 20;
	}

	private static int b = 40;

	public static void main(String[] args) {
	    System.out.println(C.b);
	    var cc = new innerAndStatic().new B().new C();
	    System.out.println();
	}

	private int a = 20;
    }

    private static int b = 40;

    public static void main(String[] args) {
	var a = innerAndStatic.b;
	var b = B.C.b;
	System.out.println(a);
    }

    private int a = 20;

}
