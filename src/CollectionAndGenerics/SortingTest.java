package CollectionAndGenerics;

import java.util.ArrayList;

public class SortingTest {
    public static void main(String[] args) {
	java.util.List<String> bunnies = new ArrayList<>();
	bunnies.add("long ear");
	bunnies.add("floppy");
	bunnies.add("hoppy");
	System.out.println(bunnies);
	bunnies.sort((b1, b2) -> b1.compareTo(b2));
	System.out.println(bunnies);
    }

}
