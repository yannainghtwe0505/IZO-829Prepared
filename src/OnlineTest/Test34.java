package OnlineTest;

public class Test34 {

    public static void addToInt(int x, int amountToAdd) {
        x = x + amountToAdd;
        System.out.println(x);
    }

    int Var() {
        var _ = 7;
        return _;
    }

    public static void main(String[] args) {

        var a = 15;
        var b = 10;
        Test34.addToInt(a, b);
        System.out.println(a);
    }
}