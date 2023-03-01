package Concurrency;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AvoidingStateful {
    public static List<Integer> addValues(IntStream source) {
        var data = Collections.synchronizedList(new ArrayList<Integer>());
        source.filter(s -> s % 2 == 0).forEach(i -> {
            data.add(i);
        }); // STATEFUL: DON'T DO THIS!
        return data;
    }

    // you should use this
    public static List<Integer> addValuesBetter(IntStream source) {
        return source.filter(s -> s % 2 == 0).boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        var list = addValues(IntStream.range(1, 11));
        System.out.print(list + "\n");

        var list2 = addValues(IntStream.range(1, 11).parallel());
        System.out.print(list2 + "\n");
        // The problem is that our lambda expression is stateful and modifies a list that is outside our stream.

        var list3 = addValuesBetter(IntStream.range(1, 11).parallel());
        System.out.print(list3);
    }
}
