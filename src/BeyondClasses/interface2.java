package BeyondClasses;

interface interf {
    public static void testStatic() {
    }

    public abstract void test();;

    default void testDefault() {
	System.out.println("Hello test default");
	testPrivate();
    }

    private void testPrivate() {
	System.out.println("Helo test private");
	test();
    }
}

public class interface2 implements interf {
    public static void main(String[] args) {
	interface2 i = new interface2();
//	i.test
	i.testDefault();
    }

    @Override
    public void test() {
	System.out.println("I love you ");

    }

}
