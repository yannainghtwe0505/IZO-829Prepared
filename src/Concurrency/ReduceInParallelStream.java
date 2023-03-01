package Concurrency;

import java.util.Arrays;
import java.util.List;

public class ReduceInParallelStream {
    public static void main(String[] args) {
        List.of(1, 2, 3, 4, 5, 6).stream().skip(5).unordered();
        // a is not order just tell JVM order is applied
        List.of(1, 2, 3, 4, 5, 6).stream().unordered().parallel();
        // b is order
        System.out.println(List.of('w', 'o', 'l', 'f').parallelStream().reduce("", (s1, c) -> s1 + c, (s2, s3) -> s2 + s3));
        System.out.println(List.of('w', 'o', 'l', 'f').stream().reduce("", (s1, c) -> s1 + c, (s2, s3) -> s2 + s3));
        System.out.println(List.of(1, 2, 3, 4, 5, 6).parallelStream().reduce(0, (a, b) -> (a - b)));
        System.out.println(List.of(1, 2, 3, 4, 5, 6).parallelStream().reduce(0, (a, b) -> (a + b), Integer::sum));
        System.out.println(List.of("w", "o", "l", "f").parallelStream().reduce("b", String::concat));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    }

}
