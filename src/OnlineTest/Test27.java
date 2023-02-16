package OnlineTest;

import java.util.ArrayList;

public class Test27 {

    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<Integer>();

        testList.add(127);
        testList.add(127);

        testList.add(128);
        testList.add(128);
        // testList.cl
        // testList.cl
        // testList.clo

        System.out.println(testList.get(0) == testList.get(1));
        System.out.println(testList.get(2).equals(testList.get(3)));
        System.out.println(testList.get(2) == testList.get(3));
        System.out.println(testList.get(0));
        System.out.println(testList.get(1));
        System.out.println(testList.get(2));
        System.out.println(testList.get(3));
    }
}