package OnlineTest;

public class Test19 {
    private static Hello[] hello;

    public static void main(String[] args) {
        if (hello.length > 0 && hello != null) {
            System.out.println(hello[0]);
        }
    }
}

class Hello {

}