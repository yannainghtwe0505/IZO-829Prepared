package Classes;

abstract class abMain {
    public abstract void aa(Object a);

    public abstract void test();
}

abstract class abMain2 extends abMain {
    @Override
    public void test() {
    }
}

public class abstractTest extends abMain2 {

    public static void main(String[] args) {
	System.out.println("");
    }

    public void aa(String a) {

    }

    @Override
    public void test() {
	System.out.println("I miss you ");

    }

}