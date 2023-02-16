package OnlineTest;

public class Test6 {

    public static void main(String[] args) {
        int result = 0;
        for (var n = 0; n <= 9; n++) { // Line l1
            if (n == 4)
                break;
            if (n == 6)
                break;
            else
                continue;
            result = n; // Line l2
        }
        System.out.println(result);
    }

}

// Explanation -
// At line l1 var is Local variable Type inference was added in JDK 10. In this case it will be int.
// Line l2 is unreachable code
