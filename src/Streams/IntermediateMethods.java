package Streams;

import java.util.List;
import java.util.stream.Stream;

public class IntermediateMethods {
    public static void main(String[] args) {
	Stream<String> s = Stream.of("monkey", "mgorilla", "bonobo");
	s.filter(x -> x.startsWith("m")).forEach(System.out::println); // monke

	Stream<String> s2 = Stream.of("duck", "duck", "duck", "goose");
	s2.distinct().forEach(System.out::println); // duckgoos
	
	Stream<Integer> s4 = Stream.iterate(1, n -> n + 1);
	s4.skip(5).limit(2).forEach(System.out::print); // 67
	
	//Flat Map
	List<String> zero = List.of();
	var one = List.of("Bonobo");
	var two = List.of("Mama Gorilla", "Baby Gorilla");
	Stream<List<String>> animals = Stream.of(zero, one, two);
	animals.flatMap(m -> m.stream())
	 .forEach(System.out::println);
    }

}
