package LambadasAndFunctionalP;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class funInterConvientMethods {
    public static void main(String[] args) {
	Predicate<String> egg = s -> s.contains("egg");
	Predicate<String> brown=s->s.contains("brown");
	Predicate<String> p1=egg.and(brown);
	Predicate<String> p2=egg.or(brown.negate());
	Consumer<String> c1=x->System.out.println("1:"+x);
	Consumer<String> c2=x->System.out.println(",2:"+x);
	Consumer<String> c3=c1.andThen(c2);
	c3.accept(" my heros");
	Function<Integer, Integer> before=x->x+1;
	Function<Integer, Integer> after=x->x*2;
	Function<Integer, Integer> combined=after.compose(before);
	System.out.println(combined.apply(10));
    }
}
