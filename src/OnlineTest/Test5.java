package OnlineTest;

import java.util.ArrayList;
import java.util.List;

public class Test5 {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Certification");
        List<StringBuilder> testList = new ArrayList<>();
        testList.add(new StringBuilder("Certification"));
        testList.add(stringBuilder);
        stringBuilder.append("Guide!");
        stringBuilder.append("Hee!");
        testList.add(stringBuilder);

        System.out.println(testList);

    }
}

// Explanation -
// Here the reference stringBuilder
// �would contain the memory address. So when we modify the value of stringBuilder the list element also get updated