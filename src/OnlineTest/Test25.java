package OnlineTest;

import java.util.ArrayList;
import java.util.List;

public class Test25 {

    public static void main(String[] args) {
        int month = '4';
        Integer a = 11;
        List<Integer> testList = new ArrayList<>();
        testList.add(a);
        testList.add(a *= 5);
        testList.add(a);

        testList.removeIf(a -> a == 1);

        System.out.println(testList);
    }
}