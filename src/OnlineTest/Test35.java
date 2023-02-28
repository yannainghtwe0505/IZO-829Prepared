package OnlineTest;

public class Test35 {
    private static int a = 20;

    Test35(int a) {
        Test35.a = a;
    }

    public static void main(String[] args) {
        Test35 t1 = new Test35(10);
        System.out.println(t1.a);
        Test35 t2 = new Test35(120);
        System.out.println(t2.a);
        System.out.println(t1.a);

    }

}
