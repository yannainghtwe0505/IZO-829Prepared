package OnlineTest;

import java.util.ArrayList;
import java.util.List;

public class Test26 {

     static void main(String[] args) {
        List<String> testList = new ArrayList<>();
        testList.add(0, "certification");
        testList.set(0, "guide");
        System.out.println(testList);
    }
}