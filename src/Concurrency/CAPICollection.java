package Concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CAPICollection {

    public static void main(String[] args) {
        List<Integer> favNumbers = new CopyOnWriteArrayList<>(List.of(4, 3, 42));
        for (var n : favNumbers) {
            System.out.print(n + " "); // 4 3 42
            favNumbers.add(n + 1);
        }
        System.out.println();
        System.out.println("Size: " + favNumbers.size()); // Size: 6
    }
}
