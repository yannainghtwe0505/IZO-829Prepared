package CollectionAndGenerics;

import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args) {
	java.util.List<String> list=new ArrayList<>();
	list.add("a");
	list.add("b");
	list.add("c");
	list.set(0, "mm");
	System.out.println(list);
	list.remove("b");
	System.out.println(list);
	list.remove(0);
	System.out.println(list);
//	list.set(1, "reset");
	var numbers = Arrays.asList(1, 2, 3);

	numbers.replaceAll(x->x*2);

	System.out.println(numbers); // [2, 4, 6]
    }
}
