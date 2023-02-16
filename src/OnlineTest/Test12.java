package OnlineTest;

import java.util.ArrayList;
import java.util.List;

public class Test12 {
    public static void main(String[] args) {
        Integer a = 11;
        List<Integer> testList = new ArrayList<>();
        testList.add(a);
        testList.add(a *= 5);
        testList.add(a);

        testList.removeIf(a -> a == 1);

        System.out.println(testList);
    }
}
// Lambda expression's parameter a cannot redeclare another local variable defined in an enclosing scope.