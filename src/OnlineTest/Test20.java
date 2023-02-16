package OnlineTest;

public class Test20 {
    public static void main(String[] args) {
        MyInterface obj = () -> {
            int i = 22;
            i++;
            System.out.println(i);
            return;
        };
        obj.calculate();
    }
}