package Streams;

import java.util.List;
import java.util.Optional;
import java.util.TreeSet;
import java.util.stream.Stream;

public abstract class TestStreamMethods {
    public static void main(String[] args) {
	var list=List.of(1,2,4,5);
	Stream<Integer> st=Stream.of(2,5,40);
	Stream<Integer> col=list.stream();
	Stream<Integer> col2=list.parallelStream();
	st.forEach(System.out::print);
	col.forEach(System.out::print);
	col2.forEach(System.out::print);
	System.out.println("----------------------------");
//	Stream.generate(()->Math.random()).forEach(System.out::println);;
	Stream.iterate(1,i->i<10,i->	i+1).forEach(System.out::print);;
	System.out.println("----------------");
//	Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
//
//	System.out.println(s.count()); // 3
//	
//	Stream<String> s = Stream.of("monkey", "ape", "bonobo");
//	Optional<String> min = s.max((s1, s2)->s2.length()- s1.length());
//
//	min.ifPresent(System.out::println); // ape
	
//	Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
//
//	Stream<String> infinite = Stream.generate(()-> "chimp");
//
//	s.findAny().ifPresent(System.out::println); // monkey (usually)
//
//	infinite.findAny().ifPresent(System.out::println); // chimp
//	
//	Stream<String> stream = Stream.of("w", "o", "l", "f!");

//	int length = stream.reduce(2, (i, s) ->{
//	    System.out.println(i+"-"+s);
//	    return i+s.length();}, (a, b)-> {
//	    System.out.println(a+"--"+b);
//	    return a+b;});
//
//	System.out.println(length); // 5
	
	Stream<String> stream = Stream.of("w", "o", "l", "f");

	TreeSet<String> set = stream.collect(() -> new TreeSet<>(), TreeSet::add, TreeSet::addAll);

	System.out.println(set); // [f, l, o, w]
	System.out.println(stream.toString());
    }

}
