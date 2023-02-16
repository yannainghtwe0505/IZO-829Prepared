package OnlineTest;

public class Test1 {

    public static void main(String[] args) {
        int i;
        outer: do {
            i = 5;
            inner: while (true) {
                System.out.println(i--);
                if (i == 3) {
                    break outer;
                }
            }
        } while (true);
    }
}
// Explanation -
// "outer" and "inner" are valid label names.
// On encountering do-while loop, control goes inside and initializes variable i to 5.
// Then it executes while loop and it's boolean expression is always true.
// System.out.println(i--); prints 5 to the console first, and then decrements the value of i by 1. So, i becomes 4.
// Boolean expression of if(i == 4) evaluates to true. break outer; statement takes the control out of do-while loop.
// main method ends and program terminates successfully.
// Thus, 5 gets printed only once.