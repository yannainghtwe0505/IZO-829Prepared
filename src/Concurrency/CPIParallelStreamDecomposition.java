package Concurrency;

import java.util.List;

public class CPIParallelStreamDecomposition {
    private static int doWork(int input) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
        }
        return input;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        // List.of(1, 2, 3, 4, 5).stream().map(w -> doWork(w)).forEach(s -> System.out.print(s + " ")); //serial stream
        // List.of(1, 2, 3, 4, 5).parallelStream().map(w -> doWork(w)).forEach(s -> System.out.print(s + " "));
        System.out.print(List.of(1, 2, 3, 4, 5, 6).parallelStream().skip(4).limit(6).findFirst().get());
        // What about operations that consider order, such as findFirst(), limit(), and skip()?
        List.of(1, 2, 3, 4, 5).parallelStream().map(w -> doWork(w)).forEachOrdered(s -> System.out.print(s + " "));// for order

        System.out.println();
        var timeTaken = (System.currentTimeMillis() - start) / 1000;
        System.out.println("Time: " + timeTaken + " seconds");
    }
    // predictable. The map() and
    // forEach() operations on a parallel stream are equivalent to submitting multiple Runnable
    // lambda expressions to a pooled thread executor and then waiting for the results.

}
