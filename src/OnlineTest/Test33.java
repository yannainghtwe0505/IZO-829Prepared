package OnlineTest;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test33 {
    public static void main(String[] args) {
        Predicate<String> empty = String::isEmpty;
        Predicate<String> notEmpty = empty.negate();

        var result = Stream.generate(() -> "").filter(notEmpty).collect(Collectors.groupingBy(k -> k)).entrySet().stream().map(Entry::getValue)
                .flatMap(Collection::stream).collect(Collectors.partitioningBy(notEmpty));
        System.out.println(result);
    }

}
