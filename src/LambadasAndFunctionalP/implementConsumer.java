package LambadasAndFunctionalP;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class implementConsumer {
    public static void main(String[] args) {
	Consumer<String> c1=System.out::println;
	Consumer<String> c2=(s)->System.out.println(s);
	c1.accept("Anime");
	c2.accept("anime");
	System.out.println("--------------------------");
	var map=new HashMap<String,Integer>();
	BiConsumer<String, Integer> b1=map::put;
	BiConsumer<String, Integer> b2=(k,v)->map.put(k,v);
	b1.accept("Hello ", 1);
	b2.accept("Hello2 ", 1);
	System.out.println(map);
    }

}
