package OnlineTest;

public class Test15 {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("certification"); // Line n3
        modify(stringBuilder); // Line l6
        System.out.println(stringBuilder); // Line l7
    }

    private static void modify(StringBuilder s) {
        s.append("-guide"); // Line l11
    }
}