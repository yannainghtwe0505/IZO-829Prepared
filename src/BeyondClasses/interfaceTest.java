package BeyondClasses;

interface interfaceTes {
    int a = 40;

    static void testStatic() {
	System.out.println("Hello I want to change this ");
    }

    void test();

    default void testDefault() {
    }

}

interface interfaceTes2 {
    int a = 50;

    static void testStatic() {
	System.out.println("Hello I want to change this ");
    }

}

public class interfaceTest implements interfaceTes, interfaceTes2 {
    static int a = 50;

    public static void main(String[] args) {
	interfaceTest i = new interfaceTest();
	System.out.println(a);
	interfaceTes.testStatic();

	i.testDefault();
    }

    @Override
    public void test() {
	System.out.println("Hello");

    }

}
